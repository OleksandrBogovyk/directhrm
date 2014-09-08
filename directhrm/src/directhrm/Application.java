package directhrm;

import directhrm.db.DbManager;
import directhrm.gui.controller.tree.ControllerStructTree;
import directhrm.gui.windows.LoginWindow;
import directhrm.gui.windows.MainWindow;
import java.sql.SQLException;

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
		controllerStructTree = new ControllerStructTree( this );
		controllerStructTree.init();
		
	}
	public void showMainWindow() {
		mainWindow.setVisible(true);
	}
	
	private MainWindow mainWindow = new MainWindow();
	
	private ControllerStructTree controllerStructTree;
	
	private DbManager dbManager = new DbManager();
}
