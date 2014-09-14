package directhrm.db;

import directhrm.entity.Department;
import directhrm.entity.Organization;
import java.sql.Connection;
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
public class DbDepartmentManager {

	public DbDepartmentManager(DbManager dbManager, DataSource dataSource) {
		this.dbManager = dbManager;
		this.dataSource = dataSource;
	}
	
	public List<Organization> loadOrganizationList() throws SQLException {
		List<Organization> list = new ArrayList<>();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery(
					"SELECT id, organization_name "
							+ "FROM organization ORDER BY organization_name");
			while( rs.next() ) {
				Organization o = new Organization();
				o.setId( rs.getInt("id") );
				o.setName( DbManager.fetchNotNullString(rs, "organization_name") );
				list.add(o);
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
	public Organization loadOrganization(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(
					"SELECT organization_name FROM organization WHERE id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if( !rs.next() )
				return null;
			Organization o = new Organization();
			o.setId( id );
			o.setName( DbManager.fetchNotNullString(rs, "organization_name") );
			
			return o;
		} finally {
			if( rs != null )
				rs.close();
			if( ps != null )
				ps.close();
			if( conn != null )
				conn.close();
		}
	}
	
	public void updateOrganization(Organization organization) 
	throws SQLException
	{
		Connection conn = null;
		try {
			List<DbEvent> events = new ArrayList<>();
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			updateOrganization(conn, organization, events);
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
	public void updateOrganization(
			Connection conn, Organization organization, List<DbEvent> events) 
	throws SQLException
	{
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(
					"UPDATE organization SET organization_name = ? WHERE id = ?");
			ps.setString(1, organization.getName());
			ps.setInt(2, organization.getId());
			ps.executeUpdate();
			DbEvent event = DbEvent.createOrganizationUpdated(organization);
			events.add(event);
		} finally {
			if( ps != null )
				ps.close();
		}
	}
	
	public List<Department> loadDepartmentList() throws SQLException {
		List<Department> list = new ArrayList<>();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery(
					"SELECT id, department_name, department_place, organization_id "
							+ "FROM department ORDER BY department_name");
			while( rs.next() ) {
				Department d = new Department();
				d.setId( rs.getInt("id") );
				d.setName( rs.getString("department_name") );
				d.setPlace( rs.getString("department_place") );
				d.setOrganizationId(rs.getInt("organization_id") );
				list.add(d);
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
	public Department loadDepartment(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(
					"SELECT department_name, department_place, organization_id "
					+ "FROM department WHERE id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if( !rs.next() )
				return null;
			Department d = new Department();
			d.setId( id );
			d.setName( DbManager.fetchNotNullString(rs, "department_name") );
			d.setPlace(DbManager.fetchNotNullString(rs, "department_place") );
			d.setOrganizationId( rs.getInt("organization_id") );
			
			return d;
		} finally {
			if( rs != null )
				rs.close();
			if( ps != null )
				ps.close();
			if( conn != null )
				conn.close();
		}
	}
	
	public void updateDepartment(Department department) 
	throws SQLException
	{
		Connection conn = null;
		try {
			List<DbEvent> events = new ArrayList<>();
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			updateDepartment(conn, department, events);
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
	public void updateDepartment(
			Connection conn, Department department, List<DbEvent> events) 
	throws SQLException
	{
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(
					"UPDATE department SET "
					+ "department_name = ?, department_place = ?, organization_id = ? "
					+ "WHERE id = ?");
			ps.setString(1, department.getName());
			ps.setString(2, department.getPlace());
			ps.setInt(3, department.getOrganizationId());
			ps.setInt(4, department.getId());
			ps.executeUpdate();
			DbEvent event = DbEvent.createDepartmentUpdated(department);
			events.add(event);
		} finally {
			if( ps != null )
				ps.close();
		}
	}

	private DbManager dbManager;
	private DataSource dataSource;
}
