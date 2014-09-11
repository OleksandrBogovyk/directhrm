package directhrm.db;

import directhrm.entity.Organization;

/**
 *
 * @author andre
 */
public class DbEvent {

	public static enum DbEventType {
		ORGANIZATION_INSERTED, ORGANIZAION_UPDATED, ORGANIZATION_DELETED
	};
	
	public static DbEvent createOrganizationUpdated(Organization o) {
		DbEvent event = new DbEvent();
		event.type = DbEventType.ORGANIZAION_UPDATED;
		event.organization = o;
		return event;
	}

	public DbEventType getType() {
		return type;
	}

	public Organization getOrganization() {
		return organization;
	}

	
	
	private DbEventType type;
	private Organization organization;
}
