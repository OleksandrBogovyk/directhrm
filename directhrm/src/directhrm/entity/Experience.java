package directhrm.entity;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Experience {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getFireReason() {
		return fireReason;
	}

	public void setFireReason(String fireReason) {
		this.fireReason = fireReason;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	private int id = 0;
	private String company = "";
	private String position = "";
	private Date dateBegin = null;
	private Date dateEnd = null;
	private String fireReason = "";
	private int years = 0;
}
