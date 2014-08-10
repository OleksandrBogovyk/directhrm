/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.gui.mainwindow;

public class MainWindowController 
{
    private static MainWindowController instance;
 
    MainWindow view;

    public static MainWindowController getInstance() 
    {
        if (instance == null)
        {
            instance = new MainWindowController();
        }
        return instance;
    }
    
    public void showGUI()
    {
        view.setVisible(true);
    }

    private MainWindowController() 
    {
        view = new MainWindow();
    }
  
}
