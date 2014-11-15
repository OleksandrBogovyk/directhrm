package directhrm.gui.controller;

import directhrm.Application;
import directhrm.entity.Person;
import directhrm.gui.controller.component.ControllerComboBox;
import directhrm.gui.controller.component.ControllerComponent;
import directhrm.gui.controller.component.ControllerRadioButtons;
import directhrm.gui.controller.component.ControllerTextArea;
import directhrm.gui.controller.component.ControllerTextField;
import directhrm.gui.controller.component.ControllerTextFieldDate;
import directhrm.gui.controller.component.ControllerTextFieldInteger;
import directhrm.gui.controller.component.DateChangeListener;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author andre
 */
public class ControllerPerson extends ControllerStructNode {

	public ControllerPerson(Application application) {
		super(application);
		initFieldControllers();
		
		setValue( (NodeValue)null );
	}
	private void initFieldControllers() {
		fieldLastName = new ControllerTextField( mainWindow.getFieldLastName() );
		listControllers.add(fieldLastName);
		
		fieldName = new ControllerTextField( mainWindow.getFieldName() );
		listControllers.add(fieldName);
		
		fieldMiddleName = new ControllerTextField( mainWindow.getFieldMiddleName() );
		listControllers.add(fieldMiddleName);
		
		fieldTableId = new ControllerTextFieldInteger( mainWindow.getFieldTableId());
		listControllers.add(fieldTableId);
		
		//dcBirthday = new ControllerTextFieldDate( mainWindow.getFieldBirthday() );
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

		rbHighEducation = new ControllerRadioButtons();
		//rbHighEducation.addRadioButton( mainWindow.getRbHighEducationYes(), "Y");
		//rbHighEducation.addRadioButton( mainWindow.getRbHighEducationNo(), "N");
		listControllers.add(rbHighEducation);
		
		fieldDiplomaName = new ControllerTextField( mainWindow.getFieldSpeciality() );
		listControllers.add(fieldDiplomaName);
		
		rbJobber = new ControllerRadioButtons();
		rbJobber.addRadioButton(mainWindow.getRbJobberNo(), "N");
		rbJobber.addRadioButton(mainWindow.getRbJobberYes(), "Y");
		listControllers.add(rbJobber);
		
		fieldIdent = new ControllerTextField( mainWindow.getFieldIdent() );
		listControllers.add( fieldIdent );
		
		fieldPassportSnum = new ControllerTextField( mainWindow.getFieldPassportNum() );
		listControllers.add(fieldPassportSnum);
		
		//dcPassportDate = new ControllerTextFieldDate( mainWindow.getFieldPassportDate() );
		listControllers.add(dcPassportDate);
		
		fieldPassportIssue = new ControllerTextField( mainWindow.getFieldPassportGiven() );
		listControllers.add(fieldPassportIssue);

		areaDescription = new ControllerTextArea( mainWindow.getAreaDescription() );
		listControllers.add(areaDescription);

		rbMilitary = new ControllerRadioButtons();
		//rbMilitary.addRadioButton( mainWindow.getRbArmyYes(), "Y");
		//rbMilitary.addRadioButton( mainWindow.getRbArmyNo(), "N");
		listControllers.add(rbMilitary);

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

		fieldEmail2 = new ControllerTextField( mainWindow.getFieldWorkEmail() );
		listControllers.add(fieldEmail2);

		fieldSkype = new ControllerTextField( mainWindow.getFieldSkype() );
		listControllers.add(fieldSkype);

		fieldInternalNum = new ControllerTextField( mainWindow.getFieldInternalNumber() );
		listControllers.add(fieldInternalNum);

		//cmbAge.setEnabled(false);
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

	public void setValue(NodeValue value) {
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
		
		fieldLastName.setValue( person.getLastName() );
		fieldName.setValue( person.getName() );
		fieldMiddleName.setValue( person.getMiddleName() );
		dcBirthday.setValue( person.getBirthDate() );
		fieldTableId.setValue( person.getTabId() );
		rbGender.setValue( person.getGender() );
		cmbCitizenship.setValue( person.getCitizenship() );
		rbHighEducation.setValue( person.getHighEducation() );
		fieldDiplomaName.setValue( person.getDiploma().getName() );
		rbJobber.setValue( person.getJobber() );

		fieldIdent.setValue( person.getIdent() );
		rbMilitary.setValue( person.getMilitary() );
		fieldPassportSnum.setValue( person.getPassport().getSnum() );
		dcPassportDate.setValue( person.getPassport().getDate() );
		fieldPassportIssue.setValue( person.getPassport().getIssue());
		
		areaDescription.setValue("");

		cmbContactCity.setValue( person.getContact().getCity() );
		fieldZipcode.setValue( person.getContact().getZipcode() );
		fieldAddress.setValue( person.getContact().getAddress() );
		fieldPhone1.setValue( person.getContact().getPhone() );
		fieldPhone2.setValue( person.getContact().getPhone2() );
		fieldEmail1.setValue( person.getContact().getEmail() );
		fieldEmail2.setValue( person.getContact().getEmail2() );
		fieldSkype.setValue( person.getContact().getSkype() );
		fieldInternalNum.setValue( person.getContact().getInternalnum() );

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
		//cmbAge.setSelectedItem( String.valueOf(age) );
	}
	
	private Person person;
	
	// Field controllers
	private List<ControllerComponent> listControllers = new ArrayList<>();
	private ControllerTextField fieldLastName;
	private ControllerTextField fieldName;
	private ControllerTextField fieldMiddleName;
	private ControllerTextFieldInteger fieldTableId;
	private ControllerTextFieldDate dcBirthday;
	private ControllerRadioButtons rbGender;
	private ControllerComboBox cmbCitizenship;
	private ControllerRadioButtons rbHighEducation;
	private ControllerRadioButtons rbJobber;
	private ControllerTextField fieldDiplomaName;

	private ControllerRadioButtons rbMilitary;

	private ControllerTextField fieldIdent;
	private ControllerTextField fieldPassportSnum;
	private ControllerTextFieldDate dcPassportDate;
	private ControllerTextField fieldPassportIssue;
	private ControllerTextArea areaDescription;

	private ControllerComboBox cmbContactCity;
	private ControllerTextField fieldZipcode;
	private ControllerTextField fieldAddress;
	private ControllerTextField fieldPhone1;
	private ControllerTextField fieldPhone2;
	private ControllerTextField fieldEmail1;
	private ControllerTextField fieldEmail2;
	private ControllerTextField fieldSkype;
	private ControllerTextField fieldInternalNum;
	
	//private JComboBox<String> cmbAge = mainWindow.getCmbAge();
}
