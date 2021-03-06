package directhrm.gui.controller.component;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ControllerTextFieldInteger extends ControllerTextField {

	public ControllerTextFieldInteger(JTextField textField) {
		super(textField);
	}

	public void setValue(Integer value) {
		if( value == null ) {
			setValue("");
			return;
		}
		setValue( value.toString() );
	}
	
	public Integer getIntValue() {
		try {
			String text = textField.getText();
			Integer i = Integer.parseInt(text);
			return i;
		} catch (NumberFormatException numberFormatException) {
			return null;
		}
	}
	
	@Override
	protected void onTextEdited() {
		super.onTextEdited();
		if( ignoreEdition )
			return;
		String text = textField.getText();
		try {
			Integer.parseInt(text);
			textField.setForeground(Color.black);
		} catch (NumberFormatException numberFormatException) {
			textField.setForeground(Color.red);
		}
	}
	
}
