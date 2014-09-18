package directhrm.gui.action;

import directhrm.Application;
import directhrm.entity.Organization;
import directhrm.gui.GuiUtil;
import directhrm.gui.windows.DlgOrganization;
import directhrm.gui.windows.MainWindow;
import java.awt.event.ActionEvent;

/**
 *
 * @author andre
 */
public class ActionOrganizationCreate extends DirectHrmAction {

	public ActionOrganizationCreate(Application application) {
		super(application);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainWindow mainWindow = application.getMainWindow();
		Organization organization = new Organization();
		DlgOrganization dlg = new DlgOrganization(mainWindow, true, application);
		dlg.setOrganization( organization );
		dlg.pack();
		GuiUtil.centerWindow(dlg, mainWindow);
		dlg.setVisible(true);
	}
	
}
