package directhrm.gui.controller.component;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author andre
 */
public class ControllerTextField extends ControllerComponent {

	public ControllerTextField(JTextField textField) {
		this.textField = textField;
		textField.getDocument().addDocumentListener( new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				onTextEdited();
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				onTextEdited();
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				onTextEdited();
			}
		} );
	}

	@Override
	public void setEnabled(boolean enabled) {
		textField.setEnabled(enabled);
	}

	@Override
	public void clearValue() {
		setValue(""); 
	}
	
	public void setValue(String text) {
		ignoreEdition = true;
		textField.setText(text);
		textField.setCaretPosition(0);
		ignoreEdition = false;
	}
	
	protected void onTextEdited() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	protected JTextField textField;
	protected boolean ignoreEdition = false;
}
