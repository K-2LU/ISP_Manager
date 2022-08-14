package isp_manager;

import java.awt.CardLayout;
import java.sql.*;

public class addAdmin extends javax.swing.JPanel {
        CardLayout cards;
        Connection con;
        Statement stm;
        ResultSet rs;
        PreparedStatement st;
        String who;
        String passwd;
        
    public addAdmin(String id) {
        who = id;        
        try{
            Class.forName("org.sqlite.JDBC"); // Driver available
            
            con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db");
            stm = con.createStatement(); // statement created
            rs = stm.executeQuery("select * from admin"); // Query executed
            
            
            
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                passwd = rs.getString(5);
                break;
            }

        }        
        rs.close();
        stm.close();
        con.close();

            
        } catch(Exception e)    {
            System.out.println(e.getMessage());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        unameField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        tempPassField1 = new javax.swing.JPasswordField();
        tempPassField2 = new javax.swing.JPasswordField();
        passField1 = new javax.swing.JPasswordField();
        passField2 = new javax.swing.JPasswordField();
        savePanel = new javax.swing.JPanel();
        saveLabel = new javax.swing.JLabel();
        cancelPanel = new javax.swing.JPanel();
        cancelLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        uidField = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1256, 678));

        BG.setBackground(new java.awt.Color(44, 44, 44));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a new admin");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Username :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email Address :");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone No. :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Temp. Password :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Re-enter Password :");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Enter your password to confirm :");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Re-enter :");

        nameField.setBackground(new java.awt.Color(38, 38, 38));
        nameField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        unameField.setBackground(new java.awt.Color(38, 38, 38));
        unameField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        unameField.setForeground(new java.awt.Color(204, 204, 204));
        unameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        mailField.setBackground(new java.awt.Color(38, 38, 38));
        mailField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        mailField.setForeground(new java.awt.Color(204, 204, 204));
        mailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        phoneField.setBackground(new java.awt.Color(38, 38, 38));
        phoneField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        phoneField.setForeground(new java.awt.Color(204, 204, 204));
        phoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        tempPassField1.setBackground(new java.awt.Color(38, 38, 38));
        tempPassField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tempPassField1.setForeground(new java.awt.Color(204, 204, 204));
        tempPassField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));
        tempPassField1.setPreferredSize(new java.awt.Dimension(5, 24));

        tempPassField2.setBackground(new java.awt.Color(38, 38, 38));
        tempPassField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tempPassField2.setForeground(new java.awt.Color(204, 204, 204));
        tempPassField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));
        tempPassField2.setPreferredSize(new java.awt.Dimension(5, 24));

        passField1.setBackground(new java.awt.Color(38, 38, 38));
        passField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passField1.setForeground(new java.awt.Color(204, 204, 204));
        passField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));
        passField1.setPreferredSize(new java.awt.Dimension(5, 24));

        passField2.setBackground(new java.awt.Color(38, 38, 38));
        passField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passField2.setForeground(new java.awt.Color(204, 204, 204));
        passField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));
        passField2.setPreferredSize(new java.awt.Dimension(5, 24));

        savePanel.setBackground(new java.awt.Color(67, 88, 210));
        savePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savePanelMouseExited(evt);
            }
        });

        saveLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(204, 204, 204));
        saveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/check.png"))); // NOI18N
        saveLabel.setText("Confirm");
        saveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cancelPanel.setBackground(new java.awt.Color(44, 44, 44));
        cancelPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 66, 66), 3, true));
        cancelPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelPanelMouseExited(evt);
            }
        });

        cancelLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancelLabel.setForeground(new java.awt.Color(204, 204, 204));
        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/close(1).png"))); // NOI18N
        cancelLabel.setText("Reset");
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelPanelLayout = new javax.swing.GroupLayout(cancelPanel);
        cancelPanel.setLayout(cancelPanelLayout);
        cancelPanelLayout.setHorizontalGroup(
            cancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelPanelLayout.setVerticalGroup(
            cancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        warningLabel.setForeground(new java.awt.Color(44, 44, 44));
        warningLabel.setText("warning label");

        uidField.setBackground(new java.awt.Color(38, 38, 38));
        uidField.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        uidField.setForeground(new java.awt.Color(204, 204, 204));
        uidField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(0, 305, Short.MAX_VALUE)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempPassField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempPassField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(uidField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(warningLabel))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uidField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempPassField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempPassField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseClicked
        String temp1, temp2, pass1, pass2;
        String id, name, username, mail, contactNo;
        
        id = uidField.getText();
        name = nameField.getText();
        username = unameField.getText();
        mail = mailField.getText();
        contactNo = phoneField.getText();
        
        temp1 = tempPassField1.getText();
        temp2 = tempPassField2.getText();
        pass1 = passField1.getText();
        pass2 = passField2.getText();
        

        
        if(!temp1.equals(temp2))    {
            warningLabel.setText("Temporary passwords do not match");
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
        }   else if (!pass1.equals(pass2))  {
            warningLabel.setText("Your Passwords do not match");
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
        }   else if(!pass1.equals(passwd))  {
            warningLabel.setText("Incorrect password: " + passwd + who);
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
        }   
        else {
            
            try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.createStatement(); // statement created
        st = con.prepareStatement("insert into admin values(?,?,?,?,?,?)");
        
        st.setString(1, id);
        st.setString(2, name);
        st.setString(3, username);
        st.setString(4, mail);
        st.setString(5, temp1);
        st.setString(6, contactNo);
        st.executeUpdate();
        
        st.close();
        con.close();
        stm.close();
        rs.close();            
            warningLabel.setText("New admin created");
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_saveLabelMouseClicked

    private void saveLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseEntered
        savePanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_saveLabelMouseEntered

    private void saveLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseExited
        savePanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_saveLabelMouseExited

    private void savePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePanelMouseEntered
        savePanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_savePanelMouseEntered

    private void savePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePanelMouseExited
        savePanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_savePanelMouseExited

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        nameField.setText("");
        unameField.setText("");
        mailField.setText("");
        phoneField.setText("");
        tempPassField1.setText("");
        tempPassField2.setText("");
        passField1.setText("");
        passField2.setText("");
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_cancelLabelMouseExited

    private void cancelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPanelMouseEntered
        cancelPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_cancelPanelMouseEntered

    private void cancelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPanelMouseExited
        cancelPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_cancelPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JPanel cancelPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JPasswordField passField2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JPanel savePanel;
    private javax.swing.JPasswordField tempPassField1;
    private javax.swing.JPasswordField tempPassField2;
    private javax.swing.JTextField uidField;
    private javax.swing.JTextField unameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
