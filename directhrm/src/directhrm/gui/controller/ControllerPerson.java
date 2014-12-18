package directhrm.gui.controller;

import directhrm.Application;
import directhrm.entity.Contact;
import directhrm.entity.Contract;
import directhrm.entity.Department;
import directhrm.entity.Experience;
import directhrm.entity.Organization;
import directhrm.entity.Passport;
import directhrm.entity.Person;
import directhrm.entity.PersonPosition;
import directhrm.entity.Worktime;
import directhrm.gui.controller.component.ControllerCheckBox;
import directhrm.gui.controller.component.ControllerComboBox;
import directhrm.gui.controller.component.ControllerComponent;
import directhrm.gui.controller.component.ControllerRadioButtons;
import directhrm.gui.controller.component.ControllerTextArea;
import directhrm.gui.controller.component.ControllerTextField;
import directhrm.gui.controller.component.ControllerTextFieldDate;
import directhrm.gui.controller.component.ControllerTextFieldDecimal;
import directhrm.gui.controller.component.ControllerTextFieldInteger;
import directhrm.gui.controller.component.DateChangeListener;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.img.icon.Icons;
import directhrm.util.Property;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class ControllerPerson extends ControllerStructNode {

	public ControllerPerson(Application application) {
		super(application);
		initFieldControllers();
		
		java.net.URL imgURL = Icons.class.getResource("default_photo.png");
		iconDefaultPhoto = new ImageIcon(imgURL);
		
		setValue( null, (NodeValue)null );
	}
        
	private void initFieldControllers() {
		
		areaAbout = new ControllerTextArea( mainWindow.getAreaDescription() );
		listControllers.add(areaAbout);
		
		fieldLastName = new ControllerTextField( mainWindow.getFieldLastName() );
		listControllers.add(fieldLastName);
		
		fieldName = new ControllerTextField( mainWindow.getFieldName() );
		listControllers.add(fieldName);
		
		fieldMiddleName = new ControllerTextField( mainWindow.getFieldMiddleName() );
		listControllers.add(fieldMiddleName);
		
		fieldTableId = new ControllerTextFieldInteger( mainWindow.getFieldTableId());
		listControllers.add(fieldTableId);
		
		dcBirthday = new ControllerTextFieldDate( mainWindow.getFieldBirthday() );
		dcBirthday.setDateChangeListener( new DateChangeListener() {
			@Override
			public void dateChanged() {
				setCmbAgeValue();
			}
		} );
		listControllers.add( dcBirthday );
		
		rbGender = new ControllerRadioButtons();
		rbGender.addRadioButton(mainWindow.getRbFemale(), "F");
		rbGender.addRadioButton(mainWindow.getRbMale(), "M");
		listControllers.add(rbGender);

		cmbCitizenship = new ControllerComboBox( mainWindow.getCmbCitizenship() );
		listControllers.add(cmbCitizenship);

		cmbMarital = new ControllerComboBox( mainWindow.getCmbMarital() );
		listControllers.add(cmbMarital);
		
		cbMarital = new ControllerCheckBox( mainWindow.getCbMarital() );
		listControllers.add(cbMarital);
		
		rbHighEducation = new ControllerRadioButtons();
		//rbHighEducation.addRadioButton( mainWindow.getRbHighEducationYes(), "Y");
		//rbHighEducation.addRadioButton( mainWindow.getRbHighEducationNo(), "N");
		listControllers.add(rbHighEducation);
		
		fieldDiplomaName = new ControllerTextField( mainWindow.getFieldSpeciality() );
		listControllers.add(fieldDiplomaName);
		
		cmbArmy = new ControllerComboBox( mainWindow.getCmbArmy() );
		listControllers.add( cmbArmy );
		
		fieldArmyOther = new ControllerTextField( mainWindow.getFieldArmyOther());
		listControllers.add(fieldArmyOther);
		
		cmbDriver = new ControllerComboBox( mainWindow.getCmbDriver() );
		{
			List<Property> items = new ArrayList<>();
			items.add( new Property("A", "A") );
			items.add( new Property("B", "B") );
			items.add( new Property("C", "C") );
			items.add( new Property("D", "D") );
			items.add( new Property("E", "E") );
			cmbDriver.setItems(items);
		}
		listControllers.add( cmbDriver );
		
		fieldIdent = new ControllerTextField( mainWindow.getFieldIdent() );
		listControllers.add( fieldIdent );
		
		fieldPassportSnum = new ControllerTextField( mainWindow.getFieldPassportNum() );
		listControllers.add(fieldPassportSnum);
		
		dcPassportDate = new ControllerTextFieldDate( mainWindow.getFieldPassportDate() );
		listControllers.add(dcPassportDate);
		
		fieldPassportIssue = new ControllerTextField( mainWindow.getFieldPassportGiven() );
		listControllers.add(fieldPassportIssue);

		cmbContactCity = new ControllerComboBox( mainWindow.getCmbAddressCity() );
		listControllers.add(cmbContactCity);

		fieldAddressIndex = new ControllerTextField( mainWindow.getFieldAddressIndex() );
		listControllers.add(fieldAddressIndex);

		fieldAddress = new ControllerTextField( mainWindow.getFieldAddressStreet() );
		listControllers.add(fieldAddress);

		fieldPhone1 = new ControllerTextField( mainWindow.getFieldPhoneMobile() );
		listControllers.add(fieldPhone1);

		fieldPhone2 = new ControllerTextField( mainWindow.getFieldPhoneHome() );
		listControllers.add(fieldPhone2);

		fieldEmail1 = new ControllerTextField( mainWindow.getFieldEmail() );
		listControllers.add(fieldEmail1);

		fieldEmail2 = new ControllerTextField( mainWindow.getFieldWorkEmail());
		listControllers.add(fieldEmail2);

		fieldInternalNum = new ControllerTextField( mainWindow.getFieldInternalNumber() );
		listControllers.add(fieldInternalNum);

		fieldOrganization = new ControllerTextField( mainWindow.getFieldOrganization());
		listControllers.add(fieldOrganization);

		fieldDepartment = new ControllerTextField( mainWindow.getFieldDepartment());
		listControllers.add(fieldDepartment);

		fieldPosition = new ControllerTextField( mainWindow.getFieldPosition());
		listControllers.add(fieldPosition);
		
		dcHireDate = new ControllerTextFieldDate( mainWindow.getFieldDateIn() );
		listControllers.add(dcHireDate);
		
		dcFireDate = new ControllerTextFieldDate( mainWindow.getFieldDateOut());
		listControllers.add(dcFireDate);
		
		cbNotByContract = new ControllerCheckBox( mainWindow.getCbNotByContract());
		listControllers.add(cbNotByContract);
		
		cbByContract = new ControllerCheckBox( mainWindow.getCbByContract());
		listControllers.add(cbByContract);

		fieldContractNumber = new ControllerTextField( mainWindow.getFieldContractNumber());
		listControllers.add(fieldContractNumber);
		
		fieldContractDate = new ControllerTextFieldDate( mainWindow.getFieldContractDate());
		listControllers.add(fieldContractDate);

		fieldWorktimeFrom = new ControllerTextField( mainWindow.getFieldWorktimeFrom());
		listControllers.add(fieldWorktimeFrom);

		fieldWorktimeTo = new ControllerTextField( mainWindow.getFieldWorktimeTo());
		listControllers.add(fieldWorktimeTo);

		fieldSalary = new ControllerTextFieldDecimal( mainWindow.getFieldSalary());
		listControllers.add(fieldSalary);

		fieldBonus = new ControllerTextFieldDecimal( mainWindow.getFieldBonus());
		listControllers.add(fieldBonus);

		fieldPlace1 = new ControllerTextField( mainWindow.getFieldRoom1());
		listControllers.add(fieldPlace1);

		fieldPlace2 = new ControllerTextField( mainWindow.getFieldRoom2());
		listControllers.add(fieldPlace2);
	}
        
	@Override
	public boolean saveEditions() throws SQLException {
		if( person == null )
			return true;
		Person p = new Person();
		p.setId( person.getId() );
		p.setAboutId( person.getAboutId() );
		p.setAbout( areaAbout.getValue() );
		p.setLastName( fieldLastName.getValue() );
		p.setName( fieldName.getValue() );
		p.setMiddleName(fieldMiddleName.getValue() );
		p.setBirthDate( dcBirthday.getDate() );
		p.setGender( rbGender.getValue() );
		p.setCitizenship( cmbCitizenship.getValue() );
		p.setDriver( cmbDriver.getValue() );
		String army = cmbArmy.getValue();
		if( army.equals("Другое") ) {
			p.setArmy( fieldArmyOther.getValue() );
		} else {
			p.setArmy(army);
		}
		
		if( cbMarital.getValue() ) {
			p.setMarital("N");
		} else {
			String s = cmbMarital.getValue();
			if( "Замужем".equals(s) )
				p.setMarital("H");
			else if( "Женат".equals(s) )
				p.setMarital("W");
			else
				p.setMarital( person.getMarital() );
		}
		
		Passport passport = new Passport();
		passport.setId( person.getPassport().getId() );
		passport.setSnum( fieldPassportSnum.getValue() );
		passport.setIssue(fieldPassportIssue.getValue() );
		passport.setDate( dcPassportDate.getDate() );
		p.setPassport(passport);
		
		p.setIdent( fieldIdent.getValue() );

		Integer tableId = fieldTableId.getIntValue();
		if( tableId == null )
			p.setTabId( person.getTabId() );
		else
			p.setTabId(tableId);

		Contact contact = new Contact();
		contact.setId( person.getContact().getId() );
		contact.setCity( cmbContactCity.getValue() );
		contact.setAddress( fieldAddress.getValue() );
		contact.setZipcode( fieldAddressIndex.getValue() );
		contact.setPhone( fieldPhone1.getValue() );
		contact.setPhone2( fieldPhone2.getValue() );
		contact.setEmail( fieldEmail1.getValue() );
		contact.setEmail2( fieldEmail2.getValue() );
		contact.setInternalnum( fieldInternalNum.getValue() );
		p.setContact(contact);
		
		dbManager.getPersonManager().savePerson(p);
		person = p;
		for(ControllerComponent cc : listControllers) {
			cc.clearDirty();
		}
		return true;
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
	}

	@Override
	public void discardEditions() {
	}

	public void setValue(TreeNode<NodeValue> node, NodeValue value) {

		for(ControllerComponent cc : listControllers) {
			cc.clearValue();
			cc.clearDirty();
		}
		{
			JTable tableExperience = mainWindow.getTableExperience();
			DefaultTableModel tableModel = ((DefaultTableModel)tableExperience.getModel());
			tableModel.setRowCount(0);
		}

		mainWindow.getButtonStructSave().setEnabled( value != null );
		mainWindow.getButtonStructDiscard().setEnabled( value != null );
		
		if( value == null ) {
			person = null;
//			for(ControllerComponent cc : listControllers) {
//				cc.setEnabled(false);
//			}
			mainWindow.getLabelPhoto().setIcon(null);
			return;
		}
		for (ControllerComponent cc : listControllers) {
			cc.setEnabled(true);
		}
		
		person = value.getPerson();
		
		areaAbout.setValue( person.getAbout() );
		fieldLastName.setValue( person.getLastName() );
		fieldName.setValue( person.getName() );
		fieldMiddleName.setValue( person.getMiddleName() );
		dcBirthday.setValue( person.getBirthDate() );
		fieldTableId.setValue( person.getTabId() );
		rbGender.setValue( person.getGender() );
		cmbCitizenship.setValue( person.getCitizenship() );
		rbHighEducation.setValue( person.getHighEducation() );
		fieldDiplomaName.setValue( person.getDiploma().getName() );

		fieldIdent.setValue( person.getIdent() );
		fieldPassportSnum.setValue( person.getPassport().getSnum() );
		dcPassportDate.setValue( person.getPassport().getDate() );
		fieldPassportIssue.setValue( person.getPassport().getIssue());

		boolean bSingle = person.getMarital().equals("N");
		cbMarital.setValue( bSingle );
		mainWindow.getCmbMarital().setEnabled( !bSingle );
		if( !bSingle ) {
			String marital = person.getMarital().equals("W") ? "Женат" : "Замужем";
			cmbMarital.setValue( marital );
		}
		
		{
			String army = person.getArmy();
			if( cmbArmy.hasValue(army) ) {
				cmbArmy.setValue(army);
				fieldArmyOther.setEnabled(false);
			} else {
				cmbArmy.setValue("Другое");
				fieldArmyOther.setValue(army);
				fieldArmyOther.setEnabled(true);
			}
		}
		cmbDriver.setValue( person.getDriver() );
		
		cmbContactCity.setValue( person.getContact().getCity() );
		fieldAddressIndex.setValue( person.getContact().getZipcode() );
		fieldAddress.setValue( person.getContact().getAddress() );
		fieldPhone1.setValue( person.getContact().getPhone() );
		fieldPhone2.setValue( person.getContact().getPhone2() );
		fieldEmail1.setValue( person.getContact().getEmail() );
		fieldEmail2.setValue( person.getContact().getEmail2() );
		fieldInternalNum.setValue( person.getContact().getInternalnum() );

		String departmentText = "";
		String place1Text = "";
		String place2Text = "";
		TreeNode<NodeValue> nodeDepartment = node.getParent();
		if( nodeDepartment != null ) {
			NodeValue valueDepartment = nodeDepartment.getValue();
			if( valueDepartment != null ) {
				Department department = valueDepartment.getDepartment();
				if( department != null ) {
					departmentText = department.getName();
					place1Text = department.getPlace();
					place2Text = department.getPlace2();
				}
			}
		}
		fieldDepartment.setValue( departmentText );
		fieldPlace1.setValue(place1Text);
		fieldPlace2.setValue(place2Text);

		String organizationText = "";
		TreeNode<NodeValue> nodeOrganization = nodeDepartment == null ? 
				null : nodeDepartment.getParent();
		if( nodeOrganization != null ) {
			NodeValue valueOrganization = nodeOrganization.getValue();
			if( valueOrganization != null ) {
				Organization organization = valueOrganization.getOrganization();
				if( organization != null )
					organizationText = organization.getName();
			}
		}
 		fieldOrganization.setValue( organizationText );
		
		PersonPosition position = person.getPosition();
		String positionText = position == null ? "" : position.getName();
		fieldPosition.setValue(positionText);
		if( position == null ) {
			dcHireDate.setValue((Date)null);
			dcFireDate.setValue((Date)null);
		} else {
			dcHireDate.setValue( position.getHireDate() );
			dcFireDate.setValue( position.getFireDate() );
		}
		if( person.getJobber().equals("Y") && person.getContract() != null ) {
			cbByContract.setValue(true);
			cbNotByContract.setValue(false);
			Contract contract = person.getContract();
			fieldContractNumber.setValue( contract.getNumber() );
			fieldContractDate.setValue( contract.getDate() );
			fieldContractNumber.setEnabled(true);
			fieldContractDate.setEnabled(true);
		} else {
			cbByContract.setValue(false);
			cbNotByContract.setValue(true);
			fieldContractNumber.setValue( "" );
			fieldContractDate.setValue( (Date)null );
			fieldContractNumber.setEnabled(false);
			fieldContractDate.setEnabled(false);
		}
		
		JTable tableExperience = mainWindow.getTableExperience();
        DefaultTableModel tableModel = ((DefaultTableModel)tableExperience.getModel());
        tableModel.setRowCount(0);
		int order = 1;
		for( Experience e : person.getListExperience() ) {
			Vector<Object> vector = new Vector<>();
			vector.add( order++ );
			vector.add( e.getCompany() );
			vector.add( e.getPosition());
			vector.add( dateFormat.format(e.getDateBegin()));
			vector.add( dateFormat.format(e.getDateEnd()));
			vector.add( e.getFireReason());
			vector.add( e.getYears());
            tableModel.addRow(vector);
        }
		
		if( person.getPhoto() == null ) {
			mainWindow.getLabelPhoto().setIcon(iconDefaultPhoto);
		} else {
			mainWindow.getLabelPhoto().setIcon(person.getPhoto());
		}

		Worktime worktime = person.getWorktime();
		if( worktime == null ) {
			fieldWorktimeFrom.setValue("");
			fieldWorktimeTo.setValue("");
		} else {
			fieldWorktimeFrom.setValue( worktime.getFrom() );
			fieldWorktimeTo.setValue( worktime.getTo() );
		}
		
		if( person.getSalary() == null ) {
			fieldSalary.setValue( (Double)null);
		} else {
			fieldSalary.setValue( person.getSalary().getValue() );
		}

		if( person.getBonus()== null ) {
			fieldBonus.setValue( (Double)null);
		} else {
			fieldBonus.setValue( person.getBonus().getSum());
		}

		setCmbAgeValue();		
	}

	private void setCmbAgeValue() {
		Date date = dcBirthday.getDate();
		if( date == null )
			return;
		Date now = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(GregorianCalendar.YEAR, 1);
		int age = 0;
		while( calendar.getTime().getTime() < now.getTime() ) {
			age++;
			calendar.add(GregorianCalendar.YEAR, 1);
		}
		cmbAge.setValue(age);
	}	
	private Person person;
	
	// Field controllers
	private List<ControllerComponent> listControllers = new ArrayList<>();
	private ControllerTextArea areaAbout;
	private ControllerTextField fieldLastName;
	private ControllerTextField fieldName;
	private ControllerTextField fieldMiddleName;
	private ControllerTextFieldInteger fieldTableId;
	private ControllerTextFieldDate dcBirthday;
	private ControllerRadioButtons rbGender;
	private ControllerComboBox cmbCitizenship;
	private ControllerRadioButtons rbHighEducation;
	private ControllerTextField fieldDiplomaName;
	private ControllerComboBox cmbArmy;
	private ControllerTextField fieldArmyOther;
	private ControllerComboBox cmbDriver;
	private ControllerComboBox cmbMarital;
	private ControllerCheckBox cbMarital;

	private ControllerTextField fieldIdent;
	private ControllerTextField fieldPassportSnum;
	private ControllerTextFieldDate dcPassportDate;
	private ControllerTextField fieldPassportIssue;

	private ControllerComboBox cmbContactCity;
	private ControllerTextField fieldAddressIndex;
	private ControllerTextField fieldAddress;
	private ControllerTextField fieldPhone1;
	private ControllerTextField fieldPhone2;
	private ControllerTextField fieldEmail1;
	private ControllerTextField fieldEmail2;
	private ControllerTextField fieldInternalNum;

	private ControllerTextField fieldOrganization;
	private ControllerTextField fieldDepartment;
	private ControllerTextField fieldPosition;
	private ControllerTextFieldDate dcHireDate;
	private ControllerTextFieldDate dcFireDate;
	private ControllerCheckBox cbNotByContract;
	private ControllerCheckBox cbByContract;
	private ControllerTextField fieldContractNumber;
	private ControllerTextFieldDate fieldContractDate;
	
	private ControllerTextField fieldWorktimeFrom;
	private ControllerTextField fieldWorktimeTo;
	private ControllerTextFieldDecimal fieldSalary;
	private ControllerTextFieldDecimal fieldBonus;
	private ControllerTextField fieldPlace1;
	private ControllerTextField fieldPlace2;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	private Icon iconDefaultPhoto;

	private JSpinner cmbAge = mainWindow.getCmbAge();
}
