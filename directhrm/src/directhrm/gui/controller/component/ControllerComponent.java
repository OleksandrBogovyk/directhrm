package directhrm.gui.controller.component;

/**
 *
 * @author andre
 */
public class ControllerComponent {

	public boolean isDirty() {
		return dirty;
	}
	public void clearDirty() {
		setDirty(false);
	}
	public void markDirty() {
		setDirty(true);
	}
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}
	
	public void clearValue() {
		
	}
	public void setEnabled(boolean enabled) {
		
	}
	
	private boolean dirty;
}
