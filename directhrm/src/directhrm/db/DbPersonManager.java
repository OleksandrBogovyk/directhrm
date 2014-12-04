package directhrm.db;

import directhrm.entity.Contact;
import directhrm.entity.Contract;
import directhrm.entity.Diploma;
import directhrm.entity.Experience;
import directhrm.entity.Passport;
import directhrm.entity.Person;
import directhrm.entity.PersonPosition;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class DbPersonManager {

	public DbPersonManager(DbManager dbManager) {
		this.dbManager = dbManager;
	}

	public List<Person> loadPersonList() throws SQLException {
		List<Person> list = new ArrayList<>();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		String query = 
				"SELECT id FROM person "
				+ "ORDER BY person_lastname, person_name, person_middlename";
		try {
			conn = dbManager.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			List<Integer> ids = new ArrayList<>();
			while( rs.next() ) {
				ids.add( rs.getInt("id") );
			}
			rs.close();
			rs = null;
			
			for(int id : ids) {
				Person p = loadPerson(conn, id);
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
	public Person loadPerson(Connection conn, int id) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = dbManager.getConnection();
			String query = 
					"SELECT person_lastname, person_name, person_middlename, "
					+ "person_dob, person_gender, person_citizenship, person_ident, "
					+ "person_driver, person_marital, person_army, person_diploma, "
					+ "person_jobber, person_tabno, department_id, "
					+ "contact_id, contract_id, passport_id, about_id "
					+ "FROM person WHERE id = " + id;
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			if( !rs.next() )
				return null;
			Person p = new Person();
			p.setId( id );
			p.setLastName( rs.getString("person_lastname") );
			p.setName(rs.getString("person_name") );
			p.setMiddleName(rs.getString("person_middlename") );
			p.setGender( rs.getString("person_gender") );
			p.setCitizenship(rs.getString("person_citizenship") );
			p.setIdent(rs.getString("person_ident") );
			p.setBirthDate( DbManager.fetchDate(rs, "person_dob") );
			p.setDriver( rs.getString("person_driver") );
			p.setArmy( rs.getString("person_army") );
			p.setMarital(rs.getString("person_marital") );
			p.setHighEducation(rs.getString("person_diploma") );
			p.setJobber(rs.getString("person_jobber") );
			p.setTabId(rs.getInt("person_tabno") );
			p.setDepartmentId(rs.getInt("department_id") );
			int contactId = rs.getInt("contact_id");
			int contractId = rs.getInt("contract_id");
			int passportId = rs.getInt("passport_id");
			int aboutId = rs.getInt("about_id");
			
			rs.close();
			ps.close();

			if( aboutId > 0 ) {
				query = 
						"SELECT about_text FROM about WHERE id = " + aboutId;
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery(query);
				if( rs.next() ) {
					String about = rs.getString("about_text");
					p.setAbout(about);
				}
				rs.close();
				ps.close();
			}

			if( contactId > 0 ) {
				query = 
						"SELECT contact_city, contact_address, zipcode, contact_phone, "
						+ "contact_phone2, contact_email, contact_email2, "
						+ "skype, notes "
						+ "FROM contact WHERE id = " + contactId;
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery(query);
				if( rs.next() ) {
					Contact contact = p.getContact();
					contact.setId(contactId);
					contact.setCity( rs.getString("contact_city") );
					contact.setAddress(rs.getString("contact_address") );
					contact.setZipcode(rs.getString("zipcode") );
					contact.setPhone(rs.getString("contact_phone") );
					contact.setPhone2(rs.getString("contact_phone2") );
					contact.setEmail(rs.getString("contact_email") );
					contact.setEmail2(rs.getString("contact_email2") );
					contact.setSkype(rs.getString("skype") );
					contact.setNotes(rs.getString("notes") );
					p.setContact(contact);
				}
				rs.close();
				ps.close();
			}

			if( contractId > 0 ) {
				query = 
						"SELECT contract_number, contract_date "
						+ "FROM contract WHERE id = " + contractId;
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery(query);
				if( rs.next() ) {
					Contract contract = new Contract();
					contract.setId(contractId);
					contract.setNumber( rs.getString("contract_number") );
					contract.setDate(DbManager.fetchDate(rs, "contract_date") );
					p.setContract(contract);
				}
				rs.close();
				ps.close();
			}

			query = 
					"SELECT id, position_name, position_hiredate, position_firedate "
					+ "FROM position WHERE position_firedate IS NULL AND person_id = " + p.getId();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			if( rs.next() ) {
				PersonPosition position = new PersonPosition();
				position.setId(rs.getInt("id"));
				position.setName( rs.getString("position_name") );
				position.setHireDate(DbManager.fetchDate(rs, "position_hiredate") );
				position.setFireDate(DbManager.fetchDate(rs, "position_firedate") );
				p.setPosition(position);
			}
			rs.close();
			ps.close();

//			query = 
//					"SELECT id, diploma_name, diploma_year "
//					+ "FROM diploma WHERE person_id = " + p.getId();
//			ps = conn.prepareStatement(query);
//			rs = ps.executeQuery(query);
//			if( rs.next() ) {
//				Diploma diploma = p.getDiploma();
//				diploma.setId(rs.getInt("id"));
//				diploma.setName(rs.getString("diploma_name") );
//				p.setDiploma(diploma);
//			}
//			rs.close();
//			ps.close();

			if( passportId > 0 ) {
				query = 
						"SELECT passport_snum, passport_date, passport_issue "
						+ "FROM passport WHERE id = " + passportId;
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery(query);
				if( rs.next() ) {
					Passport passport = p.getPassport();
					passport.setId(contractId);
					passport.setSnum(rs.getString("passport_snum") );
					passport.setDate(DbManager.fetchDate(rs, "passport_date") );
					passport.setIssue(rs.getString("passport_issue") );
					p.setPassport(passport);
				}
				rs.close();
				ps.close();
			}
			
			query = 
					"SELECT id, experience_company, experience_position, experience_dbegin, "
					+ "experience_dend, experience_freason, experience_years "
					+ "FROM experience WHERE person_id = " + p.getId() + " ORDER BY experience_dbegin DESC";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			while( rs.next() ) {
				Experience e = new Experience();
				e.setId( rs.getInt("id") );
				e.setCompany( rs.getString("experience_company") );
				e.setPosition( rs.getString("experience_position") );
				e.setDateBegin( DbManager.fetchDate(rs, "experience_dbegin") );
				e.setDateEnd( DbManager.fetchDate(rs, "experience_dend") );
				e.setFireReason( rs.getString("experience_freason") );
				e.setYears( rs.getInt("experience_years") );
				p.addExperience(e);
			}
			rs.close();
			ps.close();

			rs = null;
			ps = null;
			
			return p;
		} finally {
			if( rs != null )
				rs.close();
			if( ps != null )
				ps.close();
		}
		
	}
	
	public void updatePerson(Person person) 
	throws SQLException
	{
		Connection conn = null;
		try {
			List<DbEvent> events = new ArrayList<>();
			conn = dbManager.getConnection();
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
				+ "person_driver = ?, person_army = ?, person_marital = ?, person_diploma = ?, "
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
			ps.setString(index++, person.getArmy());
			ps.setString(index++, person.getMarital());
			ps.setString(index++, person.getHighEducation());
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
}
