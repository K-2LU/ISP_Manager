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
        legalDocField = new javax.swing.JTextField();
        addStaffClick = new javax.swing.JPanel();
        adderButton = new javax.swing.JButton();
        roleBox = new javax.swing.JComboBox<>();
        packageLabel1 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        packageLabel2 = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        infoName = new javax.swing.JLabel();
        infoUsername = new javax.swing.JLabel();
        infoUserID = new javax.swing.JLabel();
        infoEMail = new javax.swing.JLabel();
        infoContact = new javax.swing.JLabel();
        infoAddress = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

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
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameFieldMouseExited(evt);
            }
        });

        nameLabel.setBackground(new java.awt.Color(204, 204, 204));
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("Staff Name");

        addressField.setBackground(new java.awt.Color(48, 48, 48));
        addressField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        addressField.setForeground(new java.awt.Color(204, 204, 204));
        addressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressField.setText("Enter address");
        addressField.setBorder(null);
        addressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addressFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addressFieldMouseExited(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(204, 204, 204));
        addressLabel.setForeground(new java.awt.Color(204, 204, 204));
        addressLabel.setText("Current Address:");

        phoneField.setBackground(new java.awt.Color(48, 48, 48));
        phoneField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        phoneField.setForeground(new java.awt.Color(204, 204, 204));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneField.setText("Enter phone number");
        phoneField.setBorder(null);
        phoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phoneFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneFieldMouseExited(evt);
            }
        });

        phoneLabel.setBackground(new java.awt.Color(204, 204, 204));
        phoneLabel.setForeground(new java.awt.Color(204, 204, 204));
        phoneLabel.setText("Contact No. (Phone):");

        emailField.setBackground(new java.awt.Color(48, 48, 48));
        emailField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setText("Enter email address");
        emailField.setBorder(null);
        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailFieldMouseExited(evt);
            }
        });

        emailLabel.setBackground(new java.awt.Color(204, 204, 204));
        emailLabel.setForeground(new java.awt.Color(204, 204, 204));
        emailLabel.setText("Email Address:");

        packageLabel.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel.setText("Role");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NID/Birth Certificate No.");

        legalDocField.setBackground(new java.awt.Color(48, 48, 48));
        legalDocField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        legalDocField.setForeground(new java.awt.Color(204, 204, 204));
        legalDocField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        legalDocField.setText("Legal document no.");
        legalDocField.setBorder(null);
        legalDocField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                legalDocFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                legalDocFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                legalDocFieldMouseExited(evt);
            }
        });

        addStaffClick.setBackground(new java.awt.Color(10, 137, 70));
        addStaffClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addStaffClickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addStaffClickMouseExited(evt);
            }
        });

        adderButton.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        adderButton.setForeground(new java.awt.Color(204, 204, 204));
        adderButton.setText("Add Staff");
        adderButton.setBorder(null);
        adderButton.setContentAreaFilled(false);
        adderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adderButtonMouseExited(evt);
            }
        });
        adderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStaffClickLayout = new javax.swing.GroupLayout(addStaffClick);
        addStaffClick.setLayout(addStaffClickLayout);
        addStaffClickLayout.setHorizontalGroup(
            addStaffClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStaffClickLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        addStaffClickLayout.setVerticalGroup(
            addStaffClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        roleBox.setBackground(new java.awt.Color(48, 48, 48));
        roleBox.setForeground(new java.awt.Color(204, 204, 204));
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Technician", "General staff" }));
        roleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleBoxActionPerformed(evt);
            }
        });

        packageLabel1.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel1.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel1.setText("BDT");

        salaryTextField.setBackground(new java.awt.Color(38, 38, 38));
        salaryTextField.setBorder(null);
        salaryTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salaryTextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salaryTextFieldMouseExited(evt);
            }
        });
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
                        .addComponent(legalDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(roleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStaffClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(legalDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addComponent(addStaffClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        holderPanel.add(addCustomerPanel, "card2");

        infoPanel.setBackground(new java.awt.Color(44, 44, 44));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name :");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username :");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("UserID :");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Address :");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contact No. :");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Address :");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Active Status :");

        infoName.setBackground(new java.awt.Color(204, 204, 204));
        infoName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoName.setForeground(new java.awt.Color(204, 204, 204));
        infoName.setText("(name here)");

        infoUsername.setBackground(new java.awt.Color(204, 204, 204));
        infoUsername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoUsername.setForeground(new java.awt.Color(204, 204, 204));
        infoUsername.setText("(username here)");

        infoUserID.setBackground(new java.awt.Color(204, 204, 204));
        infoUserID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoUserID.setForeground(new java.awt.Color(204, 204, 204));
        infoUserID.setText("(userID here)");

        infoEMail.setBackground(new java.awt.Color(204, 204, 204));
        infoEMail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoEMail.setForeground(new java.awt.Color(204, 204, 204));
        infoEMail.setText("(email address here)");

        infoContact.setBackground(new java.awt.Color(204, 204, 204));
        infoContact.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoContact.setForeground(new java.awt.Color(204, 204, 204));
        infoContact.setText("(contact No. here)");

        infoAddress.setBackground(new java.awt.Color(204, 204, 204));
        infoAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoAddress.setForeground(new java.awt.Color(204, 204, 204));
        infoAddress.setText("(address here)");

        jPanel3.setBackground(new java.awt.Color(10, 137, 70));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Inactive");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoContact, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(223, 223, 223))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoContact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(414, Short.MAX_VALUE))
        );

        holderPanel.add(infoPanel, "card3");

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
                        .addGap(0, 60, Short.MAX_VALUE))
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
                        .addComponent(holderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void roleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleBoxActionPerformed

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        holderPanel.removeAll();
        holderPanel.add(infoPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        nameField.setText("");
    }//GEN-LAST:event_nameFieldMouseClicked

    private void nameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseEntered
        nameField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_nameFieldMouseEntered

    private void nameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseExited
        nameField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_nameFieldMouseExited

    private void addressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressFieldMouseClicked
        addressField.setText("");
    }//GEN-LAST:event_addressFieldMouseClicked

    private void addressFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressFieldMouseEntered
        addressField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_addressFieldMouseEntered

    private void addressFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressFieldMouseExited
        addressField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_addressFieldMouseExited

    private void phoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseClicked
        phoneField.setText("");
    }//GEN-LAST:event_phoneFieldMouseClicked

    private void phoneFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseEntered
        phoneField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_phoneFieldMouseEntered

    private void phoneFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseExited
        phoneField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_phoneFieldMouseExited

    private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseClicked
        emailField.setText("");
    }//GEN-LAST:event_emailFieldMouseClicked

    private void emailFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseEntered
        emailField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_emailFieldMouseEntered

    private void emailFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMouseExited
        emailField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_emailFieldMouseExited

    private void legalDocFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocFieldMouseClicked
        legalDocField.setText("");
    }//GEN-LAST:event_legalDocFieldMouseClicked

    private void legalDocFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocFieldMouseEntered
        legalDocField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_legalDocFieldMouseEntered

    private void legalDocFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalDocFieldMouseExited
        legalDocField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_legalDocFieldMouseExited

    private void salaryTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTextFieldMouseEntered
        salaryTextField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_salaryTextFieldMouseEntered

    private void salaryTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTextFieldMouseExited
        salaryTextField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_salaryTextFieldMouseExited

    private void addStaffClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffClickMouseEntered
        
    }//GEN-LAST:event_addStaffClickMouseEntered

    private void addStaffClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffClickMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addStaffClickMouseExited

    private void adderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButtonMouseEntered
        addStaffClick.setBackground(new java.awt.Color(10,125,55));
    }//GEN-LAST:event_adderButtonMouseEntered

    private void adderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButtonMouseExited
        addStaffClick.setBackground(new java.awt.Color(10,137,70));
    }//GEN-LAST:event_adderButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JLabel addIcon;
    private javax.swing.JPanel addStaffBG;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JPanel addStaffClick;
    private javax.swing.JButton adderButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel briefSearchPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel holderPanel;
    private javax.swing.JLabel infoAddress;
    private javax.swing.JLabel infoContact;
    private javax.swing.JLabel infoEMail;
    private javax.swing.JLabel infoName;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel infoUserID;
    private javax.swing.JLabel infoUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField legalDocField;
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
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
