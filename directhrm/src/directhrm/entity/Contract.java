package directhrm.entity;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Contract {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private int id = 0;
	private String number = "";
	private Date date;
}
