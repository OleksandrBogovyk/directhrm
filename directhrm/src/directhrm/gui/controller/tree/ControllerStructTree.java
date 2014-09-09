package directhrm.gui.controller.tree;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.db.DbManager;
import directhrm.db.DbPersonManager;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTree;

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
		
		StructTreeModel treeModel = new StructTreeModel(application, root);
		JTree treeStruct = application.getMainWindow().getTreeStruct();
		treeStruct.setModel(treeModel);
	}

	private Application application;
}
