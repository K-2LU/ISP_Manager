/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package isp_manager;

/**
 *
 * @author King Nothing
 */
public class removeAdmin extends javax.swing.JPanel {

    /**
     * Creates new form removeAdmin
     */
    public removeAdmin() {
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

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        savePanel = new javax.swing.JPanel();
        saveLabel = new javax.swing.JLabel();
        passField1 = new javax.swing.JPasswordField();
        passField2 = new javax.swing.JPasswordField();
        unameField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1256, 678));

        BG.setBackground(new java.awt.Color(44, 44, 44));
        BG.setPreferredSize(new java.awt.Dimension(1256, 666));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Contact No. :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter your password :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Re-enter to confirm :");

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
            .addGroup(savePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        unameField.setBackground(new java.awt.Color(38, 38, 38));
        unameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        unameField.setForeground(new java.awt.Color(204, 204, 204));
        unameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        mailField.setBackground(new java.awt.Color(38, 38, 38));
        mailField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        mailField.setForeground(new java.awt.Color(204, 204, 204));
        mailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        warningLabel.setForeground(new java.awt.Color(44, 44, 44));
        warningLabel.setText("warning label");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(savePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(256, 256, 256))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseClicked
        String uname, mail, pass1, pass2;
        
        uname = unameField.getText();
        mail = mailField.getText();
        pass1 = passField1.getText();
        pass2 = passField2.getText();

        if (!pass1.equals(pass2))  {
            warningLabel.setText("Wrong password");
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
        }   else {
            warningLabel.setText("Admin removed");
            warningLabel.setForeground(new java.awt.Color(204,204, 204));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mailField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JPasswordField passField2;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JPanel savePanel;
    private javax.swing.JTextField unameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}