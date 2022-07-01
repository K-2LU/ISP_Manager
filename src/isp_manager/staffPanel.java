package isp_manager;

public class staffPanel extends javax.swing.JPanel {
    javax.swing.JPanel tempPanel;
    
    public staffPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addStaffBG = new javax.swing.JPanel();
        addIcon = new javax.swing.JLabel();
        addStaffButton = new javax.swing.JButton();
        listStaffBG = new javax.swing.JPanel();
        listIcon = new javax.swing.JLabel();
        listStaffButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        briefSearchPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        holderPanel = new javax.swing.JPanel();
        addCustomerPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        packageLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        addCustClick = new javax.swing.JPanel();
        adderButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        packageLabel1 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        packageLabel2 = new javax.swing.JLabel();
        removeStaffBG = new javax.swing.JPanel();
        remStaffIcon = new javax.swing.JLabel();
        removeStaffButton = new javax.swing.JButton();

        BG.setBackground(new java.awt.Color(44, 44, 44));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 55, 55), 2));

        addStaffBG.setBackground(new java.awt.Color(44, 44, 44));

        addIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/plus.png"))); // NOI18N

        addStaffButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addStaffButton.setForeground(new java.awt.Color(204, 204, 204));
        addStaffButton.setText("Add Staff");
        addStaffButton.setBorder(null);
        addStaffButton.setContentAreaFilled(false);
        addStaffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addStaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStaffButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addStaffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addStaffButtonMouseExited(evt);
            }
        });
        addStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStaffBGLayout = new javax.swing.GroupLayout(addStaffBG);
        addStaffBG.setLayout(addStaffBGLayout);
        addStaffBGLayout.setHorizontalGroup(
            addStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStaffBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        addStaffBGLayout.setVerticalGroup(
            addStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(addIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        listStaffBG.setBackground(new java.awt.Color(44, 44, 44));

        listIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/contact-list.png"))); // NOI18N

        listStaffButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listStaffButton.setForeground(new java.awt.Color(204, 204, 204));
        listStaffButton.setText("List Staff");
        listStaffButton.setBorder(null);
        listStaffButton.setContentAreaFilled(false);
        listStaffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        listStaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listStaffButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listStaffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listStaffButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listStaffBGLayout = new javax.swing.GroupLayout(listStaffBG);
        listStaffBG.setLayout(listStaffBGLayout);
        listStaffBGLayout.setHorizontalGroup(
            listStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listStaffBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(listIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listStaffBGLayout.setVerticalGroup(
            listStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listStaffBGLayout.createSequentialGroup()
                .addGroup(listStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jTextField1.setBackground(new java.awt.Color(33, 33, 33));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(77, 77, 77));
        jTextField1.setText("search staff");
        jTextField1.setBorder(null);

        briefSearchPanel.setBackground(new java.awt.Color(33, 33, 33));

        jButton1.setBackground(new java.awt.Color(55, 55, 55));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        javax.swing.GroupLayout briefSearchPanelLayout = new javax.swing.GroupLayout(briefSearchPanel);
        briefSearchPanel.setLayout(briefSearchPanelLayout);
        briefSearchPanelLayout.setHorizontalGroup(
            briefSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        briefSearchPanelLayout.setVerticalGroup(
            briefSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(briefSearchPanelLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        holderPanel.setBackground(new java.awt.Color(44, 44, 44));
        holderPanel.setLayout(new java.awt.CardLayout());

        addCustomerPanel.setBackground(new java.awt.Color(44, 44, 44));

        nameField.setBackground(new java.awt.Color(48, 48, 48));
        nameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText("Enter name");
        nameField.setBorder(null);

        nameLabel.setBackground(new java.awt.Color(204, 204, 204));
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("Staff Name");

        addressField.setBackground(new java.awt.Color(48, 48, 48));
        addressField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        addressField.setForeground(new java.awt.Color(204, 204, 204));
        addressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressField.setText("Enter address");
        addressField.setBorder(null);

        addressLabel.setBackground(new java.awt.Color(204, 204, 204));
        addressLabel.setForeground(new java.awt.Color(204, 204, 204));
        addressLabel.setText("Current Address:");

        phoneField.setBackground(new java.awt.Color(48, 48, 48));
        phoneField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        phoneField.setForeground(new java.awt.Color(204, 204, 204));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneField.setText("Enter phone number");
        phoneField.setBorder(null);

        phoneLabel.setBackground(new java.awt.Color(204, 204, 204));
        phoneLabel.setForeground(new java.awt.Color(204, 204, 204));
        phoneLabel.setText("Contact No. (Phone):");

        emailField.setBackground(new java.awt.Color(48, 48, 48));
        emailField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setText("Enter email address");
        emailField.setBorder(null);

        emailLabel.setBackground(new java.awt.Color(204, 204, 204));
        emailLabel.setForeground(new java.awt.Color(204, 204, 204));
        emailLabel.setText("Email Address:");

        packageLabel.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel.setText("Role");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NID/Birth Certificate No.");

        jTextField6.setBackground(new java.awt.Color(48, 48, 48));
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Legal document no.");
        jTextField6.setBorder(null);

        addCustClick.setBackground(new java.awt.Color(10, 137, 70));

        adderButton.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        adderButton.setForeground(new java.awt.Color(204, 204, 204));
        adderButton.setText("Add Staff");
        adderButton.setBorder(null);
        adderButton.setContentAreaFilled(false);
        adderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCustClickLayout = new javax.swing.GroupLayout(addCustClick);
        addCustClick.setLayout(addCustClickLayout);
        addCustClickLayout.setHorizontalGroup(
            addCustClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustClickLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        addCustClickLayout.setVerticalGroup(
            addCustClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jComboBox1.setBackground(new java.awt.Color(48, 48, 48));
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Technician", "General staff" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        packageLabel1.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel1.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel1.setText("BDT");

        salaryTextField.setBackground(new java.awt.Color(38, 38, 38));
        salaryTextField.setBorder(null);
        salaryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTextFieldActionPerformed(evt);
            }
        });

        packageLabel2.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel2.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel2.setText("Salary");

        javax.swing.GroupLayout addCustomerPanelLayout = new javax.swing.GroupLayout(addCustomerPanel);
        addCustomerPanel.setLayout(addCustomerPanelLayout);
        addCustomerPanelLayout.setHorizontalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(addCustomerPanelLayout.createSequentialGroup()
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addCustomerPanelLayout.createSequentialGroup()
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                .addComponent(packageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(packageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addCustClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        addCustomerPanelLayout.setVerticalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressField)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneField)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addComponent(addCustClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        holderPanel.add(addCustomerPanel, "card2");

        removeStaffBG.setBackground(new java.awt.Color(44, 44, 44));

        remStaffIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/remove.png"))); // NOI18N
        remStaffIcon.setToolTipText("");

        removeStaffButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        removeStaffButton.setForeground(new java.awt.Color(204, 204, 204));
        removeStaffButton.setText("Remove Staff");
        removeStaffButton.setBorder(null);
        removeStaffButton.setContentAreaFilled(false);
        removeStaffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        removeStaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeStaffButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeStaffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeStaffButtonMouseExited(evt);
            }
        });
        removeStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStaffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeStaffBGLayout = new javax.swing.GroupLayout(removeStaffBG);
        removeStaffBG.setLayout(removeStaffBGLayout);
        removeStaffBGLayout.setHorizontalGroup(
            removeStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeStaffBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(remStaffIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removeStaffBGLayout.setVerticalGroup(
            removeStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeStaffBGLayout.createSequentialGroup()
                .addGroup(removeStaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remStaffIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(briefSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(removeStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(holderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(briefSearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(addStaffBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listStaffBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeStaffBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(holderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStaffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffButtonMouseClicked
        // TODO add your handling code here:
        holderPanel.removeAll();
        holderPanel.add(addCustomerPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_addStaffButtonMouseClicked

    private void addStaffButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffButtonMouseEntered
        addStaffBG.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_addStaffButtonMouseEntered

    private void addStaffButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffButtonMouseExited
        addStaffBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_addStaffButtonMouseExited

    private void listStaffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStaffButtonMouseClicked
        tempPanel = new listStaffPanel();
        holderPanel.removeAll();
        holderPanel.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_listStaffButtonMouseClicked

    private void listStaffButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStaffButtonMouseEntered
        listStaffBG.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_listStaffButtonMouseEntered

    private void listStaffButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStaffButtonMouseExited
        listStaffBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_listStaffButtonMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void salaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextFieldActionPerformed

    private void adderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adderButtonActionPerformed

    private void removeStaffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeStaffButtonMouseClicked
        tempPanel = new removeStaff();
        holderPanel.removeAll();
        holderPanel.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_removeStaffButtonMouseClicked

    private void removeStaffButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeStaffButtonMouseEntered
        removeStaffBG.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_removeStaffButtonMouseEntered

    private void removeStaffButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeStaffButtonMouseExited
        removeStaffBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_removeStaffButtonMouseExited

    private void removeStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStaffButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeStaffButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel addCustClick;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JLabel addIcon;
    private javax.swing.JPanel addStaffBG;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JButton adderButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel briefSearchPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel holderPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel listIcon;
    private javax.swing.JPanel listStaffBG;
    private javax.swing.JButton listStaffButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packageLabel1;
    private javax.swing.JLabel packageLabel2;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel remStaffIcon;
    private javax.swing.JPanel removeStaffBG;
    private javax.swing.JButton removeStaffButton;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
