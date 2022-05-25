package isp_manager;

import java.awt.*;
import java.awt.event.*;


public class adminPanel extends javax.swing.JFrame {
    
    CardLayout cards;
    
    public adminPanel() {
        initComponents();
        
        cards = (CardLayout)(cardHolder.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        dashBoardBG = new javax.swing.JPanel();
        dashBoardButton = new javax.swing.JButton();
        homeBG = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        CustomerBG = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        StaffBG = new javax.swing.JPanel();
        staffButton = new javax.swing.JButton();
        ReportsBG = new javax.swing.JPanel();
        reportsButton = new javax.swing.JButton();
        SupportBG = new javax.swing.JPanel();
        supportButton = new javax.swing.JButton();
        logOutBG = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        dashBoardPanelBG = new javax.swing.JPanel();
        topbarPanel = new javax.swing.JPanel();
        photoHolder = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addUserTopButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        listCustomerTopButton = new javax.swing.JButton();
        notificationButtonTop = new javax.swing.JButton();
        activeUsersTopButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        todoButton = new javax.swing.JButton();
        cardHolder = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        userStatusPanel = new javax.swing.JPanel();
        activeCountLabel = new javax.swing.JLabel();
        onlineCountLabel = new javax.swing.JLabel();
        activeTextLabel = new javax.swing.JLabel();
        OnlineTextLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        staffActiveCount = new javax.swing.JLabel();
        staffLeaveCount = new javax.swing.JLabel();
        activeStaffTextLabel = new javax.swing.JLabel();
        onLeaveTextLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HomePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CustomerPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addCustomerPanel = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        addCustomerPanel1 = new javax.swing.JPanel();
        customerPackageButton = new javax.swing.JButton();
        searchCustomerPanel2 = new javax.swing.JPanel();
        searchCustomerButton = new javax.swing.JButton();
        listCustomerPanel3 = new javax.swing.JPanel();
        listOfCustomerButton = new javax.swing.JButton();
        customerPaymentPanel = new javax.swing.JPanel();
        customerPaymentButton = new javax.swing.JButton();
        customerReportPanel = new javax.swing.JPanel();
        customerReportButton = new javax.swing.JButton();
        StaffPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        supportPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        addCustomerOptions = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSplitPane1.setDividerLocation(280);
        jSplitPane1.setDividerSize(0);

        leftPanel.setBackground(new java.awt.Color(204, 204, 204));

        logoPanel.setBackground(new java.awt.Color(204, 204, 204));
        logoPanel.setLayout(new java.awt.GridLayout(1, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/logo_1_80.png"))); // NOI18N

        dashBoardBG.setBackground(new java.awt.Color(204, 204, 204));

        dashBoardButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        dashBoardButton.setForeground(new java.awt.Color(51, 51, 51));
        dashBoardButton.setText("Dashboard");
        dashBoardButton.setBorder(null);
        dashBoardButton.setContentAreaFilled(false);
        dashBoardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashBoardButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashBoardBGLayout = new javax.swing.GroupLayout(dashBoardBG);
        dashBoardBG.setLayout(dashBoardBGLayout);
        dashBoardBGLayout.setHorizontalGroup(
            dashBoardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashBoardBGLayout.setVerticalGroup(
            dashBoardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        homeBG.setBackground(new java.awt.Color(204, 204, 204));

        homeButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        homeButton.setForeground(new java.awt.Color(51, 51, 51));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeBGLayout = new javax.swing.GroupLayout(homeBG);
        homeBG.setLayout(homeBGLayout);
        homeBGLayout.setHorizontalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeBGLayout.setVerticalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        CustomerBG.setBackground(new java.awt.Color(204, 204, 204));

        customerButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        customerButton.setForeground(new java.awt.Color(51, 51, 51));
        customerButton.setText("Customers");
        customerButton.setBorder(null);
        customerButton.setContentAreaFilled(false);
        customerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CustomerBGLayout = new javax.swing.GroupLayout(CustomerBG);
        CustomerBG.setLayout(CustomerBGLayout);
        CustomerBGLayout.setHorizontalGroup(
            CustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CustomerBGLayout.setVerticalGroup(
            CustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        StaffBG.setBackground(new java.awt.Color(204, 204, 204));

        staffButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        staffButton.setForeground(new java.awt.Color(51, 51, 51));
        staffButton.setText("Staff");
        staffButton.setBorder(null);
        staffButton.setContentAreaFilled(false);
        staffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StaffBGLayout = new javax.swing.GroupLayout(StaffBG);
        StaffBG.setLayout(StaffBGLayout);
        StaffBGLayout.setHorizontalGroup(
            StaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StaffBGLayout.setVerticalGroup(
            StaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ReportsBG.setBackground(new java.awt.Color(204, 204, 204));

        reportsButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        reportsButton.setForeground(new java.awt.Color(51, 51, 51));
        reportsButton.setText("Reports");
        reportsButton.setBorder(null);
        reportsButton.setContentAreaFilled(false);
        reportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ReportsBGLayout = new javax.swing.GroupLayout(ReportsBG);
        ReportsBG.setLayout(ReportsBGLayout);
        ReportsBGLayout.setHorizontalGroup(
            ReportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReportsBGLayout.setVerticalGroup(
            ReportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SupportBG.setBackground(new java.awt.Color(204, 204, 204));

        supportButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        supportButton.setForeground(new java.awt.Color(51, 51, 51));
        supportButton.setText("Support");
        supportButton.setBorder(null);
        supportButton.setContentAreaFilled(false);
        supportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supportButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SupportBGLayout = new javax.swing.GroupLayout(SupportBG);
        SupportBG.setLayout(SupportBGLayout);
        SupportBGLayout.setHorizontalGroup(
            SupportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SupportBGLayout.setVerticalGroup(
            SupportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        logOutBG.setBackground(new java.awt.Color(204, 204, 204));

        logOutButton.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(51, 51, 51));
        logOutButton.setText("Log out");
        logOutButton.setBorder(null);
        logOutButton.setContentAreaFilled(false);
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout logOutBGLayout = new javax.swing.GroupLayout(logOutBG);
        logOutBG.setLayout(logOutBGLayout);
        logOutBGLayout.setHorizontalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logOutBGLayout.setVerticalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StaffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(homeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CustomerBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ReportsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SupportBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(dashBoardBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReportsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupportBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(logOutBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftPanel);

        dashBoardPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        topbarPanel.setBackground(new java.awt.Color(204, 204, 204));

        photoHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/userImage_B10_2_100x101.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Generic Adminstrator");

        addUserTopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/add-user-32.png"))); // NOI18N
        addUserTopButton.setBorder(null);
        addUserTopButton.setContentAreaFilled(false);
        addUserTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserTopButtonActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/3844432_magnifier_search_zoom_icon.png"))); // NOI18N
        searchButton.setBorder(null);
        searchButton.setContentAreaFilled(false);

        listCustomerTopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/clipboard.png"))); // NOI18N
        listCustomerTopButton.setBorder(null);
        listCustomerTopButton.setContentAreaFilled(false);

        notificationButtonTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/notification.png"))); // NOI18N
        notificationButtonTop.setBorder(null);
        notificationButtonTop.setContentAreaFilled(false);

        activeUsersTopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/group.png"))); // NOI18N
        activeUsersTopButton.setBorder(null);
        activeUsersTopButton.setContentAreaFilled(false);

        userNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        userNameLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNameLabel.setText("admin.generic");

        todoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/to-do-list.png"))); // NOI18N
        todoButton.setBorder(null);
        todoButton.setContentAreaFilled(false);

        javax.swing.GroupLayout topbarPanelLayout = new javax.swing.GroupLayout(topbarPanel);
        topbarPanel.setLayout(topbarPanelLayout);
        topbarPanelLayout.setHorizontalGroup(
            topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                        .addComponent(addUserTopButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(listCustomerTopButton)
                        .addGap(18, 18, 18)
                        .addComponent(activeUsersTopButton)
                        .addGap(18, 18, 18)
                        .addComponent(notificationButtonTop)
                        .addGap(18, 18, 18)
                        .addComponent(todoButton)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                        .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(photoHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topbarPanelLayout.setVerticalGroup(
            topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topbarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(activeUsersTopButton)
                            .addComponent(searchButton)
                            .addComponent(addUserTopButton)
                            .addComponent(listCustomerTopButton)
                            .addComponent(notificationButtonTop)
                            .addComponent(todoButton))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        cardHolder.setBackground(new java.awt.Color(255, 255, 255));
        cardHolder.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));

        userStatusPanel.setBackground(new java.awt.Color(119, 159, 182));
        userStatusPanel.setPreferredSize(new java.awt.Dimension(260, 160));

        activeCountLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        activeCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        activeCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activeCountLabel.setText("200");

        onlineCountLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        onlineCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        onlineCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        onlineCountLabel.setText("189");

        activeTextLabel.setBackground(new java.awt.Color(255, 255, 255));
        activeTextLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        activeTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        activeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activeTextLabel.setText("[Active]");

        OnlineTextLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        OnlineTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        OnlineTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OnlineTextLabel.setText("[Online]");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Status");

        javax.swing.GroupLayout userStatusPanelLayout = new javax.swing.GroupLayout(userStatusPanel);
        userStatusPanel.setLayout(userStatusPanelLayout);
        userStatusPanelLayout.setHorizontalGroup(
            userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userStatusPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userStatusPanelLayout.createSequentialGroup()
                        .addComponent(activeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(activeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userStatusPanelLayout.createSequentialGroup()
                        .addComponent(onlineCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OnlineTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userStatusPanelLayout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57)))
        );
        userStatusPanelLayout.setVerticalGroup(
            userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userStatusPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activeCountLabel)
                    .addComponent(activeTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onlineCountLabel)
                    .addComponent(OnlineTextLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userStatusPanelLayout.createSequentialGroup()
                    .addContainerGap(119, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 160));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Staff Status");

        staffActiveCount.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        staffActiveCount.setForeground(new java.awt.Color(255, 255, 255));
        staffActiveCount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        staffActiveCount.setText("10");

        staffLeaveCount.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        staffLeaveCount.setForeground(new java.awt.Color(255, 255, 255));
        staffLeaveCount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        staffLeaveCount.setText("1");

        activeStaffTextLabel.setBackground(new java.awt.Color(255, 255, 255));
        activeStaffTextLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        activeStaffTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        activeStaffTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        activeStaffTextLabel.setText("[Active]");

        onLeaveTextLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        onLeaveTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        onLeaveTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        onLeaveTextLabel.setText("[On Leave]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staffLeaveCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffActiveCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activeStaffTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onLeaveTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activeStaffTextLabel)
                    .addComponent(staffActiveCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onLeaveTextLabel)
                    .addComponent(staffLeaveCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A graph of online users during a certain time");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(userStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userStatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        cardHolder.add(dashboardPanel, "card2");

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home Panel");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        cardHolder.add(HomePanel, "card3");

        CustomerPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CustomerPanel");

        addCustomerPanel.setBackground(new java.awt.Color(159, 164, 169));
        addCustomerPanel.setForeground(new java.awt.Color(53, 144, 243));

        addCustomerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addCustomerButton.setForeground(new java.awt.Color(51, 51, 51));
        addCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/add-user.png"))); // NOI18N
        addCustomerButton.setText("Add Customer");
        addCustomerButton.setBorder(null);
        addCustomerButton.setContentAreaFilled(false);
        addCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCustomerButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addCustomerPanelLayout = new javax.swing.GroupLayout(addCustomerPanel);
        addCustomerPanel.setLayout(addCustomerPanelLayout);
        addCustomerPanelLayout.setHorizontalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        addCustomerPanelLayout.setVerticalGroup(
            addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addCustomerPanel1.setBackground(new java.awt.Color(159, 164, 169));
        addCustomerPanel1.setForeground(new java.awt.Color(53, 144, 243));
        addCustomerPanel1.setPreferredSize(new java.awt.Dimension(329, 172));

        customerPackageButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerPackageButton.setForeground(new java.awt.Color(51, 51, 51));
        customerPackageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/package.png"))); // NOI18N
        customerPackageButton.setText("Packages");
        customerPackageButton.setBorder(null);
        customerPackageButton.setContentAreaFilled(false);

        javax.swing.GroupLayout addCustomerPanel1Layout = new javax.swing.GroupLayout(addCustomerPanel1);
        addCustomerPanel1.setLayout(addCustomerPanel1Layout);
        addCustomerPanel1Layout.setHorizontalGroup(
            addCustomerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPackageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addCustomerPanel1Layout.setVerticalGroup(
            addCustomerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPackageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );

        searchCustomerPanel2.setBackground(new java.awt.Color(159, 164, 169));
        searchCustomerPanel2.setForeground(new java.awt.Color(53, 144, 243));
        searchCustomerPanel2.setPreferredSize(new java.awt.Dimension(329, 172));

        searchCustomerButton.setBackground(new java.awt.Color(51, 51, 51));
        searchCustomerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchCustomerButton.setForeground(new java.awt.Color(51, 51, 51));
        searchCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/search.png"))); // NOI18N
        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.setBorder(null);
        searchCustomerButton.setContentAreaFilled(false);

        javax.swing.GroupLayout searchCustomerPanel2Layout = new javax.swing.GroupLayout(searchCustomerPanel2);
        searchCustomerPanel2.setLayout(searchCustomerPanel2Layout);
        searchCustomerPanel2Layout.setHorizontalGroup(
            searchCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        searchCustomerPanel2Layout.setVerticalGroup(
            searchCustomerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );

        listCustomerPanel3.setBackground(new java.awt.Color(159, 164, 169));
        listCustomerPanel3.setForeground(new java.awt.Color(53, 144, 243));
        listCustomerPanel3.setPreferredSize(new java.awt.Dimension(329, 172));

        listOfCustomerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listOfCustomerButton.setForeground(new java.awt.Color(51, 51, 51));
        listOfCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/customer.png"))); // NOI18N
        listOfCustomerButton.setText("List of Customers");
        listOfCustomerButton.setBorder(null);
        listOfCustomerButton.setContentAreaFilled(false);
        listOfCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listCustomerPanel3Layout = new javax.swing.GroupLayout(listCustomerPanel3);
        listCustomerPanel3.setLayout(listCustomerPanel3Layout);
        listCustomerPanel3Layout.setHorizontalGroup(
            listCustomerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listOfCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        listCustomerPanel3Layout.setVerticalGroup(
            listCustomerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listOfCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );

        customerPaymentPanel.setBackground(new java.awt.Color(159, 164, 169));
        customerPaymentPanel.setPreferredSize(new java.awt.Dimension(329, 172));

        customerPaymentButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerPaymentButton.setForeground(new java.awt.Color(51, 51, 51));
        customerPaymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/fees.png"))); // NOI18N
        customerPaymentButton.setText("Customer Payments");
        customerPaymentButton.setBorder(null);
        customerPaymentButton.setContentAreaFilled(false);

        javax.swing.GroupLayout customerPaymentPanelLayout = new javax.swing.GroupLayout(customerPaymentPanel);
        customerPaymentPanel.setLayout(customerPaymentPanelLayout);
        customerPaymentPanelLayout.setHorizontalGroup(
            customerPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        customerPaymentPanelLayout.setVerticalGroup(
            customerPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        customerReportPanel.setBackground(new java.awt.Color(159, 164, 169));
        customerReportPanel.setPreferredSize(new java.awt.Dimension(329, 172));

        customerReportButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerReportButton.setForeground(new java.awt.Color(51, 51, 51));
        customerReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/report.png"))); // NOI18N
        customerReportButton.setText("Reports");
        customerReportButton.setBorder(null);
        customerReportButton.setContentAreaFilled(false);

        javax.swing.GroupLayout customerReportPanelLayout = new javax.swing.GroupLayout(customerReportPanel);
        customerReportPanel.setLayout(customerReportPanelLayout);
        customerReportPanelLayout.setHorizontalGroup(
            customerReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        customerReportPanelLayout.setVerticalGroup(
            customerReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCustomerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCustomerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(listCustomerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(customerReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(535, 535, 535))
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listCustomerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(addCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCustomerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(customerPaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        cardHolder.add(CustomerPanel, "card4");

        StaffPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Support Panel");

        javax.swing.GroupLayout StaffPanelLayout = new javax.swing.GroupLayout(StaffPanel);
        StaffPanel.setLayout(StaffPanelLayout);
        StaffPanelLayout.setHorizontalGroup(
            StaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffPanelLayout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );
        StaffPanelLayout.setVerticalGroup(
            StaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffPanelLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );

        cardHolder.add(StaffPanel, "card5");

        reportPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Report Panel");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );

        cardHolder.add(reportPanel, "card6");

        supportPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Support Panel");

        javax.swing.GroupLayout supportPanelLayout = new javax.swing.GroupLayout(supportPanel);
        supportPanel.setLayout(supportPanelLayout);
        supportPanelLayout.setHorizontalGroup(
            supportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportPanelLayout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
        );
        supportPanelLayout.setVerticalGroup(
            supportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportPanelLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        cardHolder.add(supportPanel, "card7");

        addCustomerOptions.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout addCustomerOptionsLayout = new javax.swing.GroupLayout(addCustomerOptions);
        addCustomerOptions.setLayout(addCustomerOptionsLayout);
        addCustomerOptionsLayout.setHorizontalGroup(
            addCustomerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        addCustomerOptionsLayout.setVerticalGroup(
            addCustomerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );

        cardHolder.add(addCustomerOptions, "card8");

        javax.swing.GroupLayout dashBoardPanelBGLayout = new javax.swing.GroupLayout(dashBoardPanelBG);
        dashBoardPanelBG.setLayout(dashBoardPanelBGLayout);
        dashBoardPanelBGLayout.setHorizontalGroup(
            dashBoardPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashBoardPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashBoardPanelBGLayout.setVerticalGroup(
            dashBoardPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardPanelBGLayout.createSequentialGroup()
                .addComponent(topbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(dashBoardPanelBG);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashBoardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashBoardButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(dashboardPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_dashBoardButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        cardHolder.removeAll();
        cardHolder.add(HomePanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void customerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(CustomerPanel);
        repaint();
        revalidate();

    }//GEN-LAST:event_customerButtonMouseClicked

    private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(StaffPanel);
        repaint();
        revalidate();

    }//GEN-LAST:event_staffButtonMouseClicked

    private void reportsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(reportPanel);
        repaint();
        revalidate();

    }//GEN-LAST:event_reportsButtonMouseClicked

    private void supportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(supportPanel);
        repaint();
        revalidate();

    }//GEN-LAST:event_supportButtonMouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        new loginSystem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void listOfCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listOfCustomerButtonActionPerformed

    private void addCustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerButtonMouseClicked
        // TODO add your handling code here:
        cardHolder.removeAll();
        cardHolder.add(addCustomerOptions);
        repaint();
        revalidate();
    }//GEN-LAST:event_addCustomerButtonMouseClicked

    private void addUserTopButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addUserTopButtonActionPerformed
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerBG;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel OnlineTextLabel;
    private javax.swing.JPanel ReportsBG;
    private javax.swing.JPanel StaffBG;
    private javax.swing.JPanel StaffPanel;
    private javax.swing.JPanel SupportBG;
    private javax.swing.JLabel activeCountLabel;
    private javax.swing.JLabel activeStaffTextLabel;
    private javax.swing.JLabel activeTextLabel;
    private javax.swing.JButton activeUsersTopButton;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JPanel addCustomerOptions;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JPanel addCustomerPanel1;
    private javax.swing.JButton addUserTopButton;
    private javax.swing.JPanel cardHolder;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton customerPackageButton;
    private javax.swing.JButton customerPaymentButton;
    private javax.swing.JPanel customerPaymentPanel;
    private javax.swing.JButton customerReportButton;
    private javax.swing.JPanel customerReportPanel;
    private javax.swing.JPanel dashBoardBG;
    private javax.swing.JButton dashBoardButton;
    private javax.swing.JPanel dashBoardPanelBG;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel homeBG;
    private javax.swing.JButton homeButton;
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
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel listCustomerPanel3;
    private javax.swing.JButton listCustomerTopButton;
    private javax.swing.JButton listOfCustomerButton;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton notificationButtonTop;
    private javax.swing.JLabel onLeaveTextLabel;
    private javax.swing.JLabel onlineCountLabel;
    private javax.swing.JLabel photoHolder;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JPanel searchCustomerPanel2;
    private javax.swing.JLabel staffActiveCount;
    private javax.swing.JButton staffButton;
    private javax.swing.JLabel staffLeaveCount;
    private javax.swing.JButton supportButton;
    private javax.swing.JPanel supportPanel;
    private javax.swing.JButton todoButton;
    private javax.swing.JPanel topbarPanel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel userStatusPanel;
    // End of variables declaration//GEN-END:variables
}
