package directhrm.gui.action;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Organization;
import directhrm.gui.GuiUtil;
import directhrm.gui.controller.ControllerStruct;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.DlgOrganization;
import directhrm.gui.windows.MainWindow;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ActionOrganizationEdit extends DirectHrmAction {

	public ActionOrganizationEdit(Application application) {
		super( application );
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		MainWindow mainWindow = application.getMainWindow();
		ControllerStruct controllerStruct = application.getControllerStruct();
		TreeNode<NodeValue> selectedNode = controllerStruct.getSelectedNode();
		if( selectedNode == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре организацию", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}
		NodeValue value = selectedNode.getValue();
		Organization o = value.getOrganization();
		if( o == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре организацию", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}

		Organization organization = null;
		try {
			DbDepartmentManager departmentManager = 
					application.getDbManager().getDepartmentManager();
			organization = departmentManager.loadOrganization(o.getId());
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(application.getMainWindow(), 
					"Возникла ошибка при чтении информации", "Ошибка", 
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(ActionOrganizationEdit.class.getName()).log(Level.SEVERE, null, ex);
			return;
		}
		DlgOrganization dlg = new DlgOrganization(mainWindow, true, application);
		dlg.setOrganization( organization );
		dlg.pack();
		GuiUtil.centerWindow(dlg, mainWindow);
		dlg.setVisible(true);
	}
}
