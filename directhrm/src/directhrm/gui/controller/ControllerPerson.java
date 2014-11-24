package directhrm.gui.controller;

import directhrm.Application;
import directhrm.entity.Department;
import directhrm.entity.Organization;
import directhrm.entity.Person;
import directhrm.gui.controller.component.ControllerCheckBox;
import directhrm.gui.controller.component.ControllerComboBox;
import directhrm.gui.controller.component.ControllerComponent;
import directhrm.gui.controller.component.ControllerRadioButtons;
import directhrm.gui.controller.component.ControllerTextArea;
import directhrm.gui.controller.component.ControllerTextField;
import directhrm.gui.controller.component.ControllerTextFieldDate;
import directhrm.gui.controller.component.ControllerTextFieldInteger;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ControllerPerson extends ControllerStructNode {

	public ControllerPerson(Application application) {
		super(application);
		initFieldControllers();
		
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
		
		cmbDriver = new ControllerComboBox( mainWindow.getCmbDriver() );
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

		fieldZipcode = new ControllerTextField( mainWindow.getFieldAddressIndex() );
		listControllers.add(fieldZipcode);

		fieldAddress = new ControllerTextField( mainWindow.getFieldAddressStreet() );
		listControllers.add(fieldAddress);

		fieldPhone1 = new ControllerTextField( mainWindow.getFieldPhoneMobile() );
		listControllers.add(fieldPhone1);

		fieldPhone2 = new ControllerTextField( mainWindow.getFieldPhoneHome() );
		listControllers.add(fieldPhone2);

		fieldEmail1 = new ControllerTextField( mainWindow.getFieldEmail() );
		listControllers.add(fieldEmail1);

		fieldInternalNum = new ControllerTextField( mainWindow.getFieldInternalNumber() );
		listControllers.add(fieldInternalNum);

		fieldOrganization = new ControllerTextField( mainWindow.getFieldOrganization());
		listControllers.add(fieldOrganization);

		fieldDepartment = new ControllerTextField( mainWindow.getFieldDepartment());
		listControllers.add(fieldDepartment);
	}
        
	@Override
	public boolean saveEditions() throws SQLException {
		return true;
	}

	@Override
	public void setValue(TreeNode<NodeValue> selectedNode) {
	}

	@Override
	public void discardEditions() {
	}

	public void setValue(TreeNode<NodeValue> node, NodeValue value) {
		if( value == null ) {
			person = null;
			for(ControllerComponent cc : listControllers) {
				cc.clearValue();
				cc.clearDirty();
				cc.setEnabled(false);
			}
			return;
		}
		for (ControllerComponent cc : listControllers) {
			cc.clearValue();
			cc.clearDirty();
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
		
		cmbArmy.setValue( person.getArmy() );
		cmbDriver.setValue( person.getDriver() );
		
		cmbContactCity.setValue( person.getContact().getCity() );
		fieldZipcode.setValue( person.getContact().getZipcode() );
		fieldAddress.setValue( person.getContact().getAddress() );
		fieldPhone1.setValue( person.getContact().getPhone() );
		fieldPhone2.setValue( person.getContact().getPhone2() );
		fieldEmail1.setValue( person.getContact().getEmail() );
		fieldSkype.setValue( person.getContact().getSkype() );
		fieldInternalNum.setValue( person.getContact().getInternalnum() );

		String departmentText = "";
		TreeNode<NodeValue> nodeDepartment = node.getParent();
		if( nodeDepartment != null ) {
			NodeValue valueDepartment = nodeDepartment.getValue();
			if( valueDepartment != null ) {
				Department department = valueDepartment.getDepartment();
				if( department != null )
					departmentText = department.getName();
			}
		}
		fieldDepartment.setValue( departmentText );

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
		
	}
	
//	private void setCmbAgeValue() {
//		Date date = dcBirthday.getDate();
//		if( date == null )
//			return;
//		Date now = new Date();
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.setTime(date);
//		calendar.add(GregorianCalendar.YEAR, 1);
//		int age = 0;
//		while( calendar.getTime().getTime() < now.getTime() ) {
//			age++;
//			calendar.add(GregorianCalendar.YEAR, 1);
//		}
//		//cmbAge.setSelectedItem( String.valueOf(age) );
//	}
	
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
	private ControllerComboBox cmbDriver;
	private ControllerComboBox cmbMarital;
	private ControllerCheckBox cbMarital;

	private ControllerTextField fieldIdent;
	private ControllerTextField fieldPassportSnum;
	private ControllerTextFieldDate dcPassportDate;
	private ControllerTextField fieldPassportIssue;

	private ControllerComboBox cmbContactCity;
	private ControllerTextField fieldZipcode;
	private ControllerTextField fieldAddress;
	private ControllerTextField fieldPhone1;
	private ControllerTextField fieldPhone2;
	private ControllerTextField fieldEmail1;
	private ControllerTextField fieldSkype;
	private ControllerTextField fieldInternalNum;

	private ControllerTextField fieldOrganization;
	private ControllerTextField fieldDepartment;
}
