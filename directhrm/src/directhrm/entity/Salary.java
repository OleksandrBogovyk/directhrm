package directhrm.entity;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Salary {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private int id;
	private double value;
	private Date date;
}
