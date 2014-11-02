package directhrm.gui.controller.component;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author andre
 */
public class ControllerComboBox  extends ControllerComponent {

	public ControllerComboBox(JComboBox cmb) {
		this.cmb = cmb;
		cmb.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				onValueSelected();
			}
		} );
		editable = cmb.isEditable();
		if( editable ) {
			Component editorComponent = cmb.getEditor().getEditorComponent();
			if( editorComponent instanceof JTextField ) {
				textField = (JTextField)editorComponent;
				textField.getDocument().addDocumentListener( new DocumentListener() {
					@Override
					public void insertUpdate(DocumentEvent e) {
						onValueSelected();
					}
					@Override
					public void removeUpdate(DocumentEvent e) {
						onValueSelected();
					}
					@Override
					public void changedUpdate(DocumentEvent e) {
						onValueSelected();
					}
				} );
			}
		}
	}

	@Override
	public void setEnabled(boolean enabled) {
		cmb.setEnabled(enabled);
	}

	@Override
	public void clearValue() {
		setValue(""); 
	}
	
	public void setValue(Object value) {
		ignoreEdition = true;
		if( editable && textField != null && (value instanceof String) ) {
			textField.setText( (String)value );
			textField.setCaretPosition(0);
		} else {
			cmb.setSelectedItem(value);
		}
		ignoreEdition = false;
	}
	
	protected void onValueSelected() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	private JComboBox cmb;
	private boolean editable;
	private JTextField textField;
	private boolean ignoreEdition = false;
}
