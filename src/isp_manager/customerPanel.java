package isp_manager;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;

public class customerPanel extends javax.swing.JPanel {
        javax.swing.JPanel tempPanel;
        CardLayout cards;
        String tempUID = "", t2 ="";
        String uid, nid, name, username, address, pass, packStat, actStat, contactNo, mail;
        String tuid, tnid, tname, tusername, taddress, tpass, tpackStat, tactStat, tcontactNo, tmail, tcredit;
        
        int credit = 5000, v;
        Connection con;
        PreparedStatement stm;
        String who;

        public customerPanel(String id) throws Exception {
                who = id;
                try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
                        stm = con.prepareStatement("insert into customer values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        Statement state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from customer"); // Query executed
                        
                        boolean zeroNotFound = true;
                        int zeroes = 0, mark = 0, temp;
                        
                        while(rs.next())    {
                            tempUID = rs.getString(1);
                        }
                        
                        v = 0;
                        
                        for(int i =0; i < 5; i++)   {
                            v*=10;
                            char at = tempUID.charAt(i);
                            if(at!='0') zeroNotFound = false;
                            if(zeroNotFound==true && at=='0')   {
                                zeroes+=1;
                            }
                            v += Character.getNumericValue(at);
//                            System.out.println(zeroes + " " +v);
                        }
                        temp = v;
//                        System.out.println(temp);
//                        while(temp>=0) {
//                            temp /= 10;
//                            mark++;
////                            System.out.println(temp);
//                        }
                        
                        if(v%10==9) zeroes -= 1;
                        
                        for(int i=0; i<zeroes; i++) {
                            t2 = t2 + "0";
                        }
                        t2 = t2 + (v+1);
                        System.out.println(t2);
                        rs.close();
                        state.close();
                        stm.close();
                        con.close();
                }catch(Exception e) {}
                
                initComponents();

                cards = (CardLayout) (holderPanel.getLayout());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
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
        searchField = new javax.swing.JTextField();
        briefSearchPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
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
        addCustBG = new javax.swing.JPanel();
        adderButton = new javax.swing.JButton();
        packageBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        unameField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        UIDLabel = new javax.swing.JLabel();
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
        infoIndicator = new javax.swing.JPanel();
        infoActStat = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        infoPack = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        infoCredit = new javax.swing.JLabel();
        editInfoButton = new javax.swing.JLabel();
        editCustomer = new javax.swing.JPanel();
        editNameField = new javax.swing.JTextField();
        nameLabel10 = new javax.swing.JLabel();
        editAddressField = new javax.swing.JTextField();
        addressLabel10 = new javax.swing.JLabel();
        editPhoneField = new javax.swing.JTextField();
        phoneLabel10 = new javax.swing.JLabel();
        editEmailField = new javax.swing.JTextField();
        emailLabel10 = new javax.swing.JLabel();
        packageLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        editNidFIeld = new javax.swing.JTextField();
        addCustBG10 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        editPackageBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        editUnameFIeld = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        warningLabel1 = new javax.swing.JLabel();
        passField1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        editActiveBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        editCreditField = new javax.swing.JTextField();
        cancelEditPanel = new javax.swing.JPanel();
        cancelEdit = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        removeCustomerBG = new javax.swing.JPanel();
        removeIcon = new javax.swing.JLabel();
        removeCustomerButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 44, 44));
        setPreferredSize(new java.awt.Dimension(1268, 857));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.CardLayout());

        BG.setBackground(new java.awt.Color(44, 44, 44));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 55, 55), 2));

        addCustomerOptPanel.setBackground(new java.awt.Color(44, 44, 44));

        addIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/plus.png"))); // NOI18N

        addCustomerButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addCustomerButton1.setForeground(new java.awt.Color(204, 204, 204));
        addCustomerButton1.setText("Add Customer");
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

        javax.swing.GroupLayout addCustomerOptPanelLayout = new javax.swing.GroupLayout(addCustomerOptPanel);
        addCustomerOptPanel.setLayout(addCustomerOptPanelLayout);
        addCustomerOptPanelLayout.setHorizontalGroup(
            addCustomerOptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerOptPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCustomerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
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
        listCutomerButton.setText("List Customers");
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
        packageButton.setText("Packages");
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

        searchField.setBackground(new java.awt.Color(38, 38, 38));
        searchField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(204, 204, 204));
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setText("search customer");
        searchField.setBorder(null);
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchFieldMouseExited(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        briefSearchPanel.setBackground(new java.awt.Color(38, 38, 38));

        searchButton.setBackground(new java.awt.Color(38, 38, 38));
        searchButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchButton.setForeground(new java.awt.Color(204, 204, 204));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setContentAreaFilled(false);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout briefSearchPanelLayout = new javax.swing.GroupLayout(briefSearchPanel);
        briefSearchPanel.setLayout(briefSearchPanelLayout);
        briefSearchPanelLayout.setHorizontalGroup(
            briefSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        briefSearchPanelLayout.setVerticalGroup(
            briefSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(briefSearchPanelLayout.createSequentialGroup()
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        nameLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("Customer Name");

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
        addressLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
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
        phoneLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
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
        emailLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(204, 204, 204));
        emailLabel.setText("Email Address:");

        packageLabel.setBackground(new java.awt.Color(204, 204, 204));
        packageLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        packageLabel.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel.setText("Package");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
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

        addCustBG.setBackground(new java.awt.Color(10, 137, 70));

        adderButton.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        adderButton.setForeground(new java.awt.Color(204, 204, 204));
        adderButton.setText("Add Customer");
        adderButton.setBorder(null);
        adderButton.setContentAreaFilled(false);
        adderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adderButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adderButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addCustBGLayout = new javax.swing.GroupLayout(addCustBG);
        addCustBG.setLayout(addCustBGLayout);
        addCustBGLayout.setHorizontalGroup(
            addCustBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        addCustBGLayout.setVerticalGroup(
            addCustBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
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
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
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
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
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
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("User ID");

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("customer.");

        UIDLabel.setBackground(new java.awt.Color(204, 204, 204));
        UIDLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        UIDLabel.setForeground(new java.awt.Color(204, 204, 204));
        UIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UIDLabel.setText(t2);

        javax.swing.GroupLayout addCustomerPanelLayout = new javax.swing.GroupLayout(addCustomerPanel);
        addCustomerPanel.setLayout(addCustomerPanelLayout);
        addCustomerPanelLayout.setHorizontalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCustomerPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(packageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(packageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCustomerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(unameField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCustomerPanelLayout.createSequentialGroup()
                                        .addComponent(addCustBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCustomerPanelLayout.createSequentialGroup()
                                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(legalDocField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 17, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        addCustomerPanelLayout.setVerticalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(addCustBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(legalDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(packageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(183, 183, 183))
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
        infoName.setText(tname);

        infoUsername.setBackground(new java.awt.Color(204, 204, 204));
        infoUsername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoUsername.setForeground(new java.awt.Color(204, 204, 204));
        infoUsername.setText(tusername);

        infoUserID.setBackground(new java.awt.Color(204, 204, 204));
        infoUserID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoUserID.setForeground(new java.awt.Color(204, 204, 204));
        infoUserID.setText(tuid);

        infoEMail.setBackground(new java.awt.Color(204, 204, 204));
        infoEMail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoEMail.setForeground(new java.awt.Color(204, 204, 204));
        infoEMail.setText(tmail);

        infoContact.setBackground(new java.awt.Color(204, 204, 204));
        infoContact.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoContact.setForeground(new java.awt.Color(204, 204, 204));
        infoContact.setText(tcontactNo);

        infoAddress.setBackground(new java.awt.Color(204, 204, 204));
        infoAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoAddress.setForeground(new java.awt.Color(204, 204, 204));
        infoAddress.setText(taddress);

        infoIndicator.setBackground(new java.awt.Color(10, 137, 70));

        infoActStat.setBackground(new java.awt.Color(204, 204, 204));
        infoActStat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        infoActStat.setForeground(new java.awt.Color(204, 204, 204));
        infoActStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoActStat.setText(tactStat);

        javax.swing.GroupLayout infoIndicatorLayout = new javax.swing.GroupLayout(infoIndicator);
        infoIndicator.setLayout(infoIndicatorLayout);
        infoIndicatorLayout.setHorizontalGroup(
            infoIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoIndicatorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(infoActStat)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        infoIndicatorLayout.setVerticalGroup(
            infoIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoActStat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Package :");

        infoPack.setBackground(new java.awt.Color(204, 204, 204));
        infoPack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoPack.setForeground(new java.awt.Color(204, 204, 204));
        infoPack.setText(taddress);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Credit :");

        infoCredit.setBackground(new java.awt.Color(204, 204, 204));
        infoCredit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoCredit.setForeground(new java.awt.Color(204, 204, 204));
        infoCredit.setText(taddress);

        editInfoButton.setBackground(new java.awt.Color(204, 204, 204));
        editInfoButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        editInfoButton.setForeground(new java.awt.Color(180, 180, 180));
        editInfoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editInfoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/edit-info.png"))); // NOI18N
        editInfoButton.setText("Edit");
        editInfoButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        editInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editInfoButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editInfoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editInfoButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(infoCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(infoPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(infoIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(infoPack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(infoName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addComponent(editInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))))
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
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoPack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(editInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        holderPanel.add(infoPanel, "card3");

        editCustomer.setBackground(new java.awt.Color(44, 44, 44));

        editNameField.setBackground(new java.awt.Color(48, 48, 48));
        editNameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editNameField.setForeground(new java.awt.Color(204, 204, 204));
        editNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editNameField.setText("Enter name");
        editNameField.setBorder(null);
        editNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editNameFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editNameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editNameFieldMouseExited(evt);
            }
        });

        nameLabel10.setBackground(new java.awt.Color(204, 204, 204));
        nameLabel10.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel10.setText("Customer Name");

        editAddressField.setBackground(new java.awt.Color(48, 48, 48));
        editAddressField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editAddressField.setForeground(new java.awt.Color(204, 204, 204));
        editAddressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editAddressField.setText("Enter address");
        editAddressField.setBorder(null);
        editAddressField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAddressFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editAddressFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editAddressFieldMouseExited(evt);
            }
        });

        addressLabel10.setBackground(new java.awt.Color(204, 204, 204));
        addressLabel10.setForeground(new java.awt.Color(204, 204, 204));
        addressLabel10.setText("Current Address:");

        editPhoneField.setBackground(new java.awt.Color(48, 48, 48));
        editPhoneField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editPhoneField.setForeground(new java.awt.Color(204, 204, 204));
        editPhoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editPhoneField.setText("Enter phone number");
        editPhoneField.setBorder(null);
        editPhoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPhoneFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPhoneFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPhoneFieldMouseExited(evt);
            }
        });

        phoneLabel10.setBackground(new java.awt.Color(204, 204, 204));
        phoneLabel10.setForeground(new java.awt.Color(204, 204, 204));
        phoneLabel10.setText("Contact No. (Phone):");

        editEmailField.setBackground(new java.awt.Color(48, 48, 48));
        editEmailField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editEmailField.setForeground(new java.awt.Color(204, 204, 204));
        editEmailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editEmailField.setText("Enter email address");
        editEmailField.setBorder(null);
        editEmailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editEmailFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editEmailFieldMouseExited(evt);
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

        editNidFIeld.setBackground(new java.awt.Color(48, 48, 48));
        editNidFIeld.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editNidFIeld.setForeground(new java.awt.Color(204, 204, 204));
        editNidFIeld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editNidFIeld.setText("Legal document no.");
        editNidFIeld.setBorder(null);
        editNidFIeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editNidFIeldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editNidFIeldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editNidFIeldMouseExited(evt);
            }
        });

        addCustBG10.setBackground(new java.awt.Color(10, 137, 70));

        updateButton.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        updateButton.setForeground(new java.awt.Color(204, 204, 204));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.setContentAreaFilled(false);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addCustBG10Layout = new javax.swing.GroupLayout(addCustBG10);
        addCustBG10.setLayout(addCustBG10Layout);
        addCustBG10Layout.setHorizontalGroup(
            addCustBG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustBG10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        addCustBG10Layout.setVerticalGroup(
            addCustBG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        editPackageBox.setBackground(new java.awt.Color(48, 48, 48));
        editPackageBox.setForeground(new java.awt.Color(204, 204, 204));
        editPackageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 mbps", "15 mbps", "20 mbps", "30 mbps" }));
        editPackageBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPackageBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPackageBoxMouseExited(evt);
            }
        });
        editPackageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPackageBoxActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Set username");

        editUnameFIeld.setBackground(new java.awt.Color(48, 48, 48));
        editUnameFIeld.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editUnameFIeld.setForeground(new java.awt.Color(204, 204, 204));
        editUnameFIeld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editUnameFIeld.setText("Enter username");
        editUnameFIeld.setBorder(null);
        editUnameFIeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUnameFIeldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editUnameFIeldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editUnameFIeldMouseExited(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Set password");

        warningLabel1.setForeground(new java.awt.Color(204, 204, 204));

        passField1.setBackground(new java.awt.Color(48, 48, 48));
        passField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passField1.setForeground(new java.awt.Color(204, 204, 204));
        passField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField1.setBorder(null);
        passField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passField1MouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Set userID");

        editActiveBox.setBackground(new java.awt.Color(48, 48, 48));
        editActiveBox.setForeground(new java.awt.Color(204, 204, 204));
        editActiveBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        editActiveBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editActiveBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editActiveBoxMouseExited(evt);
            }
        });
        editActiveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActiveBoxActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Set Credit");

        editCreditField.setBackground(new java.awt.Color(48, 48, 48));
        editCreditField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editCreditField.setForeground(new java.awt.Color(204, 204, 204));
        editCreditField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editCreditField.setText("Enter Credit");
        editCreditField.setBorder(null);
        editCreditField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCreditFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editCreditFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editCreditFieldMouseExited(evt);
            }
        });

        cancelEditPanel.setBackground(new java.awt.Color(44, 44, 44));
        cancelEditPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        cancelEdit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        cancelEdit.setForeground(new java.awt.Color(204, 204, 204));
        cancelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelEdit.setText("Cancel");
        cancelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelEditPanelLayout = new javax.swing.GroupLayout(cancelEditPanel);
        cancelEditPanel.setLayout(cancelEditPanelLayout);
        cancelEditPanelLayout.setHorizontalGroup(
            cancelEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cancelEditPanelLayout.setVerticalGroup(
            cancelEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("customer.");

        javax.swing.GroupLayout editCustomerLayout = new javax.swing.GroupLayout(editCustomer);
        editCustomer.setLayout(editCustomerLayout);
        editCustomerLayout.setHorizontalGroup(
            editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editCustomerLayout.createSequentialGroup()
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(warningLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editCustomerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editCustomerLayout.createSequentialGroup()
                                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 489, Short.MAX_VALUE))
                            .addGroup(editCustomerLayout.createSequentialGroup()
                                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packageLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addGap(0, 345, Short.MAX_VALUE)
                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editActiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editPackageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNidFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(editUnameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCustBG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelEditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        editCustomerLayout.setVerticalGroup(
            editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editUnameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editActiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(editCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNidFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packageLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editPackageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelEditPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustBG10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        holderPanel.add(editCustomer, "card2");

        removeCustomerBG.setBackground(new java.awt.Color(44, 44, 44));

        removeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/remove.png"))); // NOI18N
        removeIcon.setToolTipText("");

        removeCustomerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        removeCustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        removeCustomerButton.setText("Remove/Block Customer");
        removeCustomerButton.setBorder(null);
        removeCustomerButton.setContentAreaFilled(false);
        removeCustomerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        removeCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeCustomerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeCustomerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeCustomerButtonMouseExited(evt);
            }
        });
        removeCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeCustomerBGLayout = new javax.swing.GroupLayout(removeCustomerBG);
        removeCustomerBG.setLayout(removeCustomerBGLayout);
        removeCustomerBGLayout.setHorizontalGroup(
            removeCustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeCustomerBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(removeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        removeCustomerBGLayout.setVerticalGroup(
            removeCustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeCustomerBGLayout.createSequentialGroup()
                .addGroup(removeCustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(briefSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeCustomerBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addCustomerOptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listCustomerOptPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(packagesBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(searchField))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(addCustomerOptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listCustomerOptPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(packagesBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeCustomerBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(BG, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void editInfoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseEntered
        editInfoButton.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_editInfoButtonMouseEntered

    private void editNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseClicked
        editNameField.setText("");
    }//GEN-LAST:event_editNameFieldMouseClicked

    private void editNameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseEntered
        editNameField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editNameFieldMouseEntered

    private void editNameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseExited
        editNameField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editNameFieldMouseExited

    private void editAddressFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressFieldMouseClicked
        editAddressField.setText("");
    }//GEN-LAST:event_editAddressFieldMouseClicked

    private void editAddressFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressFieldMouseEntered
        editAddressField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editAddressFieldMouseEntered

    private void editAddressFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressFieldMouseExited
        editAddressField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editAddressFieldMouseExited

    private void editPhoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhoneFieldMouseClicked
        editPhoneField.setText("");
    }//GEN-LAST:event_editPhoneFieldMouseClicked

    private void editPhoneFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhoneFieldMouseEntered
        editPhoneField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editPhoneFieldMouseEntered

    private void editPhoneFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhoneFieldMouseExited
        editPhoneField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editPhoneFieldMouseExited

    private void editEmailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailFieldMouseClicked
        editEmailField.setText("");
    }//GEN-LAST:event_editEmailFieldMouseClicked

    private void editEmailFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailFieldMouseEntered
        editEmailField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editEmailFieldMouseEntered

    private void editEmailFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailFieldMouseExited
        editEmailField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editEmailFieldMouseExited

    private void editNidFIeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNidFIeldMouseClicked
        editNidFIeld.setText("");
    }//GEN-LAST:event_editNidFIeldMouseClicked

    private void editNidFIeldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNidFIeldMouseEntered
        editNidFIeld.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editNidFIeldMouseEntered

    private void editNidFIeldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNidFIeldMouseExited
        editNidFIeld.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editNidFIeldMouseExited

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        
        String aname, acontact, amail, aActStat, aPackStat, aAddress, anid, auname, apass;
        String aCredit;
        
        aname = editNameField.getText(); // done
        aAddress = editAddressField.getText(); // done
        acontact = editPhoneField.getText(); // done
        amail = editEmailField.getText(); // done
        anid = editNidFIeld.getText(); // done
        auname = editUnameFIeld.getText(); // done
        apass = passField1.getText(); // done
        aCredit = editCreditField.getText();
        
        int crd = Integer.parseInt(aCredit); // done
        aPackStat = editPackageBox.getSelectedItem().toString();
        aActStat = editActiveBox.getSelectedItem().toString();
        
        String result;
        if(aActStat.equals("Active"))
            result = "true";
        else
            result = "false";
        
        
        try {
        Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        
        Statement stt = con.createStatement();
        PreparedStatement state = con.prepareStatement("update customer set nid = ? where id = ?");
        ResultSet rs = stt.executeQuery("select * from customer"); // Query executed

        state.setString(1, anid);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set name = ? where id = ?");
        state.setString(1, aname);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set address = ? where id = ?");
        state.setString(1, aAddress);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set email = ? where id = ?");
        state.setString(1, amail);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set contact = ? where id = ?");
        state.setString(1, acontact);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set username = ? where id = ?");
        state.setString(1, auname);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set password = ? where id = ?");
        state.setString(1, apass);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set credit = ? where id = ?");
        state.setInt(1, credit);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set active = ? where id = ?");
        state.setString(1, result);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state = con.prepareStatement("update customer set package = ? where id = ?");
        state.setString(1, aPackStat);
        state.setString(2, tuid);
        state.executeUpdate();
        
        state.close();
        rs.close();
        stt.close();
        con.close();
        
        infoName.setText(aname);
        infoAddress.setText(aAddress);
        infoContact.setText(tcontactNo);
        infoEMail.setText(amail);
        infoUsername.setText(auname);
        infoCredit.setText(aCredit);
        infoPack.setText(aPackStat);
        infoCredit.setText(aCredit);
        infoActStat.setText(aActStat);
        
        if(result.equals("false")) infoIndicator.setBackground(new java.awt.Color(197,0,0));
        else infoIndicator.setBackground(new java.awt.Color(10,137,70));
        
        holderPanel.removeAll();
        holderPanel.add(infoPanel);
        repaint();
        revalidate();
        
        } catch(Exception e)   {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseExited

    private void editPackageBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPackageBoxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editPackageBoxMouseEntered

    private void editPackageBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPackageBoxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editPackageBoxMouseExited

    private void editPackageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPackageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPackageBoxActionPerformed

    private void editUnameFIeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUnameFIeldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editUnameFIeldMouseClicked

    private void editUnameFIeldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUnameFIeldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editUnameFIeldMouseEntered

    private void editUnameFIeldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUnameFIeldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editUnameFIeldMouseExited

    private void passField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passField1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passField1MouseEntered

    private void passField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passField1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_passField1MouseExited

    private void editActiveBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editActiveBoxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editActiveBoxMouseEntered

    private void editActiveBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editActiveBoxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editActiveBoxMouseExited

    private void editActiveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActiveBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActiveBoxActionPerformed

    private void editCreditFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCreditFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editCreditFieldMouseClicked

    private void editCreditFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCreditFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editCreditFieldMouseEntered

    private void editCreditFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCreditFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editCreditFieldMouseExited

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked

    private void editInfoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseExited
        editInfoButton.setForeground(new java.awt.Color(180,180,180));
    }//GEN-LAST:event_editInfoButtonMouseExited

    private void editInfoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseClicked
        editNameField.setText(tname);
        editAddressField.setText(taddress);
        editPhoneField.setText(tcontactNo);
        editEmailField.setText(tmail);
        editUnameFIeld.setText(tusername);
        editCreditField.setText(tcredit);
        editNidFIeld.setText(tnid);
        
        holderPanel.removeAll();
        holderPanel.add(editCustomer);
        repaint();
        revalidate();
    }//GEN-LAST:event_editInfoButtonMouseClicked

    private void cancelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelEditMouseClicked
        holderPanel.removeAll();
        holderPanel.add(infoPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_cancelEditMouseClicked

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String info = searchField.getText();
            String userInf;
            try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db");
                        // established connection
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from customer"); // Query executed

                        
                        while (rs.next()) {
                            userInf = rs.getString(4);
                            if(userInf.equals(info))    {
                                int crd;
                                tuid = rs.getString(1);
                                tnid = rs.getString(2);
                                tname = rs.getString(3);
                                tusername = rs.getString(4);
                                taddress = rs.getString(5);
                                tpass = rs.getString(6);
                                tpackStat = rs.getString(7);
                                crd = rs.getInt(8);
                                tactStat = rs.getString(9);
                                tcontactNo = rs.getString(10);
                                tmail = rs.getString(11);
                                
//                                System.out.println(tuid + tnid);
                                infoName.setText(tname);
                                infoUsername.setText(tusername);
                                infoUserID.setText(tuid);
                                infoEMail.setText(tmail);
                                infoAddress.setText(taddress);
                                infoContact.setText(tcontactNo);
                                infoPack.setText(tpackStat);
                                tcredit = "" + crd;
                                infoCredit.setText("" + crd);
                                if(tactStat.equals("true")){
                                    infoActStat.setText("Active");
                                    infoIndicator.setBackground(new java.awt.Color(10,137,70));
                                }
                                else {
                                    infoActStat.setText("Inactive");
                                    infoIndicator.setBackground(new java.awt.Color(197,0,0));
                                    }
                                holderPanel.removeAll();
                                holderPanel.add(infoPanel);
                                repaint();
                                revalidate();
                                break;
                            }
                                
                        }
                        con.close();
                        st.close();
                        rs.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldMouseEntered

    private void searchFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldMouseExited

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        briefSearchPanel.setBackground(new java.awt.Color(41,41,41));
    }//GEN-LAST:event_searchButtonMouseEntered

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        briefSearchPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_searchButtonMouseExited

        private void addCustomerButton1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addCustomerButton1MouseEntered
                addCustomerOptPanel.setBackground(new java.awt.Color(33, 33, 33));
        }// GEN-LAST:event_addCustomerButton1MouseEntered

        private void addCustomerButton1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addCustomerButton1MouseExited
                addCustomerOptPanel.setBackground(new java.awt.Color(44, 44, 44));
        }// GEN-LAST:event_addCustomerButton1MouseExited

        private void listCutomerButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_listCutomerButtonMouseEntered
                // TODO add your handling code here:
                listCustomerOptPanel1.setBackground(new java.awt.Color(33, 33, 33));
        }// GEN-LAST:event_listCutomerButtonMouseEntered

        private void listCutomerButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_listCutomerButtonMouseExited
                listCustomerOptPanel1.setBackground(new java.awt.Color(44, 44, 44));
        }// GEN-LAST:event_listCutomerButtonMouseExited

        private void packageButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_packageButtonMouseEntered
                packagesBG.setBackground(new java.awt.Color(33, 33, 33));
        }// GEN-LAST:event_packageButtonMouseEntered

        private void packageButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_packageButtonMouseExited
                packagesBG.setBackground(new java.awt.Color(44, 44, 44));
        }// GEN-LAST:event_packageButtonMouseExited

        private void packageBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_packageBoxActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_packageBoxActionPerformed

        private void listCutomerButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_listCutomerButtonMouseClicked
                tempPanel = new listCustomerPanel();
                holderPanel.removeAll();
                holderPanel.add(tempPanel);
                repaint();
                revalidate();
        }// GEN-LAST:event_listCutomerButtonMouseClicked

        private void addCustomerButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addCustomerButton1MouseClicked
                // TODO add your handling code here:
                editNameField.setText("Enter name");
                editAddressField.setText("Enter address");
                editPhoneField.setText("Enter phone number");
                editEmailField.setText("Enter email address");
                editNidFIeld.setText("Legal document no.");
                editUnameFIeld.setText("Enter username");
                passField1.setText("");
                editCreditField.setText("Enter Credit");
                
                holderPanel.removeAll();
                holderPanel.add(addCustomerPanel);
                repaint();
                revalidate();
        }// GEN-LAST:event_addCustomerButton1MouseClicked

        private void packageButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_packageButtonMouseClicked
                tempPanel = new packagePanel();
                holderPanel.removeAll();
                holderPanel.add(tempPanel);
                repaint();
                revalidate();
        }// GEN-LAST:event_packageButtonMouseClicked

        private void removeCustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_removeCustomerButtonMouseClicked
                tempPanel = new removeCustomer(who);
                holderPanel.removeAll();
                holderPanel.add(tempPanel);
                repaint();
                revalidate();
        }// GEN-LAST:event_removeCustomerButtonMouseClicked

        private void removeCustomerButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_removeCustomerButtonMouseEntered
                removeCustomerBG.setBackground(new java.awt.Color(33, 33, 33));
        }// GEN-LAST:event_removeCustomerButtonMouseEntered

        private void removeCustomerButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_removeCustomerButtonMouseExited
                removeCustomerBG.setBackground(new java.awt.Color(44, 44, 44));
        }// GEN-LAST:event_removeCustomerButtonMouseExited

        private void removeCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeCustomerButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_removeCustomerButtonActionPerformed

        private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nameFieldMouseClicked
                nameField.setText("");
        }// GEN-LAST:event_nameFieldMouseClicked

        private void nameFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nameFieldMouseEntered
                nameField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_nameFieldMouseEntered

        private void nameFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nameFieldMouseExited
                nameField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_nameFieldMouseExited

        private void addressFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addressFieldMouseClicked
                addressField.setText("");
        }// GEN-LAST:event_addressFieldMouseClicked

        private void addressFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addressFieldMouseEntered
                addressField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_addressFieldMouseEntered

        private void addressFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addressFieldMouseExited
                addressField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_addressFieldMouseExited

        private void phoneFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_phoneFieldMouseClicked
                phoneField.setText("");
        }// GEN-LAST:event_phoneFieldMouseClicked

        private void phoneFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_phoneFieldMouseEntered
                phoneField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_phoneFieldMouseEntered

        private void phoneFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_phoneFieldMouseExited
                phoneField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_phoneFieldMouseExited

        private void emailFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_emailFieldMouseClicked
                emailField.setText("");
        }// GEN-LAST:event_emailFieldMouseClicked

        private void emailFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_emailFieldMouseEntered
                emailField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_emailFieldMouseEntered

        private void emailFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_emailFieldMouseExited
                emailField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_emailFieldMouseExited

        private void legalDocFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_legalDocFieldMouseClicked
                legalDocField.setText("");
        }// GEN-LAST:event_legalDocFieldMouseClicked

        private void legalDocFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_legalDocFieldMouseEntered
                legalDocField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_legalDocFieldMouseEntered

        private void legalDocFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_legalDocFieldMouseExited
                legalDocField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_legalDocFieldMouseExited

        private void packageBoxMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_packageBoxMouseEntered
                packageBox.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_packageBoxMouseEntered

        private void packageBoxMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_packageBoxMouseExited
                packageBox.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_packageBoxMouseExited

        private void adderButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_adderButtonMouseEntered
                addCustBG.setBackground(new java.awt.Color(10, 125, 55));
        }// GEN-LAST:event_adderButtonMouseEntered

        private void adderButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_adderButtonMouseExited
                addCustBG.setBackground(new java.awt.Color(10, 137, 70));
        }// GEN-LAST:event_adderButtonMouseExited

        private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchButtonMouseClicked
            String info = searchField.getText();
            String userInf;
            try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db");
                        // established connection
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from customer"); // Query executed

                        
                        while (rs.next()) {
                            userInf = rs.getString(4);
                            if(userInf.equals(info))    {
                                int crd;
                                tuid = rs.getString(1);
                                tnid = rs.getString(2);
                                tname = rs.getString(3);
                                tusername = rs.getString(4);
                                taddress = rs.getString(5);
                                tpass = rs.getString(6);
                                tpackStat = rs.getString(7);
                                crd = rs.getInt(8);
                                tactStat = rs.getString(9);
                                tcontactNo = rs.getString(10);
                                tmail = rs.getString(11);
                                
//                                System.out.println(tuid + tnid);
                                infoName.setText(tname);
                                infoUsername.setText(tusername);
                                infoUserID.setText(tuid);
                                infoEMail.setText(tmail);
                                infoAddress.setText(taddress);
                                infoContact.setText(tcontactNo);
                                infoPack.setText(tpackStat);
                                tcredit = "" + crd;
                                infoCredit.setText("" + crd);
                                if(tactStat.equals("true")){
                                    infoActStat.setText("Active");
                                    infoIndicator.setBackground(new java.awt.Color(10,137,70));
                                }
                                else {
                                    infoActStat.setText("Inactive");
                                    infoIndicator.setBackground(new java.awt.Color(197,0,0));
                                    }
                                holderPanel.removeAll();
                                holderPanel.add(infoPanel);
                                repaint();
                                revalidate();
                                break;
                            }
                                
                        }
                        con.close();
                        st.close();
                        rs.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

        }// GEN-LAST:event_searchButtonMouseClicked

        private void adderButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_adderButtonMouseClicked
                
                name = nameField.getText();
                address = addressField.getText();
                contactNo = phoneField.getText();
                mail = emailField.getText();
                nid = legalDocField.getText();
                int idx = packageBox.getSelectedIndex();

                
                if (idx == 0) {
                        packStat = "10 mbps";
                } else if (idx == 1) {
                        packStat = "15 mbps";
                } else if (idx == 2) {
                        packStat = "20 mbps";
                } else {
                        packStat = "30 mbps";
                }

                username = unameField.getText();
                username = "customer." + username;
                pass = passField.getText();
                actStat = "true";
                credit = 5000;

                try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
                        stm = con.prepareStatement("insert into customer values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        Statement state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from customer"); // Query executed
                        
                        
                        stm.setString(1, t2);
                        stm.setString(2, nid);
                        stm.setString(3, name);
                        stm.setString(4, username);
                        stm.setString(5, address);
                        stm.setString(6, pass);
                        stm.setString(7, packStat);
                        stm.setInt(8, credit);
                        stm.setString(9, actStat);
                        stm.setString(10, contactNo);
                        stm.setString(11, mail);
                        // System.out.println("before");
                        stm.executeUpdate();
                        
                        tempUID = "";
                        t2 ="";
                        boolean zeroNotFound = true;
                        int zeroes = 0, mark = 0, temp;
                        
                        while(rs.next())    {
                            tempUID = rs.getString(1);
                        }
                        
                        v = 0;
                        
                        for(int i =0; i < 5; i++)   {
                            v*=10;
                            char at = tempUID.charAt(i);
                            if(at!='0') zeroNotFound = false;
                            if(zeroNotFound==true && at=='0')   {
                                zeroes+=1;
                            }
                            v += Character.getNumericValue(at);
//                            System.out.println(zeroes + " " +v);
                        }
                        temp = v;
                        
//                        while(temp>=10) {
//                            temp /= 10;
//                            mark++;
//                        }
                        
//                        System.out.println(mark);
                        
                        if(v%10==9) zeroes -= 1;
                        zeroes -= mark;
                        for(int i=0; i<zeroes; i++) {
                            t2 = t2 + "0";
                        }
                        t2 = t2 + (v+1);
                        
                        rs.close();
                        state.close();
                        stm.close();
                        con.close();
                        warningLabel.setText("Customer added");
                        UIDLabel.setText(t2);

                } catch (Exception sq) {
                        System.out.println(sq.getMessage());
                }
        }// GEN-LAST:event_adderButtonMouseClicked

        private void unameFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_unameFieldMouseClicked
                unameField.setText("");
        }// GEN-LAST:event_unameFieldMouseClicked

        private void unameFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_unameFieldMouseEntered
                unameField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_unameFieldMouseEntered

        private void unameFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_unameFieldMouseExited
                unameField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_unameFieldMouseExited

        private void passFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passFieldMouseEntered
                passField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_passFieldMouseEntered

        private void passFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passFieldMouseExited
                passField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_passFieldMouseExited

        private void uidFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_uidFieldMouseClicked
//                uidField.setText("");
        }// GEN-LAST:event_uidFieldMouseClicked

        private void uidFieldMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_uidFieldMouseEntered
//                uidField.setBackground(new java.awt.Color(54, 54, 54));
        }// GEN-LAST:event_uidFieldMouseEntered

        private void uidFieldMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_uidFieldMouseExited
//                uidField.setBackground(new java.awt.Color(48, 48, 48));
        }// GEN-LAST:event_uidFieldMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JPanel addCustBG;
    private javax.swing.JPanel addCustBG10;
    private javax.swing.JButton addCustomerButton1;
    private javax.swing.JPanel addCustomerOptPanel;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JLabel addIcon;
    private javax.swing.JButton adderButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLabel10;
    private javax.swing.JPanel briefSearchPanel;
    private javax.swing.JLabel cancelEdit;
    private javax.swing.JPanel cancelEditPanel;
    private javax.swing.JComboBox<String> editActiveBox;
    private javax.swing.JTextField editAddressField;
    private javax.swing.JTextField editCreditField;
    private javax.swing.JPanel editCustomer;
    private javax.swing.JTextField editEmailField;
    private javax.swing.JLabel editInfoButton;
    private javax.swing.JTextField editNameField;
    private javax.swing.JTextField editNidFIeld;
    private javax.swing.JComboBox<String> editPackageBox;
    private javax.swing.JTextField editPhoneField;
    private javax.swing.JTextField editUnameFIeld;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel10;
    private javax.swing.JPanel holderPanel;
    private javax.swing.JLabel infoActStat;
    private javax.swing.JLabel infoAddress;
    private javax.swing.JLabel infoContact;
    private javax.swing.JLabel infoCredit;
    private javax.swing.JLabel infoEMail;
    private javax.swing.JPanel infoIndicator;
    private javax.swing.JLabel infoName;
    private javax.swing.JLabel infoPack;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel infoUserID;
    private javax.swing.JLabel infoUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField legalDocField;
    private javax.swing.JPanel listCustomerOptPanel1;
    private javax.swing.JButton listCutomerButton;
    private javax.swing.JLabel listIcon;
    private javax.swing.JLabel listIcon1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel10;
    private javax.swing.JComboBox<String> packageBox;
    private javax.swing.JButton packageButton;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packageLabel10;
    private javax.swing.JPanel packagesBG;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel10;
    private javax.swing.JPanel removeCustomerBG;
    private javax.swing.JButton removeCustomerButton;
    private javax.swing.JLabel removeIcon;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField unameField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JLabel warningLabel1;
    // End of variables declaration//GEN-END:variables
}
