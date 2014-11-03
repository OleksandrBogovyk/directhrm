package directhrm.gui.controller.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/**
 *
 * @author andre
 */
public class ComtrollerCheckBox extends ControllerComponent {

	public ComtrollerCheckBox(JCheckBox checkBox) {
		this.checkBox = checkBox;
		checkBox.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				onValueSelected();
			}
		} );
	}

	@Override
	public void setEnabled(boolean enabled) {
		checkBox.setEnabled(enabled);
	}

	@Override
	public void clearValue() {
		setValue(false); 
	}
	
	public void setValue(boolean selected) {
		ignoreEdition = true;
		checkBox.setSelected(selected);
		ignoreEdition = false;
	}
	
	protected void onValueSelected() {
		if( ignoreEdition )
			return;
		markDirty();
	}
	
	private JCheckBox checkBox;
	private boolean ignoreEdition = false;
}
