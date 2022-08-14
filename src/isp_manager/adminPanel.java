package isp_manager;

import java.awt.*;
import java.sql.*;

import javax.lang.model.util.ElementScanner14;

import java.awt.event.*;

public class adminPanel extends javax.swing.JFrame {

        javax.swing.JPanel custPanel;
        javax.swing.JPanel stffPanel;
        javax.swing.JPanel rprtPanel;
        javax.swing.JPanel suppPanel;
        javax.swing.JPanel addCustOptPanel;

        CardLayout cards;
        Connection con;
        Statement stm;
        ResultSet rs;
        String who;

        String userId, username, contactNo, mailAddress, passwd;
        String name;
        
        int totalStaffInt, onLeaveStaffInt;
        int totalCustomerInt, inactiveCustomerInt;
        
        String tStaff, tLeave, tStaffActive;
        String tCustomer, tInactive, tCustomerActive;

        public adminPanel(String id) throws Exception {
                Class.forName("org.sqlite.JDBC"); // Driver available
                con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
                stm = con.createStatement(); // statement created
                rs = stm.executeQuery("select * from admin"); // Query executed
                who = id;

                while (rs.next()) {
                        if (who.equals(rs.getString(1))) {
                                userId = rs.getString(1);
                                name = rs.getString(2);
                                username = rs.getString(3);
                                mailAddress = rs.getString(4);
                                passwd = rs.getString(5);
                                contactNo = rs.getString(6);
                                break;
                        }
                }
                
                rs = stm.executeQuery("select * from staff");
                while(rs.next())    {
                    totalStaffInt += 1;
                    String tempStat = rs.getString(5);
                    if(tempStat.equals("false"))
                        onLeaveStaffInt += 1;
                }
                
                rs = stm.executeQuery("select * from customer");
                while(rs.next())    {
                    totalCustomerInt += 1;
                    String tempStat = rs.getString(5);
                    if(tempStat.equals("false"))
                        inactiveCustomerInt += 1;
                }
                
                tStaff = "" + totalStaffInt;
                tLeave = "" + onLeaveStaffInt;
                tStaffActive = "" + (totalStaffInt - onLeaveStaffInt);
                
                tCustomer = "" + totalCustomerInt;
                tInactive = "" + inactiveCustomerInt;
                tCustomerActive = "" + (totalCustomerInt - inactiveCustomerInt);
                
                rs.close();
                con.close();
                initComponents();

                cards = (CardLayout) (cardHolder.getLayout());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
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
        customerBG = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        custIcon = new javax.swing.JLabel();
        staffBG = new javax.swing.JPanel();
        staffButton = new javax.swing.JButton();
        staffIcon = new javax.swing.JLabel();
        reportsBG = new javax.swing.JPanel();
        reportsButton = new javax.swing.JButton();
        reportIcon = new javax.swing.JLabel();
        logOutBG = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        logIcon = new javax.swing.JLabel();
        settingsBG = new javax.swing.JPanel();
        settingsIcon = new javax.swing.JLabel();
        settingsButton = new javax.swing.JButton();
        dashBoardPanelBG = new javax.swing.JPanel();
        topbarPanel = new javax.swing.JPanel();
        photoHolder = new javax.swing.JLabel();
        adminNameHolder = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        cardHolder = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        staffPanel = new javax.swing.JPanel();
        staffLabel = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        settingsLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalStaff = new javax.swing.JLabel();
        activeStaff = new javax.swing.JLabel();
        leaveStaff = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalCustomer = new javax.swing.JLabel();
        inactiveCust = new javax.swing.JLabel();
        activeCust = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISP Manager");
        setResizable(false);

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(0);

        leftPanel.setBackground(new java.awt.Color(44, 44, 44));

        logoPanel.setBackground(new java.awt.Color(204, 204, 204));
        logoPanel.setLayout(new java.awt.GridLayout(1, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/ISPManager_86.png"))); // NOI18N

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashBoardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashBoardButtonMouseExited(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
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

        customerBG.setBackground(new java.awt.Color(44, 44, 44));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerButtonMouseExited(evt);
            }
        });

        custIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/customer(1).png"))); // NOI18N

        javax.swing.GroupLayout customerBGLayout = new javax.swing.GroupLayout(customerBG);
        customerBG.setLayout(customerBGLayout);
        customerBGLayout.setHorizontalGroup(
            customerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        customerBGLayout.setVerticalGroup(
            customerBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custIcon)
                .addContainerGap())
        );

        staffBG.setBackground(new java.awt.Color(44, 44, 44));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffButtonMouseExited(evt);
            }
        });
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        staffIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/teamwork.png"))); // NOI18N

        javax.swing.GroupLayout staffBGLayout = new javax.swing.GroupLayout(staffBG);
        staffBG.setLayout(staffBGLayout);
        staffBGLayout.setHorizontalGroup(
            staffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        staffBGLayout.setVerticalGroup(
            staffBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffIcon)
                .addContainerGap())
        );

        reportsBG.setBackground(new java.awt.Color(44, 44, 44));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsButtonMouseExited(evt);
            }
        });

        reportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/report(1).png"))); // NOI18N

        javax.swing.GroupLayout reportsBGLayout = new javax.swing.GroupLayout(reportsBG);
        reportsBG.setLayout(reportsBGLayout);
        reportsBGLayout.setHorizontalGroup(
            reportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportsBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        reportsBGLayout.setVerticalGroup(
            reportsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(reportsBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon)
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
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
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        logOutBGLayout.setVerticalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(logOutBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsBG.setBackground(new java.awt.Color(44, 44, 44));

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/setting.png"))); // NOI18N

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout settingsBGLayout = new javax.swing.GroupLayout(settingsBG);
        settingsBG.setLayout(settingsBGLayout);
        settingsBGLayout.setHorizontalGroup(
            settingsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsBGLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(settingsIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        settingsBGLayout.setVerticalGroup(
            settingsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staffBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(homeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customerBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(homeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashBoardBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(logOutBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftPanel);

        dashBoardPanelBG.setBackground(new java.awt.Color(44, 44, 44));
        dashBoardPanelBG.setForeground(new java.awt.Color(44, 44, 44));

        topbarPanel.setBackground(new java.awt.Color(44, 44, 44));

        if(username.equals("admin.rigan"))
        photoHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/rigan.jpg")));
        else if (username.equals("admin.sajjad"))photoHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/sajjad.jpg")));
        else if (username.equals("admin.summit"))photoHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/summitsir.jpg")));
        else {photoHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/userImage_B10_2_100x101.png")));
        }

        adminNameHolder.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        adminNameHolder.setForeground(new java.awt.Color(204, 204, 204));
        adminNameHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adminNameHolder.setText(name);

        userNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        userNameLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNameLabel.setText(username);

        javax.swing.GroupLayout topbarPanelLayout = new javax.swing.GroupLayout(topbarPanel);
        topbarPanel.setLayout(topbarPanelLayout);
        topbarPanelLayout.setHorizontalGroup(
            topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNameHolder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photoHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topbarPanelLayout.setVerticalGroup(
            topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(topbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topbarPanelLayout.createSequentialGroup()
                        .addComponent(adminNameHolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameLabel))))
        );

        cardHolder.setBackground(new java.awt.Color(44, 44, 44));
        cardHolder.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(44, 44, 44));

        homePanel.setBackground(new java.awt.Color(44, 44, 44));
        homePanel.setForeground(new java.awt.Color(44, 44, 44));

        homeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(204, 204, 204));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/business-report_86pc.png"))); // NOI18N
        homeLabel.setText("Dashboard");
        homeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        staffPanel.setBackground(new java.awt.Color(44, 44, 44));

        staffLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        staffLabel.setForeground(new java.awt.Color(204, 204, 204));
        staffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/teamwork86px.png"))); // NOI18N
        staffLabel.setText("Staff");
        staffLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        staffLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        staffLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout staffPanelLayout = new javax.swing.GroupLayout(staffPanel);
        staffPanel.setLayout(staffPanelLayout);
        staffPanelLayout.setHorizontalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        staffPanelLayout.setVerticalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        customerPanel.setBackground(new java.awt.Color(44, 44, 44));

        customerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(204, 204, 204));
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/customer86px.png"))); // NOI18N
        customerLabel.setText("Customers");
        customerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        reportPanel.setBackground(new java.awt.Color(44, 44, 44));

        reportLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(204, 204, 204));
        reportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/report86px.png"))); // NOI18N
        reportLabel.setText("Reports");
        reportLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        reportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingsPanel.setBackground(new java.awt.Color(44, 44, 44));

        settingsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(204, 204, 204));
        settingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/setting86px.png"))); // NOI18N
        settingsLabel.setText("Settings");
        settingsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settingsLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(staffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addGap(157, 157, 157))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        cardHolder.add(HomePanel, "card3");

        dashboardPanel.setBackground(new java.awt.Color(44, 44, 44));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Total Staff ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Staff ");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("On Leave");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Active");

        totalStaff.setBackground(new java.awt.Color(204, 204, 204));
        totalStaff.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        totalStaff.setForeground(new java.awt.Color(204, 204, 204));
        totalStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalStaff.setText(tStaff);

        activeStaff.setBackground(new java.awt.Color(204, 204, 204));
        activeStaff.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        activeStaff.setForeground(new java.awt.Color(204, 204, 204));
        activeStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeStaff.setText(tStaffActive);

        leaveStaff.setBackground(new java.awt.Color(204, 204, 204));
        leaveStaff.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        leaveStaff.setForeground(new java.awt.Color(204, 204, 204));
        leaveStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leaveStaff.setText(tLeave);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Customer");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Total Customer");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Inactive");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Active");

        totalCustomer.setBackground(new java.awt.Color(204, 204, 204));
        totalCustomer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        totalCustomer.setForeground(new java.awt.Color(204, 204, 204));
        totalCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalCustomer.setText(tCustomer);

        inactiveCust.setBackground(new java.awt.Color(204, 204, 204));
        inactiveCust.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inactiveCust.setForeground(new java.awt.Color(204, 204, 204));
        inactiveCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inactiveCust.setText(tInactive);

        activeCust.setBackground(new java.awt.Color(204, 204, 204));
        activeCust.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        activeCust.setForeground(new java.awt.Color(204, 204, 204));
        activeCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeCust.setText(tCustomerActive);

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dashboardPanelLayout.createSequentialGroup()
                                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leaveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inactiveCust, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activeCust, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inactiveCust, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeCust, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(387, 387, 387))
        );

        cardHolder.add(dashboardPanel, "card2");

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

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homePanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homePanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_homeLabelMouseExited

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked

                cardHolder.removeAll();
                cardHolder.add(dashboardPanel);
                repaint();
                revalidate();
        
    }//GEN-LAST:event_homeLabelMouseClicked

    private void customerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseEntered
        customerPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_customerLabelMouseEntered

    private void customerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseExited
        customerPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_customerLabelMouseExited

    private void customerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseClicked
            try {
                custPanel = new customerPanel(who);
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
            } catch (Exception e)   {}
    }//GEN-LAST:event_customerLabelMouseClicked

    private void staffLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLabelMouseEntered
        staffPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_staffLabelMouseEntered

    private void staffLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLabelMouseExited
        staffPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_staffLabelMouseExited

    private void staffLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLabelMouseClicked
            try {
                custPanel = new staffPanel(who);
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
            } catch (Exception e)   {}
    }//GEN-LAST:event_staffLabelMouseClicked

    private void reportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseEntered
        reportPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_reportLabelMouseEntered

    private void reportLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseExited
        reportPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_reportLabelMouseExited

    private void reportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseClicked
            try {
                custPanel = new reportPanel();
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
            } catch (Exception e)   {}
    }//GEN-LAST:event_reportLabelMouseClicked

    private void settingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseEntered
        settingsPanel.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_settingsLabelMouseEntered

    private void settingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseExited
        settingsPanel.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_settingsLabelMouseExited

    private void settingsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseClicked
            try {
                custPanel = new settingsPanel(who);
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
            } catch (Exception e)   {}
    }//GEN-LAST:event_settingsLabelMouseClicked

        private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_homeButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_homeButtonActionPerformed

        private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {
                custPanel = new settingsPanel(who);
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
        }

        private void customerButtonMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                custPanel = new customerPanel(who);
            } catch (Exception e)   {}
                cardHolder.removeAll();
                cardHolder.add(custPanel);
                repaint();
                revalidate();
        }

        private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {
        }

        private void dashBoardButtonMouseEntered(java.awt.event.MouseEvent evt) {
                dashBoardBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void dashBoardButtonMouseExited(java.awt.event.MouseEvent evt) {
                dashBoardBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {
                homeBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {
                homeBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void customerButtonMouseEntered(java.awt.event.MouseEvent evt) {
                customerBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void customerButtonMouseExited(java.awt.event.MouseEvent evt) {
                customerBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void staffButtonMouseEntered(java.awt.event.MouseEvent evt) {
                staffBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void staffButtonMouseExited(java.awt.event.MouseEvent evt) {
                staffBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void reportsButtonMouseEntered(java.awt.event.MouseEvent evt) {
                reportsBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void reportsButtonMouseExited(java.awt.event.MouseEvent evt) {
                reportsBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {
                settingsBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {
                settingsBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {
                logOutBG.setBackground(new java.awt.Color(33, 33, 33));
        }

        private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {
                logOutBG.setBackground(new java.awt.Color(44, 44, 44));
        }

        private void dashBoardButtonMouseClicked(java.awt.event.MouseEvent evt) {
                cardHolder.removeAll();
                cardHolder.add(dashboardPanel);
                repaint();
                revalidate();
        }

        private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {
                cardHolder.removeAll();
                cardHolder.add(HomePanel);
                repaint();
                revalidate();
        }

        private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {
                stffPanel = new staffPanel(who);
                cardHolder.removeAll();
                cardHolder.add(stffPanel);
                repaint();
                revalidate();

        }

        private void reportsButtonMouseClicked(java.awt.event.MouseEvent evt) {
                rprtPanel = new reportPanel();
                cardHolder.removeAll();
                cardHolder.add(rprtPanel);
                repaint();
                revalidate();

        }

        private void supportButtonMouseClicked(java.awt.event.MouseEvent evt) {
                suppPanel = new settingsPanel(who);
                cardHolder.removeAll();
                cardHolder.add(suppPanel);
                repaint();
                revalidate();

        }

        private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {
                new loginSystem().setVisible(true);
                this.dispose();
        }

        private void addUserTopButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addUserTopButtonActionPerformed
        }

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                // new adminPanel().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel activeCust;
    private javax.swing.JLabel activeStaff;
    private javax.swing.JLabel adminNameHolder;
    private javax.swing.JPanel cardHolder;
    private javax.swing.JLabel custIcon;
    private javax.swing.JPanel customerBG;
    private javax.swing.JButton customerButton;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JPanel dashBoardBG;
    private javax.swing.JButton dashBoardButton;
    private javax.swing.JPanel dashBoardPanelBG;
    private javax.swing.JLabel dashIcon;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel homeBG;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel inactiveCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel leaveStaff;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logIcon;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel photoHolder;
    private javax.swing.JLabel reportIcon;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel reportsBG;
    private javax.swing.JButton reportsButton;
    private javax.swing.JPanel settingsBG;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JPanel staffBG;
    private javax.swing.JButton staffButton;
    private javax.swing.JLabel staffIcon;
    private javax.swing.JLabel staffLabel;
    private javax.swing.JPanel staffPanel;
    private javax.swing.JPanel topbarPanel;
    private javax.swing.JLabel totalCustomer;
    private javax.swing.JLabel totalStaff;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
