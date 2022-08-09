package isp_manager;

import java.sql.*;
import java.awt.CardLayout;

public class loginSystem extends javax.swing.JFrame {

        String username;
        String password;

        boolean unameFieldClicked = false;
        boolean passFieldClicked = false;

        CardLayout cards;

        public loginSystem() {
                initComponents();

                cards = (CardLayout) (cardHolder.getLayout());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        cardHolder = new javax.swing.JPanel();
        loginPanel4 = new javax.swing.JPanel();
        unameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButtonPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        forgotPassButton = new javax.swing.JButton();
        newConnPanel = new javax.swing.JPanel();
        requestButton = new javax.swing.JButton();
        loginFailedAlert = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(44, 44, 44));
        bg.setForeground(new java.awt.Color(48, 48, 48));

        cardHolder.setLayout(new java.awt.CardLayout());

        loginPanel4.setBackground(new java.awt.Color(44, 44, 44));

        unameField.setBackground(new java.awt.Color(48, 48, 48));
        unameField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        unameField.setForeground(new java.awt.Color(153, 153, 153));
        unameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unameField.setText("username or ID");
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
        unameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(48, 48, 48));
        passwordField.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordFieldMouseExited(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButtonPanel.setBackground(new java.awt.Color(51, 51, 51));
        loginButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonPanelMouseExited(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginButtonPanelLayout = new javax.swing.GroupLayout(loginButtonPanel);
        loginButtonPanel.setLayout(loginButtonPanelLayout);
        loginButtonPanelLayout.setHorizontalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        loginButtonPanelLayout.setVerticalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        forgotPassButton.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        forgotPassButton.setForeground(new java.awt.Color(102, 102, 102));
        forgotPassButton.setText("Forgot password?");
        forgotPassButton.setBorder(null);
        forgotPassButton.setContentAreaFilled(false);
        forgotPassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPassButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPassButtonMouseExited(evt);
            }
        });
        forgotPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassButtonActionPerformed(evt);
            }
        });

        newConnPanel.setBackground(new java.awt.Color(51, 51, 51));
        newConnPanel.setForeground(new java.awt.Color(255, 255, 255));

        requestButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        requestButton.setForeground(new java.awt.Color(204, 204, 204));
        requestButton.setText("Request a Connection");
        requestButton.setBorder(null);
        requestButton.setContentAreaFilled(false);
        requestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestButtonMouseExited(evt);
            }
        });
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newConnPanelLayout = new javax.swing.GroupLayout(newConnPanel);
        newConnPanel.setLayout(newConnPanelLayout);
        newConnPanelLayout.setHorizontalGroup(
            newConnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newConnPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(requestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        newConnPanelLayout.setVerticalGroup(
            newConnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(requestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        loginFailedAlert.setForeground(new java.awt.Color(44, 44, 44));
        loginFailedAlert.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginFailedAlert.setText("Login Failed");
        loginFailedAlert.setToolTipText("");

        javax.swing.GroupLayout loginPanel4Layout = new javax.swing.GroupLayout(loginPanel4);
        loginPanel4.setLayout(loginPanel4Layout);
        loginPanel4Layout.setHorizontalGroup(
            loginPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel4Layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addGroup(loginPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel4Layout.createSequentialGroup()
                            .addComponent(loginFailedAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel4Layout.createSequentialGroup()
                            .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)))))
            .addGroup(loginPanel4Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(loginPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forgotPassButton)
                    .addComponent(loginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newConnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        loginPanel4Layout.setVerticalGroup(
            loginPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(loginFailedAlert)
                .addGap(151, 151, 151)
                .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassButton)
                .addGap(63, 63, 63)
                .addComponent(newConnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        cardHolder.add(loginPanel4, "card2");

        registerPanel.setBackground(new java.awt.Color(44, 44, 44));

        nameText.setBackground(new java.awt.Color(48, 48, 48));
        nameText.setForeground(new java.awt.Color(102, 102, 102));
        nameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameText.setText("Enter your name");
        nameText.setBorder(null);

        nameLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("Name :");

        jTextField6.setBackground(new java.awt.Color(48, 48, 48));
        jTextField6.setForeground(new java.awt.Color(102, 102, 102));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Enter your contact no.");
        jTextField6.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Email address :");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contact no. :");

        jTextField7.setBackground(new java.awt.Color(48, 48, 48));
        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Enter your contact no.");
        jTextField7.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        submitButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.setContentAreaFilled(false);
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(nameText))
                .addGap(80, 80, 80))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        cardHolder.add(registerPanel, "card3");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/ISP Manager512.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Powered by the MachineHeads");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(cardHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cardHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPassButtonActionPerformed

    private void requestButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestButtonMouseEntered
        newConnPanel.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_requestButtonMouseEntered

    private void requestButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestButtonMouseExited
        newConnPanel.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_requestButtonMouseExited

    private void unameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameFieldMouseEntered
        unameField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_unameFieldMouseEntered

    private void unameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameFieldMouseExited
        unameField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_unameFieldMouseExited

    private void passwordFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseEntered
        passwordField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_passwordFieldMouseEntered

    private void passwordFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseExited
        passwordField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_passwordFieldMouseExited

        private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_requestButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_requestButtonActionPerformed

        private void requestButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_requestButtonMouseClicked
                // TODO add your handling code here:
                cardHolder.removeAll();
                cardHolder.add(registerPanel);
                repaint();
                revalidate();

        }// GEN-LAST:event_requestButtonMouseClicked

        private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_submitButtonMouseClicked
                // TODO add your handling code here:
                cardHolder.removeAll();
                cardHolder.add(loginPanel4);
                repaint();
                revalidate();
                loginFailedAlert.setForeground(new java.awt.Color(44,44,44));
                unameField.setText("username or ID");
                passwordField.setText("Password");
        }// GEN-LAST:event_submitButtonMouseClicked

        private void unameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_unameFieldActionPerformed

        }// GEN-LAST:event_unameFieldActionPerformed

        private void loginButtonMouseClicked(java.awt.event.MouseEvent evt)  {// GEN-FIRST:event_loginButtonMouseClicked
                // TODO add your handling code here:
                try {
                Class.forName("org.sqlite.JDBC"); // Driver available
                Connection con = DriverManager.getConnection("jdbc:sqlite:F:\\Jva\\test\\ISP_Manager\\src\\isp_manager\\database\\isp_manager.db"); // established
                // connection
                Statement stm = con.createStatement(); // statement created
                ResultSet rs = stm.executeQuery("select * from admin"); // Query executed
                username = unameField.getText();
                password = passwordField.getText();

                while (rs.next()) {
                        if (username.equals(rs.getString(3)) && password.equals(rs.getString(5))) {
                                this.dispose();
                                new adminPanel().setVisible(true);
                        } else if (username.equals("customer") && password.equals("customer")) {
                                this.dispose();
                                new customerUserPanel().setVisible(true);
                        } else if (username.equals("staff") && password.equals("staff")) {
                                this.dispose();
                                new staffUserPanel().setVisible(true);
                        } else {
                                loginFailedAlert.setForeground(new java.awt.Color(204, 204, 204));
                        }
                }
                } catch (Exception e)   {
                    loginFailedAlert.setText("Login failed");
                    loginFailedAlert.setForeground(new java.awt.Color(204,204,204));
//                    e.printStackTrace();
                }
        }// GEN-LAST:event_loginButtonMouseClicked

        private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_loginButtonActionPerformed

        private void unameFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_unameFieldMouseClicked
                if (!unameFieldClicked) {
                        unameField.setText("");
                        unameFieldClicked = true;
                }
        }// GEN-LAST:event_unameFieldMouseClicked

        private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordFieldMouseClicked
                if (!passFieldClicked) {
                        passwordField.setText("");
                        passFieldClicked = true;
                }
        }// GEN-LAST:event_passwordFieldMouseClicked

        private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_passwordFieldKeyPressed
                // TODO add your handling code here:
        }// GEN-LAST:event_passwordFieldKeyPressed

        private void loginButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonPanelMouseEntered
        }// GEN-LAST:event_loginButtonPanelMouseEntered

        private void loginButtonPanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonPanelMouseExited

        }// GEN-LAST:event_loginButtonPanelMouseExited

        private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonMouseEntered
                loginButtonPanel.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_loginButtonMouseEntered

        private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonMouseExited
                loginButtonPanel.setBackground(new java.awt.Color(51, 51, 51));
        }// GEN-LAST:event_loginButtonMouseExited

        private void forgotPassButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_forgotPassButtonMouseEntered
                forgotPassButton.setForeground(new java.awt.Color(120, 120, 120));
        }// GEN-LAST:event_forgotPassButtonMouseEntered

        private void forgotPassButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_forgotPassButtonMouseExited
                forgotPassButton.setForeground(new java.awt.Color(102, 102, 102));
        }// GEN-LAST:event_forgotPassButtonMouseExited

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(loginSystem.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(loginSystem.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(loginSystem.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(loginSystem.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new loginSystem().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cardHolder;
    private javax.swing.JButton forgotPassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginButtonPanel;
    private javax.swing.JLabel loginFailedAlert;
    private javax.swing.JPanel loginPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JPanel newConnPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton requestButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField unameField;
    // End of variables declaration//GEN-END:variables
}
