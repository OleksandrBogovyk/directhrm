package directhrm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Department {
	
	public static List<Department> getOrganizationDepartments(
			List<Department> list, int organizationId)
	{
		List<Department> result = new ArrayList<>();
		for(Department d : list) {
			if( d.getOrganizationId()== organizationId )
				result.add(d);
		}
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlace2() {
		return place2;
	}

	public void setPlace2(String place2) {
		this.place2 = place2;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	private int id;
	private String name = "";
	private String place = "";
	private String place2 = "";
	private int organizationId;
}
