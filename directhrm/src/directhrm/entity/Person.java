package directhrm.entity;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Person {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public char getDriver() {
		return driver;
	}

	public void setDriver(char driver) {
		this.driver = driver;
	}

	public char getMilitary() {
		return military;
	}

	public void setMilitary(char military) {
		this.military = military;
	}

	public char getMartial() {
		return martial;
	}

	public void setMartial(char martial) {
		this.martial = martial;
	}

	public char getDiploma() {
		return diploma;
	}

	public void setDiploma(char diploma) {
		this.diploma = diploma;
	}

	public char getJobber() {
		return jobber;
	}

	public void setJobber(char jobber) {
		this.jobber = jobber;
	}

	public int getTabId() {
		return tabId;
	}

	public void setTabId(int tabId) {
		this.tabId = tabId;
	}

	
	
	private int id;
	private String name = "";
	private String middleName = "";
	private String lastName = "";
	private Date birthDate;
	private char gender;
	private String citizenship = "";
	private String ident = "";
	private char driver;
	private char military;
	private char martial;
	private char diploma;
	private char jobber;
	private int tabId;
	
}
