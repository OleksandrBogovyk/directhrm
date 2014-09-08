package directhrm;

import directhrm.db.DbManager;
import directhrm.gui.windows.LoginWindow;
import directhrm.gui.windows.MainWindow;

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

	public DbManager getDbManager() {
		return dbManager;
	}
	
	public void showMainWindow() {
		mainWindow = new MainWindow();
		mainWindow.setVisible(true);
	}
	
	private MainWindow mainWindow;
	private DbManager dbManager = new DbManager();
}
