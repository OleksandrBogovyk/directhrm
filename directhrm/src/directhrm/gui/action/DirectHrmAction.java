package directhrm.gui.action;

import directhrm.Application;
import javax.swing.AbstractAction;

/**
 *
 * @author andre
 */
abstract public class DirectHrmAction extends AbstractAction {

	public DirectHrmAction(Application application) {
		this.application = application;
	}

	protected Application application;
}
