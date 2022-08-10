package isp_manager;

import java.sql.*;

public class customerUserPanel extends javax.swing.JFrame {
    String who;
    Connection con;
    Statement stm;
    ResultSet rs;

    String userId, username, contactNo, mailAddress, bandwith, nameCust;
    String actStat, passwd;
    int credit;

    public customerUserPanel(String id) throws Exception {
        Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.createStatement(); // statement created
        rs = stm.executeQuery("select * from customer"); // Query executed
        who = id;
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                userId = rs.getString(1);
                username = rs.getString(4);
                contactNo = rs.getString(10);
                mailAddress = rs.getString(11);
                bandwith = rs.getString(7);
                nameCust = rs.getString(3);
                actStat = rs.getString(9);
                credit = rs.getInt(8);
                passwd = rs.getString(6);
                break;
            }
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        payConfirmBG = new javax.swing.JPanel();
        confirmPay = new javax.swing.JLabel();
        creditTotal = new javax.swing.JLabel();
        billTotal = new javax.swing.JLabel();
        passwordBill = new javax.swing.JPasswordField();
        settingsPanel = new javax.swing.JPanel();
        setPassBG = new javax.swing.JPanel();
        passChange = new javax.swing.JLabel();
        settingsCardHolder = new javax.swing.JPanel();
        settingsHolder = new javax.swing.JPanel();
        defPanel = new javax.swing.JPanel();
        passChanger = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        currentPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        newPass1 = new javax.swing.JPasswordField();
        confirmPassBG = new javax.swing.JPanel();
        confirmPass = new javax.swing.JLabel();
        cancelPassBG = new javax.swing.JPanel();
        cancellPass = new javax.swing.JLabel();
        alertLabelPass = new javax.swing.JLabel();
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
        name.setText(nameCust);

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
        uID.setText(userId);

        contNo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        contNo.setForeground(new java.awt.Color(204, 204, 204));
        contNo.setText(contactNo);

        uname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(204, 204, 204));
        uname.setText(username);

        pack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pack.setForeground(new java.awt.Color(204, 204, 204));
        pack.setText(bandwith);

        mail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(204, 204, 204));
        mail.setText(mailAddress);

        jPanel1.setBackground(new java.awt.Color(0, 168, 30));

        stat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(204, 204, 204));
        stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(actStat.equals("true"))
        stat.setText("Active");
        else
        stat.setText("Inactive");

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
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Pay Bill");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Bill :");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enter Password :");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Total credit :");

        payConfirmBG.setBackground(new java.awt.Color(10, 125, 55));

        confirmPay.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        confirmPay.setForeground(new java.awt.Color(204, 204, 204));
        confirmPay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPay.setText("Confirm");
        confirmPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmPayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmPayMouseExited(evt);
            }
        });

        javax.swing.GroupLayout payConfirmBGLayout = new javax.swing.GroupLayout(payConfirmBG);
        payConfirmBG.setLayout(payConfirmBGLayout);
        payConfirmBGLayout.setHorizontalGroup(
            payConfirmBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmPay, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        payConfirmBGLayout.setVerticalGroup(
            payConfirmBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payConfirmBGLayout.createSequentialGroup()
                .addComponent(confirmPay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        creditTotal.setBackground(new java.awt.Color(204, 204, 204));
        creditTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        creditTotal.setForeground(new java.awt.Color(204, 204, 204));
        creditTotal.setText("total credit here");

        billTotal.setBackground(new java.awt.Color(204, 204, 204));
        billTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        billTotal.setForeground(new java.awt.Color(204, 204, 204));
        billTotal.setText("(bill here)");

        passwordBill.setBackground(new java.awt.Color(44, 44, 44));
        passwordBill.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordBill.setForeground(new java.awt.Color(204, 204, 204));
        passwordBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPanelLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382))
            .addGroup(billPanelLayout.createSequentialGroup()
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(payConfirmBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(creditTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(billTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordBill, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(102, 102, 102)
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(passwordBill))
                .addGap(35, 35, 35)
                .addComponent(payConfirmBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        holder.add(billPanel, "card3");

        settingsPanel.setBackground(new java.awt.Color(44, 44, 44));

        setPassBG.setBackground(new java.awt.Color(44, 44, 44));

        passChange.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passChange.setForeground(new java.awt.Color(204, 204, 204));
        passChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passChange.setText("Change Password");
        passChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passChangeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passChangeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout setPassBGLayout = new javax.swing.GroupLayout(setPassBG);
        setPassBG.setLayout(setPassBGLayout);
        setPassBGLayout.setHorizontalGroup(
            setPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setPassBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passChange, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setPassBGLayout.setVerticalGroup(
            setPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        settingsCardHolder.setBackground(new java.awt.Color(44, 44, 44));

        settingsHolder.setBackground(new java.awt.Color(44, 44, 44));
        settingsHolder.setLayout(new java.awt.CardLayout());

        defPanel.setBackground(new java.awt.Color(44, 44, 44));

        javax.swing.GroupLayout defPanelLayout = new javax.swing.GroupLayout(defPanel);
        defPanel.setLayout(defPanelLayout);
        defPanelLayout.setHorizontalGroup(
            defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        defPanelLayout.setVerticalGroup(
            defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        settingsHolder.add(defPanel, "card3");

        passChanger.setBackground(new java.awt.Color(44, 44, 44));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter your current password :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Enter new password :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Re-type :");

        currentPass.setBackground(new java.awt.Color(38, 38, 38));
        currentPass.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        currentPass.setForeground(new java.awt.Color(204, 204, 204));
        currentPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        newPass.setBackground(new java.awt.Color(38, 38, 38));
        newPass.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        newPass.setForeground(new java.awt.Color(204, 204, 204));
        newPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        newPass1.setBackground(new java.awt.Color(38, 38, 38));
        newPass1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        newPass1.setForeground(new java.awt.Color(204, 204, 204));
        newPass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        newPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPass1ActionPerformed(evt);
            }
        });

        confirmPassBG.setBackground(new java.awt.Color(67, 88, 210));

        confirmPass.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        confirmPass.setForeground(new java.awt.Color(204, 204, 204));
        confirmPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPass.setText("Confirm");
        confirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmPassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout confirmPassBGLayout = new javax.swing.GroupLayout(confirmPassBG);
        confirmPassBG.setLayout(confirmPassBGLayout);
        confirmPassBGLayout.setHorizontalGroup(
            confirmPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPassBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmPass, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        confirmPassBGLayout.setVerticalGroup(
            confirmPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cancelPassBG.setBackground(new java.awt.Color(44, 44, 44));
        cancelPassBG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        cancellPass.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        cancellPass.setForeground(new java.awt.Color(204, 204, 204));
        cancellPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancellPass.setText("Cancel");
        cancellPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancellPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancellPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancellPassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelPassBGLayout = new javax.swing.GroupLayout(cancelPassBG);
        cancelPassBG.setLayout(cancelPassBGLayout);
        cancelPassBGLayout.setHorizontalGroup(
            cancelPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelPassBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancellPass, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelPassBGLayout.setVerticalGroup(
            cancelPassBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancellPass, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        alertLabelPass.setText("jLabel1");

        javax.swing.GroupLayout passChangerLayout = new javax.swing.GroupLayout(passChanger);
        passChanger.setLayout(passChangerLayout);
        passChangerLayout.setHorizontalGroup(
            passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passChangerLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPassBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelPassBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        passChangerLayout.setVerticalGroup(
            passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passChangerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(alertLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(90, 90, 90)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmPassBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelPassBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        settingsHolder.add(passChanger, "card2");

        javax.swing.GroupLayout settingsCardHolderLayout = new javax.swing.GroupLayout(settingsCardHolder);
        settingsCardHolder.setLayout(settingsCardHolderLayout);
        settingsCardHolderLayout.setHorizontalGroup(
            settingsCardHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsCardHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        settingsCardHolderLayout.setVerticalGroup(
            settingsCardHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsCardHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(setPassBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(settingsCardHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(setPassBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(settingsCardHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        holder.add(settingsPanel, "card5");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void newPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPass1ActionPerformed

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseClicked
        holder.removeAll();
        holder.add(homePanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_homeButtonMouseClicked

    private void billButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseClicked
        holder.removeAll();
        holder.add(billPanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_billButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseEntered
        homeBG.setBackground(new java.awt.Color(51, 51, 51));
    }// GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseExited
        homeBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_homeButtonMouseExited

    private void billButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseEntered
        billBG.setBackground(new java.awt.Color(51, 51, 51));
    }// GEN-LAST:event_billButtonMouseEntered

    private void billButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseExited
        billBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_billButtonMouseExited

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logOutButtonMouseEntered
        logOutBG.setBackground(new java.awt.Color(51, 51, 51));
    }// GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logOutButtonMouseExited
        logOutBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_logOutButtonMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logOutButtonMouseClicked
        this.dispose();
        new loginSystem().setVisible(true);
    }// GEN-LAST:event_logOutButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_settingsButtonMouseEntered
        settingsBG.setBackground(new java.awt.Color(51, 51, 51));
    }// GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_settingsButtonMouseExited
        settingsBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_settingsButtonMouseExited

    private void confirmPayMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPayMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_confirmPayMouseClicked

    private void confirmPayMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPayMouseEntered
        payConfirmBG.setBackground(new java.awt.Color(10, 137, 70));
    }// GEN-LAST:event_confirmPayMouseEntered

    private void confirmPayMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPayMouseExited
        payConfirmBG.setBackground(new java.awt.Color(10, 125, 55));
    }// GEN-LAST:event_confirmPayMouseExited

    private void confirmPassMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPassMouseEntered
        confirmPassBG.setBackground(new java.awt.Color(29, 78, 168));
    }// GEN-LAST:event_confirmPassMouseEntered

    private void cancellPassMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancellPassMouseEntered
        cancelPassBG.setBackground(new java.awt.Color(38, 38, 38));
    }// GEN-LAST:event_cancellPassMouseEntered

    private void cancellPassMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancellPassMouseExited
        cancelPassBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_cancellPassMouseExited

    private void cancellPassMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancellPassMouseClicked
        settingsHolder.removeAll();
        settingsHolder.add(defPanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_cancellPassMouseClicked

    private void confirmPassMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPassMouseExited
        confirmPassBG.setBackground(new java.awt.Color(67, 88, 210));
    }// GEN-LAST:event_confirmPassMouseExited

    private void confirmPassMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_confirmPassMouseClicked
        String temp = currentPass.getText();
        String temp1 = newPass.getText();
        String temp2 = newPass1.getText();

        if (!temp.equals(passwd)) {
            alertLabelPass.setText("Wrong password");
            alertLabelPass.setForeground(new java.awt.Color(204, 204, 204));
        } else if (!temp1.equals(temp2)) {
            alertLabelPass.setText("Passwords do not match");
            alertLabelPass.setForeground(new java.awt.Color(204, 204, 204));
        } else {

        }

    }// GEN-LAST:event_confirmPassMouseClicked

    private void passChangeMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passChangeMouseEntered
        setPassBG.setBackground(new java.awt.Color(51, 51, 51));
    }// GEN-LAST:event_passChangeMouseEntered

    private void passChangeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passChangeMouseClicked
        settingsHolder.removeAll();
        settingsHolder.add(passChanger);
        repaint();
        revalidate();
    }// GEN-LAST:event_passChangeMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_settingsButtonMouseClicked
        holder.removeAll();
        holder.add(settingsPanel);
        repaint();
        revalidate();
    }// GEN-LAST:event_settingsButtonMouseClicked

    private void passChangeMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passChangeMouseExited
        setPassBG.setBackground(new java.awt.Color(44, 44, 44));
    }// GEN-LAST:event_passChangeMouseExited

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
                // new customerUserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel alertLabelPass;
    private javax.swing.JPanel billBG;
    private javax.swing.JLabel billButton;
    private javax.swing.JPanel billPanel;
    private javax.swing.JLabel billTotal;
    private javax.swing.JPanel cancelPassBG;
    private javax.swing.JLabel cancellPass;
    private javax.swing.JPanel cardBG;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JPanel confirmPassBG;
    private javax.swing.JLabel confirmPay;
    private javax.swing.JLabel contNo;
    private javax.swing.JLabel creditTotal;
    private javax.swing.JPasswordField currentPass;
    private javax.swing.JLabel customerPhoto;
    private javax.swing.JPanel defPanel;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel homeBG;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField newPass1;
    private javax.swing.JLabel pack;
    private javax.swing.JLabel passChange;
    private javax.swing.JPanel passChanger;
    private javax.swing.JPasswordField passwordBill;
    private javax.swing.JPanel payConfirmBG;
    private javax.swing.JPanel setPassBG;
    private javax.swing.JPanel settingsBG;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JPanel settingsCardHolder;
    private javax.swing.JPanel settingsHolder;
    private javax.swing.JPanel settingsPanel;
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
