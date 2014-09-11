package directhrm.db;

import directhrm.entity.Organization;
import directhrm.entity.Person;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author andre
 */
public class DbPersonManager {

	public DbPersonManager(DbManager dbManager, DataSource dataSource) {
		this.dbManager = dbManager;
		this.dataSource = dataSource;
	}

	public List<Person> loadPersonList() throws SQLException {
		List<Person> list = new ArrayList<>();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		String query = 
				"SELECT id, person_lastname, person_name, person_middlename, "
				+ "person_dob, person_gender, person_citizenship, person_ident, "
				+ "person_driver, person_military, person_marital, person_diploma, "
				+ "person_jobber, person_work, person_tabno, department_id "
				+ "FROM person "
				+ "ORDER BY person_lastname, person_name, person_middlename";
		try {
			conn = dataSource.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			while( rs.next() ) {
				Person p = new Person();
				p.setId( rs.getInt("id") );
				p.setLastName( rs.getString("person_lastname") );
				p.setName(rs.getString("person_name") );
				p.setMiddleName(rs.getString("person_middlename") );
				p.setBirthDate( DbManager.fetchDate(rs, "person_dob") );
				p.setDriver( rs.getString("person_driver") );
				p.setMilitary(rs.getString("person_military") );
				p.setMarital(rs.getString("person_marital") );
				p.setDiploma(rs.getString("person_diploma") );
				p.setJobber(rs.getString("person_driver") );
				p.setWork( rs.getString("person_driver") );
				p.setTabId(rs.getInt("person_tabno") );
				p.setDepartmentId(rs.getInt("department_id") );
				list.add(p);
			}
			
			return list;
		} finally {
			if( rs != null )
				rs.close();
			if( statement != null )
				statement.close();
			if( conn != null )
				conn.close();
		}
		
	}
	
	private DbManager dbManager;
	private DataSource dataSource;
}
