package directhrm.gui.controller;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Organization;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ControllerOrganization extends ControllerStructNode {

	public ControllerOrganization(Application application) {
		super(application);
		//fieldName = mainWindow.getFieldOrganizationName();
		listenTextField(fieldName);
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
		DbDepartmentManager departmentManager = dbManager.getDepartmentManager();
		int id = selectedNode.getValue().getOrganization().getId();
		try {
			organization = departmentManager.loadOrganization(id);
		} catch (SQLException ex) {
			organization = null;
			JOptionPane.showMessageDialog(application.getMainWindow(), 
					"Возникла ошибка при чтении информации", "Ошибка", 
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(ControllerOrganization.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		fieldName.setEnabled( organization != null );
		if( organization == null )
			return;
		fillComponentsValues();
		setDirty(false);
	}

	
	@Override
	public boolean saveEditions() throws SQLException {
		StringBuilder sbMessage = new StringBuilder();
		testFieldLength("Название организации", fieldName, 60, sbMessage);
		if( sbMessage.length() > 0 ) {
			JOptionPane.showMessageDialog(
					mainWindow, sbMessage, "Внимание", 
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		Organization o = new Organization();
		o.setId( organization.getId() );
		o.setOrganizationName( fieldName.getText() );
		dbManager.getDepartmentManager().updateOrganization( o );
		this.organization = o;
		setDirty(false);
		return true;
	}

	@Override
	public void discardEditions() {
		fillComponentsValues();
		setDirty(false);
	}

	private void fillComponentsValues() {
		fieldName.setText( organization.getOrganizationName() );
	}
	
	private Organization organization;
	private JTextField fieldName;

}
