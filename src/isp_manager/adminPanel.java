package isp_manager;

import java.awt.*;
import java.awt.event.*;

public class adminPanel extends javax.swing.JFrame {
    
    javax.swing.JPanel custPanel;
    javax.swing.JPanel stffPanel;
    javax.swing.JPanel rprtPanel;
    javax.swing.JPanel suppPanel;
    javax.swing.JPanel addCustOptPanel;
    
    CardLayout cards;

    public adminPanel() {
        initComponents();

        cards = (CardLayout) (cardHolder.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        dashBoardBG = new javax.swing.JPanel();
        dashBoardButton = new javax.swing.JButton();
        dashIcon = new javax.swing.JLabel();
        homeBG = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        homeIcon = new javax.swing.JLabel();
        CustomerBG = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        custIcon = new javax.swing.JLabel();
        StaffBG = new javax.swing.JPanel();
        staffButton = new javax.swing.JButton();
        staffIcon = new javax.swing.JLabel();
        ReportsBG = new javax.swing.JPanel();
        reportsButton = new javax.swing.JButton();
        reportIcon = new javax.swing.JLabel();
        SettingsBG = new javax.swing.JPanel();
        settingsButton = new javax.swing.JButton();
        settingsIcon = new javax.swing.JLabel();
        logOutBG = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        logIcon = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(0);

        leftPanel.setBackground(new java.awt.Color(44, 44, 44));

        logoPanel.setBackground(new java.awt.Color(204, 204, 204));
        logoPanel.setLayout(new java.awt.GridLayout(1, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/logo_1_80.png"))); // NOI18N

        dashBoardBG.setBackground(new java.awt.Color(44, 44, 44));

        dashBoardButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dashBoardButton.setForeground(new java.awt.Color(204, 204, 204));
        dashBoardButton.setText("Dashboard");
        dashBoardButton.setBorder(null);
        dashBoardButton.setContentAreaFilled(false);
        dashBoardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dashBoardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashBoardButtonMouseClicked(evt);
            }
        });

        dashIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/business-report.png"))); // NOI18N

        javax.swing.GroupLayout dashBoardBGLayout = new javax.swing.GroupLayout(dashBoardBG);
        dashBoardBG.setLayout(dashBoardBGLayout);
        dashBoardBGLayout.setHorizontalGroup(
            dashBoardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        dashBoardBGLayout.setVerticalGroup(
            dashBoardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(dashIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homeBG.setBackground(new java.awt.Color(44, 44, 44));

        homeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(204, 204, 204));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setContentAreaFilled(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/home.png"))); // NOI18N

        javax.swing.GroupLayout homeBGLayout = new javax.swing.GroupLayout(homeBG);
        homeBG.setLayout(homeBGLayout);
        homeBGLayout.setHorizontalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        homeBGLayout.setVerticalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CustomerBG.setBackground(new java.awt.Color(44, 44, 44));

        customerButton.setBackground(new java.awt.Color(204, 204, 204));
        customerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerButton.setForeground(new java.awt.Color(204, 204, 204));
        customerButton.setText("Customers");
        customerButton.setBorder(null);
        customerButton.setContentAreaFilled(false);
        customerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        customerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerButtonMouseClicked(evt);
            }
        });

        custIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/customer(1).png"))); // NOI18N

        javax.swing.GroupLayout CustomerBGLayout = new javax.swing.GroupLayout(CustomerBG);
        CustomerBG.setLayout(CustomerBGLayout);
        CustomerBGLayout.setHorizontalGroup(
            CustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        CustomerBGLayout.setVerticalGroup(
            CustomerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custIcon)
                .addContainerGap())
        );

        StaffBG.setBackground(new java.awt.Color(44, 44, 44));

        staffButton.setBackground(new java.awt.Color(204, 204, 204));
        staffButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        staffButton.setForeground(new java.awt.Color(204, 204, 204));
        staffButton.setText("Staff");
        staffButton.setBorder(null);
        staffButton.setContentAreaFilled(false);
        staffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        staffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButtonMouseClicked(evt);
            }
        });
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        staffIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/teamwork.png"))); // NOI18N

        javax.swing.GroupLayout StaffBGLayout = new javax.swing.GroupLayout(StaffBG);
        StaffBG.setLayout(StaffBGLayout);
        StaffBGLayout.setHorizontalGroup(
            StaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        StaffBGLayout.setVerticalGroup(
            StaffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffIcon)
                .addContainerGap())
        );

        ReportsBG.setBackground(new java.awt.Color(44, 44, 44));

        reportsButton.setBackground(new java.awt.Color(204, 204, 204));
        reportsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        reportsButton.setForeground(new java.awt.Color(204, 204, 204));
        reportsButton.setText("Reports");
        reportsButton.setBorder(null);
        reportsButton.setContentAreaFilled(false);
        reportsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        reportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsButtonMouseClicked(evt);
            }
        });

        reportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/report(1).png"))); // NOI18N

        javax.swing.GroupLayout ReportsBGLayout = new javax.swing.GroupLayout(ReportsBG);
        ReportsBG.setLayout(ReportsBGLayout);
        ReportsBGLayout.setHorizontalGroup(
            ReportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        ReportsBGLayout.setVerticalGroup(
            ReportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReportsBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SettingsBG.setBackground(new java.awt.Color(44, 44, 44));

        settingsButton.setBackground(new java.awt.Color(204, 204, 204));
        settingsButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(204, 204, 204));
        settingsButton.setText("Settings");
        settingsButton.setBorder(null);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/setting.png"))); // NOI18N

        javax.swing.GroupLayout SettingsBGLayout = new javax.swing.GroupLayout(SettingsBG);
        SettingsBG.setLayout(SettingsBGLayout);
        SettingsBGLayout.setHorizontalGroup(
            SettingsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsBGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(settingsIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        SettingsBGLayout.setVerticalGroup(
            SettingsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SettingsBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logOutBG.setBackground(new java.awt.Color(44, 44, 44));

        logOutButton.setBackground(new java.awt.Color(204, 204, 204));
        logOutButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(204, 204, 204));
        logOutButton.setText("Log out");
        logOutButton.setBorder(null);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });

        logIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/log-out.png"))); // NOI18N

        javax.swing.GroupLayout logOutBGLayout = new javax.swing.GroupLayout(logOutBG);
        logOutBG.setLayout(logOutBGLayout);
        logOutBGLayout.setHorizontalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutBGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logOutBGLayout.setVerticalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(logOutBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(homeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CustomerBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ReportsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SettingsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
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
                .addComponent(SettingsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(logOutBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftPanel);

        dashBoardPanelBG.setBackground(new java.awt.Color(44, 44, 44));

        topbarPanel.setBackground(new java.awt.Color(44, 44, 44));

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

        dashboardPanel.setBackground(new java.awt.Color(44, 44, 44));

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
                .addContainerGap(365, Short.MAX_VALUE))
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
                .addContainerGap(490, Short.MAX_VALUE)
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

    private void customerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerButtonMouseClicked
        // TODO add your handling code here:
        custPanel = new customerPanel();
        cardHolder.removeAll();
        cardHolder.add(custPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_customerButtonMouseClicked

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffButtonActionPerformed

    private void dashBoardButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dashBoardButtonMouseClicked
        cardHolder.removeAll();
        cardHolder.add(dashboardPanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_dashBoardButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        cardHolder.removeAll();
        cardHolder.add(HomePanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_homeButtonMouseClicked


    private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_staffButtonMouseClicked
        stffPanel = new staffPanel();
        cardHolder.removeAll();
        cardHolder.add(stffPanel);
        repaint();
        revalidate();

    }// GEN-LAST:event_staffButtonMouseClicked

    private void reportsButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_reportsButtonMouseClicked
        rprtPanel = new reportPanel();
        cardHolder.removeAll();
        cardHolder.add(rprtPanel);
        repaint();
        revalidate();

    }// GEN-LAST:event_reportsButtonMouseClicked

    private void supportButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_supportButtonMouseClicked
        suppPanel = new supportPanel();
        cardHolder.removeAll();
        cardHolder.add(suppPanel);
        repaint();
        revalidate();

    }// GEN-LAST:event_supportButtonMouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        new loginSystem().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_logOutButtonMouseClicked

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
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel OnlineTextLabel;
    private javax.swing.JPanel ReportsBG;
    private javax.swing.JPanel SettingsBG;
    private javax.swing.JPanel StaffBG;
    private javax.swing.JLabel activeCountLabel;
    private javax.swing.JLabel activeStaffTextLabel;
    private javax.swing.JLabel activeTextLabel;
    private javax.swing.JButton activeUsersTopButton;
    private javax.swing.JButton addUserTopButton;
    private javax.swing.JPanel cardHolder;
    private javax.swing.JLabel custIcon;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel dashBoardBG;
    private javax.swing.JButton dashBoardButton;
    private javax.swing.JPanel dashBoardPanelBG;
    private javax.swing.JLabel dashIcon;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel homeBG;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton listCustomerTopButton;
    private javax.swing.JLabel logIcon;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton notificationButtonTop;
    private javax.swing.JLabel onLeaveTextLabel;
    private javax.swing.JLabel onlineCountLabel;
    private javax.swing.JLabel photoHolder;
    private javax.swing.JLabel reportIcon;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JLabel staffActiveCount;
    private javax.swing.JButton staffButton;
    private javax.swing.JLabel staffIcon;
    private javax.swing.JLabel staffLeaveCount;
    private javax.swing.JButton todoButton;
    private javax.swing.JPanel topbarPanel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel userStatusPanel;
    // End of variables declaration//GEN-END:variables
}
