package directhrm.gui.controller.tree;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Department;
import directhrm.entity.Organization;
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
		DbDepartmentManager departmentManager = 
				application.getDbManager().getDepartmentManager();
		TreeNode<NodeValue> root = new TreeNode<>(new NodeValue());
		List<Organization> listOrg = departmentManager.loadOrganizationList();
		List<Department> listDep = departmentManager.loadDepartmentList();
		for(Organization org : listOrg) {
			TreeNode<NodeValue> orgNode = root.addChild(new NodeValue(org));
			List<Department> listOrgDep = 
					Department.getOrganizationDepartments(listDep, org.getId());
			for(Department dep : listOrgDep) {
				orgNode.addChild( new NodeValue(dep) );
			}
		}
		
		StructTreeModel treeModel = new StructTreeModel(application, root);
		JTree treeStruct = application.getMainWindow().getTreeStruct();
		treeStruct.setModel(treeModel);
	}

	private Application application;
}
