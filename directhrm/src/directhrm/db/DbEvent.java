package directhrm.db;

import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;

/**
 *
 * @author andre
 */
public class DbEvent {

	public static enum DbEventType {
		ORGANIZATION_INSERTED, ORGANIZAION_UPDATED, ORGANIZATION_DELETED,
		DEPARTMENT_INSERTED, DEPARTMENT_UPDATED, DEPARTMENT_DELETED,
		PERSON_INSERTED, PERSON_UPDATED, PERSON_DELETED,
	};
	
	public static DbEvent createOrganizationUpdated(Organization o) {
		DbEvent event = new DbEvent();
		event.type = DbEventType.ORGANIZAION_UPDATED;
		event.organization = o;
		return event;
	}

	public static DbEvent createDepartmentUpdated(Department d) {
		DbEvent event = new DbEvent();
		event.type = DbEventType.DEPARTMENT_UPDATED;
		event.department = d;
		return event;
	}

	public static DbEvent createPersonUpdated(Person p) {
		DbEvent event = new DbEvent();
		event.type = DbEventType.PERSON_UPDATED;
		event.person = p;
		return event;
	}
	
	public DbEventType getType() {
		return type;
	}

	public Organization getOrganization() {
		return organization;
	}

	public Department getDepartment() {
		return department;
	}

	public Person getPerson() {
		return person;
	}
	
	private DbEventType type;
	private Organization organization;
	private Department department;
	private Person person;
}
