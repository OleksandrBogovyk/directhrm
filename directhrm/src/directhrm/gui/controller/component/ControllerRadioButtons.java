package directhrm.gui.controller.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author andre
 */
public class ControllerRadioButtons extends ControllerComponent {

	public ControllerRadioButtons() {
		
	}
	
	public void addRadioButton(JRadioButton rb, String value) {
		listValue.add(value);
		listRadioButton.add(rb);
		buttonGroup.add(rb);
		
		rb.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				onValueChanged();
			}
		} );
	}

	@Override
	public void setEnabled(boolean enabled) {
		for(JRadioButton rb : listRadioButton) {
			rb.setEnabled(enabled);
		}
	}

	@Override
	public void clearValue() {
		for(JRadioButton rb : listRadioButton) {
			rb.setSelected(false);
		}
	}
	
	public void onValueChanged() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	public String getValue() {
		for(int i=0, size=listRadioButton.size(); i < size; i++) {
			if( listRadioButton.get(i).isSelected() )
				return listValue.get(i);
		}
		return "";
	}
	
	public void setValue(String value) {
		ignoreEdition = true;
		for(int i=0, size=listRadioButton.size(); i < size; i++) {
			if( listValue.get(i).equals(value) ) {
				listRadioButton.get(i).setSelected(true);
				break;
			}
		}
		ignoreEdition = false;
	}
	
	private boolean ignoreEdition = false;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private List<String> listValue = new ArrayList<>();
	private List<JRadioButton> listRadioButton = new ArrayList<>();
}
