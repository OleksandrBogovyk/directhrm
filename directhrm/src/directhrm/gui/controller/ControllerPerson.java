package directhrm.gui.controller;

import directhrm.Application;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class ControllerPerson extends ControllerStructNode {

	public ControllerPerson(Application application) {
		super(application);
	}

	@Override
	public boolean saveEditions() throws SQLException {
		return true;
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
	}

	@Override
	public void discardEditions() {
	}

	public void setValue(NodeValue value) {
		if( value == null ) {
			
		}
	}
}
