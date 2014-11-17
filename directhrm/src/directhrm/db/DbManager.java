package directhrm.db;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author andre
 */
public class DbManager {

	public static String fetchNotNullString(ResultSet rs, String colname) throws SQLException {
		String str = rs.getString(colname);
		if( str == null )
			str = "";
		return str; 
	}
	public static Date fetchDate(ResultSet rs, String colname) throws SQLException {
		java.sql.Date date = rs.getDate(colname);
		if( date == null )
			return null;
		return new Date( date.getTime() ); 
	}
	public static Integer fetchInteger(ResultSet rs, String colname) throws SQLException {
		int i = rs.getInt(colname);
		if( rs.wasNull() )
			return null;
		return i; 
	}

	public static java.sql.Date createSqlDate(Date date) {
		if( date == null )
			return null;
		return new java.sql.Date( date.getTime() );
	}

    private static String bytesToHex(byte[] b) {
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder buf = new StringBuilder();
            for (int j=0; j<b.length; j++) {
            buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
            buf.append(hexDigit[b[j] & 0x0f]);
            } 
            return buf.toString();
        }
	
//	public DataSource getDataSource() {
//		return dataSource;
//	}

	public DbDepartmentManager getDepartmentManager() {
		return departmentManager;
	}

	public DbPersonManager getPersonManager() {
		return personManager;
	}
	
	
	public String tryLogin(ConnectProperties prop) 
	throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	SQLException, NoSuchAlgorithmException 
	{
        Class.forName("com.mysql.jdbc.Driver");

		url = String.format("jdbc:mysql://%s:%s/%s", 
				prop.getServer(), prop.getPort(), prop.getDatabase());
		dbUser = prop.getDbUser();
		dbPassword = prop.getDbPassword();
		
		Connection conn = getConnection();
		try (Statement stm = conn.createStatement()) {
			ResultSet rst = stm.executeQuery("SELECT admin_name, admin_password FROM admin_tb where admin_name=\"" + prop.getUser() + "\"");
			while (rst.next()) {
				String dbadm = rst.getString("admin_name");
				String dbpwd = rst.getString("admin_password");
				MessageDigest md = MessageDigest.getInstance("SHA1");
				// Изменить соль на "D!rect*Hrm_"
                StringBuilder salt = new StringBuilder("Zxczxc123");
				String hashpwd = salt.append(prop.getPassword()).toString();
				md.update(hashpwd.getBytes());
				byte[] output = md.digest();
				String outpwd = bytesToHex(output);

				if (!dbadm.equals(prop.getPassword()) && !dbpwd.equals(outpwd)) {
					return "Ошибка авторизации! Пожалуйста, попробуйте ещё раз.";
				}
			}
			
			departmentManager = new DbDepartmentManager(this);
			personManager = new DbPersonManager(this);
			
			return "";
		}
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, dbUser, dbPassword);
	}
	
	public void addDbEventListener(DbEventListener l) {
		listeners.add( l );
	}
	public void removeDbEventListener(DbEventListener l) {
		listeners.remove( l );
	}
	public void notifyListeners(List<DbEvent> events) {
		for(DbEvent e : events) {
			for(DbEventListener l : listeners) {
				try {
					l.dbEventHappened(e);
				} catch (RuntimeException ex) {
				Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

	private String url;
	private String dbUser;
	private String dbPassword;
	
	private DataSource dataSource;
	private DbDepartmentManager departmentManager;
	private DbPersonManager personManager;
	
	private List<DbEventListener> listeners = new ArrayList<>();
}
