package directhrm.gui.controller;

import directhrm.Application;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class ControllerDepartment extends ControllerStructNode {

	public ControllerDepartment(Application application) {
		super(application);
	}

	@Override
	public void saveEditions() throws SQLException {
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
	}

	@Override
	public void discardEditions() {
	}

}
