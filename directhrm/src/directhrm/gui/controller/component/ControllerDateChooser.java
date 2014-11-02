package directhrm.gui.controller.component;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author andre
 */
public class ControllerDateChooser extends ControllerComponent {

	public ControllerDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
		IDateEditor dateEditor = dateChooser.getDateEditor();
		dateEditor.addPropertyChangeListener(pcl);
		if (dateEditor instanceof JTextFieldDateEditor) {
			JTextFieldDateEditor tfde = (JTextFieldDateEditor) dateEditor;
			tfde.getDocument().addDocumentListener(new DocumentListener() {
				@Override
				public void removeUpdate(DocumentEvent e) {
					valueEdited();
				}

				@Override
				public void insertUpdate(DocumentEvent e) {
					valueEdited();
				}

				@Override
				public void changedUpdate(DocumentEvent e) {
					valueEdited();
				}

				private void valueEdited() {
					onDateEdited();
				}
			});
		}
	}

	@Override
	public void setEnabled(boolean enabled) {
		dateChooser.setEnabled(enabled);
		IDateEditor dateEditor = dateChooser.getDateEditor();
		dateEditor.setEnabled(enabled);
	}

	@Override
	public void clearValue() {
		setValue(null); 
	}

	public void setDateChangeListener(DateChangeListener dateChangeListener) {
		this.dateChangeListener = dateChangeListener;
	}
	
	public void setValue(Date date) {
		ignoreEdition = true;
		dateChooser.setDate(date);
		ignoreEdition = false;
	}
	
	protected void onDateEdited() {
		if( ignoreEdition )
			return;
		markDirty();
		if( dateChangeListener != null )
			dateChangeListener.dateChanged();
	}

	private JDateChooser dateChooser;
	private boolean ignoreEdition = false;
	private DateChangeListener dateChangeListener;

	private PropertyChangeListener pcl = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if( evt.getPropertyName().equals("date") ) {
				onDateEdited();
			}
		}
	};
}
