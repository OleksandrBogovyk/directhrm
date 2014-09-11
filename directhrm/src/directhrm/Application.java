package directhrm;

import directhrm.db.DbManager;
import directhrm.gui.controller.ControllerStruct;
import directhrm.gui.controller.tree.ControllerStructTree;
import directhrm.gui.windows.LoginWindow;
import directhrm.gui.windows.MainWindow;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Application {

	public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
            public void run() {
				LoginWindow loginWindow = new LoginWindow();
				Application application = new Application();
				loginWindow.setApplication(application);
                loginWindow.setVisible(true);
            }
        });  
	}

	public MainWindow getMainWindow() {
		return mainWindow;
	}

	
	public DbManager getDbManager() {
		return dbManager;
	}

	public void initControllers() throws SQLException {
		controllerStruct = new ControllerStruct(this);
		controllerStruct.init();
	}
	public void showMainWindow() {
		mainWindow.setVisible(true);
	}
	
	public void showErrorMessage() {
		JOptionPane.showMessageDialog(
				mainWindow, "Возникла ошибка во время выполнения операции", 
				"Ошибка", JOptionPane.ERROR_MESSAGE);
	}
	
	private MainWindow mainWindow = new MainWindow();
	
	ControllerStruct controllerStruct;
	private DbManager dbManager = new DbManager();
}
