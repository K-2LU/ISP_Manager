package isp_manager;

public class settingsPanel extends javax.swing.JPanel {
    
    javax.swing.JPanel tempPanel;
    boolean backActive = false;
    
    
    String who;
    
    public settingsPanel(String id) {
        
        who = id;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        settingsBG = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();
        profileLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeAdminPanel = new javax.swing.JPanel();
        remAdminButton = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addAdminPanel = new javax.swing.JPanel();
        addAdminButton = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        changePassPanel = new javax.swing.JPanel();
        changePassLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        deletionPanel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();

        BG.setBackground(new java.awt.Color(44, 44, 44));

        settingsBG.setBackground(new java.awt.Color(44, 44, 44));
        settingsBG.setLayout(new java.awt.CardLayout());

        defaultPanel.setBackground(new java.awt.Color(44, 44, 44));

        profilePanel.setBackground(new java.awt.Color(44, 44, 44));
        profilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilePanelMouseExited(evt);
            }
        });

        profileLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(204, 204, 204));
        profileLabel.setText("Profile");
        profileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileLabelMouseEntered(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/user.png"))); // NOI18N

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(profileLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        removeAdminPanel.setBackground(new java.awt.Color(44, 44, 44));
        removeAdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeAdminPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeAdminPanelMouseExited(evt);
            }
        });

        remAdminButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        remAdminButton.setForeground(new java.awt.Color(204, 204, 204));
        remAdminButton.setText("Remove an admin");
        remAdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remAdminButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remAdminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remAdminButtonMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/admin_rem.png"))); // NOI18N

        javax.swing.GroupLayout removeAdminPanelLayout = new javax.swing.GroupLayout(removeAdminPanel);
        removeAdminPanel.setLayout(removeAdminPanelLayout);
        removeAdminPanelLayout.setHorizontalGroup(
            removeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeAdminPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(remAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        removeAdminPanelLayout.setVerticalGroup(
            removeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeAdminPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(remAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addAdminPanel.setBackground(new java.awt.Color(44, 44, 44));
        addAdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addAdminPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addAdminPanelMouseExited(evt);
            }
        });

        addAdminButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addAdminButton.setForeground(new java.awt.Color(204, 204, 204));
        addAdminButton.setText("Add new admin");
        addAdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAdminButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addAdminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addAdminButtonMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/admin.png"))); // NOI18N

        javax.swing.GroupLayout addAdminPanelLayout = new javax.swing.GroupLayout(addAdminPanel);
        addAdminPanel.setLayout(addAdminPanelLayout);
        addAdminPanelLayout.setHorizontalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        addAdminPanelLayout.setVerticalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(addAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        changePassPanel.setBackground(new java.awt.Color(44, 44, 44));
        changePassPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePassPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePassPanelMouseExited(evt);
            }
        });

        changePassLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        changePassLabel.setForeground(new java.awt.Color(204, 204, 204));
        changePassLabel.setText("Change Password");
        changePassLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePassLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePassLabelMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/password.png"))); // NOI18N

        javax.swing.GroupLayout changePassPanelLayout = new javax.swing.GroupLayout(changePassPanel);
        changePassPanel.setLayout(changePassPanelLayout);
        changePassPanelLayout.setHorizontalGroup(
            changePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changePassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        changePassPanelLayout.setVerticalGroup(
            changePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(changePassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        deletePanel.setBackground(new java.awt.Color(44, 44, 44));
        deletePanel.setPreferredSize(new java.awt.Dimension(539, 75));
        deletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletePanelMouseExited(evt);
            }
        });

        deletionPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deletionPanel.setForeground(new java.awt.Color(204, 204, 204));
        deletionPanel.setText("Delete your account");
        deletionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletionPanelMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/user_rem_red.png"))); // NOI18N

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(deletionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changePassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        settingsBG.add(defaultPanel, "card2");

        backPanel.setBackground(new java.awt.Color(44, 44, 44));

        backLabel.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        backLabel.setForeground(new java.awt.Color(44, 44, 44));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setText("Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1146, Short.MAX_VALUE))
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BGLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(settingsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(807, Short.MAX_VALUE))
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BGLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(settingsBG, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void profilePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePanelMouseExited
        profilePanel.setBackground(new java.awt.Color(44, 44, 44));
    }//GEN-LAST:event_profilePanelMouseExited

    private void profilePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePanelMouseEntered
        profilePanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_profilePanelMouseEntered

    private void changePassPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassPanelMouseExited
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_changePassPanelMouseExited

    private void changePassPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassPanelMouseEntered
        changePassPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_changePassPanelMouseEntered

    private void deletePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseExited
        deletePanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_deletePanelMouseExited

    private void deletePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseEntered
        deletePanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_deletePanelMouseEntered

    private void removeAdminPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAdminPanelMouseExited
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_removeAdminPanelMouseExited

    private void removeAdminPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAdminPanelMouseEntered
        removeAdminPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_removeAdminPanelMouseEntered

    private void addAdminPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminPanelMouseExited
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_addAdminPanelMouseExited

    private void addAdminPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminPanelMouseEntered
        addAdminPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_addAdminPanelMouseEntered

    private void profileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLabelMouseClicked
        backLabel.setForeground(new java.awt.Color(204,204,204));
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/back.png")));
        backActive = true;
        tempPanel = new adminProfile(who);
        settingsBG.removeAll();
        settingsBG.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_profileLabelMouseClicked

    private void changePassLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassLabelMouseClicked
        backLabel.setForeground(new java.awt.Color(38,38,38));
        backLabel.setText("Back");
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/back.png")));
        backActive = true;
        tempPanel = new passChangeAdmin(who);
        settingsBG.removeAll();
        settingsBG.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_changePassLabelMouseClicked

    private void profileLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLabelMouseEntered
        profilePanel.setBackground(new java.awt.Color(38,38,38));
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_profileLabelMouseEntered

    private void changePassLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassLabelMouseEntered
        changePassPanel.setBackground(new java.awt.Color(38,38,38));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_changePassLabelMouseEntered

    private void deletionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletionPanelMouseEntered
        deletePanel.setBackground(new java.awt.Color(38,38,38));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_deletionPanelMouseEntered

    private void remAdminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remAdminButtonMouseEntered
        removeAdminPanel.setBackground(new java.awt.Color(38,38,38));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_remAdminButtonMouseEntered

    private void addAdminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminButtonMouseEntered
        addAdminPanel.setBackground(new java.awt.Color(38,38,38));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_addAdminButtonMouseEntered

    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        if(backActive == true)
            backPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        if(backActive)
            backPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_backLabelMouseExited

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        if(backActive)  {
            settingsBG.removeAll();
            settingsBG.add(defaultPanel);
            repaint();
            revalidate();
            
            backActive = false;
            backPanel.setBackground(new java.awt.Color(44,44,44));
            backLabel.setIcon(null);
            backLabel.setText("");
            
            profilePanel.setBackground(new java.awt.Color(44,44,44));
            changePassPanel.setBackground(new java.awt.Color(44,44,44));
            addAdminPanel.setBackground(new java.awt.Color(44,44,44));
            removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
            deletePanel.setBackground(new java.awt.Color(44,44,44));
        }
    }//GEN-LAST:event_backLabelMouseClicked

    private void addAdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminButtonMouseClicked
        backLabel.setForeground(new java.awt.Color(204,204,204));
        backLabel.setText("Back");
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/back.png")));
        backActive = true;
        tempPanel = new addAdmin(who);
        settingsBG.removeAll();
        settingsBG.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_addAdminButtonMouseClicked

    private void addAdminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminButtonMouseExited
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_addAdminButtonMouseExited

    private void remAdminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remAdminButtonMouseExited
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_remAdminButtonMouseExited

    private void deletionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletionPanelMouseExited
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_deletionPanelMouseExited

    private void changePassLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassLabelMouseExited
        addAdminPanel.setBackground(new java.awt.Color(44,44,44));
        profilePanel.setBackground(new java.awt.Color(44,44,44));
        changePassPanel.setBackground(new java.awt.Color(44,44,44));
        deletePanel.setBackground(new java.awt.Color(44,44,44));
        removeAdminPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_changePassLabelMouseExited

    private void remAdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remAdminButtonMouseClicked
        backLabel.setForeground(new java.awt.Color(204,204,204));
        backLabel.setText("Back");
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/back.png")));
        backActive = true;
        tempPanel = new removeAdmin();
        settingsBG.removeAll();
        settingsBG.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_remAdminButtonMouseClicked

    private void deletionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletionPanelMouseClicked
        backLabel.setForeground(new java.awt.Color(204,204,204));
        backLabel.setText("Back");
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/back.png")));
        backActive = true;
        tempPanel = new deleteAdminAccount();
        settingsBG.removeAll();
        settingsBG.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_deletionPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel addAdminButton;
    private javax.swing.JPanel addAdminPanel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel changePassLabel;
    private javax.swing.JPanel changePassPanel;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel deletionPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel remAdminButton;
    private javax.swing.JPanel removeAdminPanel;
    private javax.swing.JPanel settingsBG;
    // End of variables declaration//GEN-END:variables
}
