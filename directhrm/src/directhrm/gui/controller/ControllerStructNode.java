package directhrm.gui.controller;

import directhrm.Application;
import directhrm.db.DbManager;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.MainWindow;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author andre
 */
abstract public class ControllerStructNode {

	abstract public void setValue(TreeNode<NodeValue> selectedNode);
	
	abstract public void discardEditions();

	abstract public boolean saveEditions() throws SQLException;

	public ControllerStructNode(Application application) {
		this.application = application;
		mainWindow = application.getMainWindow();
		dbManager = application.getDbManager();
	}
	
	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}
	
	public void listenTextField(JTextField textField) {
		textField.getDocument().addDocumentListener( new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				setDirty(true);
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				setDirty(true);
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				setDirty(true);
			}
		} );
	}

	protected void testFieldLength(
			String fieldName, JTextField textField, int maxLength, 
			StringBuilder sbMessage) 
	{
		if( textField.getText().length() > maxLength ) {
			sbMessage.append( String.format(
					"Слишком длинное значение поля '%s'. "
					+ "Максимально допустимое число символов: %d\n", 
					fieldName, maxLength) );
		}
	}
	
	protected Application application;
	protected MainWindow mainWindow;
	protected DbManager dbManager;
	protected boolean dirty = false;
}
