package directhrm.gui.controller;

import directhrm.Application;
import directhrm.entity.Contract;
import directhrm.entity.Department;
import directhrm.entity.Experience;
import directhrm.entity.Organization;
import directhrm.entity.Person;
import directhrm.entity.PersonPosition;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
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

		for(ControllerComponent cc : listControllers) {
			cc.clearValue();
			cc.clearDirty();
		}
		{
			JTable tableExperience = mainWindow.getTableExperience();
			DefaultTableModel tableModel = ((DefaultTableModel)tableExperience.getModel());
			tableModel.setRowCount(0);
		}

		if( value == null ) {
			person = null;
			for(ControllerComponent cc : listControllers) {
				cc.setEnabled(false);
			}
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
		
		cmbArmy.setValue( person.getArmy() );
		cmbDriver.setValue( person.getDriver() );
		
		cmbContactCity.setValue( person.getContact().getCity() );
		fieldAddressIndex.setValue( person.getContact().getZipcode() );
		fieldAddress.setValue( person.getContact().getAddress() );
		fieldPhone1.setValue( person.getContact().getPhone() );
		fieldPhone2.setValue( person.getContact().getPhone2() );
		fieldEmail1.setValue( person.getContact().getEmail() );
		//fieldSkype.setValue( person.getContact().getSkype() );
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
	private ControllerTextField fieldAddressIndex;
	private ControllerTextField fieldAddress;
	private ControllerTextField fieldPhone1;
	private ControllerTextField fieldPhone2;
	private ControllerTextField fieldEmail1;
	private ControllerTextField fieldSkype;
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
	
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
}
