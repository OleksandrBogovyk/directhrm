package directhrm.gui.controller.component;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ControllerTextFieldDate extends ControllerTextField {

	public ControllerTextFieldDate(JTextField textField) {
		super(textField);
	}

	public void setDateChangeListener(DateChangeListener dateChangeListener) {
		this.dateChangeListener = dateChangeListener;
	}

	
	
	public void setValue(Date value) {
		if( value == null ) {
			setValue("");
			return;
		}
		setValue( dateFormat.format(value) );
	}

	@Override
	protected void onTextEdited() {
		super.onTextEdited();
		if( ignoreEdition )
			return;
		String text = textField.getText();
		try {
			dateFormat.parse(text);
			textField.setForeground(Color.black);
		} catch (ParseException exception) {
			textField.setForeground(Color.red);
		}
		dateChangeListener.dateChanged();
	}
	
	public Date getDate() {
		String text = textField.getText();
		try {
			return dateFormat.parse(text);
		} catch (ParseException exception) {
			return null;
		}
	}
	
	private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	private DateChangeListener dateChangeListener;
}
