/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.gui.windows;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ABogovik
 */
public class loginWindow extends javax.swing.JFrame {
    private Component frame;

    /**
     * Creates new form loginWindow
     */
    public loginWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_name = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        dbServerField = new javax.swing.JComboBox();
        label_dbserver = new javax.swing.JLabel();
        label_greeting = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        changeBox1 = new javax.swing.JCheckBox();
        dbPasswordField = new javax.swing.JPasswordField();
        dbUserField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Авторизация");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        label_name.setText("Имя пользователя:");

        label_password.setText("Пароль:");

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        enterButton.setText("Войти");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        dbServerField.setEditable(true);
        dbServerField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "127.0.0.1" }));
        dbServerField.setToolTipText("");

        label_dbserver.setText("Сервер БД:");

        label_greeting.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_greeting.setText("Добро пожаловать в систему DirectHRM");

        portField.setText("3306");
        portField.setEnabled(false);

        jLabel1.setText("Порт БД:");

        jLabel3.setText("Пароль БД:");

        changeBox1.setText("Изменить порт");
        changeBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Пользователь БД:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_password, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_dbserver, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(loginField)
                                .addComponent(dbServerField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(portField, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addGap(79, 79, 79))
                                .addComponent(changeBox1))
                            .addComponent(dbPasswordField)
                            .addComponent(dbUserField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterButton))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(label_greeting, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, enterButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_greeting)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbServerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dbserver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dbPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(enterButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        loginWindow.this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed

        if (loginField.getText().isEmpty() && passwordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                "Поля не могут быть пустыми! Пожалуйста, попробуйте ещё раз.",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
        }
            try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String URL = "jdbc:mysql://localhost:3306/hrms";
        Connection conn = (Connection) DriverManager.getConnection(URL,"root","mysqlroot");
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT admin_name, admin_password FROM admin_tb where admin_name=\""+loginField.getText()+"\"");
        while(rst.next()){
                String dbadm = rst.getString("admin_name");
                String dbpwd = rst.getString("admin_password");
                System.out.println(dbadm+" "+dbpwd);
                MessageDigest md = MessageDigest.getInstance("SHA1");
                    StringBuilder salt = new StringBuilder("Zxczxc123");
                        String hashpwd = salt.append(passwordField.getText()).toString();
                        md.update(hashpwd.getBytes()); 
                        byte[] output = md.digest();
                    String outpwd = bytesToHex(output);
                    
                    
                if (dbadm.equals(loginField.getText()) && dbpwd.equals(outpwd)) {
                    mainWindow program = new mainWindow();
                    program.setVisible(true);
                    loginWindow.this.setVisible(false);
                    loginWindow.this.dispose();
                    } else {
                    JOptionPane.showMessageDialog(frame,
                "Ошибка авторизации! Пожалуйста, попробуйте ещё раз.",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
                }
            }
            stm.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println(ex);
        } catch (SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(loginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterButtonActionPerformed
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Enter Button pressed.");
        }
    }//GEN-LAST:event_formKeyPressed

    private void changeBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBox1ActionPerformed
        if (changeBox1.isSelected()) {
            portField.setEnabled(true);
        } else {
            portField.setEnabled(false);
        }
    }//GEN-LAST:event_changeBox1ActionPerformed
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginWindow().setVisible(true);
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox changeBox1;
    private javax.swing.JPasswordField dbPasswordField;
    private javax.swing.JComboBox dbServerField;
    private javax.swing.JTextField dbUserField;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_dbserver;
    private javax.swing.JLabel label_greeting;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_password;
    private javax.swing.JTextField loginField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField portField;
    // End of variables declaration//GEN-END:variables

    public static String bytesToHex(byte[] b) {
      char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                         '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      StringBuffer buf = new StringBuffer();
      for (int j=0; j<b.length; j++) {
         buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
         buf.append(hexDigit[b[j] & 0x0f]);
      } return buf.toString();
    }
}
