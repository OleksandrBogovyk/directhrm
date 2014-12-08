package directhrm.entity;

/**
 *
 * @author andre
 */
public class Worktime {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	private int id;
	private String from = "";
	private String to = "";
}
