package isp_manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class removeStaff extends javax.swing.JPanel {

        Connection con;
    PreparedStatement stm;
    String passwd;
    ResultSet rs;
    Statement st;
    
    String who;
    
    public removeStaff(String id) {
                
        who = id;
                
        try {
            Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.prepareStatement("delete from staff where username = ?");
        st = con.createStatement();
        rs = st.executeQuery("select * from admin");
        
        
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                passwd = rs.getString(5);
                break;
            }
            
        }
        con.close();
        stm.close();
        } catch(Exception sq)   {
        }
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        removeBG = new javax.swing.JPanel();
        removeButton = new javax.swing.JButton();
        blockBG = new javax.swing.JPanel();
        blockButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        passField1 = new javax.swing.JPasswordField();
        warningLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(787, 678));
        setMinimumSize(new java.awt.Dimension(787, 678));
        setPreferredSize(new java.awt.Dimension(787, 678));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Re-enter password:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Enter password:");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Username (staff):");

        usernameField.setBackground(new java.awt.Color(38, 38, 38));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        usernameField.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        removeBG.setBackground(new java.awt.Color(204, 0, 0));

        removeButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        removeButton.setForeground(new java.awt.Color(204, 204, 204));
        removeButton.setText("Remove ");
        removeButton.setBorder(null);
        removeButton.setContentAreaFilled(false);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout removeBGLayout = new javax.swing.GroupLayout(removeBG);
        removeBG.setLayout(removeBGLayout);
        removeBGLayout.setHorizontalGroup(
            removeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        removeBGLayout.setVerticalGroup(
            removeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        blockBG.setBackground(new java.awt.Color(102, 102, 102));

        blockButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        blockButton.setForeground(new java.awt.Color(204, 204, 204));
        blockButton.setText("Block");
        blockButton.setBorder(null);
        blockButton.setContentAreaFilled(false);
        blockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blockButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout blockBGLayout = new javax.swing.GroupLayout(blockBG);
        blockBG.setLayout(blockBGLayout);
        blockBGLayout.setHorizontalGroup(
            blockBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        blockBGLayout.setVerticalGroup(
            blockBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        passField.setBackground(new java.awt.Color(38, 38, 38));
        passField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        passField1.setBackground(new java.awt.Color(38, 38, 38));
        passField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passField1.setForeground(new java.awt.Color(204, 204, 204));
        passField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        passField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passField1ActionPerformed(evt);
            }
        });

        warningLabel.setBackground(new java.awt.Color(204, 204, 204));
        warningLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(204, 204, 204));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(blockBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseEntered
        removeBG.setBackground(new java.awt.Color(155,0, 0));
    }//GEN-LAST:event_removeButtonMouseEntered

    private void removeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseExited
        removeBG.setBackground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_removeButtonMouseExited

    private void blockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockButtonMouseEntered
        blockBG.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_blockButtonMouseEntered

    private void blockButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockButtonMouseExited
        blockBG.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_blockButtonMouseExited

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void passField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passField1ActionPerformed

    private void blockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockButtonMouseClicked
        String username, pass1, pass2;
        username = usernameField.getText();
        pass1 = passField.getText();
        pass2 = passField1.getText();
        
        if(!pass1.equals(passwd)) {
            warningLabel.setText("Incorrect password");
        }   else if (!pass1.equals(pass2)) {
            warningLabel.setText("Passwords do not match");
        }   else {
        
        try {
            con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
            stm = con.prepareStatement("update staff set active = ? where username = ?");
            
            stm.setString(1, "false");
            stm.setString(2, username);
            stm.executeUpdate();
            
            stm.close();
            con.close();
            
            warningLabel.setText("Staff blocked");
        }   catch(Exception e) {}
        
        }
    }//GEN-LAST:event_blockButtonMouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        String username, pass1, pass2;
        username = usernameField.getText();
        pass1 = passField.getText();
        pass2 = passField1.getText();
        
        if(!pass1.equals(passwd)) {
            warningLabel.setText("Incorrect password");
        }   else if (!pass1.equals(pass2)) {
            warningLabel.setText("Passwords do not match");
        }   else {
        
        try {
            con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
            stm = con.prepareStatement("delete from staff where username = ?");
            
            stm.setString(1, username);
            stm.executeUpdate();
            
            stm.close();
            con.close();
            
            warningLabel.setText("Staff removed");
        }   catch(Exception e) {}
        
        }
    }//GEN-LAST:event_removeButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blockBG;
    private javax.swing.JButton blockButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JPanel removeBG;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
