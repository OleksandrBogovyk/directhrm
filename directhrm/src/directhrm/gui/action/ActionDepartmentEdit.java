package directhrm.gui.action;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.gui.GuiUtil;
import directhrm.gui.controller.ControllerStruct;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.DlgDepartment;
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
public class ActionDepartmentEdit extends DirectHrmAction {

	public ActionDepartmentEdit(Application application) {
		super(application);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainWindow mainWindow = application.getMainWindow();
		ControllerStruct controllerStruct = application.getControllerStruct();
		TreeNode<NodeValue> selectedNode = controllerStruct.getSelectedNode();
		if( selectedNode == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре подразделение", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}
		NodeValue value = selectedNode.getValue();
		Department d = value.getDepartment();
		if( d == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре подразделение", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}

		Department department = null;
		try {
			DbDepartmentManager departmentManager = 
					application.getDbManager().getDepartmentManager();
			department = departmentManager.loadDepartment(d.getId());
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(application.getMainWindow(), 
					"Возникла ошибка при чтении информации", "Ошибка", 
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(ActionOrganizationEdit.class.getName()).log(Level.SEVERE, null, ex);
			return;
		}
		DlgDepartment dlg = new DlgDepartment(mainWindow, true, application);
		dlg.setDepartment(department);
		dlg.pack();
		GuiUtil.centerWindow(dlg, mainWindow);
		dlg.setVisible(true);
	}

}
