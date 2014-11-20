package directhrm.gui.windows;

import directhrm.Application;
import directhrm.gui.action.ActionDepartmentCreate;
import directhrm.gui.action.ActionDepartmentDelete;
import directhrm.gui.action.ActionDepartmentEdit;
import directhrm.gui.action.ActionOrganizationCreate;
import directhrm.gui.action.ActionOrganizationDelete;
import directhrm.gui.action.ActionOrganizationEdit;
import java.awt.Component;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;

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

	public JTextField getFieldBirthday() {
		return fieldBirthday;
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

	public JTextField getFieldGraduationYear() {
		return fieldGraduationYear;
	}

	public JTextField getFieldPassportDate() {
		return fieldPassportDate;
	}

	public JTextField getFieldAddressIndex() {
		return fieldAddressIndex;
	}

	public JTextField getFieldAddressStreet() {
		return fieldAddressStreet;
	}

//	public JTextField getFieldContractNum() {
//		return fieldContractNum;
//	}

	public JTextField getFieldEmail() {
		return fieldEmail;
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

	public JTextField getFieldOrganisation() {
		return fieldOrganisation;
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

//	public JTextField getFieldRate() {
//		return fieldRate;
//	}

	public JTextField getFieldSkype() {
		return fieldSkype;
	}

	public JTextField getFieldSpeciality() {
		return fieldSpeciality;
	}

	public JTextField getFieldTableId() {
		return fieldTableId;
	}

//	public JTextField getFieldWorkDayEnd() {
//		return fieldWorkDayEnd;
//	}
//
//	public JTextField getFieldWorkDayStart() {
//		return fieldWorkDayStart;
//	}
//
//	public JTextField getFieldWorkEmail() {
//		return fieldWorkEmail;
//	}

//	public JTextField getFieldWorkPlace() {
//		return fieldWorkPlace;
//	}
        
//	public JLabel getLabelPhoto() {
//		return labelPhoto;
//	}

//	public JRadioButton getRbArmyNo() {
//		return rbArmyNo;
//	}
//
//	public JRadioButton getRbArmyYes() {
//		return rbArmyYes;
//	}
        
	public JRadioButton getRbFemale() {
		return rbFemale;
	}

	//public JRadioButton getRbHighEducationNo() {
	//	return rbHighEducationNo;
	//}

	//public JRadioButton getRbHighEducationYes() {
	//	return rbHighEducationYes;
	//}

	//public JRadioButton getRbJobberNo() {
	//	return rbJobberNo;
	//}

	//public JRadioButton getRbJobberYes() {
	//	return rbJobberYes;
	//}

	public JRadioButton getRbMale() {
		return rbMale;
	}

	//public JRadioButton getRbMissionNo() {
	//	return rbMissionNo;
	//}

	//public JRadioButton getRbMissionYes() {
	//	return rbMissionYes;
	//}

	
	
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
        adminTableList = new javax.swing.JTable();
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
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeStruct = new javax.swing.JTree();
        jPanel6 = new javax.swing.JPanel();
        buttonStructExport = new javax.swing.JButton();
        buttonStructDiscard = new javax.swing.JButton();
        buttonStructSave = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelPersonHolder = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
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
        jPanel7 = new javax.swing.JPanel();
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
        fieldSkype = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        fieldPassportDate = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cbByContract = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        fieldTableId = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fieldPosition = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        fieldDepartment = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        fieldDateIn = new javax.swing.JTextField();
        fieldDateOut = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        fieldOrganisation = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        fieldInternalNumber = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jTextField11 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
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
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
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

        adminListWindow.setLocationRelativeTo(null);
        adminListWindow.setTitle("Все администраторы");

        adminTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Admin", "Administartor", "319203f211d7e4e5b2d3d2e0cae0644145cfcb6f", "2014-10-24 11:24:49"},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Логин", "Имя", "Пароль", "Добавлен"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(adminTableList);

        javax.swing.GroupLayout adminListWindowLayout = new javax.swing.GroupLayout(adminListWindow.getContentPane());
        adminListWindow.getContentPane().setLayout(adminListWindowLayout);
        adminListWindowLayout.setHorizontalGroup(
            adminListWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminListWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        adminListWindowLayout.setVerticalGroup(
            adminListWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminListWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        //adminAddWindow.setSize(350, 195);
        adminAddWindow.setLocationRelativeTo(null);
        adminAddWindow.setTitle("Добавление администратора");
        adminAddWindow.setResizable(false);

        jLabel53.setText("Логин:");

        jLabel54.setText("Полное имя:");

        jLabel55.setText("Пароль:");

        jLabel56.setText("Пароль (повторно):");

        jLabel57.setText("Дата:");

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

        jButton5.setText("Добавить");

        javax.swing.GroupLayout adminAddWindowLayout = new javax.swing.GroupLayout(adminAddWindow.getContentPane());
        adminAddWindow.getContentPane().setLayout(adminAddWindowLayout);
        adminAddWindowLayout.setHorizontalGroup(
            adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAddWindowLayout.createSequentialGroup()
                        .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAddWindowLayout.createSequentialGroup()
                                .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAddWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        adminAddWindowLayout.setVerticalGroup(
            adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminAddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        adminDelRmWindow.setTitle("Удаление/Изменение администратора");
        adminDelRmWindow.setResizable(false);

        jSpinner18.setModel(new javax.swing.SpinnerDateModel());
        jSpinner18.setEnabled(false);

        jLabel58.setText("Пароль:");

        jLabel59.setText("Пароль (повторно):");

        jButton6.setText("Сохранить");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel60.setText("Дата:");

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

        jLabel61.setText("Логин:");

        jLabel62.setText("Полное имя:");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Пользователь:", "Администратор (по умолчанию)", "Боговик Александр", "Андрей Якивчук" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jButton11.setText("Удалить");

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
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, 0, 220, Short.MAX_VALUE)
                            .addComponent(jPasswordField4)
                            .addComponent(jTextField16)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminDelRmWindowLayout.createSequentialGroup()
                                .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField17))))
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
                .addGap(18, 18, 18)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminDelRmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton11))
                .addContainerGap())
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

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ООО \"Моя компания\"");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("IT");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Боговик Александр Александрович");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Кузьменко Александр Викорович");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Юридический");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Шульга Екатерина Сергеевна");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeStruct.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeStruct);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Общая информация"));
        jPanel6.setPreferredSize(new java.awt.Dimension(1360, 700));

        buttonStructExport.setText("Экспорт");
        buttonStructExport.setEnabled(false);
        buttonStructExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStructExportActionPerformed(evt);
            }
        });

        buttonStructDiscard.setText("Отмена");

        buttonStructSave.setText("Сохранить");
        buttonStructSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStructSaveActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Дата загрузки фото:");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Краткая характеристика:");

        areaDescription.setColumns(20);
        areaDescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        areaDescription.setLineWrap(true);
        areaDescription.setRows(5);
        areaDescription.setText("Кузьменко Александр Викторович, 1988 года рождения является сотрудником  ООО «Моя компания» с 2013 года по настоящее время.\nЗа время работы Александр Викторович зарекомендовал  себя высококвалифицированным,  работником и специалистом своего дела.\n\nТрудолюбие и высокая работоспособность так же являются отличительными чертами Александра Викторовича. ");
        areaDescription.setToolTipText("Краткая характеристка");
        areaDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaDescription);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Персональная информация");

        jPanel5.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel4.setText("Фамилия:");

        jLabel5.setText("Имя:");

        jLabel6.setText("Отчество:");

        jLabel7.setText("Пол:");

        jLabel8.setText("Дата рождения:");

        fieldName.setText("Александр");

        fieldLastName.setText("Кузьменко");

        fieldMiddleName.setText("Викторович");
        fieldMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMiddleNameActionPerformed(evt);
            }
        });

        rbMale.setSelected(true);
        rbMale.setText("Мужской");

        rbFemale.setText("Женский");

        jLabel10.setText("Гражданство:");

        cmbCitizenship.setEditable(true);
        cmbCitizenship.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Украина" }));

        jLabel12.setText("Семейное положение:");

        cmbMarital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Замужем", "Женат" }));
        cmbMarital.setEnabled(false);

        cbMarital.setSelected(true);
        cbMarital.setText("Не состою в браке");
        cbMarital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaritalActionPerformed(evt);
            }
        });

        jLabel17.setText("Высшее образование:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Среднее", "Среднее специальное", "Высшее (специалист)", "Не полное высшее (бакалавр)" }));
        jComboBox2.setSelectedIndex(2);

        jLabel18.setText("Специальность:");

        fieldSpeciality.setText("Инженер-программист");

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel22.setText("год окончания");

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel28.setText("форма обучения");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "дневная", "заочная" }));

        fieldGraduationYear.setText("0000");

        fieldBirthday.setText("00.00.0000");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(fieldName)
                            .addComponent(fieldLastName)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fieldSpeciality, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(rbMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbFemale))
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbMarital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbCitizenship, 0, 127, Short.MAX_VALUE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cbMarital))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox5, 0, 97, Short.MAX_VALUE)
                                            .addComponent(fieldGraduationYear, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(fieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbMarital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fieldSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(fieldGraduationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel11.setText("Служба в армии:");

        jLabel13.setText("Водительские права:");

        jLabel14.setText("ИНН:");

        jLabel16.setText("Паспортные данные:");

        fieldPassportNum.setText("АН 076512");
        fieldPassportNum.setToolTipText("Серия и номер паспорта");

        fieldPassportGiven.setText("Нижнегородским РО УМВС в Днепропетровской обл.");
        fieldPassportGiven.setToolTipText("Кем выдан");

        jLabel43.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel43.setText("серия/номер");

        jLabel44.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel44.setText("кем выдан");

        jLabel45.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel45.setText("дата");

        fieldIdent.setText("1234567890");
        fieldIdent.setToolTipText("Идентификационный код");

        cmbArmy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Служил", "Освобожден (по здоровью)", "Военная кафедра", "Не военнообязанный(ая)", "Другое" }));
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

        cmbDriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "N" }));

        jTextField1.setEnabled(false);

        jLabel23.setText("Прописка:");

        cmbAddressCity.setEditable(true);
        cmbAddressCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Киев", "Харьков", "Одесса", "Днепропетровск", "Донецк", "Запорожье", "Львов", "Кривой Рог", "Николаев", "Мариуполь", "Луганск", "Винница", "Макеевка", "Херсон", "Полтава", "Чернигов", "Черкассы", "Житомир", "Суммы", "Хмельницкий", "Черновцы", "Горловка", "Ровно", "Днепродзержинск", "Кировоград", "Ивано-Франковск", "Кременчуг", "Тернополь" }));
        cmbAddressCity.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("город");

        fieldAddressStreet.setText("ул. Первомайская, 24/17");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText("адрес");

        fieldAddressIndex.setText("00000");

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel19.setText("индекс");

        jLabel26.setText("Контакты:");

        fieldPhoneMobile.setText("(050) 123-24-67");

        fieldPhoneHome.setText("(067) 123-24-67");

        jLabel32.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel32.setText("мобильный");

        jLabel31.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel31.setText("домашний");

        jLabel27.setText("Почта (личная):");

        fieldEmail.setText("akuzmenko@gmail.com");

        fieldSkype.setEnabled(false);

        jCheckBox1.setText("Skype");

        fieldPassportDate.setText("00.00.0000");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel43)
                                    .addComponent(fieldPassportNum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldPassportGiven, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel44)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45)
                                    .addComponent(fieldPassportDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(fieldIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cmbArmy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel13)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(cmbAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldAddressStreet)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cmbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldEmail)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldPhoneMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31)
                                    .addComponent(fieldSkype, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldPhoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel19))
                            .addComponent(fieldAddressIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fieldEmail, fieldSkype});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(fieldPassportNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPassportGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPassportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cmbAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAddressIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(fieldPhoneMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPhoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSkype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbAddressCity, fieldAddressStreet, fieldEmail, fieldSkype});

        jPanel8.setPreferredSize(new java.awt.Dimension(500, 200));

        cbByContract.setText("По договору №");

        jLabel24.setText("Табельный номер:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel30.setText("от");

        fieldTableId.setText("12019");

        jLabel21.setText("Организация:");

        jLabel35.setText("Должность:");

        fieldPosition.setText("Должность сотрудника");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Штат");

        jTextField3.setEnabled(false);

        jTextField4.setText("00.00.0000");
        jTextField4.setEnabled(false);

        jLabel29.setText("Отдел:");

        fieldDepartment.setEditable(false);
        fieldDepartment.setText("Отдел сотрудника");

        jLabel34.setText("Принят:");

        fieldDateIn.setText("00:00:0000");

        fieldDateOut.setText("00:00:0000");
        fieldDateOut.setEnabled(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel39.setText("принят");

        jLabel40.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel40.setText("уволен");

        fieldOrganisation.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addComponent(fieldDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(fieldTableId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel35)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPosition)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbByContract)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(fieldOrganisation))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(fieldOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(fieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(fieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(fieldTableId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(cbByContract)
                    .addComponent(jLabel30)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(fieldDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel38.setText("Внутренний номер:");

        jLabel36.setText("Кабинет:");

        fieldInternalNumber.setText("4024");
        fieldInternalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldInternalNumberActionPerformed(evt);
            }
        });

        jLabel42.setText("Почта:");

        jLabel41.setText("Заработная плата:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel46.setText("премия");

        jLabel47.setText("Разряд:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        jLabel49.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel49.setText("(согласно категории)");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(1.0f)));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(1.0f)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel48.setText("№1");

        jLabel50.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel50.setText("№2");

        jLabel37.setText("График работы:");

        jTextField6.setText("08:00");

        jTextField7.setText("17:00");

        jLabel65.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel65.setText("оклад");

        jLabel66.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel66.setText("(рабочая)");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel37)
                            .addComponent(jLabel47)
                            .addComponent(jLabel38)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jSpinner3)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldInternalNumber)
                            .addComponent(jTextField18)))
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel46)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50))
                    .addComponent(jLabel66))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField10, jTextField11});

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField6, jTextField7});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(fieldInternalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(45, 45, 45))
        );

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Штатная информация");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Опыт работы");

        javax.swing.GroupLayout panelPersonHolderLayout = new javax.swing.GroupLayout(panelPersonHolder);
        panelPersonHolder.setLayout(panelPersonHolderLayout);
        panelPersonHolderLayout.setHorizontalGroup(
            panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20)
                    .addGroup(panelPersonHolderLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator11)
                    .addGroup(panelPersonHolderLayout.createSequentialGroup()
                        .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))
                    .addComponent(jSeparator10)
                    .addComponent(jLabel33)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator12)
                    .addComponent(jScrollPane4))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel3});

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel5, jPanel7});

        panelPersonHolderLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel11, jPanel8});

        jScrollPane3.setViewportView(panelPersonHolder);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF", "ODT" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Сегодня:");

        jLabel51.setText("15.11.2014");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Вы вошли как:");

        jLabel64.setText("Администратор");

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonStructSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonStructDiscard)
                .addGap(10, 10, 10)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonStructExport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addContainerGap())
            .addComponent(jScrollPane3)
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonStructDiscard, buttonStructExport, buttonStructSave});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        jMenu1.setText("Файл");

        jMenuItem27.setText("Открыть");
        jMenu1.add(jMenuItem27);
        jMenu1.add(jSeparator9);

        jMenu11.setText("Экспорт");

        jMenuItem17.setText("Документ (PDF)");
        jMenu11.add(jMenuItem17);

        jMenuItem31.setText("Документ (ODT)");
        jMenu11.add(jMenuItem31);

        jMenu1.add(jMenu11);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem29.setText("Выход");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem29);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Правка");

        jMenuItem26.setText("Очистить область");
        jMenu2.add(jMenuItem26);

        jMenuItem25.setText("Удалить область");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Сотрудники");

        jMenuItem8.setText("Все сотрудники");
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator3);

        jMenuItem7.setText("Принять сотрудника");
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Уволить сотрудника");
        jMenu3.add(jMenuItem9);

        jMenuItem14.setText("Редактировать персональные данные");
        jMenu3.add(jMenuItem14);

        jMenuItem16.setText("Данные о родственниках");
        jMenu3.add(jMenuItem16);

        jMenuItem15.setText("Назначение/перевод");
        jMenu3.add(jMenuItem15);

        jMenuItem10.setText("Оклад/Надбавка");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Командировка/Бизнес");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Больничный лист");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Отпуск");
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Отделы");

        jMenuItem21.setText("Все подразделения");
        jMenu4.add(jMenuItem21);
        jMenu4.add(jSeparator7);

        menuItemCreateDepartment.setText("Создать подразделение");
        jMenu4.add(menuItemCreateDepartment);

        menuItemDeleteDepartment.setText("Удалить подразделение");
        jMenu4.add(menuItemDeleteDepartment);

        menuItemEditDepartment.setText("Изменить данные");
        jMenu4.add(menuItemEditDepartment);

        jMenuBar1.add(jMenu4);

        jMenu10.setText("Организации");

        jMenuItem22.setText("Все организации");
        jMenu10.add(jMenuItem22);
        jMenu10.add(jSeparator8);

        menuItemCreateOrganization.setText("Новая организация");
        menuItemCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateOrganizationActionPerformed(evt);
            }
        });
        jMenu10.add(menuItemCreateOrganization);

        menuItemEditOrganization.setText("Изменить данные");
        jMenu10.add(menuItemEditOrganization);

        menuItemDeleteOrganization.setText("Удалить организацию (структуру)");
        jMenu10.add(menuItemDeleteOrganization);

        jMenuBar1.add(jMenu10);

        jMenu5.setText("Операции");

        jMenuItem36.setText("Печать карточки");
        jMenu5.add(jMenuItem36);

        jMenuItem20.setText("Табель рабочего времени");
        jMenu5.add(jMenuItem20);

        jMenuItem19.setText("Штатное расписание");
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Отчеты");

        jMenuItem33.setText("Дни рождения");
        jMenu6.add(jMenuItem33);

        jMenuItem32.setText("График отпусков");
        jMenu6.add(jMenuItem32);

        jMenuItem34.setText("Праздничные дни");
        jMenu6.add(jMenuItem34);

        jMenuItem35.setText("Отчеты по сотрудникам (работающие)");
        jMenu6.add(jMenuItem35);

        jMenuItem18.setText("Отчеты по сотрудникам (уволенные)");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem23.setText("Отчеты по организациям");
        jMenu6.add(jMenuItem23);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Сервис");

        jMenu9.setText("Администрирование");

        jMenuItem4.setText("Все администраторы");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);
        jMenu9.add(jSeparator2);

        jMenuItem5.setText("Добавить администратора");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuItem6.setText("Удалить/Изменить администратора");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenu7.add(jMenu9);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Справка");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Справка");
        jMenu8.add(jMenuItem1);
        jMenu8.add(jSeparator1);

        jMenuItem2.setText("Лицензия");
        jMenu8.add(jMenuItem2);

        jMenuItem3.setText("О программе");
        jMenu8.add(jMenuItem3);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
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
	
    public void exitMainWindow() {
        Object[] options = {"Да", "Отмена"};
        Component frame = null;
        int status = JOptionPane.showOptionDialog(frame, 
                "Действительно выйти из программы?",
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
        adminListWindow.pack();
        adminListWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        adminAddWindow.pack();
        adminAddWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        adminDelRmWindow.pack();
        adminDelRmWindow.setVisible(true);
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
        if (jComboBox10.getSelectedIndex() > 0){
            jTextField16.setEnabled(true);
            jTextField17.setEnabled(true);
            jPasswordField3.setEnabled(true);
            jPasswordField4.setEnabled(true);
            jSpinner18.setModel(new javax.swing.SpinnerDateModel());
        } else {
            jTextField16.setEnabled(false);
            jTextField17.setEnabled(false);
            jPasswordField3.setEnabled(false);
            jPasswordField4.setEnabled(false);
            jSpinner18 = new javax.swing.JSpinner();
            jSpinner18.setEnabled(false);
        }
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
        String jpf1Text=Arrays.toString(jPasswordField3.getPassword());
        String jpf2Text=Arrays.toString(jPasswordField4.getPassword());

        if (!jpf1Text.equals(jpf2Text)){
            System.out.println("Пароли совпадают");
        }
    }//GEN-LAST:event_jButton6ActionPerformed
        

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
    private javax.swing.JDialog adminAddWindow;
    private javax.swing.JDialog adminDelRmWindow;
    private javax.swing.JDialog adminListWindow;
    private javax.swing.JTable adminTableList;
    private javax.swing.JTextArea areaDescription;
    private javax.swing.JButton buttonStructDiscard;
    private javax.swing.JButton buttonStructExport;
    private javax.swing.JButton buttonStructSave;
    private javax.swing.JCheckBox cbByContract;
    private javax.swing.JCheckBox cbMarital;
    private javax.swing.JComboBox cmbAddressCity;
    private javax.swing.JComboBox cmbArmy;
    private javax.swing.JComboBox cmbCitizenship;
    private javax.swing.JComboBox cmbDriver;
    private javax.swing.JComboBox cmbMarital;
    private javax.swing.JTextField fieldAddressIndex;
    private javax.swing.JTextField fieldAddressStreet;
    private javax.swing.JTextField fieldBirthday;
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
    private javax.swing.JTextField fieldOrganisation;
    private javax.swing.JTextField fieldPassportDate;
    private javax.swing.JTextField fieldPassportGiven;
    private javax.swing.JTextField fieldPassportNum;
    private javax.swing.JTextField fieldPhoneHome;
    private javax.swing.JTextField fieldPhoneMobile;
    private javax.swing.JTextField fieldPosition;
    private javax.swing.JTextField fieldSkype;
    private javax.swing.JTextField fieldSpeciality;
    private javax.swing.JTextField fieldTableId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
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
    private javax.swing.JCheckBox jCheckBox2;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
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
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuItemCreateDepartment;
    private javax.swing.JMenuItem menuItemCreateOrganization;
    private javax.swing.JMenuItem menuItemDeleteDepartment;
    private javax.swing.JMenuItem menuItemDeleteOrganization;
    private javax.swing.JMenuItem menuItemEditDepartment;
    private javax.swing.JMenuItem menuItemEditOrganization;
    private javax.swing.JPanel panelPersonHolder;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTree treeStruct;
    // End of variables declaration//GEN-END:variables
}
