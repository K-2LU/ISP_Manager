package isp_manager;

import java.sql.*;

public class adminProfile extends javax.swing.JPanel {

    javax.swing.JPanel tempPanel;
    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement pst;
    String who;
    
    String userId, username, contactNo, mailAddress, bandwith, nameAd;
    String actStat, passwd, creditString;
    int credit;
    public adminProfile(String id) {
        who = id;
        try {
        Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.createStatement(); // statement created
//        st = con.prepareStatement("update customer set password = ? where id = ?");
        rs = stm.executeQuery("select * from admin"); // Query execute
        
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                userId = rs.getString(1);
                nameAd = rs.getString(2);
                username = rs.getString(3);
                mailAddress = rs.getString(4);
                passwd = rs.getString(5);
                contactNo = rs.getString(6);
                break;
            }
        }
                        stm.close();
                rs.close();
                con.close();
        } catch (Exception e) {}
        
                who = id;
 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        profile_front = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idPanel = new javax.swing.JLabel();
        namePanel = new javax.swing.JLabel();
        usernamePanel = new javax.swing.JLabel();
        mailPanel = new javax.swing.JLabel();
        phonPanel = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        editLabel = new javax.swing.JLabel();
        profile_edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        passField1 = new javax.swing.JPasswordField();
        confirmPanel = new javax.swing.JPanel();
        confirmLabel = new javax.swing.JLabel();
        cancelPanel = new javax.swing.JPanel();
        cancelLabel = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1256, 678));

        BG.setBackground(new java.awt.Color(44, 44, 44));
        BG.setLayout(new java.awt.CardLayout());

        profile_front.setBackground(new java.awt.Color(44, 44, 44));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email Address :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Phone No. :");

        idPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idPanel.setForeground(new java.awt.Color(204, 204, 204));
        idPanel.setText(userId);

        namePanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        namePanel.setForeground(new java.awt.Color(204, 204, 204));
        namePanel.setText(nameAd);

        usernamePanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usernamePanel.setForeground(new java.awt.Color(204, 204, 204));
        usernamePanel.setText(username);

        mailPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mailPanel.setForeground(new java.awt.Color(204, 204, 204));
        mailPanel.setText(mailAddress);

        phonPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phonPanel.setForeground(new java.awt.Color(204, 204, 204));
        phonPanel.setText(contactNo);

        editPanel.setBackground(new java.awt.Color(67, 88, 210));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPanelMouseExited(evt);
            }
        });

        editLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        editLabel.setForeground(new java.awt.Color(204, 204, 204));
        editLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/edit-info.png"))); // NOI18N
        editLabel.setText("Edit info");
        editLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout profile_frontLayout = new javax.swing.GroupLayout(profile_front);
        profile_front.setLayout(profile_frontLayout);
        profile_frontLayout.setHorizontalGroup(
            profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_frontLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(278, 278, 278))
            .addGroup(profile_frontLayout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profile_frontLayout.setVerticalGroup(
            profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_frontLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(profile_frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_frontLayout.createSequentialGroup()
                        .addComponent(idPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_frontLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        BG.add(profile_front, "card2");

        profile_edit.setBackground(new java.awt.Color(44, 44, 44));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Name :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Email Address :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Phone No. :");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Password :");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Re-enter Password :");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("(Please enter your password to confirm the changes. You'll notice the visible changes the next time you log in)");

        passField.setBackground(new java.awt.Color(38, 38, 38));
        passField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));

        passField1.setBackground(new java.awt.Color(38, 38, 38));
        passField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passField1.setForeground(new java.awt.Color(204, 204, 204));
        passField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));

        confirmPanel.setBackground(new java.awt.Color(67, 88, 210));
        confirmPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmPanelMouseExited(evt);
            }
        });

        confirmLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        confirmLabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/check.png"))); // NOI18N
        confirmLabel.setText("Confirm Changes");
        confirmLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout confirmPanelLayout = new javax.swing.GroupLayout(confirmPanel);
        confirmPanel.setLayout(confirmPanelLayout);
        confirmPanelLayout.setHorizontalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        confirmPanelLayout.setVerticalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
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
        cancelLabel.setText("Cancel");
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
                .addComponent(cancelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mailField.setBackground(new java.awt.Color(38, 38, 38));
        mailField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        mailField.setForeground(new java.awt.Color(204, 204, 204));
        mailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        nameField.setBackground(new java.awt.Color(38, 38, 38));
        nameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        phoneField.setBackground(new java.awt.Color(38, 38, 38));
        phoneField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        phoneField.setForeground(new java.awt.Color(204, 204, 204));
        phoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60), 2));

        warningLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout profile_editLayout = new javax.swing.GroupLayout(profile_edit);
        profile_edit.setLayout(profile_editLayout);
        profile_editLayout.setHorizontalGroup(
            profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_editLayout.createSequentialGroup()
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_editLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_editLayout.createSequentialGroup()
                                .addGap(608, 608, 608)
                                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(profile_editLayout.createSequentialGroup()
                                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(profile_editLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profile_editLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(profile_editLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141)
                                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(profile_editLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(profile_editLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(confirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cancelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        profile_editLayout.setVerticalGroup(
            profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(profile_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        BG.add(profile_edit, "card3");

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

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_editPanelMouseExited

    private void confirmPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPanelMouseEntered
        confirmPanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_confirmPanelMouseEntered

    private void confirmPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPanelMouseExited
        confirmPanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_confirmPanelMouseExited

    private void cancelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPanelMouseEntered
        editPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_cancelPanelMouseEntered

    private void cancelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPanelMouseExited
        editPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_cancelPanelMouseExited

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_cancelLabelMouseExited

    private void confirmLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseEntered
        confirmPanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_confirmLabelMouseEntered

    private void confirmLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseExited
        confirmPanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_confirmLabelMouseExited

    private void editLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseClicked
        BG.removeAll();
        BG.add(profile_edit);
        repaint();
        revalidate();
    }//GEN-LAST:event_editLabelMouseClicked

    private void editLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseEntered
        editPanel.setBackground(new java.awt.Color(29,78,168));
    }//GEN-LAST:event_editLabelMouseEntered

    private void editLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseExited
        editPanel.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_editLabelMouseExited

    private void confirmLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseClicked
        
        String newName, newMail, newContact;
        newName = nameField.getText();
        newMail = mailField.getText();
        newContact = phoneField.getText();
        
        String pass1, pass2;
        pass1 = passField.getText();
        pass2 = passField1.getText();
        
        if(!pass1.equals(passwd)){
            warningLabel.setText("Incorrect password");
        } else if(!pass1.equals(pass2))    {
            warningLabel.setText("Passwords Do Not Match");
        }   else    {
            try {
                Class.forName("org.sqlite.JDBC"); // Driver available
                con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection

                Statement stt = con.createStatement();
                PreparedStatement state = con.prepareStatement("update admin set name = ? where id = ?");
                ResultSet rs = stt.executeQuery("select * from admin"); // Query executed
                
                String tname = nameField.getText();
                String mail = mailField.getText();
                String phone = phoneField.getText();
                
                state = con.prepareStatement("update admin set phone = ? where id = ?");
                state.setString(1, phone);
                state.setString(2, who);
                state.executeUpdate();
                
                state = con.prepareStatement("update admin set email = ? where id = ?");
                state.setString(1, mail);
                state.setString(2, who);
                state.executeUpdate();
                
                namePanel.setText(tname);
                mailPanel.setText(mail);
                phonPanel.setText(phone);
                
                BG.removeAll();
                BG.add(profile_front);
                repaint();
                revalidate();
                
                state.close();
                rs.close();
                stt.close();
                con.close();
            } catch(Exception e)   {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_confirmLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        BG.removeAll();
        BG.add(profile_front);
        repaint();
        revalidate();
    }//GEN-LAST:event_cancelLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JPanel cancelPanel;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel idPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel namePanel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JLabel phonPanel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPanel profile_edit;
    private javax.swing.JPanel profile_front;
    private javax.swing.JLabel usernamePanel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
