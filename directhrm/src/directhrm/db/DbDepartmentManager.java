package directhrm.db;

import directhrm.entity.Department;
import directhrm.entity.Organization;
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
public class DbDepartmentManager {

	public DbDepartmentManager(DataSource dataSource) {
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
				o.setName( rs.getString("organization_name") );
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
	
	
	private DataSource dataSource;
}
