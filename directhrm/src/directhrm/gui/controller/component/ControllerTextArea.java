package directhrm.gui.controller.component;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author andre
 */
public class ControllerTextArea extends ControllerComponent {

	public ControllerTextArea(JTextArea textArea) {
		this.textArea = textArea;
		textArea.getDocument().addDocumentListener( new DocumentListener() {
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
		textArea.setEnabled(enabled);
	}

	@Override
	public void clearValue() {
		textArea.setText(""); 
	}
	
	public void setValue(String text) {
		ignoreEdition = true;
		textArea.setText(text);
		textArea.setCaretPosition(0);
		ignoreEdition = false;
	}
	
	protected void onTextEdited() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	private JTextArea textArea;
	private boolean ignoreEdition = false;
}
