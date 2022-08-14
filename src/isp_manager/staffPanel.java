package isp_manager;

import java.awt.event.KeyEvent;
import java.sql.*;

public class staffPanel extends javax.swing.JPanel {
    javax.swing.JPanel tempPanel;
    
    String who;
    Connection con;
    PreparedStatement stm;

    String tempUID = "", t2 = "";
    String tuid, tnid, tname, tusername, taddress, tpass, tpackStat, tactStat, tcontactNo, tmail, tcredit;
    String userId, username, contactNo, mailAddress, nameStaff;
    String actStat, passwd, role;
    int salary, v;
    
    
    
    public staffPanel(String id){
        who = id;
                try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
                        stm = con.prepareStatement("insert into customer values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        Statement state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from staff"); // Query executed
                        
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
        addStaffClick = new javax.swing.JPanel();
        adderButton = new javax.swing.JButton();
        roleBox = new javax.swing.JComboBox<>();
        packageLabel1 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        packageLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passFIeld = new javax.swing.JPasswordField();
        alertLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        UIDLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        infoName = new javax.swing.JLabel();
        infoUsername = new javax.swing.JLabel();
        infoUserID = new javax.swing.JLabel();
        infoEMail = new javax.swing.JLabel();
        infoContact = new javax.swing.JLabel();
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
        removeStaffBG = new javax.swing.JPanel();
        remStaffIcon = new javax.swing.JLabel();
        removeStaffButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();

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

        briefSearchPanel.setBackground(new java.awt.Color(33, 33, 33));

        searchButton.setBackground(new java.awt.Color(55, 55, 55));
        searchButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchButton.setForeground(new java.awt.Color(204, 204, 204));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setContentAreaFilled(false);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
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
            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        packageLabel.setText("Role");

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
        packageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        packageLabel1.setText("BDT");

        salaryTextField.setBackground(new java.awt.Color(38, 38, 38));
        salaryTextField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        salaryTextField.setForeground(new java.awt.Color(204, 204, 204));
        salaryTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        packageLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        packageLabel2.setForeground(new java.awt.Color(204, 204, 204));
        packageLabel2.setText("Salary");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Staff ID:");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("staff.");

        usernameField.setBackground(new java.awt.Color(48, 48, 48));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setText("Enter Username");
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameFieldMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Staff Password");

        passFIeld.setBackground(new java.awt.Color(48, 48, 48));
        passFIeld.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passFIeld.setForeground(new java.awt.Color(204, 204, 204));
        passFIeld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passFIeld.setText("Password");
        passFIeld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 54, 54), 3, true));
        passFIeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passFIeldMouseClicked(evt);
            }
        });

        alertLabel.setBackground(new java.awt.Color(204, 204, 204));
        alertLabel.setForeground(new java.awt.Color(204, 204, 204));
        alertLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Staff username:");

        UIDLabel.setBackground(new java.awt.Color(204, 204, 204));
        UIDLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UIDLabel.setForeground(new java.awt.Color(204, 204, 204));
        UIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UIDLabel.setText(t2);

        javax.swing.GroupLayout addCustomerPanelLayout = new javax.swing.GroupLayout(addCustomerPanel);
        addCustomerPanel.setLayout(addCustomerPanelLayout);
        addCustomerPanelLayout.setHorizontalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                    .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(114, 114, 114)
                                    .addComponent(roleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                    .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                            .addComponent(packageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(packageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(6, 6, 6)))
                            .addGroup(addCustomerPanelLayout.createSequentialGroup()
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
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(legalDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))))
                    .addGroup(addCustomerPanelLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(addStaffClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        addCustomerPanelLayout.setVerticalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addStaffClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
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
        jLabel13.setText("Role");

        infoPack.setBackground(new java.awt.Color(204, 204, 204));
        infoPack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        infoPack.setForeground(new java.awt.Color(204, 204, 204));
        infoPack.setText(taddress);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Salary");

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
                .addGap(53, 53, 53)
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
                .addContainerGap(251, Short.MAX_VALUE))
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
        editPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPhoneFieldActionPerformed(evt);
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
        packageLabel10.setText("Role :");

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
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
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
        editPackageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Technician", "General Staff" }));
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
        jLabel17.setText("Update Active Status :");

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
        jLabel18.setText("Update Salary");

        editCreditField.setBackground(new java.awt.Color(48, 48, 48));
        editCreditField.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        editCreditField.setForeground(new java.awt.Color(204, 204, 204));
        editCreditField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editCreditField.setText("Enter Salary");
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
        editCreditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCreditFieldActionPerformed(evt);
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
            .addComponent(cancelEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cancelEditPanelLayout.setVerticalGroup(
            cancelEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout editCustomerLayout = new javax.swing.GroupLayout(editCustomer);
        editCustomer.setLayout(editCustomerLayout);
        editCustomerLayout.setHorizontalGroup(
            editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(addCustBG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelEditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(editCustomerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(warningLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editCustomerLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editCustomerLayout.createSequentialGroup()
                            .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                            .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editActiveBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editCreditField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editNidFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(packageLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editPackageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editUnameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editCustomerLayout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(21, 21, 21)))
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
                    .addComponent(editPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editNidFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editPackageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addComponent(editUnameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editCustomerLayout.createSequentialGroup()
                        .addComponent(editActiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editCreditField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131)
                .addGroup(editCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCustBG10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelEditPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        holderPanel.add(editCustomer, "card2");

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

        jPanel2.setBackground(new java.awt.Color(33, 33, 33));

        searchField.setBackground(new java.awt.Color(33, 33, 33));
        searchField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(204, 204, 204));
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setText("search staff");
        searchField.setBorder(null);
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(briefSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listStaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 60, Short.MAX_VALUE)))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
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
                .addGap(0, 1, Short.MAX_VALUE))
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
        tempPanel = new removeStaff(who);
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

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        
            String info = searchField.getText();
            String userInf;
            try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db");
                        // established connection
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from staff"); // Query executed

                        
                        while (rs.next()) {
                            userInf = rs.getString(3);
                            if(userInf.equals(info))    {
                                int crd;
                                tuid = rs.getString(1);
                                tname = rs.getString(2);
                                tusername = rs.getString(3);
                                tpass = rs.getString(4);
                                tactStat = rs.getString(5);
                                crd = rs.getInt(6);
                                tpackStat = rs.getString(7);
                                tmail = rs.getString(8);
                                tcontactNo = rs.getString(9);
                                
//                                System.out.println(tuid + tnid);
                                infoName.setText(tname);
                                infoUsername.setText(tusername);
                                infoUserID.setText(tuid);
                                infoEMail.setText(tmail);
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
    }//GEN-LAST:event_searchButtonMouseClicked

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
        salaryTextField.setBackground(new java.awt.Color(38,38,38));
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

    private void adderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adderButtonMouseClicked
        
        nameStaff = nameField.getText();
        contactNo = phoneField.getText();
        mailAddress = emailField.getText();
        String pass = passFIeld.getText();
        username = usernameField.getText();
        username = "staff." + username;
        String tempSalary = salaryTextField.getText();
        int salary = Integer.parseInt(tempSalary);
        int idx = roleBox.getSelectedIndex();
        String role;
        
        if(idx == 0)    role = "Manager";
        else if (idx==1) role = "Technician";
        else role = "General Staff";
        
        try{
            Class.forName("org.sqlite.JDBC"); // Driver available
            con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
            stm = con.prepareStatement("insert into staff values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                                    Statement state = con.createStatement();
                        ResultSet rs = state.executeQuery("select * from staff"); // Query executed
                        
            stm.setString(1, t2);
            stm.setString(2, nameStaff);
            stm.setString(3, username);
            stm.setString(4, pass);
            stm.setString(5, "true");
            stm.setInt(6, salary);
            stm.setString(7, role);
            stm.setString(8, mailAddress);
            stm.setString(9, contactNo);
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
            
            stm.close();
            con.close();
            alertLabel.setText("Staff added");
            UIDLabel.setText(t2);
        } catch(Exception sq)    {
            System.out.println(sq.getMessage());
        }
        
        
    }//GEN-LAST:event_adderButtonMouseClicked

    private void usernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseClicked
        usernameField.setText("");
    }//GEN-LAST:event_usernameFieldMouseClicked

    private void usernameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldMouseEntered

    private void usernameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldMouseExited

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked

    private void editInfoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseClicked
        editNameField.setText(tname);
        editPhoneField.setText(tcontactNo);
        editEmailField.setText(tmail);
        editUnameFIeld.setText(tusername);
        editCreditField.setText(tcredit);
        editNidFIeld.setText(tnid);
        passField1.setText(tpass);

        holderPanel.removeAll();
        holderPanel.add(editCustomer);
        repaint();
        revalidate();
    }//GEN-LAST:event_editInfoButtonMouseClicked

    private void editInfoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseEntered
        editInfoButton.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_editInfoButtonMouseEntered

    private void editInfoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editInfoButtonMouseExited
        editInfoButton.setForeground(new java.awt.Color(180,180,180));
    }//GEN-LAST:event_editInfoButtonMouseExited

    private void editNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseClicked
        editNameField.setText("");
    }//GEN-LAST:event_editNameFieldMouseClicked

    private void editNameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseEntered
        editNameField.setBackground(new java.awt.Color(54,54,54));
    }//GEN-LAST:event_editNameFieldMouseEntered

    private void editNameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameFieldMouseExited
        editNameField.setBackground(new java.awt.Color(48,48,48));
    }//GEN-LAST:event_editNameFieldMouseExited

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
            PreparedStatement state = con.prepareStatement("update staff set nid = ? where id = ?");
            ResultSet rs = stt.executeQuery("select * from staff"); // Query executed

            state.setString(1, anid);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set name = ? where id = ?");
            state.setString(1, aname);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set email = ? where id = ?");
            state.setString(1, amail);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set contact = ? where id = ?");
            state.setString(1, acontact);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set username = ? where id = ?");
            state.setString(1, auname);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set password = ? where id = ?");
            state.setString(1, apass);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set salary = ? where id = ?");
            state.setInt(1, crd);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set active = ? where id = ?");
            state.setString(1, result);
            state.setString(2, tuid);
            state.executeUpdate();

            state = con.prepareStatement("update staff set role = ? where id = ?");
            state.setString(1, aPackStat);
            state.setString(2, tuid);
            state.executeUpdate();

            state.close();
            rs.close();
            stt.close();
            con.close();

            infoName.setText(aname);
            infoContact.setText(tcontactNo);
            infoEMail.setText(amail);
            infoUsername.setText(auname);
            infoCredit.setText(aCredit);
            infoPack.setText(aPackStat);
            infoCredit.setText(aCredit);
            infoActStat.setText(aActStat);

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

    private void cancelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelEditMouseClicked
        holderPanel.removeAll();
        holderPanel.add(infoPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_cancelEditMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void editPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPhoneFieldActionPerformed

    private void passFIeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFIeldMouseClicked
        passFIeld.setText("");
    }//GEN-LAST:event_passFIeldMouseClicked

    private void editCreditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCreditFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCreditFieldActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)   {
                        String info = searchField.getText();
            String userInf;
            try {
                        Class.forName("org.sqlite.JDBC"); // Driver available
                        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db");
                        // established connection
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from staff"); // Query executed

                        
                        while (rs.next()) {
                            userInf = rs.getString(3);
                            if(userInf.equals(info))    {
                                int crd;
                                tuid = rs.getString(1);
                                tname = rs.getString(2);
                                tusername = rs.getString(3);
                                tpass = rs.getString(4);
                                tactStat = rs.getString(5);
                                crd = rs.getInt(6);
                                tpackStat = rs.getString(7);
                                tmail = rs.getString(8);
                                tcontactNo = rs.getString(9);
                                
//                                System.out.println(tuid + tnid);
                                infoName.setText(tname);
                                infoUsername.setText(tusername);
                                infoUserID.setText(tuid);
                                infoEMail.setText(tmail);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JPanel addCustBG10;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JLabel addIcon;
    private javax.swing.JPanel addStaffBG;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JPanel addStaffClick;
    private javax.swing.JButton adderButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel alertLabel;
    private javax.swing.JPanel briefSearchPanel;
    private javax.swing.JLabel cancelEdit;
    private javax.swing.JPanel cancelEditPanel;
    private javax.swing.JComboBox<String> editActiveBox;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField legalDocField;
    private javax.swing.JLabel listIcon;
    private javax.swing.JPanel listStaffBG;
    private javax.swing.JButton listStaffButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel10;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packageLabel1;
    private javax.swing.JLabel packageLabel10;
    private javax.swing.JLabel packageLabel2;
    private javax.swing.JPasswordField passFIeld;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel10;
    private javax.swing.JLabel remStaffIcon;
    private javax.swing.JPanel removeStaffBG;
    private javax.swing.JButton removeStaffButton;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningLabel1;
    // End of variables declaration//GEN-END:variables
}
