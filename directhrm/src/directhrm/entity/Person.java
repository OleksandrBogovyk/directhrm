package directhrm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andre
 */
public class Person {

	public static List<Person> getDepartmentPersons(List<Person> list, int departmentId) {
		List<Person> result = new ArrayList<>();
		for(Person p : list) {
			if( p.getDepartmentId() == departmentId )
				result.add(p);
		}
		return result;
	}
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getMilitary() {
		return military;
	}

	public void setMilitary(String military) {
		this.military = military;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getJobber() {
		return jobber;
	}

	public void setJobber(String jobber) {
		this.jobber = jobber;
	}

	public int getTabId() {
		return tabId;
	}

	public void setTabId(int tabId) {
		this.tabId = tabId;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	
	
	private int id;
	private String name = "";
	private String middleName = "";
	private String lastName = "";
	private Date birthDate;
	private String gender;
	private String citizenship = "";
	private String ident = "";
	private String driver;
	private String military;
	private String marital;
	private String diploma;
	private String jobber;
	private String work;
	private int tabId;
	
	private int departmentId;
	
}
