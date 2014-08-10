/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.gui.registerAdminUserWindow;

import directhrm.domain.Admin;
import directhrm.persist.dao.AdminDao;
import directhrm.util.PasswordAuthenticateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterAdminUserWindowModel 
{
    public void registerNewAdminUser(String userName, String userEnteredPassword)
    {        
        try 
        {
            String encryptedPassword = PasswordAuthenticateUtil.getInstance().getEncryptedPassword(userEnteredPassword);
            Admin newAdminUser = new Admin(userName, encryptedPassword);
            AdminDao.getInstance().create(newAdminUser);
        } catch (Exception ex) 
        {
            Logger.getLogger(RegisterAdminUserWindowModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) 
    {
        AdminDao.getInstance().deleteById(1);
        AdminDao.getInstance().deleteById(2);
        AdminDao.getInstance().deleteById(3);
        
        RegisterAdminUserWindowModel model = new RegisterAdminUserWindowModel();
        model.registerNewAdminUser("Admin", "admin");
        
    }
    
}
