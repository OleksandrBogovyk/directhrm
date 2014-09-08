package directhrm.db;

import com.mysql.jdbc.Connection;
import static directhrm.gui.windows.LoginWindow.bytesToHex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author andre
 */
public class DbManager {

	public String tryLogin(
			String server, String port, String database,
			String dbUser, String dbPassword) 
	throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	SQLException, NoSuchAlgorithmException 
	{
		if( true )
			return ""; // For debug reason
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String URL = "jdbc:mysql://localhost:3306/hrms";
		Connection conn = (Connection) DriverManager.getConnection(URL, "root", "mysqlroot");
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

				if (dbadm.equals(dbUser) && dbpwd.equals(outpwd)) {
					return "";
				} else {
					return "Ошибка авторизации! Пожалуйста, попробуйте ещё раз.";
				}
			}
		}
		return "";
	}
}
