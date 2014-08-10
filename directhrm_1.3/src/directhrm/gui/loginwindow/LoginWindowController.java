/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.gui.loginwindow;

import directhrm.gui.mainwindow.MainWindowController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginWindowController 
{
    private static LoginWindowController instance;
    private final LoginWindow view;
    private final LoginWindowModel model;

    public static LoginWindowController getInstance() 
    {
        if (instance == null)
        {
            instance = new LoginWindowController();
        }
        return instance;
    }

    private LoginWindowController() 
    {
        this.view = new LoginWindow();
        this.model = new LoginWindowModel();
        view.registerOkButtonListener(getOkButtonListener());
    }
        
    private ActionListener getOkButtonListener()
    {
        ActionListener okButtonListener = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                try 
                {
                    LoginWindowModel.LoginStatus loginStatus = model.logIn(view.getUserName(), view.getPassword(), view.getDatabase());
                    if (loginStatus.isLoginSucessful())
                    {
                        view.setVisible(false);
                        MainWindowController.getInstance().showGUI();
                    }
                    else
                    {
                        view.showErrorMessage(loginStatus.getMessage());
                    }
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(LoginWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        return okButtonListener;
    }
    
    private void showGUI() 
    {
        view.setVisible(true);
    }
        
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                LoginWindowController controller = LoginWindowController.getInstance();
                controller.showGUI();
            }
        });
    }

}
