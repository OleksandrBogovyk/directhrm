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

	
	private Organization organization;
	private Department department;
	private Person person;
}
