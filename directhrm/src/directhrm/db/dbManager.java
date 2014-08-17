/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ABogovik
 */
public class dbManager {
    public String logname, logpassword, loghost, logport;
    
    public void setName(String newname) {
        this.logname = newname;
    }
    
    public void setPassword(String newpass) {
        this.logpassword = newpass;
    }
    
    public void setDb(String newdb) {
        this.loghost = newdb;
    }
    
    public void setPort(String newport) {
        this.logport = newport;
    }
    /*
    public void logInto(String logname, String logpassword, String loghost, String logport) throws SQLException {
                try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String URL = "jdbc:mysql://"+this.loghost+":"+this.logport+"/hrms";
        Connection conn = (Connection) DriverManager.getConnection(URL,this.logname,this.logpassword);
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT name FROM admin_tb");
        while(rst.next()){
                String name = rst.getString("name");
                System.out.println(name);
            }
            stm.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println(ex);
        }
    }
    */
}
