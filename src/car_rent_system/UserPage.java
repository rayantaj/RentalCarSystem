/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_rent_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UserPage extends javax.swing.JFrame {

    DB db;
    Connection con;
    //public int userID;
    Customer customer;
    Admin admin;
    PreparedStatement statement;

    public UserPage(Connection con, DB db) {
        initComponents();
        this.con = con;
        this.db = db;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        EMailField = new javax.swing.JTextField();
        EmailLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpToggle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Image.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\rental.png")); // NOI18N

        TitleLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("C-Rents");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addComponent(Image))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        EmailLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("E-Mail");

        EMailField.setBackground(new java.awt.Color(255, 255, 255));
        EMailField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        EMailField.setForeground(new java.awt.Color(0, 0, 0));

        EmailLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EmailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel1.setText("Password");

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New to C-Rents?");

        loginButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signUpToggle.setBackground(new java.awt.Color(153, 153, 153));
        signUpToggle.setText("Click Here");
        signUpToggle.setBorder(null);
        signUpToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(signUpToggle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmailLabel1)
                            .addComponent(EmailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EMailField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(signUpToggle))
                .addGap(22, 22, 22)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String email = EMailField.getText();
        String password = passwordField.getText();

        
        if (LogIn("admins", email, password) == true) {

            new AdminHomePage(con, db).setVisible(true);
            this.setVisible(false);
        } else if (LogIn("customers", email, password)) {
            new CustomerHomePage(customer, con, db).setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email/password", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_loginButtonActionPerformed

    private void signUpToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpToggleActionPerformed
        this.setVisible(false);
        new customerSignUp(db).setVisible(true);
    }//GEN-LAST:event_signUpToggleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    public boolean LogIn(String TableName, String Email, String Password) {

        try {

            String q = "select * from " + TableName + " where email = ? AND password = ?";

            statement = null;
            // CREATE THE STATEMENT
            statement = con.prepareStatement(q, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // ASSIGN THE VALUE INTO THE STATMENT
            statement.setString(1, Email);
            statement.setString(2, Password);
            // RESULT QUERY 
            ResultSet rs = statement.executeQuery();
            rs.beforeFirst();
            if (rs.first()) {
                if (TableName.equalsIgnoreCase("customers")) {
                    System.out.println("LOGIN SUCCESSFUL");
                    String Scn = rs.getInt("scn") + "";
                    String emailRs = rs.getString("email");
                    String name = rs.getString("name");
                    String passwordRS = rs.getString("password");
                    String I_Number = rs.getString("lNumber");
                    Date dateLice = rs.getDate("eLicDate");
                    Date BOD = rs.getDate("dob");
                    String phone = rs.getString("Phone");
                    //String SCN, String License_Number, Date BOD, Date End_License, String Name, String Email, String Password, String phone
                    //this.userID = Integer.parseInt(Scn);
                    customer = new Customer(Scn, I_Number, BOD, dateLice, name, emailRs, passwordRS, phone);
                    customer.GetALL_Data();
                } else {
                    //String Name, String Email, String Password, String phone
                    admin = new Admin(rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("phone"));

                }
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signUpToggle;
    // End of variables declaration//GEN-END:variables
}
