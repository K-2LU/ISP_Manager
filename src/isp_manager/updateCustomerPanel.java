/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package isp_manager;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class updateCustomerPanel extends javax.swing.JPanel {

    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement st;

    String userId, username, contactNo, mailAddress, bandwith, nameCust;
    String actStat, passwd, creditString;
    int credit;
    
    String who;
    
    public updateCustomerPanel(String id) {
        
        try{
                    Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.createStatement(); // statement created
        st = con.prepareStatement("update customer set password = ? where id = ?");
        rs = stm.executeQuery("select * from customer"); // Query executed
        
        who = id;
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                userId = rs.getString(1);
                username = rs.getString(4);
                contactNo = rs.getString(10);
                mailAddress = rs.getString(11);
                bandwith = rs.getString(7);
                nameCust = rs.getString(3);
                actStat = rs.getString(9);
                credit = rs.getInt(8);
                passwd = rs.getString(6);
                break;
            }
        }
        con.close();
        stm.close();
        st.close();
        rs.close();
        
        } catch (Exception e)   {}
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomerPanel10 = new javax.swing.JPanel();
        nameField10 = new javax.swing.JTextField();
        nameLabel10 = new javax.swing.JLabel();
        addressField10 = new javax.swing.JTextField();
        addressLabel10 = new javax.swing.JLabel();
        phoneField10 = new javax.swing.JTextField();
        phoneLabel10 = new javax.swing.JLabel();
        emailField10 = new javax.swing.JTextField();
        emailLabel10 = new javax.swing.JLabel();
        packageLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        legalDocField10 = new javax.swing.JTextField();
        addCustBG10 = new javax.swing.JPanel();
        adderButton10 = new javax.swing.JButton();
        packageBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        unameField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        packageBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        unameField1 = new javax.swing.JTextField();

        addCustomerPanel10.setBackground(new java.awt.Color(44, 44, 44));

        nameField10.setBackground(new java.awt.Color(48, 48, 48));
        nameField10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nameField10.setForeground(new java.awt.Color(204, 204, 204));
        nameField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField10.setText("Enter name");
        nameField10.setBorder(null);
        nameField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameField10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameField10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameField10MouseExited(evt);
            }
        });

        nameLabel10.setBackground(new java.awt.Color(204, 204, 204));
        nameLabel10.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel10.setText("Customer Name");

        addressField10.setBackground(new java.awt.Color(48, 48, 48));
        addressField10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        addressField10.setForeground(new java.awt.Color(204, 204, 204));
        addressField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressField10.setText("Enter address");
        addressField10.setBorder(null);
        addressField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressField10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addressField10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addressField10MouseExited(evt);
            }
        });

        addressLabel10.setBackground(new java.awt.Color(204, 204, 204));
        addressLabel10.setForeground(new java.awt.Color(204, 204, 204));
        addressLabel10.setText("Current Address:");

        phoneField10.setBackground(new java.awt.Color(48, 48, 48));
        phoneField10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        phoneField10.setForeground(new java.awt.Color(204, 204, 204));
        phoneField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneField10.setText("Enter phone number");
        phoneField10.setBorder(null);
        phoneField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneField10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phoneField10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneField10MouseExited(evt);
            }
        });

        phoneLabel10.setBackground(new java.awt.Color(204, 204, 204));
        phoneLabel10.setForeground(new java.awt.Color(204, 204, 204));
        phoneLabel10.setText("Contact No. (Phone):");

        emailField10.setBackground(new java.awt.Color(48, 48, 48));
        emailField10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailField10.setForeground(new java.awt.Color(204, 204, 204));
        emailField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField10.setText("Enter email address");
        emailField10.setBorder(null);
        emailField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailField10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailField10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailField10MouseExited(evt);
            }
        });

        emailLabel10.setBackground(new java.awt.Color(204, 204, 204));
        emailLabel10.setForeground(new java.awt.Color(204, 204, 204));
        emailLabel10.setText("Email Address:");

        packageLabel10.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel10.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel10.setText("Package");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("NID/Birth Certificate No.");

        legalDocField10.setBackground(new java.awt.Color(48, 48, 48));
        legalDocField10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        legalDocField10.setForeground(new java.awt.Color(204, 204, 204));
        legalDocField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        legalDocField10.setText("Legal document no.");
        legalDocField10.setBorder(null);
        legalDocField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                legalDocField10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                legalDocField10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                legalDocField10MouseExited(evt);
            }
        });

        addCustBG10.setBackground(new java.awt.Color(10, 137, 70));

        adderButton10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        adderButton10.setForeground(new java.awt.Color(204, 204, 204));
        adderButton10.setText("Update");
        adderButton10.setBorder(null);
        adderButton10.setContentAreaFilled(false);
        adderButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adderButton10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adderButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adderButton10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout addCustBG10Layout = new javax.swing.GroupLayout(addCustBG10);
        addCustBG10.setLayout(addCustBG10Layout);
        addCustBG10Layout.setHorizontalGroup(
            addCustBG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustBG10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adderButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        addCustBG10Layout.setVerticalGroup(
            addCustBG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adderButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        packageBox.setBackground(new java.awt.Color(48, 48, 48));
        packageBox.setForeground(new java.awt.Color(204, 204, 204));
        packageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 mbps", "15 mbps", "20 mbps", "30 mbps" }));
        packageBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packageBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packageBoxMouseExited(evt);
            }
        });
        packageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageBoxActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Set username");

        unameField.setBackground(new java.awt.Color(48, 48, 48));
        unameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        unameField.setForeground(new java.awt.Color(204, 204, 204));
        unameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unameField.setText("Enter username");
        unameField.setBorder(null);
        unameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unameFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unameFieldMouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Set password");

        warningLabel.setForeground(new java.awt.Color(204, 204, 204));

        passField.setBackground(new java.awt.Color(48, 48, 48));
        passField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField.setBorder(null);
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passFieldMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Set userID");

        packageBox1.setBackground(new java.awt.Color(48, 48, 48));
        packageBox1.setForeground(new java.awt.Color(204, 204, 204));
        packageBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        packageBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packageBox1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packageBox1MouseExited(evt);
            }
        });
        packageBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageBox1ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Set Credit");

        unameField1.setBackground(new java.awt.Color(48, 48, 48));
        unameField1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        unameField1.setForeground(new java.awt.Color(204, 204, 204));
        unameField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unameField1.setText("Enter Credit");
        unameField1.setBorder(null);
        unameField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unameField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unameField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unameField1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout addCustomerPanel10Layout = new javax.swing.GroupLayout(addCustomerPanel10);
        addCustomerPanel10.setLayout(addCustomerPanel10Layout);
        addCustomerPanel10Layout.setHorizontalGroup(
            addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(packageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(packageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legalDocField10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField10, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCustomerPanel10Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packageLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                                    .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 472, Short.MAX_VALUE)))))
                    .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(addCustBG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addCustomerPanel10Layout.setVerticalGroup(
            addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(packageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(unameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustomerPanel10Layout.createSequentialGroup()
                        .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(legalDocField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(addCustomerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packageLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(addCustBG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addCustomerPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCustomerPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField10MouseClicked

    private void nameField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameField10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField10MouseEntered

    private void nameField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameField10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField10MouseExited

    private void addressField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addressField10MouseClicked

    private void addressField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressField10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addressField10MouseEntered

    private void addressField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressField10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addressField10MouseExited

    private void phoneField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneField10MouseClicked

    private void phoneField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneField10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneField10MouseEntered

    private void phoneField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneField10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneField10MouseExited

    private void emailField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailField10MouseClicked

    private void emailField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailField10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_emailField10MouseEntered

    private void emailField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailField10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_emailField10MouseExited

    private void legalDocField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_legalDocField10MouseClicked

    private void legalDocField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocField10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_legalDocField10MouseEntered

    private void legalDocField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocField10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_legalDocField10MouseExited

    private void adderButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adderButton10MouseClicked

    private void adderButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButton10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adderButton10MouseEntered

    private void adderButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButton10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_adderButton10MouseExited

    private void packageBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageBoxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBoxMouseEntered

    private void packageBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageBoxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBoxMouseExited

    private void packageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBoxActionPerformed

    private void unameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFieldMouseClicked

    private void unameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFieldMouseEntered

    private void unameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFieldMouseExited

    private void passFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldMouseEntered

    private void passFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldMouseExited

    private void packageBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageBox1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBox1MouseEntered

    private void packageBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageBox1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBox1MouseExited

    private void packageBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageBox1ActionPerformed

    private void unameField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_unameField1MouseClicked

    private void unameField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameField1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_unameField1MouseEntered

    private void unameField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameField1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_unameField1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCustBG10;
    private javax.swing.JPanel addCustomerPanel10;
    private javax.swing.JButton adderButton10;
    private javax.swing.JTextField addressField10;
    private javax.swing.JLabel addressLabel10;
    private javax.swing.JTextField emailField10;
    private javax.swing.JLabel emailLabel10;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JTextField legalDocField10;
    private javax.swing.JTextField nameField10;
    private javax.swing.JLabel nameLabel10;
    private javax.swing.JComboBox<String> packageBox;
    private javax.swing.JComboBox<String> packageBox1;
    private javax.swing.JLabel packageLabel10;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField phoneField10;
    private javax.swing.JLabel phoneLabel10;
    private javax.swing.JTextField unameField;
    private javax.swing.JTextField unameField1;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
