package directhrm.gui.controller;

import directhrm.Application;
import directhrm.gui.controller.tree.ControllerStructTree;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.MainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 * Контроллер осуществляет общее управление закладкой Предприятия/Сотрудники.
 * Основная задача - организовать взаимодействие между деревом структуры и 
 * панелями с отображением/редактированием выбранного узла дерева
 * @author andre
 */
public class ControllerStruct {

	public ControllerStruct(Application application) {
		this.application = application;
	}
	public void init() throws SQLException {
		controllerStructTree = new ControllerStructTree( application );
		controllerPerson = new ControllerPerson( application );
		
		controllerStructTree.init();
	
		TreeSelectionListener tsl = new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				structTreeNodeSelected();
			}
		};
		controllerStructTree.addTreeSelectionListener(tsl);
		
		MainWindow mainWindow = application.getMainWindow();
		
		buttonSave = mainWindow.getButtonStructSave();
		buttonSave.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveActiveNode();
			}
		} );
		buttonDiscard = mainWindow.getButtonStructDiscard();
		buttonDiscard.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				discardActiveNode();
			}
		} );
		buttonExport = mainWindow.getButtonStructExport();
		buttonExport.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exportActiveNode();
			}
		} );
	}

	private void structTreeNodeSelected() {
		if( ignoreTreeSelection )
			return;
		if( controllerPerson.isDirty() ) {
			int response = JOptionPane.showConfirmDialog(
					application.getMainWindow(), "Сохранить последние изменения?", "Внимание", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if( response == JOptionPane.CANCEL_OPTION ) {
				restoreSelection();
				return;
			}
			if( response == JOptionPane.YES_OPTION ) {
				try {
					boolean saved = controllerPerson.saveEditions();
					if( !saved ) {
						restoreSelection();
						return;
					}
				} catch (SQLException ex) {
					restoreSelection();
					Logger.getLogger(ControllerStruct.class.getName()).log(Level.SEVERE, null, ex);
					JOptionPane.showMessageDialog(
							application.getMainWindow(), "Возникла ошибка при попытке сохранить информацию", 
							"Ошибка", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		} 
		selectedNode = controllerStructTree.getSelectedNode();
		NodeValue value = selectedNode == null ? null : selectedNode.getValue();
		if( value != null && value.getPerson() == null )
			value = null;
		controllerPerson.setValue( value );
		buttonSave.setEnabled( value != null );
		buttonDiscard.setEnabled( value != null );
		buttonExport.setEnabled( value != null );
	}

	public TreeNode<NodeValue> getSelectedNode() {
		return selectedNode;
	}
	
	private void restoreSelection() {
		ignoreTreeSelection = true;
		controllerStructTree.selectNode(selectedNode);
		ignoreTreeSelection = false;
	}

	private void saveActiveNode() {
		try {
			controllerPerson.saveEditions();
		} catch (SQLException ex) {
			Logger.getLogger(ControllerStruct.class.getName()).log(Level.SEVERE, null, ex);
			application.showErrorMessage();
		}
	}
	private void discardActiveNode() {
		controllerPerson.discardEditions();
	}
	private void exportActiveNode() {
	}
	
	private Application application;
	
	private ControllerStructTree controllerStructTree;
	private ControllerPerson controllerPerson;
	private TreeNode<NodeValue> selectedNode;
	private boolean ignoreTreeSelection = false;
	
	private JButton buttonSave;
	private JButton buttonDiscard;
	private JButton buttonExport;
	
}
