package directhrm.db;

import directhrm.entity.Admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class DbAdminManager {

	public DbAdminManager(DbManager dbManager) {
		this.dbManager = dbManager;
	}

    public List<Admin> loadUserList() throws ClassNotFoundException, SQLException {
		List<Admin> userList = new ArrayList<>();
        Connection conn = dbManager.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM admin_tb";
            
        ResultSet rs;
        rs = stmt.executeQuery(sql);
            
        while(rs.next()){
            Admin user = new Admin();
            user.setId(rs.getInt("id"));
            user.setAdminName(rs.getString("admin_name"));
            user.setAdminFullname(rs.getString("admin_fullname"));
            user.setAdminPassword(rs.getString("admin_password"));
            user.setRegisterDate(rs.getTimestamp("admin_register"));
            user.setLastDate(rs.getTimestamp("admin_last"));
            
            userList.add(user);
        }   
		return userList;
	}
	
	private DbManager dbManager;
}
