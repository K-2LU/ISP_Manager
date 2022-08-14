package isp_manager;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class listStaffPanel extends javax.swing.JPanel {

        String uid, name, username, packStat, actStat, mail;
        int credit = 5000;

        Connection con;
        Statement stm;
        ResultSet rs;

        public listStaffPanel() {

                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane3 = new javax.swing.JScrollPane();
                DefaultTableModel model = new DefaultTableModel();
                table = new javax.swing.JTable(model);
                model.addColumn("ID");
                model.addColumn("Name");
                model.addColumn("Username");
                model.addColumn("Package");
                model.addColumn("Email");
                model.addColumn("Active Status");

                setBackground(new java.awt.Color(44, 44, 44));

                try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
                        stm = con.createStatement();
                        rs = stm.executeQuery("select * from staff"); // Query executed

                        while (rs.next()) {
                                uid = rs.getString(1);
                                name = rs.getString(2);
                                username = rs.getString(3);
                                packStat = rs.getString(7);
                                mail = rs.getString(8);
                                actStat = rs.getString(5);

                                model.addRow(new Object[] { uid, name, username, packStat, mail, actStat });
                        }
                        stm.close();
                        rs.close();
                        con.close();
                        for (int i = 0; i < 40; i++) {
                                model.addRow(new Object[] { "", "", "", "", "", "" });
                        }
                } catch (Exception e) {
                }

                jScrollPane3.setBackground(new java.awt.Color(44, 44, 44));
                jScrollPane3.setBorder(null);

                table.setBackground(new java.awt.Color(44, 44, 44));
                table.setForeground(new java.awt.Color(204, 204, 204));
                table.setGridColor(new java.awt.Color(51, 51, 51));
                table.setSelectionBackground(new java.awt.Color(51, 51, 51));
                table.setSelectionForeground(new java.awt.Color(51, 51, 51));
                jScrollPane3.setViewportView(table);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 787,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 678,
                                                                Short.MAX_VALUE));
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable table;
        // End of variables declaration//GEN-END:variables
}
