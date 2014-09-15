package directhrm.gui.controller;

import directhrm.Application;
import directhrm.gui.controller.tree.ControllerStructTree;
import directhrm.gui.controller.tree.NodeValue;
import directhrm.gui.controller.tree.TreeNode;
import directhrm.gui.windows.MainWindow;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

		controllerOrganization = new ControllerOrganization( application );
		controllerDepartment = new ControllerDepartment( application );
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
		if( activeNode != null && activeNode.isDirty() ) {
			int response = JOptionPane.showConfirmDialog(
					application.getMainWindow(), "Сохранить последние изменения?", "Внимание", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if( response == JOptionPane.CANCEL_OPTION ) {
				restoreSelection();
				return;
			}
			if( response == JOptionPane.YES_OPTION ) {
				try {
					boolean saved = activeNode.saveEditions();
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
		activeNode = setActiveCard(selectedNode);
		if( activeNode != null )
			activeNode.setValue( selectedNode );
		buttonSave.setEnabled( activeNode != null );
		buttonDiscard.setEnabled( activeNode != null );
		buttonExport.setEnabled( activeNode != null );
	}
	private void restoreSelection() {
		ignoreTreeSelection = true;
		controllerStructTree.selectNode(selectedNode);
		ignoreTreeSelection = false;
	}

	public ControllerStructNode setActiveCard( 
			TreeNode<NodeValue> selectedNode )
	{
		JPanel panelCard = application.getMainWindow().getPanelStructNodeCard();
		CardLayout cardLayout = (CardLayout)panelCard.getLayout();
		if( selectedNode == null ) {
			cardLayout.show(panelCard, "empty");
			return null;
		}
		NodeValue nodeValue = selectedNode.getValue();
		if( nodeValue.getOrganization() != null ) {
			cardLayout.show(panelCard, "organization");
			return controllerOrganization;
		}
		if( nodeValue.getDepartment()!= null ) {
			cardLayout.show(panelCard, "department");
			return controllerDepartment;
		}
		if( nodeValue.getPerson()!= null ) {
			cardLayout.show(panelCard, "person");
			return controllerPerson;
		}
		cardLayout.show(panelCard, "empty");
		return null;
	}
	
	private void saveActiveNode() {
		if( activeNode == null )
			return;
		try {
			activeNode.saveEditions();
		} catch (SQLException ex) {
			Logger.getLogger(ControllerStruct.class.getName()).log(Level.SEVERE, null, ex);
			application.showErrorMessage();
		}
	}
	private void discardActiveNode() {
		if( activeNode == null )
			return;
		activeNode.discardEditions();
	}
	private void exportActiveNode() {
		if( activeNode == null )
			return;
	}
	
	private Application application;
	
	private ControllerStructTree controllerStructTree;
	private ControllerStructNode activeNode;
	private TreeNode<NodeValue> selectedNode;
	private boolean ignoreTreeSelection = false;
	
	private JButton buttonSave;
	private JButton buttonDiscard;
	private JButton buttonExport;
	
	private ControllerOrganization controllerOrganization;
	private ControllerDepartment controllerDepartment;
	private ControllerPerson controllerPerson;
}
