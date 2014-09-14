package directhrm.db;

import directhrm.entity.Person;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
	public Person loadPerson(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = 
				"SELECT person_lastname, person_name, person_middlename, "
				+ "person_dob, person_gender, person_citizenship, person_ident, "
				+ "person_driver, person_military, person_marital, person_diploma, "
				+ "person_jobber, person_work, person_tabno, department_id "
				+ "FROM person WHERE id = ?";
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery(query);
			if( !rs.next() )
				return null;
			Person p = new Person();
			p.setId( id );
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
			
			return p;
		} finally {
			if( rs != null )
				rs.close();
			if( ps != null )
				ps.close();
			if( conn != null )
				conn.close();
		}
		
	}
	
	public void updatePerson(Person person) 
	throws SQLException
	{
		Connection conn = null;
		try {
			List<DbEvent> events = new ArrayList<>();
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			updatePerson(conn, person, events);
			conn.commit();
			dbManager.notifyListeners(events);
		} catch (SQLException | RuntimeException e) {
			if( conn != null )
				conn.rollback();
			throw e;
		} finally {
			if( conn != null )
				conn.close();
		}
	}
	public void updatePerson(
			Connection conn, Person person, List<DbEvent> events) 
	throws SQLException
	{
		PreparedStatement ps = null;

		String command = 
				"UPDATE person SET "
				+ "person_lastname = ?, person_name = ?, person_middlename = ?, "
				+ "person_dob = ?, person_gender = ?, person_citizenship = ?, person_ident = ?, "
				+ "person_driver = ?, person_military = ?, person_marital = ?, person_diploma = ?, "
				+ "person_jobber = ?, person_work = ?, person_tabno = ?, department_id = ? "
				+ "WHERE id = ?";
		try {
			ps = conn.prepareStatement( command );
			int index = 1;
			ps.setString(index++, person.getLastName());
			ps.setString(index++, person.getName());
			ps.setString(index++, person.getMiddleName());
			ps.setDate(index++, DbManager.createSqlDate( person.getBirthDate() ) );
			ps.setString(index++, person.getGender());
			ps.setString(index++, person.getCitizenship());
			ps.setString(index++, person.getIdent());
			ps.setString(index++, person.getDriver());
			ps.setString(index++, person.getMilitary());
			ps.setString(index++, person.getMarital());
			ps.setString(index++, person.getDiploma());
			ps.setString(index++, person.getJobber());
			ps.setString(index++, person.getWork());
			ps.setInt(index++, person.getTabId());
			ps.setInt(index++, person.getDepartmentId());
			
			ps.setInt(index++, person.getId());
			ps.executeUpdate();
			DbEvent event = DbEvent.createPersonUpdated(person);
			events.add(event);
		} finally {
			if( ps != null )
				ps.close();
		}
	}
	
	private DbManager dbManager;
	private DataSource dataSource;
}
