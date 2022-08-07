package isp_manager;

public class customerUserPanel extends javax.swing.JFrame {

        public customerUserPanel() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        homeBG = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        billBG = new javax.swing.JPanel();
        billButton = new javax.swing.JLabel();
        planBG = new javax.swing.JPanel();
        planButton = new javax.swing.JLabel();
        cardBG = new javax.swing.JPanel();
        holder = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text8 = new javax.swing.JLabel();
        uID = new javax.swing.JLabel();
        contNo = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        pack = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        stat = new javax.swing.JLabel();
        customerPhoto = new javax.swing.JLabel();
        billPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        planPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logOutBG = new javax.swing.JPanel();
        logOutButton = new javax.swing.JLabel();
        settingsBG = new javax.swing.JPanel();
        settingsButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BG.setBackground(new java.awt.Color(44, 44, 44));

        topPanel.setBackground(new java.awt.Color(44, 44, 44));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/logo_10.png"))); // NOI18N

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        homeBG.setBackground(new java.awt.Color(44, 44, 44));

        homeButton.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        homeButton.setForeground(new java.awt.Color(204, 204, 204));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/home.png"))); // NOI18N
        homeButton.setText("Home");
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

        javax.swing.GroupLayout homeBGLayout = new javax.swing.GroupLayout(homeBG);
        homeBG.setLayout(homeBGLayout);
        homeBGLayout.setHorizontalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeBGLayout.setVerticalGroup(
            homeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        billBG.setBackground(new java.awt.Color(44, 44, 44));

        billButton.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        billButton.setForeground(new java.awt.Color(204, 204, 204));
        billButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/money.png"))); // NOI18N
        billButton.setText("Pay Bill");
        billButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout billBGLayout = new javax.swing.GroupLayout(billBG);
        billBG.setLayout(billBGLayout);
        billBGLayout.setHorizontalGroup(
            billBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billBGLayout.setVerticalGroup(
            billBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        planBG.setBackground(new java.awt.Color(44, 44, 44));

        planButton.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        planButton.setForeground(new java.awt.Color(204, 204, 204));
        planButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/speedometer.png"))); // NOI18N
        planButton.setText("Change Plan");
        planButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                planButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                planButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout planBGLayout = new javax.swing.GroupLayout(planBG);
        planBG.setLayout(planBGLayout);
        planBGLayout.setHorizontalGroup(
            planBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        planBGLayout.setVerticalGroup(
            planBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        cardBG.setBackground(new java.awt.Color(44, 44, 44));

        holder.setBackground(new java.awt.Color(44, 44, 44));
        holder.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(44, 44, 44));

        text.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(204, 204, 204));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("User Info");

        text1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(204, 204, 204));
        text1.setText("UserID :");

        name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Customer Name Here");

        text3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text3.setForeground(new java.awt.Color(204, 204, 204));
        text3.setText("Username :");

        text4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text4.setForeground(new java.awt.Color(204, 204, 204));
        text4.setText("Contact No. :");

        text5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text5.setForeground(new java.awt.Color(204, 204, 204));
        text5.setText("Email Address :");

        text6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text6.setForeground(new java.awt.Color(204, 204, 204));
        text6.setText("Package :");

        text8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text8.setForeground(new java.awt.Color(204, 204, 204));
        text8.setText("Active status :");

        uID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uID.setForeground(new java.awt.Color(204, 204, 204));
        uID.setText("userID here");

        contNo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        contNo.setForeground(new java.awt.Color(204, 204, 204));
        contNo.setText("01XXX XXXXXX");

        uname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(204, 204, 204));
        uname.setText("username here");

        pack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pack.setForeground(new java.awt.Color(204, 204, 204));
        pack.setText("(package status here)");

        mail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(204, 204, 204));
        mail.setText("xxxxyyyy@mail.com");

        jPanel1.setBackground(new java.awt.Color(0, 168, 30));

        stat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(204, 204, 204));
        stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat.setText("Active");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        customerPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/profile(1).png"))); // NOI18N

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(customerPhoto))
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        holder.add(homePanel, "card4");
        homePanel.getAccessibleContext().setAccessibleName("");

        billPanel.setBackground(new java.awt.Color(44, 44, 44));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Pay Bill");

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addGap(455, 455, 455)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addContainerGap(560, Short.MAX_VALUE))
        );

        holder.add(billPanel, "card3");

        planPanel.setBackground(new java.awt.Color(44, 44, 44));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Change Plan");

        javax.swing.GroupLayout planPanelLayout = new javax.swing.GroupLayout(planPanel);
        planPanel.setLayout(planPanelLayout);
        planPanelLayout.setHorizontalGroup(
            planPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planPanelLayout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        planPanelLayout.setVerticalGroup(
            planPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel3)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        holder.add(planPanel, "card4");

        javax.swing.GroupLayout cardBGLayout = new javax.swing.GroupLayout(cardBG);
        cardBG.setLayout(cardBGLayout);
        cardBGLayout.setHorizontalGroup(
            cardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cardBGLayout.setVerticalGroup(
            cardBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        logOutBG.setBackground(new java.awt.Color(44, 44, 44));

        logOutButton.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(204, 204, 204));
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/log-out.png"))); // NOI18N
        logOutButton.setText("Log out");
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

        javax.swing.GroupLayout logOutBGLayout = new javax.swing.GroupLayout(logOutBG);
        logOutBG.setLayout(logOutBGLayout);
        logOutBGLayout.setHorizontalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logOutBGLayout.setVerticalGroup(
            logOutBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        settingsBG.setBackground(new java.awt.Color(44, 44, 44));

        settingsButton.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(204, 204, 204));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/setting.png"))); // NOI18N
        settingsButton.setText("Settings");
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addContainerGap()
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsBGLayout.setVerticalGroup(
            settingsBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(planBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(homeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(planBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settingsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        holder.removeAll();
        holder.add(homePanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void billButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billButtonMouseClicked
        holder.removeAll();
        holder.add(billPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_billButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_homeButtonMouseExited

    private void billButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billButtonMouseEntered
        billBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_billButtonMouseEntered

    private void billButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billButtonMouseExited
        billBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_billButtonMouseExited

    private void planButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planButtonMouseEntered
        planBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_planButtonMouseEntered

    private void planButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planButtonMouseExited
        planBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_planButtonMouseExited

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void planButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planButtonMouseClicked
        holder.removeAll();
        holder.add(planPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_planButtonMouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        this.dispose();
        new loginSystem().setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_settingsButtonMouseExited

        private void payBillButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_payBillButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_payBillButtonActionPerformed

        private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logOutButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_logOutButtonActionPerformed

        private void changePlanButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changePlanButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_changePlanButtonActionPerformed

        private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_homeButtonActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_homeButtonActionPerformed

        public static void main(String args[]) {

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new customerUserPanel().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel billBG;
    private javax.swing.JLabel billButton;
    private javax.swing.JPanel billPanel;
    private javax.swing.JPanel cardBG;
    private javax.swing.JLabel contNo;
    private javax.swing.JLabel customerPhoto;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel homeBG;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pack;
    private javax.swing.JPanel planBG;
    private javax.swing.JLabel planButton;
    private javax.swing.JPanel planPanel;
    private javax.swing.JPanel settingsBG;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JLabel stat;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text8;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel uID;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
