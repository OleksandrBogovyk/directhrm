package directhrm.gui.windows;

import directhrm.Application;
import directhrm.db.DbDepartmentManager;
import directhrm.entity.Department;
import directhrm.gui.GuiUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class DlgDepartment extends javax.swing.JDialog {

	/**
	 * Creates new form DlgOrganization
	 * @param parent
	 * @param modal
	 * @param application
	 */
	public DlgDepartment(
			java.awt.Frame parent, boolean modal, Application application) 
	{
		super(parent, modal);
		this.application = application;
		initComponents();

		panelDepartment = new PanelDepartment();
		panelContent.add(panelDepartment);
		
		fieldName = panelDepartment.getFieldName();
		fieldPlace = panelDepartment.getFieldPlace();
		
		buttonSave.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actionSave();
			}
		} );
		buttonCancel.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DlgDepartment.this.dispose();
			}
		} );
	}

	public void setDepartment(Department d) {
		this.department = d;
		fieldName.setText( department.getName() );
		fieldPlace.setText( department.getPlace());
	}

	public void actionSave() {
		StringBuilder sbMessage = new StringBuilder();
		GuiUtil.testFieldLength("Название подразделения", fieldName, 45, sbMessage);
		GuiUtil.testFieldLength("Место", fieldPlace, 12, sbMessage);
		if( sbMessage.length() > 0 ) {
			JOptionPane.showMessageDialog(
					this, sbMessage, "Внимание", 
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		Department d = new Department();
		d.setId( department.getId() );
		d.setName( fieldName.getText() );
		d.setPlace( fieldPlace.getText() );
		d.setOrganizationId( department.getOrganizationId() );
		try {
			DbDepartmentManager departmentManager = 
					application.getDbManager().getDepartmentManager();
			departmentManager.saveDepartment(d);
			dispose();
		} catch (SQLException ex) {
			Logger.getLogger(DlgDepartment.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(
					this, "Возникла ошибка во время выполнения операции", 
					"Ошибка", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Подразделение");

        panelContent.setLayout(new java.awt.BorderLayout());

        buttonCancel.setText("Отменить");

        buttonSave.setText("Сохранить");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 160, Short.MAX_VALUE)
                        .addComponent(buttonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private Application application;
	private Department department;
	private PanelDepartment panelDepartment;
	private JTextField fieldName;
	private JTextField fieldPlace;
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}