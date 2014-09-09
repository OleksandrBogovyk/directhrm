package directhrm.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import static directhrm.gui.windows.LoginWindow.bytesToHex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.DataSource;

/**
 *
 * @author andre
 */
public class DbManager {

	public static Date fetchDate(ResultSet rs, String colname) throws SQLException {
		java.sql.Date date = rs.getDate(colname);
		if( date == null )
			return null;
		return new Date( date.getTime() ); 
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public DbDepartmentManager getDepartmentManager() {
		return departmentManager;
	}

	public DbPersonManager getPersonManager() {
		return personManager;
	}
	
	
	public String tryLogin(
			String server, String port, String database,
			String dbUser, String dbPassword) 
	throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	SQLException, NoSuchAlgorithmException 
	{
		//if( true )
		//	return ""; // For debug reason
		String url = String.format(
				"jdbc:mysql://%s:%s/%s", server, port, database);
		MysqlDataSource ds = new MysqlDataSource();
		ds.setURL( url );
		ds.setUser(dbUser);
		ds.setPassword(dbPassword);
		dataSource = ds;
		
		Connection conn = dataSource.getConnection();
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		//String URL = "jdbc:mysql://localhost:3306/hrms";
		//Connection conn = (Connection) DriverManager.getConnection(URL, "root", "mysqlroot");
		try (Statement stm = conn.createStatement()) {
			ResultSet rst = stm.executeQuery("SELECT admin_name, admin_password FROM admin_tb where admin_name=\"" + dbUser + "\"");
			while (rst.next()) {
				String dbadm = rst.getString("admin_name");
				String dbpwd = rst.getString("admin_password");
				System.out.println(dbadm + " " + dbpwd);
				MessageDigest md = MessageDigest.getInstance("SHA1");
				StringBuilder salt = new StringBuilder("Zxczxc123");
				String hashpwd = salt.append(dbPassword).toString();
				md.update(hashpwd.getBytes());
				byte[] output = md.digest();
				String outpwd = bytesToHex(output);

				if (dbadm.equals(dbUser) && !dbpwd.equals(outpwd)) {
					return "Ошибка авторизации! Пожалуйста, попробуйте ещё раз.";
				}
			}
			
			departmentManager = new DbDepartmentManager(dataSource);
			personManager = new DbPersonManager(dataSource);
			
			return "";
		}
	}
	
	private DataSource dataSource;
	private DbDepartmentManager departmentManager;
	private DbPersonManager personManager;
}
