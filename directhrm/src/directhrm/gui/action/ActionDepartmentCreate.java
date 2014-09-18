package directhrm.gui.action;

import directhrm.Application;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.gui.GuiUtil;
import directhrm.gui.controller.ControllerStruct;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.DlgDepartment;
import directhrm.gui.windows.MainWindow;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ActionDepartmentCreate extends DirectHrmAction {

	public ActionDepartmentCreate(Application application) {
		super(application);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainWindow mainWindow = application.getMainWindow();
		ControllerStruct controllerStruct = application.getControllerStruct();
		TreeNode<NodeValue> selectedNode = controllerStruct.getSelectedNode();
		if( selectedNode == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре организацию, в которой создается подразделение", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}
		NodeValue value = selectedNode.getValue();
		Organization o = value.getOrganization();
		if( o == null ) {
			JOptionPane.showMessageDialog(
					mainWindow, "Нужно выбрать в структуре организацию, в которой создается подразделение", 
					"Внимание", JOptionPane.ERROR_MESSAGE);
			return;
		}
		Department department = new Department();
		department.setOrganizationId( o.getId() );
		DlgDepartment dlg = new DlgDepartment(mainWindow, true, application);
		dlg.setDepartment( department );
		dlg.pack();
		GuiUtil.centerWindow(dlg, mainWindow);
		dlg.setVisible(true);
	}

}
