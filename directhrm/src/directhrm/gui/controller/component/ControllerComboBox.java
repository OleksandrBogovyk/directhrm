package directhrm.gui.controller.component;

import directhrm.util.Property;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
	public void setItems(List<Property> list) {
		this.items = new ArrayList<>( list );
		ignoreEdition = true;
		cmb.removeAllItems();
		for(Property p : items) {
			cmb.addItem(p);
		}
		ignoreEdition = false;
	}

	public boolean hasValue(Object value) {
		for(int i=0, count=cmb.getItemCount(); i < count; i++) {
			Object o = cmb.getItemAt(i);
			if( o.equals(value) )
				return true;
		}
		return false;
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
			if( items == null )
				cmb.setSelectedItem(value);
			else {
				String key = (String)value;
				int index = Property.indexOf(items, key);
				if( index >= 0 )
					cmb.setSelectedIndex(index);
			}
		}
		ignoreEdition = false;
	}
	
	public String getValue() {
		if( editable && textField != null )
			return textField.getText();
		Object value = cmb.getSelectedItem();
		if( value instanceof Property)
			return ((Property)value).getKey();
		return (String)value;
	}
	
	protected void onValueSelected() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	private JComboBox cmb;
	private boolean editable;
	private JTextField textField;
	private List<Property> items;
	private boolean ignoreEdition = false;
}
