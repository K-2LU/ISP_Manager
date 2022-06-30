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
        addCustomerOptPanel = new javax.swing.JPanel();
        addIcon = new javax.swing.JLabel();
        addCustomerButton1 = new javax.swing.JButton();
        listCustomerOptPanel1 = new javax.swing.JPanel();
        listIcon = new javax.swing.JLabel();
        listCutomerButton = new javax.swing.JButton();
        packagesBG = new javax.swing.JPanel();
        listIcon1 = new javax.swing.JLabel();
        packageButton = new javax.swing.JButton();
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

        BG.setBackground(new java.awt.Color(44, 44, 44));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 55, 55), 2));

        addCustomerOptPanel.setBackground(new java.awt.Color(44, 44, 44));

        addIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/plus.png"))); // NOI18N

        addCustomerButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addCustomerButton1.setForeground(new java.awt.Color(204, 204, 204));
        addCustomerButton1.setText("Add Staff");
        addCustomerButton1.setBorder(null);
        addCustomerButton1.setContentAreaFilled(false);
        addCustomerButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addCustomerButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCustomerButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCustomerButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCustomerButton1MouseExited(evt);
            }
        });
        addCustomerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCustomerOptPanelLayout = new javax.swing.GroupLayout(addCustomerOptPanel);
        addCustomerOptPanel.setLayout(addCustomerOptPanelLayout);
        addCustomerOptPanelLayout.setHorizontalGroup(
            addCustomerOptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerOptPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCustomerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        addCustomerOptPanelLayout.setVerticalGroup(
            addCustomerOptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCustomerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(addIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        listCustomerOptPanel1.setBackground(new java.awt.Color(44, 44, 44));

        listIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/contact-list.png"))); // NOI18N

        listCutomerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listCutomerButton.setForeground(new java.awt.Color(204, 204, 204));
        listCutomerButton.setText("List Staff");
        listCutomerButton.setBorder(null);
        listCutomerButton.setContentAreaFilled(false);
        listCutomerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        listCutomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCutomerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listCutomerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listCutomerButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listCustomerOptPanel1Layout = new javax.swing.GroupLayout(listCustomerOptPanel1);
        listCustomerOptPanel1.setLayout(listCustomerOptPanel1Layout);
        listCustomerOptPanel1Layout.setHorizontalGroup(
            listCustomerOptPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listCustomerOptPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(listIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listCutomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listCustomerOptPanel1Layout.setVerticalGroup(
            listCustomerOptPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listCustomerOptPanel1Layout.createSequentialGroup()
                .addGroup(listCustomerOptPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listCutomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        packagesBG.setBackground(new java.awt.Color(44, 44, 44));

        listIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/speed.png"))); // NOI18N
        listIcon1.setToolTipText("");

        packageButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        packageButton.setForeground(new java.awt.Color(204, 204, 204));
        packageButton.setText("Staff Roles");
        packageButton.setBorder(null);
        packageButton.setContentAreaFilled(false);
        packageButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        packageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packageButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packageButtonMouseExited(evt);
            }
        });
        packageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout packagesBGLayout = new javax.swing.GroupLayout(packagesBG);
        packagesBG.setLayout(packagesBGLayout);
        packagesBGLayout.setHorizontalGroup(
            packagesBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(listIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(packageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        packagesBGLayout.setVerticalGroup(
            packagesBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesBGLayout.createSequentialGroup()
                .addGroup(packagesBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jTextField1.setBackground(new java.awt.Color(33, 33, 33));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(77, 77, 77));
        jTextField1.setText("search customer");
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
        adderButton.setText("Add Customer");
        adderButton.setBorder(null);
        adderButton.setContentAreaFilled(false);

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
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(14, 14, 14))))
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(addCustClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addGap(205, 205, 205)
                .addComponent(addCustClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        holderPanel.add(addCustomerPanel, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(806, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(briefSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCustomerOptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(packagesBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listCustomerOptPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(addCustomerOptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listCustomerOptPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(packagesBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(holderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerButton1MouseClicked
        // TODO add your handling code here:
        holderPanel.removeAll();
        holderPanel.add(addCustomerPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_addCustomerButton1MouseClicked

    private void addCustomerButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerButton1MouseEntered
        addCustomerOptPanel.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_addCustomerButton1MouseEntered

    private void addCustomerButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerButton1MouseExited
        addCustomerOptPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_addCustomerButton1MouseExited

    private void listCutomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCutomerButtonMouseClicked
        tempPanel = new listCustomerPanel();
        holderPanel.removeAll();
        holderPanel.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_listCutomerButtonMouseClicked

    private void listCutomerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCutomerButtonMouseEntered
        // TODO add your handling code here:
        listCustomerOptPanel1.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_listCutomerButtonMouseEntered

    private void listCutomerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCutomerButtonMouseExited
        listCustomerOptPanel1.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_listCutomerButtonMouseExited

    private void packageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageButtonMouseClicked
        tempPanel = new  packagePanel();
        holderPanel.removeAll();
        holderPanel.add(tempPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_packageButtonMouseClicked

    private void packageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageButtonMouseEntered
        packagesBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_packageButtonMouseEntered

    private void packageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageButtonMouseExited
        packagesBG.setBackground(new java.awt.Color(33,33,33));
    }//GEN-LAST:event_packageButtonMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addCustomerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerButton1ActionPerformed

    private void packageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageButtonActionPerformed

    private void salaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel addCustClick;
    private javax.swing.JButton addCustomerButton1;
    private javax.swing.JPanel addCustomerOptPanel;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JLabel addIcon;
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
    private javax.swing.JPanel listCustomerOptPanel1;
    private javax.swing.JButton listCutomerButton;
    private javax.swing.JLabel listIcon;
    private javax.swing.JLabel listIcon1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton packageButton;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packageLabel1;
    private javax.swing.JLabel packageLabel2;
    private javax.swing.JPanel packagesBG;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
