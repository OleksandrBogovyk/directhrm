/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directhrm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Александр
 */
public class DbAdminManager {
    
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

    public Vector getAdminListTable(){
        Vector<Object> rows = new Vector<>();
        
        rows.add(admin_name);
        rows.add(admin_fullname);
        rows.add(admin_password);
	rows.add(admin_register);
        rows.add(admin_last);
        return rows;  
    }
    
    public List<DbAdminManager> loadUserList() throws ClassNotFoundException, SQLException {
		List<DbAdminManager> userList = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        
        // DbManager dm = new DbManager();
        // Connection conn = dm.getConnection();
        // !!!!!!!!! ---------------- Отсюда не получает Connection (работает, но выдает ошибку SQL Exception - SEVERE: NULL) ---------------- !!!!!!!!!
        
        // !!!!!!!!! ---------------- Напрямую через DriverManager РАБОТАЕТ ---------------- !!!!!!!!!

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        //
        Statement stmt = conn.createStatement();
        String sql = "SELECT admin_name, admin_fullname, admin_password, admin_register, admin_last FROM admin_tb";
            
        ResultSet rs;
        rs = stmt.executeQuery(sql);
            
        while(rs.next()){
            DbAdminManager user = new DbAdminManager();
            user.setAdminName(rs.getString("admin_name"));
            user.setAdminFullname(rs.getString("admin_fullname"));
            user.setAdminPassword(rs.getString("admin_password"));
            user.setRegisterDate(rs.getTimestamp("admin_register"));
            user.setLastDate(rs.getTimestamp("admin_last"));
            
            userList.add(user);
        }   
		return userList;
	} 
    
    private String admin_name;
    private String admin_fullname;
    private String admin_password;
    private Timestamp admin_register;
    private Timestamp admin_last;
    
}
