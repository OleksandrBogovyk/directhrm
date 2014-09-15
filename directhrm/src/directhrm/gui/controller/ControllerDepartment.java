package directhrm.gui.controller;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Department;
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
public class ControllerDepartment extends ControllerStructNode {

	public ControllerDepartment(Application application) {
		super(application);
		fieldName = mainWindow.getFieldDepartmentName();
		fieldPlace = mainWindow.getFieldDepartmentPlace();
		listenTextField(fieldName);
		listenTextField(fieldPlace);
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
		DbDepartmentManager departmentManager = dbManager.getDepartmentManager();
		int id = selectedNode.getValue().getDepartment().getId();
		try {
			department = departmentManager.loadDepartment(id);
		} catch (SQLException ex) {
			department = null;
			JOptionPane.showMessageDialog(application.getMainWindow(), 
					"Возникла ошибка при чтении информации", "Ошибка", 
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(ControllerOrganization.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		fieldName.setEnabled( department != null );
		fieldPlace.setEnabled( department != null );
		if( department == null )
			return;
		fillComponentsValues();
		setDirty(false);
	}

	@Override
	public boolean saveEditions() throws SQLException {
		StringBuilder sbMessage = new StringBuilder();
		testFieldLength("Название подразделения", fieldName, 45, sbMessage);
		testFieldLength("Место", fieldPlace, 12, sbMessage);
		if( sbMessage.length() > 0 ) {
			JOptionPane.showMessageDialog(
					mainWindow, sbMessage, "Внимание", 
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		Department d = new Department();
		d.setId( department.getId() );
		d.setName( fieldName.getText() );
		d.setPlace( fieldPlace.getText() );
		d.setOrganizationId( department.getOrganizationId() );
		dbManager.getDepartmentManager().updateDepartment( d );
		this.department = d;
		setDirty(false);
		return true;
	}

	@Override
	public void discardEditions() {
		fillComponentsValues();
		setDirty(false);
	}

	private void fillComponentsValues() {
		fieldName.setText( department.getName() );
		fieldPlace.setText( department.getPlace());
	}

	private Department department;
	private JTextField fieldName;
	private JTextField fieldPlace;
}
