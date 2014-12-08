package directhrm.gui.windows;

import directhrm.Application;
import directhrm.db.DbAdminManager;
import directhrm.entity.Admin;
import directhrm.gui.action.ActionDepartmentCreate;
import directhrm.gui.action.ActionDepartmentDelete;
import directhrm.gui.action.ActionDepartmentEdit;
import directhrm.gui.action.ActionOrganizationCreate;
import directhrm.gui.action.ActionOrganizationDelete;
import directhrm.gui.action.ActionOrganizationEdit;
import java.awt.Component;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABogovik
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public MainWindow() {
        initComponents();
		
		panelPerson = new PanelPerson();
		panelPersonHolder.add(panelPerson);
    }

	public void setApplication(Application application) {
		this.application = application;
	}
	public void init() {
		
		initActions();
		menuItemCreateOrganization.addActionListener(actionCreateOrganization);
		menuItemEditOrganization.addActionListener(actionEditOrganization);
		menuItemDeleteOrganization.addActionListener(actionDeleteOrganization);
		menuItemCreateDepartment.addActionListener(actionCreateDepartment);
		menuItemEditDepartment.addActionListener(actionEditDepartment);
		menuItemDeleteDepartment.addActionListener(actionDeleteDepartment);
	}

	public JTree getTreeStruct() {
		return treeStruct;
	}

	public JTextArea getAreaDescription() {
		return areaDescription;
	}

	
	public JButton getButtonStructSave() {
		return buttonStructSave;
	}

	public JButton getButtonStructDiscard() {
		return buttonStructDiscard;
	}

	public JButton getButtonStructExport() {
		return buttonStructExport;
	}
        
	public JCheckBox getCbByContract() {
		return cbByContract;
	}

	public JCheckBox getCbMarital() {
		return cbMarital;
	}

	public JCheckBox getCbNotByContract() {
		return cbNotByContract;
	}
	
	
	public JComboBox getCmbAddressCity() {
		return cmbAddressCity;
	}

	public JComboBox getCmbArmy() {
		return cmbArmy;
	}
        
	public JComboBox getCmbCitizenship() {
		return cmbCitizenship;
	}

	public JComboBox getCmbDriver() {
		return cmbDriver;
	}

	public JComboBox getCmbMarital() {
		return cmbMarital;
	}

	
	public JTextField getFieldAddressIndex() {
		return fieldAddressIndex;
	}
	public JTextField getFieldAddressStreet() {
		return fieldAddressStreet;
	}
	public JTextField getFieldBirthday() {
		return fieldBirthday;
	}
	public JTextField getFieldBonus() {
		return fieldBonus;
	}
	public JTextField getFieldContractDate() {
		return fieldContractDate;
	}
	public JTextField getFieldContractNumber() {
		return fieldContractNumber;
	}
	public JTextField getFieldDateIn() {
		return fieldDateIn;
	}
	public JTextField getFieldDateOut() {
		return fieldDateOut;
	}
	public JTextField getFieldDepartment() {
		return fieldDepartment;
	}
	public JTextField getFieldEmail() {
		return fieldEmail;
	}
	public JTextField getFieldGraduationYear() {
		return fieldGraduationYear;
	}
	public JTextField getFieldIdent() {
		return fieldIdent;
	}
	public JTextField getFieldInternalNumber() {
		return fieldInternalNumber;
	}
	public JTextField getFieldLastName() {
		return fieldLastName;
	}
	public JTextField getFieldMiddleName() {
		return fieldMiddleName;
	}
	public JTextField getFieldName() {
		return fieldName;
	}
	public JTextField getFieldOrganization() {
		return fieldOrganization;
	}
	public JTextField getFieldPassportDate() {
		return fieldPassportDate;
	}
	public JTextField getFieldPassportGiven() {
		return fieldPassportGiven;
	}
	public JTextField getFieldPassportNum() {
		return fieldPassportNum;
	}
	public JTextField getFieldPhoneHome() {
		return fieldPhoneHome;
	}
	public JTextField getFieldPhoneMobile() {
		return fieldPhoneMobile;
	}
	public JTextField getFieldPosition() {
		return fieldPosition;
	}
	public JTextField getFieldRoom1() {
		return fieldRoom1;
	}
	public JTextField getFieldRoom2() {
		return fieldRoom2;
	}
	public JTextField getFieldSalary() {
		return fieldSalary;
	}
	public JTextField getFieldSpeciality() {
		return fieldSpeciality;
	}
	public JTextField getFieldTableId() {
		return fieldTableId;
	}
	public JTextField getFieldWorkEmail() {
		return fieldWorkEmail;
	}
	public JTextField getFieldWorktimeFrom() {
		return fieldWorktimeFrom;
	}
	public JTextField getFieldWorktimeTo() {
		return fieldWorktimeTo;
	}

	
	public JLabel getLabelPhoto() {
		return labelPhoto;
	}

        
	public JRadioButton getRbFemale() {
		return rbFemale;
	}
	public JRadioButton getRbMale() {
		return rbMale;
	}

	
	public JTable getTableExperience() {
		return tableExperience;
	}

	
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminListWindow = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        adminAddWindow = new javax.swing.JDialog();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jSpinner17 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        adminDelRmWindow = new javax.swing.JDialog();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jButton11 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        licenseWindow = new javax.swing.JDialog();
        aboutWindow = new javax.swing.JDialog();
        manualWindow = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeStruct = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelPersonHolder = new javax.swing.JPanel();
        panelPhoto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelPhoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        panelAbout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        panelFIO = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldLastName = new javax.swing.JTextField();
        fieldMiddleName = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cmbCitizenship = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbMarital = new javax.swing.JComboBox();
        cbMarital = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        fieldSpeciality = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        fieldGraduationYear = new javax.swing.JTextField();
        fieldBirthday = new javax.swing.JTextField();
        panelPassport = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fieldPassportNum = new javax.swing.JTextField();
        fieldPassportGiven = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        fieldIdent = new javax.swing.JTextField();
        cmbArmy = new javax.swing.JComboBox();
        cmbDriver = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cmbAddressCity = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        fieldAddressStreet = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fieldAddressIndex = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        fieldPhoneMobile = new javax.swing.JTextField();
        fieldPhoneHome = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        fieldPassportDate = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelPosition = new javax.swing.JPanel();
        cbByContract = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        fieldTableId = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fieldPosition = new javax.swing.JTextField();
        cbNotByContract = new javax.swing.JCheckBox();
        fieldContractNumber = new javax.swing.JTextField();
        fieldContractDate = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        fieldDepartment = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        fieldDateIn = new javax.swing.JTextField();
        fieldDateOut = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        fieldOrganization = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        panelWork = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        fieldInternalNumber = new javax.swing.JTextField();
        fieldRoom1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        fieldWorktimeFrom = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        fieldWorkEmail = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        fieldRoom2 = new javax.swing.JTextField();
        fieldSalary = new javax.swing.JTextField();
        fieldBonus = new javax.swing.JTextField();
        fieldWorktimeTo = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableExperience = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        buttonStructSave = new javax.swing.JButton();
        buttonStructDiscard = new javax.swing.JButton();
        buttonStructExport = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuItemCreateDepartment = new javax.swing.JMenuItem();
        menuItemDeleteDepartment = new javax.swing.JMenuItem();
        menuItemEditDepartment = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuItemCreateOrganization = new javax.swing.JMenuItem();
        menuItemEditOrganization = new javax.swing.JMenuItem();
        menuItemDeleteOrganization = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("directhrm/gui/windows/Bundle"); // NOI18N
        adminListWindow.setTitle(bundle.getString("MainWindow.adminListWindow.title")); // NOI18N
        adminListWindow.setResizable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Логин", "Полное имя", "Пароль (SHA-1)", "Дата регистрации", "Последний вход"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout adminListWindowLayout = new javax.swing.GroupLayout(adminListWindow.getContentPane());
        adminListWindow.getContentPane().setLayout(adminListWindowLayout);
        adminListWindowLayout.setHorizontalGroup(
            adminListWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminListWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        adminListWindowLayout.setVerticalGroup(
            adminListWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminListWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        //adminAddWindow.setSize(350, 195);
        adminAddWindow.setLocationRelativeTo(null);
        adminAddWindow.setTitle(bundle.getString("MainWindow.adminAddWindow.title")); // NOI18N
        adminAddWindow.setResizable(false);

        jLabel53.setText(bundle.getString("MainWindow.jLabel53.text")); // NOI18N

        jLabel54.setText(bundle.getString("MainWindow.jLabel54.text")); // NOI18N

        jLabel55.setText(bundle.getString("MainWindow.jLabel55.text")); // NOI18N

        jLabel56.setText(bundle.getString("MainWindow.jLabel56.text")); // NOI18N

        jLabel57.setText(bundle.getString("MainWindow.jLabel57.text")); // NOI18N

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jSpinner17.setModel(new javax.swing.SpinnerDateModel());
        jSpinner17.setEnabled(false);

        jButton5.setText(bundle.getString("MainWindow.jButton5.text")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminAddWindowLayout = new javax.swing.GroupLayout(adminAddWindow.getContentPane());
        adminAddWindow.getContentPane().setLayout(adminAddWindowLayout);
        adminAddWindowLayout.setHorizontalGroup(
            adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddWindowLayout.createSequentialGroup()
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAddWindowLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(adminAddWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminAddWindowLayout.createSequentialGroup()
                                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAddWindowLayout.createSequentialGroup()
                                        .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAddWindowLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5)))))
                .addContainerGap())
        );
        adminAddWindowLayout.setVerticalGroup(
            adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        adminDelRmWindow.setLocationRelativeTo(null);
        adminDelRmWindow.setTitle(bundle.getString("MainWindow.adminDelRmWindow.title")); // NOI18N
        adminDelRmWindow.setResizable(false);

        jSpinner18.setModel(new javax.swing.SpinnerDateModel());
        jSpinner18.setEnabled(false);

        jLabel58.setText(bundle.getString("MainWindow.jLabel58.text")); // NOI18N

        jLabel59.setText(bundle.getString("MainWindow.jLabel59.text")); // NOI18N

        jButton6.setText(bundle.getString("MainWindow.jButton6.text")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel60.setText(bundle.getString("MainWindow.jLabel60.text")); // NOI18N

        jTextField16.setEnabled(false);

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField17.setEnabled(false);

        jPasswordField3.setEnabled(false);
        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseReleased(evt);
            }
        });
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });

        jPasswordField4.setEnabled(false);
        jPasswordField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField4MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPasswordField4MouseReleased(evt);
            }
        });
        jPasswordField4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jPasswordField4CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jPasswordField4InputMethodTextChanged(evt);
            }
        });
        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPasswordField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyTyped(evt);
            }
        });

        jLabel61.setText(bundle.getString("MainWindow.jLabel61.text")); // NOI18N

        jLabel62.setText(bundle.getString("MainWindow.jLabel62.text")); // NOI18N

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Пользователь:", "Администратор (по умолчанию)", "Боговик Александр", "Андрей Якивчук" }));
        jComboBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox10ItemStateChanged(evt);
            }
        });
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jButton11.setText(bundle.getString("MainWindow.jButton11.text")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel63.setText(bundle.getString("MainWindow.jLabel63.text")); // NOI18N

        jSpinner2.setModel(new javax.swing.SpinnerDateModel());
        jSpinner2.setEnabled(false);

        javax.swing.GroupLayout adminDelRmWindowLayout = new javax.swing.GroupLayout(adminDelRmWindow.getContentPane());
        adminDelRmWindow.getContentPane().setLayout(adminDelRmWindowLayout);
        adminDelRmWindowLayout.setHorizontalGroup(
            adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminDelRmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminDelRmWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(adminDelRmWindowLayout.createSequentialGroup()
                        .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, 0, 220, Short.MAX_VALUE)
                            .addComponent(jPasswordField4)
                            .addComponent(jTextField16)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField17)
                            .addGroup(adminDelRmWindowLayout.createSequentialGroup()
                                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner18, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        adminDelRmWindowLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton11, jButton6});

        adminDelRmWindowLayout.setVerticalGroup(
            adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminDelRmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        licenseWindow.setTitle(bundle.getString("MainWindow.licenseWindow.title")); // NOI18N

        javax.swing.GroupLayout licenseWindowLayout = new javax.swing.GroupLayout(licenseWindow.getContentPane());
        licenseWindow.getContentPane().setLayout(licenseWindowLayout);
        licenseWindowLayout.setHorizontalGroup(
            licenseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        licenseWindowLayout.setVerticalGroup(
            licenseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        aboutWindow.setTitle(bundle.getString("MainWindow.aboutWindow.title")); // NOI18N

        javax.swing.GroupLayout aboutWindowLayout = new javax.swing.GroupLayout(aboutWindow.getContentPane());
        aboutWindow.getContentPane().setLayout(aboutWindowLayout);
        aboutWindowLayout.setHorizontalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        aboutWindowLayout.setVerticalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        manualWindow.setTitle(bundle.getString("MainWindow.manualWindow.title")); // NOI18N

        javax.swing.GroupLayout manualWindowLayout = new javax.swing.GroupLayout(manualWindow.getContentPane());
        manualWindow.getContentPane().setLayout(manualWindowLayout);
        manualWindowLayout.setHorizontalGroup(
            manualWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        manualWindowLayout.setVerticalGroup(
            manualWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/go-down.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/go-up.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator4);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/system-file-manager.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/system-users.png"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton10);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/contact-new.png"))); // NOI18N
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/preferences-system-search.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator6);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/address-book-new.png"))); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton1);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/x-office-drawing.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);
        jToolBar1.add(jSeparator5);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/help-about.png"))); // NOI18N
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton9);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/about-icon.png"))); // NOI18N
        jButton12.setText(bundle.getString("MainWindow.jButton12.text")); // NOI18N
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton12);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directhrm/img/icon/application-exit.png"))); // NOI18N
        jButton17.setFocusable(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton17);

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(220);
        jSplitPane1.setDividerSize(3);
        jSplitPane1.setToolTipText(bundle.getString("MainWindow.jSplitPane1.toolTipText")); // NOI18N

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("ООО \"Символ-Плюс\"");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("IT");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Боговик Александр Александрович");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Кузьменко Александр Викорович");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("ООО \"Софт-Медиа\"");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Юридический");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Шульга Екатерина Сергеевна");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeStruct.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeStruct);

        jSplitPane1.setLeftComponent(jScrollPane1);

        panelPhoto.setPreferredSize(new java.awt.Dimension(500, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPhoto.setText(bundle.getString("MainWindow.labelPhoto.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setText(bundle.getString("MainWindow.jLabel2.text")); // NOI18N

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout panelPhotoLayout = new javax.swing.GroupLayout(panelPhoto);
        panelPhoto.setLayout(panelPhotoLayout);
        panelPhotoLayout.setHorizontalGroup(
            panelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPhotoLayout.setVerticalGroup(
            panelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPhotoLayout.createSequentialGroup()
                        .addGroup(panelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText(bundle.getString("MainWindow.jLabel3.text")); // NOI18N

        areaDescription.setColumns(20);
        areaDescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        areaDescription.setLineWrap(true);
        areaDescription.setRows(5);
        areaDescription.setText(bundle.getString("MainWindow.areaDescription.text")); // NOI18N
        areaDescription.setToolTipText(bundle.getString("MainWindow.areaDescription.toolTipText")); // NOI18N
        areaDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaDescription);

        javax.swing.GroupLayout panelAboutLayout = new javax.swing.GroupLayout(panelAbout);
        panelAbout.setLayout(panelAboutLayout);
        panelAboutLayout.setHorizontalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAboutLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        panelAboutLayout.setVerticalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(bundle.getString("MainWindow.jLabel1.text")); // NOI18N

        panelFIO.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel4.setText(bundle.getString("MainWindow.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("MainWindow.jLabel5.text")); // NOI18N

        jLabel6.setText(bundle.getString("MainWindow.jLabel6.text")); // NOI18N

        jLabel7.setText(bundle.getString("MainWindow.jLabel7.text")); // NOI18N

        jLabel8.setText(bundle.getString("MainWindow.jLabel8.text")); // NOI18N

        fieldName.setText(bundle.getString("MainWindow.fieldName.text")); // NOI18N

        fieldLastName.setText(bundle.getString("MainWindow.fieldLastName.text")); // NOI18N

        fieldMiddleName.setText(bundle.getString("MainWindow.fieldMiddleName.text")); // NOI18N
        fieldMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMiddleNameActionPerformed(evt);
            }
        });

        rbMale.setSelected(true);
        rbMale.setText(bundle.getString("MainWindow.rbMale.text")); // NOI18N

        rbFemale.setText(bundle.getString("MainWindow.rbFemale.text")); // NOI18N

        jLabel10.setText(bundle.getString("MainWindow.jLabel10.text")); // NOI18N

        cmbCitizenship.setEditable(true);
        cmbCitizenship.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Украина" }));

        jLabel12.setText(bundle.getString("MainWindow.jLabel12.text")); // NOI18N

        cmbMarital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Замужем", "Женат" }));
        cmbMarital.setEnabled(false);

        cbMarital.setSelected(true);
        cbMarital.setText(bundle.getString("MainWindow.cbMarital.text")); // NOI18N
        cbMarital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaritalActionPerformed(evt);
            }
        });

        jLabel17.setText(bundle.getString("MainWindow.jLabel17.text")); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Среднее", "Среднее специальное", "Не полное высшее (бакалавр)", "Высшее (специалист)" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel18.setText(bundle.getString("MainWindow.jLabel18.text")); // NOI18N

        fieldSpeciality.setText(bundle.getString("MainWindow.fieldSpeciality.text")); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel22.setText(bundle.getString("MainWindow.jLabel22.text")); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel28.setText(bundle.getString("MainWindow.jLabel28.text")); // NOI18N

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "дневная", "заочная" }));
        jComboBox5.setEnabled(false);

        fieldGraduationYear.setText(bundle.getString("MainWindow.fieldGraduationYear.text")); // NOI18N

        fieldBirthday.setText(bundle.getString("MainWindow.fieldBirthday.text")); // NOI18N

        javax.swing.GroupLayout panelFIOLayout = new javax.swing.GroupLayout(panelFIO);
        panelFIO.setLayout(panelFIOLayout);
        panelFIOLayout.setHorizontalGroup(
            panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelFIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFIOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(fieldName)
                            .addComponent(fieldLastName)))
                    .addGroup(panelFIOLayout.createSequentialGroup()
                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFIOLayout.createSequentialGroup()
                                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fieldSpeciality, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFIOLayout.createSequentialGroup()
                                            .addComponent(rbMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbFemale))
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbMarital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbCitizenship, 0, 127, Short.MAX_VALUE)))
                                .addGap(10, 10, 10)
                                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFIOLayout.createSequentialGroup()
                                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox5, 0, 97, Short.MAX_VALUE)
                                            .addComponent(fieldGraduationYear)))
                                    .addGroup(panelFIOLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cbMarital))))
                            .addGroup(panelFIOLayout.createSequentialGroup()
                                .addComponent(fieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelFIOLayout.setVerticalGroup(
            panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFIOLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(11, 11, 11)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbMarital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fieldSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(fieldGraduationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPassport.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel11.setText(bundle.getString("MainWindow.jLabel11.text")); // NOI18N

        jLabel13.setText(bundle.getString("MainWindow.jLabel13.text")); // NOI18N

        jLabel14.setText(bundle.getString("MainWindow.jLabel14.text")); // NOI18N

        jLabel16.setText(bundle.getString("MainWindow.jLabel16.text")); // NOI18N

        fieldPassportNum.setText(bundle.getString("MainWindow.fieldPassportNum.text")); // NOI18N
        fieldPassportNum.setToolTipText(bundle.getString("MainWindow.fieldPassportNum.toolTipText")); // NOI18N

        fieldPassportGiven.setText(bundle.getString("MainWindow.fieldPassportGiven.text")); // NOI18N
        fieldPassportGiven.setToolTipText(bundle.getString("MainWindow.fieldPassportGiven.toolTipText")); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel43.setText(bundle.getString("MainWindow.jLabel43.text")); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel44.setText(bundle.getString("MainWindow.jLabel44.text")); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel45.setText(bundle.getString("MainWindow.jLabel45.text")); // NOI18N

        fieldIdent.setText(bundle.getString("MainWindow.fieldIdent.text")); // NOI18N
        fieldIdent.setToolTipText(bundle.getString("MainWindow.fieldIdent.toolTipText")); // NOI18N

        cmbArmy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Да", "Нет", "Освобожден", "Военная кафедра", "Другое" }));
        cmbArmy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbArmyItemStateChanged(evt);
            }
        });
        cmbArmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArmyActionPerformed(evt);
            }
        });

        cmbDriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Категория (A)", "Категория (B)", "Категория (C)", "Категория (D)", "Категория (E)", "Нет" }));

        jTextField1.setEnabled(false);

        jLabel23.setText(bundle.getString("MainWindow.jLabel23.text")); // NOI18N

        cmbAddressCity.setEditable(true);
        cmbAddressCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Киев", "Харьков", "Одесса", "Днепропетровск", "Донецк", "Запорожье", "Львов", "Кривой Рог", "Николаев", "Мариуполь", "Луганск", "Винница", "Макеевка", "Херсон", "Полтава", "Чернигов", "Черкассы", "Житомир", "Суммы", "Хмельницкий", "Черновцы", "Горловка", "Ровно", "Днепродзержинск", "Кировоград", "Ивано-Франковск", "Кременчуг", "Тернополь" }));
        cmbAddressCity.setToolTipText(bundle.getString("MainWindow.cmbAddressCity.toolTipText")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText(bundle.getString("MainWindow.jLabel9.text")); // NOI18N

        fieldAddressStreet.setText(bundle.getString("MainWindow.fieldAddressStreet.text")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText(bundle.getString("MainWindow.jLabel15.text")); // NOI18N

        fieldAddressIndex.setText(bundle.getString("MainWindow.fieldAddressIndex.text")); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel19.setText(bundle.getString("MainWindow.jLabel19.text")); // NOI18N

        jLabel26.setText(bundle.getString("MainWindow.jLabel26.text")); // NOI18N

        fieldPhoneMobile.setText(bundle.getString("MainWindow.fieldPhoneMobile.text")); // NOI18N

        fieldPhoneHome.setText(bundle.getString("MainWindow.fieldPhoneHome.text")); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel32.setText(bundle.getString("MainWindow.jLabel32.text")); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel31.setText(bundle.getString("MainWindow.jLabel31.text")); // NOI18N

        jLabel27.setText(bundle.getString("MainWindow.jLabel27.text")); // NOI18N

        fieldPassportDate.setText(bundle.getString("MainWindow.fieldPassportDate.text")); // NOI18N

        jCheckBox1.setText(bundle.getString("MainWindow.jCheckBox1.text")); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPassportLayout = new javax.swing.GroupLayout(panelPassport);
        panelPassport.setLayout(panelPassportLayout);
        panelPassportLayout.setHorizontalGroup(
            panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPassportLayout.createSequentialGroup()
                        .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPassportLayout.createSequentialGroup()
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel43)
                                    .addComponent(fieldPassportNum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldPassportGiven, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGroup(panelPassportLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel44)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45)
                                    .addComponent(fieldPassportDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPassportLayout.createSequentialGroup()
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldIdent, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbArmy, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1))))
                    .addGroup(panelPassportLayout.createSequentialGroup()
                        .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel13)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPassportLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel31))
                            .addGroup(panelPassportLayout.createSequentialGroup()
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbDriver, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPassportLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel9))
                                    .addComponent(cmbAddressCity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGroup(panelPassportLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassportLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fieldPhoneMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldPhoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))
                                .addGap(72, 72, 72)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPassportLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel19))
                            .addComponent(fieldAddressIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelPassportLayout.setVerticalGroup(
            panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(fieldPassportNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPassportGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPassportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(11, 11, 11)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cmbAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAddressIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(fieldPhoneMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPhoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        panelPassportLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbAddressCity, fieldAddressStreet, fieldEmail});

        panelPosition.setPreferredSize(new java.awt.Dimension(500, 200));

        cbByContract.setText(bundle.getString("MainWindow.cbByContract.text")); // NOI18N
        cbByContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbByContractActionPerformed(evt);
            }
        });

        jLabel24.setText(bundle.getString("MainWindow.jLabel24.text")); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel30.setText(bundle.getString("MainWindow.jLabel30.text")); // NOI18N

        fieldTableId.setText(bundle.getString("MainWindow.fieldTableId.text")); // NOI18N

        jLabel21.setText(bundle.getString("MainWindow.jLabel21.text")); // NOI18N

        jLabel35.setText(bundle.getString("MainWindow.jLabel35.text")); // NOI18N

        fieldPosition.setEditable(false);
        fieldPosition.setText(bundle.getString("MainWindow.fieldPosition.text")); // NOI18N

        cbNotByContract.setSelected(true);
        cbNotByContract.setText(bundle.getString("MainWindow.cbNotByContract.text")); // NOI18N
        cbNotByContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNotByContractActionPerformed(evt);
            }
        });

        fieldContractNumber.setEditable(false);
        fieldContractNumber.setText(bundle.getString("MainWindow.fieldContractNumber.text")); // NOI18N
        fieldContractNumber.setEnabled(false);

        fieldContractDate.setEditable(false);
        fieldContractDate.setText(bundle.getString("MainWindow.fieldContractDate.text")); // NOI18N
        fieldContractDate.setEnabled(false);

        jLabel29.setText(bundle.getString("MainWindow.jLabel29.text")); // NOI18N

        fieldDepartment.setEditable(false);
        fieldDepartment.setText(bundle.getString("MainWindow.fieldDepartment.text")); // NOI18N

        jLabel34.setText(bundle.getString("MainWindow.jLabel34.text")); // NOI18N

        fieldDateIn.setEditable(false);
        fieldDateIn.setText(bundle.getString("MainWindow.fieldDateIn.text")); // NOI18N

        fieldDateOut.setEditable(false);
        fieldDateOut.setText(bundle.getString("MainWindow.fieldDateOut.text")); // NOI18N
        fieldDateOut.setEnabled(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel39.setText(bundle.getString("MainWindow.jLabel39.text")); // NOI18N

        fieldOrganization.setEditable(false);
        fieldOrganization.setText(bundle.getString("MainWindow.fieldOrganization.text")); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel46.setText(bundle.getString("MainWindow.jLabel46.text")); // NOI18N

        javax.swing.GroupLayout panelPositionLayout = new javax.swing.GroupLayout(panelPosition);
        panelPosition.setLayout(panelPositionLayout);
        panelPositionLayout.setHorizontalGroup(
            panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPositionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldTableId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPositionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel35)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPosition)
                    .addGroup(panelPositionLayout.createSequentialGroup()
                        .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldDepartment)
                            .addComponent(fieldOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPositionLayout.createSequentialGroup()
                        .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPositionLayout.createSequentialGroup()
                                .addComponent(cbNotByContract)
                                .addGap(18, 18, 18)
                                .addComponent(cbByContract)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldContractNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPositionLayout.createSequentialGroup()
                                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel39)
                                    .addComponent(fieldDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fieldDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldContractDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPositionLayout.setVerticalGroup(
            panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPositionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(fieldOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(fieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(fieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(fieldTableId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNotByContract)
                    .addComponent(cbByContract)
                    .addComponent(jLabel30)
                    .addComponent(fieldContractNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldContractDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(fieldDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel38.setText(bundle.getString("MainWindow.jLabel38.text")); // NOI18N

        jLabel36.setText(bundle.getString("MainWindow.jLabel36.text")); // NOI18N

        fieldInternalNumber.setText(bundle.getString("MainWindow.fieldInternalNumber.text")); // NOI18N
        fieldInternalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldInternalNumberActionPerformed(evt);
            }
        });

        fieldRoom1.setEditable(false);
        fieldRoom1.setText(bundle.getString("MainWindow.fieldRoom1.text")); // NOI18N

        jLabel42.setText(bundle.getString("MainWindow.jLabel42.text")); // NOI18N

        jLabel41.setText(bundle.getString("MainWindow.jLabel41.text")); // NOI18N

        jLabel47.setText(bundle.getString("MainWindow.jLabel47.text")); // NOI18N

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        jLabel48.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel48.setText(bundle.getString("MainWindow.jLabel48.text")); // NOI18N

        jLabel37.setText(bundle.getString("MainWindow.jLabel37.text")); // NOI18N

        fieldWorktimeFrom.setEditable(false);
        fieldWorktimeFrom.setText(bundle.getString("MainWindow.fieldWorktimeFrom.text")); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel65.setText(bundle.getString("MainWindow.jLabel65.text")); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel66.setText(bundle.getString("MainWindow.jLabel66.text")); // NOI18N

        fieldRoom2.setEditable(false);
        fieldRoom2.setText(bundle.getString("MainWindow.fieldRoom2.text")); // NOI18N

        fieldSalary.setEditable(false);
        fieldSalary.setText(bundle.getString("MainWindow.fieldSalary.text")); // NOI18N
        fieldSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSalaryActionPerformed(evt);
            }
        });

        fieldBonus.setEditable(false);
        fieldBonus.setText(bundle.getString("MainWindow.fieldBonus.text")); // NOI18N

        fieldWorktimeTo.setEditable(false);
        fieldWorktimeTo.setText(bundle.getString("MainWindow.fieldWorktimeTo.text")); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel67.setText(bundle.getString("MainWindow.jLabel67.text")); // NOI18N

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel37)
                    .addComponent(jLabel47)
                    .addComponent(jLabel38)
                    .addComponent(jLabel42)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fieldInternalNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel65)
                        .addComponent(fieldSalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(fieldWorktimeFrom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldWorkEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelWorkLayout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel67)
                    .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldWorktimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelWorkLayout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldRoom2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(fieldWorktimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldWorktimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(fieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(fieldInternalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(fieldRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel66)
                    .addComponent(fieldRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(fieldWorkEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText(bundle.getString("MainWindow.jLabel33.text")); // NOI18N

        tableExperience.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "№", "Предприятие", "Должность", "Дата принятия", "Дата увольнения", "Причина увольнения", "Стаж работы"
            }
        ));
        jScrollPane4.setViewportView(tableExperience);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText(bundle.getString("MainWindow.jLabel20.text")); // NOI18N

        javax.swing.GroupLayout panelPersonHolderLayout = new javax.swing.GroupLayout(panelPersonHolder);
        panelPersonHolder.setLayout(panelPersonHolderLayout);
        panelPersonHolderLayout.setHorizontalGroup(
            panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPersonHolderLayout.createSequentialGroup()
                        .addComponent(panelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20)
                    .addComponent(jLabel33)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4)
                    .addComponent(jSeparator12)
                    .addGroup(panelPersonHolderLayout.createSequentialGroup()
                        .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(panelFIO, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelPassport, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(panelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPersonHolderLayout.setVerticalGroup(
            panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFIO, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelAbout, panelPhoto});

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelFIO, panelPassport});

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelPosition, panelWork});

        jScrollPane3.setViewportView(panelPersonHolder);

        jSplitPane1.setRightComponent(jScrollPane3);

        buttonStructSave.setText(bundle.getString("MainWindow.buttonStructSave.text")); // NOI18N
        buttonStructSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStructSaveActionPerformed(evt);
            }
        });

        buttonStructDiscard.setText(bundle.getString("MainWindow.buttonStructDiscard.text")); // NOI18N

        buttonStructExport.setText(bundle.getString("MainWindow.buttonStructExport.text")); // NOI18N
        buttonStructExport.setEnabled(false);
        buttonStructExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStructExportActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF", "ODT" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel51.setText(bundle.getString("MainWindow.jLabel51.text")); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText(bundle.getString("MainWindow.jLabel25.text")); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText(bundle.getString("MainWindow.jLabel52.text")); // NOI18N

        jLabel64.setText(bundle.getString("MainWindow.jLabel64.text")); // NOI18N

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonStructSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonStructDiscard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonStructExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonStructDiscard, buttonStructExport, buttonStructSave});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonStructSave)
                        .addComponent(buttonStructDiscard)
                        .addComponent(buttonStructExport)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel51)
                        .addComponent(jLabel52)
                        .addComponent(jLabel64))
                    .addComponent(jSeparator13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText(bundle.getString("MainWindow.jMenu1.text")); // NOI18N

        jMenuItem27.setText(bundle.getString("MainWindow.jMenuItem27.text")); // NOI18N
        jMenu1.add(jMenuItem27);
        jMenu1.add(jSeparator9);

        jMenu11.setText(bundle.getString("MainWindow.jMenu11.text")); // NOI18N

        jMenuItem17.setText(bundle.getString("MainWindow.jMenuItem17.text")); // NOI18N
        jMenu11.add(jMenuItem17);

        jMenuItem31.setText(bundle.getString("MainWindow.jMenuItem31.text")); // NOI18N
        jMenu11.add(jMenuItem31);

        jMenu1.add(jMenu11);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem29.setText(bundle.getString("MainWindow.jMenuItem29.text")); // NOI18N
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem29);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("MainWindow.jMenu2.text")); // NOI18N

        jMenuItem26.setText(bundle.getString("MainWindow.jMenuItem26.text")); // NOI18N
        jMenu2.add(jMenuItem26);

        jMenuItem25.setText(bundle.getString("MainWindow.jMenuItem25.text")); // NOI18N
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);

        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("MainWindow.jMenu3.text")); // NOI18N

        jMenuItem8.setText(bundle.getString("MainWindow.jMenuItem8.text")); // NOI18N
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator3);

        jMenuItem7.setText(bundle.getString("MainWindow.jMenuItem7.text")); // NOI18N
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText(bundle.getString("MainWindow.jMenuItem9.text")); // NOI18N
        jMenu3.add(jMenuItem9);

        jMenuItem14.setText(bundle.getString("MainWindow.jMenuItem14.text")); // NOI18N
        jMenu3.add(jMenuItem14);

        jMenuItem16.setText(bundle.getString("MainWindow.jMenuItem16.text")); // NOI18N
        jMenu3.add(jMenuItem16);

        jMenuItem15.setText(bundle.getString("MainWindow.jMenuItem15.text")); // NOI18N
        jMenu3.add(jMenuItem15);

        jMenuItem10.setText(bundle.getString("MainWindow.jMenuItem10.text")); // NOI18N
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText(bundle.getString("MainWindow.jMenuItem11.text")); // NOI18N
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText(bundle.getString("MainWindow.jMenuItem12.text")); // NOI18N
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText(bundle.getString("MainWindow.jMenuItem13.text")); // NOI18N
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText(bundle.getString("MainWindow.jMenu4.text")); // NOI18N

        jMenuItem21.setText(bundle.getString("MainWindow.jMenuItem21.text")); // NOI18N
        jMenu4.add(jMenuItem21);
        jMenu4.add(jSeparator7);

        menuItemCreateDepartment.setText(bundle.getString("MainWindow.menuItemCreateDepartment.text")); // NOI18N
        jMenu4.add(menuItemCreateDepartment);

        menuItemDeleteDepartment.setText(bundle.getString("MainWindow.menuItemDeleteDepartment.text")); // NOI18N
        jMenu4.add(menuItemDeleteDepartment);

        menuItemEditDepartment.setText(bundle.getString("MainWindow.menuItemEditDepartment.text")); // NOI18N
        jMenu4.add(menuItemEditDepartment);

        jMenuBar1.add(jMenu4);

        jMenu10.setText(bundle.getString("MainWindow.jMenu10.text")); // NOI18N

        jMenuItem22.setText(bundle.getString("MainWindow.jMenuItem22.text")); // NOI18N
        jMenu10.add(jMenuItem22);
        jMenu10.add(jSeparator8);

        menuItemCreateOrganization.setText(bundle.getString("MainWindow.menuItemCreateOrganization.text")); // NOI18N
        menuItemCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateOrganizationActionPerformed(evt);
            }
        });
        jMenu10.add(menuItemCreateOrganization);

        menuItemEditOrganization.setText(bundle.getString("MainWindow.menuItemEditOrganization.text")); // NOI18N
        jMenu10.add(menuItemEditOrganization);

        menuItemDeleteOrganization.setText(bundle.getString("MainWindow.menuItemDeleteOrganization.text")); // NOI18N
        jMenu10.add(menuItemDeleteOrganization);

        jMenuBar1.add(jMenu10);

        jMenu5.setText(bundle.getString("MainWindow.jMenu5.text")); // NOI18N

        jMenuItem36.setText(bundle.getString("MainWindow.jMenuItem36.text")); // NOI18N
        jMenu5.add(jMenuItem36);

        jMenuItem20.setText(bundle.getString("MainWindow.jMenuItem20.text")); // NOI18N
        jMenu5.add(jMenuItem20);

        jMenuItem19.setText(bundle.getString("MainWindow.jMenuItem19.text")); // NOI18N
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu6.setText(bundle.getString("MainWindow.jMenu6.text")); // NOI18N

        jMenuItem34.setText(bundle.getString("MainWindow.jMenuItem34.text")); // NOI18N
        jMenu6.add(jMenuItem34);

        jMenuItem33.setText(bundle.getString("MainWindow.jMenuItem33.text")); // NOI18N
        jMenu6.add(jMenuItem33);

        jMenuItem32.setText(bundle.getString("MainWindow.jMenuItem32.text")); // NOI18N
        jMenu6.add(jMenuItem32);

        jMenuItem35.setText(bundle.getString("MainWindow.jMenuItem35.text")); // NOI18N
        jMenu6.add(jMenuItem35);

        jMenuItem18.setText(bundle.getString("MainWindow.jMenuItem18.text")); // NOI18N
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem23.setText(bundle.getString("MainWindow.jMenuItem23.text")); // NOI18N
        jMenu6.add(jMenuItem23);

        jMenuBar1.add(jMenu6);

        jMenu7.setText(bundle.getString("MainWindow.jMenu7.text")); // NOI18N

        jMenu9.setText(bundle.getString("MainWindow.jMenu9.text")); // NOI18N

        jMenuItem4.setText(bundle.getString("MainWindow.jMenuItem4.text")); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);
        jMenu9.add(jSeparator2);

        jMenuItem5.setText(bundle.getString("MainWindow.jMenuItem5.text")); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuItem6.setText(bundle.getString("MainWindow.jMenuItem6.text")); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenu7.add(jMenu9);

        jMenuBar1.add(jMenu7);

        jMenu8.setText(bundle.getString("MainWindow.jMenu8.text")); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText(bundle.getString("MainWindow.jMenuItem1.text")); // NOI18N
        jMenu8.add(jMenuItem1);
        jMenu8.add(jSeparator1);

        jMenuItem2.setText(bundle.getString("MainWindow.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setText(bundle.getString("MainWindow.jMenuItem3.text")); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void initActions() {
		actionCreateOrganization = new ActionOrganizationCreate(application);
		actionEditOrganization = new ActionOrganizationEdit(application);
		actionDeleteOrganization = new ActionOrganizationDelete(application);
		actionCreateDepartment = new ActionDepartmentCreate(application);
		actionEditDepartment = new ActionDepartmentEdit(application);
		actionDeleteDepartment = new ActionDepartmentDelete(application);
	}
        
    Component frame = null;
    
    public void exitMainWindow() {
        Object[] options = {"Да", "Отмена"};
        int status = JOptionPane.showOptionDialog(frame, 
                "Вы действительно хотите выйти из программы?",
                "Выход",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
                );
        System.out.println(status);
        if (JOptionPane.NO_OPTION != status) {
            System.exit(0);
        }
    }
    
    private static String bytesToHex(byte[] b) {
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder buf = new StringBuilder();
            for (int j=0; j<b.length; j++) {
            buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
            buf.append(hexDigit[b[j] & 0x0f]);
            } 
            return buf.toString();
        }
    
    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        exitMainWindow();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        exitMainWindow();
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void buttonStructExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStructExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonStructExportActionPerformed

    private void buttonStructSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStructSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonStructSaveActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void fieldMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMiddleNameActionPerformed
    /*    */
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        exitMainWindow();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            adminListWindow.pack();
            adminListWindow.setLocationRelativeTo(null);
            adminListWindow.setVisible(true);
            
            DefaultTableModel tableModel = ((DefaultTableModel)jTable2.getModel());
            tableModel.setRowCount(0);

            DbAdminManager adminManager = application.getDbManager().getAdminManager();
            List<Admin> userList = adminManager.loadUserList();
		
            for( Admin user : userList ) {
                tableModel.addRow(user.getAdminListTable());
            }
			
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);    
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        adminAddWindow.pack();
        adminAddWindow.setLocationRelativeTo(null);
        adminAddWindow.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        adminDelRmWindow.pack();
        adminDelRmWindow.setLocationRelativeTo(null);
        adminDelRmWindow.setVisible(true);
        jComboBox10.removeAllItems();
        jComboBox10.addItem("Пользователи:");
            try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        Statement stmt = conn.createStatement();
        String sql = "SELECT admin_fullname FROM admin_tb";
            
        ResultSet rs;
        rs = stmt.executeQuery(sql);
            
        while(rs.next()){
            String admin_fullname = rs.getString("admin_fullname");
            jComboBox10.addItem(admin_fullname);
        }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void cmbArmyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbArmyItemStateChanged
        if (cmbArmy.getSelectedIndex() == 4){
            jTextField1.setEnabled(true);
        } else {
            jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_cmbArmyItemStateChanged

    private void cbMaritalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaritalActionPerformed
        if (!cbMarital.isSelected()) {
            cmbMarital.setEnabled(true);
        } else {
            cbMarital.setEnabled(false);
        }
    }//GEN-LAST:event_cbMaritalActionPerformed

    private void fieldInternalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldInternalNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldInternalNumberActionPerformed

    private void cmbArmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArmyActionPerformed
        
    }//GEN-LAST:event_cmbArmyActionPerformed

    private void menuItemCreateOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCreateOrganizationActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed

    }//GEN-LAST:event_jPasswordField3KeyPressed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseReleased

    }//GEN-LAST:event_jPasswordField3MouseReleased

    private void jPasswordField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyTyped

    }//GEN-LAST:event_jPasswordField4KeyTyped

    private void jPasswordField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyPressed
        
    }//GEN-LAST:event_jPasswordField4KeyPressed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed

    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jPasswordField4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPasswordField4InputMethodTextChanged

    }//GEN-LAST:event_jPasswordField4InputMethodTextChanged

    private void jPasswordField4CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPasswordField4CaretPositionChanged

    }//GEN-LAST:event_jPasswordField4CaretPositionChanged

    private void jPasswordField4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField4MouseReleased

    }//GEN-LAST:event_jPasswordField4MouseReleased

    private void jPasswordField4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField4MouseEntered

    }//GEN-LAST:event_jPasswordField4MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jComboBox10.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(
                frame, 
                "Не выбран пользователь для изменения данных.",
                "Внимание",
                JOptionPane.ERROR_MESSAGE);
        } else {   
            String jpf1Text=Arrays.toString(jPasswordField3.getPassword());
            String jpf2Text=Arrays.toString(jPasswordField4.getPassword());
        if (jPasswordField3.getPassword().length == 0 && jPasswordField3.getPassword().length == 0) {
            JOptionPane.showMessageDialog(
                frame, 
                "Поля для ввода пароля не должны быть пустыми.",
                "Внимание",
                JOptionPane.WARNING_MESSAGE);
            } else if (jpf1Text.equals(jpf2Text)) {
            try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        Statement stmt = conn.createStatement();
        
        MessageDigest md = MessageDigest.getInstance("SHA1");
        StringBuilder salt = new StringBuilder("Zxczxc123");
        String hashpwd = salt.append(jpf1Text).toString();
				md.update(hashpwd.getBytes());
				byte[] output = md.digest();
				String outpwd = bytesToHex(output);
        
        String sql1 = "UPDATE admin_tb SET admin_password='" + outpwd + "', admin_fullname='" + jTextField17.getText() + "' WHERE admin_name = '" + jTextField16.getText() + "';";
        stmt.executeUpdate(sql1);
        
        JOptionPane.showMessageDialog(
            frame, 
            "Данные пользователя '" + jComboBox10.getSelectedItem().toString() + "' успешно изменены.",
            "Выполнено",
            JOptionPane.INFORMATION_MESSAGE);
        
        String sql2 = "SELECT admin_fullname FROM admin_tb";
        ResultSet rs = stmt.executeQuery(sql2);
        
        jComboBox10.removeAllItems();
        jComboBox10.addItem("Пользователи:");

        while(rs.next()){
            String admin_fullname = rs.getString("admin_fullname");
            jComboBox10.addItem(admin_fullname);
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
        } catch (ClassNotFoundException | SQLException | NoSuchAlgorithmException ex) {
        Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
            JOptionPane.showMessageDialog(
            frame, 
            "Ошибка ввода данных! Введенные вами пароли не совпадают.",
            "Внимание",
            JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        licenseWindow.pack();
        licenseWindow.setLocationRelativeTo(null);
        licenseWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        aboutWindow.pack();
        aboutWindow.setLocationRelativeTo(null);
        aboutWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if (jComboBox2.getSelectedIndex() > 1) {
            jComboBox5.setEnabled(true);
        } else {
            jComboBox5.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void cbByContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbByContractActionPerformed
        if (cbByContract.isSelected()) {
            cbNotByContract.setSelected(false);
            fieldContractNumber.setEnabled(true);
            fieldContractDate.setEnabled(true);
        } else {
            cbNotByContract.setSelected(true);
            fieldContractNumber.setEnabled(false);
            fieldContractDate.setEnabled(false);
        }
    }//GEN-LAST:event_cbByContractActionPerformed

    private void cbNotByContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNotByContractActionPerformed
        if (cbNotByContract.isSelected()) {
            cbByContract.setSelected(false);
            fieldContractNumber.setEnabled(false);
            fieldContractDate.setEnabled(false);
        } else {
            cbByContract.setSelected(true);
            fieldContractNumber.setEnabled(true);
            fieldContractDate.setEnabled(true);
        }
    }//GEN-LAST:event_cbNotByContractActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox10ItemStateChanged
        if (jComboBox10.getSelectedIndex() > 0) {
        jTextField17.setEnabled(true);
        jPasswordField3.setEnabled(true);
        jPasswordField4.setEnabled(true);
            try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        Statement stmt = conn.createStatement();
        String sql = "SELECT admin_name, admin_fullname, admin_register, admin_last FROM admin_tb WHERE admin_fullname = '" + (String) jComboBox10.getSelectedItem() + "';";
            
        ResultSet rs;
        rs = stmt.executeQuery(sql);
            
        while(rs.next()){
            String admin_name = rs.getString("admin_name");
            String admin_fullname = rs.getString("admin_fullname");
            Timestamp admin_register = rs.getTimestamp("admin_register");
            Timestamp admin_last = rs.getTimestamp("admin_last");
            
            jTextField16.setText(admin_name);
            jTextField17.setText(admin_fullname);
            jPasswordField3.setText("");
            jPasswordField4.setText("");
            jSpinner18.setValue((Object) admin_register);
            jSpinner2.setValue((Object) admin_last);

            }
            rs.close();
            stmt.close();
            conn.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                           
    else {
        jTextField16.setText("");
        jTextField16.setEnabled(false);
        jTextField17.setText("");
        jTextField17.setEnabled(false);
        jPasswordField3.setText("");
        jPasswordField3.setEnabled(false);
        jPasswordField4.setText("");
        jPasswordField4.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox10ItemStateChanged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jTextField16.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                frame, 
                "Не выбран пользователь для удаления данных.",
                "Внимание",
                JOptionPane.ERROR_MESSAGE);
        } else {
            Object[] options = {"Да", "Отмена"};
        
            int status = JOptionPane.showOptionDialog(frame, 
                "Удалить выбранного пользователя?",
                "Внимание",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
                );
        
        if (JOptionPane.NO_OPTION != status) {
            try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        Statement stmt = conn.createStatement();
        
        String sql1 = "DELETE FROM admin_tb WHERE admin_name = '" + (String) jTextField16.getText() + "';";
        stmt.executeUpdate(sql1);
            JOptionPane.showMessageDialog(
                frame, 
                "Пользователь '" + jComboBox10.getSelectedItem().toString() + "' успешно удален.",
                "Выполнено",
                JOptionPane.INFORMATION_MESSAGE);
        
        String sql2 = "SELECT admin_fullname FROM admin_tb";
        ResultSet rs = stmt.executeQuery(sql2);
        
        jComboBox10.removeAllItems();
        jComboBox10.addItem("Пользователи:");

        while(rs.next()){
            String admin_fullname = rs.getString("admin_fullname");
            jComboBox10.addItem(admin_fullname);
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
        } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }     
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jTextField12.getText().isEmpty() ||  jTextField14.getText().isEmpty()) {
            if (jPasswordField1.getPassword().length == 0 || jPasswordField2.getPassword().length == 0) {
                JOptionPane.showMessageDialog(
                frame, 
                "Поля для ввода пароля не должны быть пустыми.",
                "Внимание",
                JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(
                frame, 
                "Поле для ввода имени и/или логина пользователя не должно"
                        + " быть пустым.",
                "Внимание",
                JOptionPane.ERROR_MESSAGE);
        } else {
        try {
            if (Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())) {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrms?useUnicode=true&characterEncoding=utf-8","root","mysqlroot");
        Statement stmt = conn.createStatement();
        
        MessageDigest md = MessageDigest.getInstance("SHA1");
        StringBuilder salt = new StringBuilder("Zxczxc123");
        String hashpwd = salt.append(jPasswordField1.getText()).toString();
				md.update(hashpwd.getBytes());
				byte[] output = md.digest();
				String outpwd = bytesToHex(output);
        
        String sql = "INSERT INTO admin_tb (admin_name, admin_fullname, admin_password, admin_register, admin_last) "
                + "VALUES ('" + jTextField12.getText() + "', '" + jTextField14.getText() + "', "
                + "'" + outpwd + "', NOW(), NOW());";
        stmt.executeUpdate(sql);
        
        conn.close();
            JOptionPane.showMessageDialog(
                frame, 
                "Пользователь '" + jTextField14.getText() + "' успешно добавлен(а).",
                "Выполнено",
                JOptionPane.INFORMATION_MESSAGE);
            
            jTextField12.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jTextField14.setText("");
            
        } else {
                JOptionPane.showMessageDialog(
                frame, 
                "Ошибка ввода данных! Введенные вами пароли не совпадают.",
                "Внимание",
                JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fieldSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSalaryActionPerformed
    
	private Application application;
	private PanelPerson panelPerson;

	// Actions
	private ActionOrganizationCreate actionCreateOrganization;
	private ActionOrganizationEdit actionEditOrganization;
	private ActionOrganizationDelete actionDeleteOrganization;
	private ActionDepartmentCreate actionCreateDepartment;
	private ActionDepartmentEdit actionEditDepartment;
	private ActionDepartmentDelete actionDeleteDepartment;
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutWindow;
    private javax.swing.JDialog adminAddWindow;
    private javax.swing.JDialog adminDelRmWindow;
    private javax.swing.JDialog adminListWindow;
    private javax.swing.JTextArea areaDescription;
    private javax.swing.JButton buttonStructDiscard;
    private javax.swing.JButton buttonStructExport;
    private javax.swing.JButton buttonStructSave;
    private javax.swing.JCheckBox cbByContract;
    private javax.swing.JCheckBox cbMarital;
    private javax.swing.JCheckBox cbNotByContract;
    private javax.swing.JComboBox cmbAddressCity;
    private javax.swing.JComboBox cmbArmy;
    private javax.swing.JComboBox cmbCitizenship;
    private javax.swing.JComboBox cmbDriver;
    private javax.swing.JComboBox cmbMarital;
    private javax.swing.JTextField fieldAddressIndex;
    private javax.swing.JTextField fieldAddressStreet;
    private javax.swing.JTextField fieldBirthday;
    private javax.swing.JTextField fieldBonus;
    private javax.swing.JTextField fieldContractDate;
    private javax.swing.JTextField fieldContractNumber;
    private javax.swing.JTextField fieldDateIn;
    private javax.swing.JTextField fieldDateOut;
    private javax.swing.JTextField fieldDepartment;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldGraduationYear;
    private javax.swing.JTextField fieldIdent;
    private javax.swing.JTextField fieldInternalNumber;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldMiddleName;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldOrganization;
    private javax.swing.JTextField fieldPassportDate;
    private javax.swing.JTextField fieldPassportGiven;
    private javax.swing.JTextField fieldPassportNum;
    private javax.swing.JTextField fieldPhoneHome;
    private javax.swing.JTextField fieldPhoneMobile;
    private javax.swing.JTextField fieldPosition;
    private javax.swing.JTextField fieldRoom1;
    private javax.swing.JTextField fieldRoom2;
    private javax.swing.JTextField fieldSalary;
    private javax.swing.JTextField fieldSpeciality;
    private javax.swing.JTextField fieldTableId;
    private javax.swing.JTextField fieldWorkEmail;
    private javax.swing.JTextField fieldWorktimeFrom;
    private javax.swing.JTextField fieldWorktimeTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JDialog licenseWindow;
    private javax.swing.JDialog manualWindow;
    private javax.swing.JMenuItem menuItemCreateDepartment;
    private javax.swing.JMenuItem menuItemCreateOrganization;
    private javax.swing.JMenuItem menuItemDeleteDepartment;
    private javax.swing.JMenuItem menuItemDeleteOrganization;
    private javax.swing.JMenuItem menuItemEditDepartment;
    private javax.swing.JMenuItem menuItemEditOrganization;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JPanel panelFIO;
    private javax.swing.JPanel panelPassport;
    private javax.swing.JPanel panelPersonHolder;
    private javax.swing.JPanel panelPhoto;
    private javax.swing.JPanel panelPosition;
    private javax.swing.JPanel panelWork;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tableExperience;
    private javax.swing.JTree treeStruct;
    // End of variables declaration//GEN-END:variables
}
