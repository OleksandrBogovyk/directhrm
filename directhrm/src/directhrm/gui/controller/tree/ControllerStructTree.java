package directhrm.gui.controller.tree;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.db.DbEvent;
import directhrm.db.DbEventListener;
import directhrm.db.DbManager;
import directhrm.db.DbPersonManager;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author andre
 */
public class ControllerStructTree implements DbEventListener {

	public ControllerStructTree(Application application) {
		this.application = application;
		application.getDbManager().addDbEventListener(this);
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
		treeModel = new StructTreeModel(application, root);
		treeStruct.setModel(treeModel);
		TreeSelectionModel selectionModel = treeStruct.getSelectionModel();
		selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		treeStruct.setCellRenderer( new CellRenderer() );
		
		
	}
	public void addTreeSelectionListener( TreeSelectionListener tsl ) {
		TreeSelectionModel selectionModel = treeStruct.getSelectionModel();
		selectionModel.addTreeSelectionListener(tsl);
	}
	
	public TreeNode<NodeValue>  getSelectedNode() {
		TreePath treePath = treeStruct.getSelectionPath();
		if( treePath == null )
			return null;
		TreeNode<NodeValue> node = 
			(TreeNode<NodeValue>)treePath.getLastPathComponent();
		return node;
	}

	@Override
	public void dbEventHappened(DbEvent event) {
		if( event.getType() == DbEvent.DbEventType.ORGANIZAION_UPDATED ) {
			treeModel.updateOrganization( event.getOrganization() );
		}
	}
	
	private Application application;
	private JTree treeStruct;
	private StructTreeModel treeModel;
}
