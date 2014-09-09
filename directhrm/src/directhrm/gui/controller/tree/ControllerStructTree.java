package directhrm.gui.controller.tree;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.db.DbManager;
import directhrm.db.DbPersonManager;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author andre
 */
public class ControllerStructTree {

	public ControllerStructTree(Application application) {
		this.application = application;
	}
	
	public void init() throws SQLException {
		DbManager dbManager = application.getDbManager();
		DbDepartmentManager departmentManager = dbManager.getDepartmentManager();
		DbPersonManager personManager = dbManager.getPersonManager();
		TreeNode<NodeValue> root = new TreeNode<>(new NodeValue());
		List<Organization> listOrg = departmentManager.loadOrganizationList();
		List<Department> listDep = departmentManager.loadDepartmentList();
		List<Person> listPerson = personManager.loadPersonList();
		for(Organization org : listOrg) {
			TreeNode<NodeValue> orgNode = root.addChild(new NodeValue(org));
			List<Department> listOrgDep = 
					Department.getOrganizationDepartments(listDep, org.getId());
			for(Department dep : listOrgDep) {
				TreeNode<NodeValue> depNode = orgNode.addChild( new NodeValue(dep) );
				List<Person> listDepPersons = 
						Person.getDepartmentPersons(listPerson, dep.getId());
				for(Person p : listDepPersons) {
					depNode.addChild( new NodeValue(p) );
				}
			}
		}
		
		treeStruct = application.getMainWindow().getTreeStruct();
		StructTreeModel treeModel = new StructTreeModel(application, root);
		treeStruct.setModel(treeModel);
		TreeSelectionModel selectionModel = treeStruct.getSelectionModel();
		selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		treeStruct.setCellRenderer( new CellRenderer() );
		
		TreeSelectionListener tsl = new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				treeNodeSelected();
			}
		};
		selectionModel.addTreeSelectionListener(tsl);
		
	}
	
	private void treeNodeSelected() {
		JPanel panelCard = application.getMainWindow().getPanelStructNodeCard();
		CardLayout cardLayout = (CardLayout)panelCard.getLayout();
		TreeNode<NodeValue> selectedNode = getSelectedNode();
		if( selectedNode == null ) {
			cardLayout.show(panelCard, "empty");
			return;
		}
		NodeValue nodeValue = selectedNode.getValue();
		if( nodeValue.getOrganization() != null ) {
			cardLayout.show(panelCard, "organization");
			return;
		}
		if( nodeValue.getDepartment()!= null ) {
			cardLayout.show(panelCard, "department");
			return;
		}
		if( nodeValue.getPerson()!= null ) {
			cardLayout.show(panelCard, "person");
			return;
		}
		cardLayout.show(panelCard, "empty");
	}

	public TreeNode<NodeValue>  getSelectedNode() {
		TreePath treePath = treeStruct.getSelectionPath();
		if( treePath == null )
			return null;
		TreeNode<NodeValue> node = 
			(TreeNode<NodeValue>)treePath.getLastPathComponent();
		return node;
	}
	
	private Application application;
	private JTree treeStruct;
}
