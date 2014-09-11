package directhrm.db;

/**
 *
 * @author andre
 */
public interface DbEventListener {

	void dbEventHappened(DbEvent event);
	
}
