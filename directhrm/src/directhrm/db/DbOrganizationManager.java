/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directhrm.db;

import directhrm.entity.Organization;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbOrganizationManager {
    
    public DbOrganizationManager(DbManager dbManager) {
		this.dbManager = dbManager;
	}
    
    public List<Organization> loadOrganizationList() throws ClassNotFoundException, SQLException {
		List<Organization> orgList = new ArrayList<>();
        Connection conn = dbManager.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM organization";
            
        ResultSet rs;
        rs = stmt.executeQuery(sql);
            
        while(rs.next()){
            Organization o = new Organization();
            
            o.setOrganizationName(rs.getString("admin_name"));
            o.setOrganizationZip(rs.getInt("admin_fullname"));
            o.setOrganizationCity(rs.getString("admin_password"));
            // TODO!!! 
            orgList.add(o);
        }   
		return orgList;
	}
	
	private DbManager dbManager;
}
