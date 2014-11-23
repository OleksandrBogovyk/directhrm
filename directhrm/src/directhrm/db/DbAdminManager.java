/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directhrm.db;

import java.sql.Timestamp;
import java.util.Vector;

/**
 *
 * @author Александр
 */
public class DbAdminManager {
    public void setId(int id){
        this.id = id;
    }
    
    public void setAdminName(String admin_name){
        this.admin_name = admin_name;
    }
    
    public void setAdminFullname(String admin_fullname){
        this.admin_fullname = admin_fullname;
    }
    
    public void setAdminPassword(String admin_password){
        this.admin_password = admin_password;
    }
    
    public void setRegisterDate(Timestamp admin_register){
       this.admin_register = admin_register;
    }
    
    public void setLastDate(Timestamp admin_last){
        this.admin_last = admin_last;
    }

    public Vector getDataBack(){
        Vector<Object> rows = new Vector<>();
        
        rows.add(id);
        rows.add(admin_name);
        rows.add(admin_fullname);
        rows.add(admin_password);
	rows.add(admin_register);
        rows.add(admin_last);
        return rows;  
    }
    
    // TODO: Перенести loadUserList() сюда! 
    
    private int id;
    private String admin_name;
    private String admin_fullname;
    private String admin_password;
    private Timestamp admin_register;
    private Timestamp admin_last;
    
}
