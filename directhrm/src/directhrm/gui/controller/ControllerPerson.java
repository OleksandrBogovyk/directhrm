package directhrm.gui.controller;

import directhrm.Application;
import directhrm.entity.Person;
import directhrm.gui.controller.component.ControllerComponent;
import directhrm.gui.controller.component.ControllerRadioButtons;
import directhrm.gui.controller.component.ControllerTextField;
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
		
		rbGender = new ControllerRadioButtons();
		rbGender.addRadioButton(mainWindow.getRbFemale(), "F");
		rbGender.addRadioButton(mainWindow.getRbMale(), "M");
		listControllers.add(rbGender);
		
		rbJobber = new ControllerRadioButtons();
		rbJobber.addRadioButton(mainWindow.getRbJobberNo(), "N");
		rbJobber.addRadioButton(mainWindow.getRbJobberYes(), "Y");
		listControllers.add(rbJobber);
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
		fieldTableId.setValue( person.getTabId() );
		rbGender.setValue( person.getGender() );
		rbJobber.setValue( person.getJobber() );
	}
	
	private Person person;
	
	// Field controllers
	private List<ControllerComponent> listControllers = new ArrayList<>();
	private ControllerTextField fieldLastName;
	private ControllerTextField fieldName;
	private ControllerTextField fieldMiddleName;
	private ControllerTextFieldInteger fieldTableId;
	private ControllerRadioButtons rbGender;
	private ControllerRadioButtons rbHighEducation;
	private ControllerRadioButtons rbJobber;
}
