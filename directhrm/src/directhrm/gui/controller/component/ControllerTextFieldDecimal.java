package directhrm.gui.controller.component;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ControllerTextFieldDecimal extends ControllerTextField {

	public ControllerTextFieldDecimal(JTextField textField) {
		super(textField);
	}

	public void setValue(Double value) {
		if( value == null ) {
			setValue("");
			return;
		}
		setValue( value.toString() );
	}
	
	@Override
	protected void onTextEdited() {
		super.onTextEdited();
		if( ignoreEdition )
			return;
		String text = textField.getText();
		try {
			Double.parseDouble(text);
			textField.setForeground(Color.black);
		} catch (NumberFormatException numberFormatException) {
			textField.setForeground(Color.red);
		}
	}
	
}
