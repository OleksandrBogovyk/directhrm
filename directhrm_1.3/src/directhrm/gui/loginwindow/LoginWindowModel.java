/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.gui.loginwindow;

import directhrm.persist.dao.AdminDao;
import directhrm.domain.Admin;
import directhrm.util.PasswordAuthenticateUtil;

public class LoginWindowModel 
{
    enum LoginStatus
    {
        SUCESS("Log in sucessful")
        , FAIL("Entered user name/password is invalid")
        , EMPTY_USER_NAME ("User name can not be empty")
        , EMPTY_PASSWORD ("Password can not be empty")
        , EMPTY_DATABASE ("Database can not be empty")
        ;
        
        private final String message;

        private LoginStatus(String message) 
        {
            this.message = message;
        }

        public String getMessage() 
        {
            return message;
        }
        
        public boolean isLoginSucessful()
        {
            return this == LoginStatus.SUCESS;
        }
    }
    
    public LoginStatus logIn(String userName, String attemtedPassword, String database) throws Exception
    {
        LoginStatus loginStatus = null;
        if (isNullOrEmpty(userName))
        {
            loginStatus = LoginStatus.EMPTY_USER_NAME;            
        }
        else if (isNullOrEmpty(attemtedPassword))
        {
            loginStatus = LoginStatus.EMPTY_PASSWORD;
        }
        else if (isNullOrEmpty(database))
        {
            loginStatus = LoginStatus.EMPTY_DATABASE;            
        }
        else
        {
            Admin admin = AdminDao.getInstance().getByUserName(userName);
            if (admin == null)
            {
                loginStatus = LoginStatus.FAIL;
            }
            else
            {
                boolean authenticateSuccess = PasswordAuthenticateUtil.getInstance().authenticate(attemtedPassword, admin.getAdminPassword());
                loginStatus = authenticateSuccess ? LoginStatus.SUCESS : LoginStatus.FAIL;             
            }
        } 
        return loginStatus;
    }
    
    private boolean isNullOrEmpty(String input)
    {
        return input == null || input.isEmpty();
    }
}
