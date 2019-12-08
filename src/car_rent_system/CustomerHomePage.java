package car_rent_system;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CustomerHomePage extends javax.swing.JFrame {

    static GridBagLayout layout = new GridBagLayout();
    GridBagConstraints c;
    DB db;
    Customer customer;

    public static HomePanel HomePanel;
    public static SearchPanel SearchPanel;
    public static editAccountPanel editAccPanel;
    ReservationPanel reservationPanel;
    int userID;
    Connection con;

    public CustomerHomePage(Customer css, Connection con, DB db) {
        initComponents();

        this.con = con;
        this.db = db;
        customer = css;


        SearchPanel = new SearchPanel(con, db, customer);
        MyContainer.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        MyContainer.add(SearchPanel, c);
        SearchPanel.setVisible(true);

        reservationPanel = new ReservationPanel(con, db);
        MyContainer.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        MyContainer.add(reservationPanel, c);
        reservationPanel.setVisible(false);

        editAccPanel = new editAccountPanel(con, db, customer);
        MyContainer.setLayout(layout);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        MyContainer.add(editAccPanel, c);
        editAccPanel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SearchPanelButton = new javax.swing.JButton();
        editAccountButton = new javax.swing.JButton();
        SignOutPanelButton = new javax.swing.JButton();
        ReservationPanelButton1 = new javax.swing.JButton();
        MyContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        SearchPanelButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SearchPanelButton.setText("Search");
        SearchPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPanelButtonActionPerformed(evt);
            }
        });

        editAccountButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        editAccountButton.setText("Edit Account");
        editAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountButtonActionPerformed(evt);
            }
        });

        SignOutPanelButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SignOutPanelButton.setText("SignOut");
        SignOutPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutPanelButtonActionPerformed(evt);
            }
        });

        ReservationPanelButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ReservationPanelButton1.setText("Reservations");
        ReservationPanelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationPanelButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(SearchPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(ReservationPanelButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(editAccountButton)
                .addGap(71, 71, 71)
                .addComponent(SignOutPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SignOutPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ReservationPanelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MyContainer.setBackground(new java.awt.Color(204, 204, 204));
        MyContainer.setPreferredSize(new java.awt.Dimension(933, 355));

        javax.swing.GroupLayout MyContainerLayout = new javax.swing.GroupLayout(MyContainer);
        MyContainer.setLayout(MyContainerLayout);
        MyContainerLayout.setHorizontalGroup(
            MyContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MyContainerLayout.setVerticalGroup(
            MyContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MyContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPanelButtonActionPerformed
        SearchPanel.setVisible(true);
        reservationPanel.setVisible(false);
        editAccPanel.setVisible(false);


    }//GEN-LAST:event_SearchPanelButtonActionPerformed

    private void editAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountButtonActionPerformed
        editAccPanel.setVisible(true);
        reservationPanel.setVisible(false);
        SearchPanel.setVisible(false);
    }//GEN-LAST:event_editAccountButtonActionPerformed

    private void SignOutPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutPanelButtonActionPerformed
        this.setVisible(false);
        new UserPage(con, db).setVisible(true);
    }//GEN-LAST:event_SignOutPanelButtonActionPerformed

    private void ReservationPanelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationPanelButton1ActionPerformed
        reservationPanel.setVisible(true);
        SearchPanel.setVisible(false);
        editAccPanel.setVisible(false);

        ResultSet re = db.getReservations(Integer.parseInt(customer.getSCN()));
        reservationPanel.getTable().setModel(resultSetToTableModel(re));
    }//GEN-LAST:event_ReservationPanelButton1ActionPerformed

    public static void main(String args[]) {

    }

    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {

            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);   // AFTER THAT INVOKE .SetModel on the JTable Object...
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyContainer;
    private javax.swing.JButton ReservationPanelButton1;
    private javax.swing.JButton SearchPanelButton;
    private javax.swing.JButton SignOutPanelButton;
    private javax.swing.JButton editAccountButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
