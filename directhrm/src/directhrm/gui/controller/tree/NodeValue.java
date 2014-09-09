package directhrm.gui.controller.tree;

import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;

/**
 *
 * @author andre
 */
public class NodeValue {

	public NodeValue() {
	}

	public NodeValue(Organization organization) {
		this.organization = organization;
	}

	public NodeValue(Department department) {
		this.department = department;
	}

	public NodeValue(Person person) {
		this.person = person;
	}

	
	@Override
	public String toString() {
		if( organization != null ) {
			return organization.getName();
		}
		if( department != null ) {
			return department.getName();
		}
		if( person != null ) {
			return String.format("%s %s %s", 
					person.getLastName(), person.getName(), person.getMiddleName());
		}
		return "Структура";
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

	
	private Organization organization;
	private Department department;
	private Person person;
}
