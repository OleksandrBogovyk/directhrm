package directhrm.entity;

/**
 *
 * @author andre
 */
public class Bonus {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	private int id = 0;
	private double sum;
	private String category = "";
}
