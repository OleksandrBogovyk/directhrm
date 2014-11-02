package directhrm.entity;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Passport {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	private int id = 0;
	private String snum = "";
	private Date date;
	private String issue = "";
}
