package isp_manager;

import java.sql.*;

public class staffUserPanel extends javax.swing.JFrame {
    
    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement st;
    
    String userId, username, contactNo, mailAddress, nameStaff;
    String actStat, passwd, role;
    int salary;
    String who;
    
    public staffUserPanel(String id) throws Exception {
        Class.forName("org.sqlite.JDBC"); // Driver available
        con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
        stm = con.createStatement(); // statement created
        st = con.prepareStatement("update staff set password = ? where id = ?");
        rs = stm.executeQuery("select * from staff"); // Query executed
        
                who = id;
        while (rs.next()) {
            if (who.equals(rs.getString(1))) {
                userId = rs.getString(1);
                nameStaff = rs.getString(2);
                username = rs.getString(3);
                passwd = rs.getString(4);
                actStat = rs.getString(5);
                salary = rs.getInt(6);
                role = rs.getString(7);
                mailAddress = rs.getString(8);
                contactNo = rs.getString(9);
                break;
            }
        }
        
        stm.close();
        st.close();
        rs.close();
        con.close();
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG3 = new javax.swing.JPanel();
        topPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        homeBG = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        billBG = new javax.swing.JPanel();
        settingsBG = new javax.swing.JPanel();
        settingsButton = new javax.swing.JLabel();
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
        pack1 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        setPassBG = new javax.swing.JPanel();
        passChange = new javax.swing.JLabel();
        settingsCardHolder = new javax.swing.JPanel();
        settingsHolder = new javax.swing.JPanel();
        defPanel = new javax.swing.JPanel();
        passChanger = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISP Maanager");
        setResizable(false);

        BG3.setBackground(new java.awt.Color(44, 44, 44));

        topPanel3.setBackground(new java.awt.Color(44, 44, 44));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isp_manager/resources/ISPManager_86px.png"))); // NOI18N

        javax.swing.GroupLayout topPanel3Layout = new javax.swing.GroupLayout(topPanel3);
        topPanel3.setLayout(topPanel3Layout);
        topPanel3Layout.setHorizontalGroup(
            topPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanel3Layout.setVerticalGroup(
            topPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout billBGLayout = new javax.swing.GroupLayout(billBG);
        billBG.setLayout(billBGLayout);
        billBGLayout.setHorizontalGroup(
            billBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billBGLayout.setVerticalGroup(
            billBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardBG.setBackground(new java.awt.Color(44, 44, 44));

        holder.setBackground(new java.awt.Color(44, 44, 44));
        holder.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(44, 44, 44));

        text.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(204, 204, 204));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Staff Info");

        text1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(204, 204, 204));
        text1.setText("UserID :");

        name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText(nameStaff);

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
        text6.setText("Role :");

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
        pack.setText(role);

        mail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(204, 204, 204));
        mail.setText(mailAddress);

        if(actStat.equals("true"))
        jPanel1.setBackground(new java.awt.Color(0, 168, 30));
        else
        jPanel1.setBackground(new java.awt.Color(197, 0, 0));

        stat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(204, 204, 204));
        stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(actStat.equals("true"))
        stat.setText("Active");
        else if (actStat.equals("false"))
        stat.setText("On leave");

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

        pack1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pack1.setForeground(new java.awt.Color(204, 204, 204));
        pack1.setText(Integer.toString(salary));

        text7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text7.setForeground(new java.awt.Color(204, 204, 204));
        text7.setText("Salary :");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(pack1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerPhoto))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pack1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        holder.add(homePanel, "card4");

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

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Enter new password :");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Re-type :");

        currentPass.setBackground(new java.awt.Color(38, 38, 38));
        currentPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        currentPass.setForeground(new java.awt.Color(204, 204, 204));
        currentPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        newPass.setBackground(new java.awt.Color(38, 38, 38));
        newPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newPass.setForeground(new java.awt.Color(204, 204, 204));
        newPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        newPass1.setBackground(new java.awt.Color(38, 38, 38));
        newPass1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newPass1.setForeground(new java.awt.Color(204, 204, 204));
        newPass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

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
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentPass, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(newPass, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(newPass1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(cancelPassBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        passChangerLayout.setVerticalGroup(
            passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passChangerLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(alertLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(passChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
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

        javax.swing.GroupLayout BG3Layout = new javax.swing.GroupLayout(BG3);
        BG3.setLayout(BG3Layout);
        BG3Layout.setHorizontalGroup(
            BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BG3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG3Layout.setVerticalGroup(
            BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG3Layout.createSequentialGroup()
                .addComponent(topPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cardBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(BG3Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(homeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_homeButtonMouseExited

    private void passChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passChangeMouseClicked
        settingsHolder.removeAll();
        settingsHolder.add(passChanger);
        repaint();
        revalidate();
    }//GEN-LAST:event_passChangeMouseClicked

    private void passChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passChangeMouseEntered
        setPassBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_passChangeMouseEntered

    private void passChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passChangeMouseExited
        setPassBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_passChangeMouseExited

    private void confirmPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPassMouseClicked
        String temp = currentPass.getText();
        String temp1 = newPass.getText();
        String temp2 = newPass1.getText();

        if (!temp.equals(passwd)) {
            alertLabelPass.setText("Wrong password");
            alertLabelPass.setForeground(new java.awt.Color(204, 204, 204));
        } else if (!temp1.equals(temp2)) {
            alertLabelPass.setText("Passwords do not match");
            alertLabelPass.setForeground(new java.awt.Color(204, 204, 204));
        } else if (temp1.equals(passwd)) {
            alertLabelPass.setText("Enter a new password");
            alertLabelPass.setForeground(new java.awt.Color(204,204,204));
        } else {
            try {
             Class.forName("org.sqlite.JDBC"); // Driver available
             con = DriverManager.getConnection("jdbc:sqlite:isp_manager.db"); // established connection
             stm = con.createStatement(); // statement created
             st = con.prepareStatement("update staff set password = ? where id = ?");
             rs = stm.executeQuery("select * from staff"); // Query executed
             
             st.setString(1, temp1);
             st.setString(2, who);
             st.executeUpdate();
             
             alertLabelPass.setText("Password updated");
             alertLabelPass.setForeground(new java.awt.Color(204,204,204));
             
             stm.close();
             st.close();
             rs.close();
             con.close();
        }   catch (Exception e) {}
        }
    }//GEN-LAST:event_confirmPassMouseClicked

    private void confirmPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPassMouseEntered
        confirmPassBG.setBackground(new java.awt.Color(29,78, 168));
    }//GEN-LAST:event_confirmPassMouseEntered

    private void confirmPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPassMouseExited
        confirmPassBG.setBackground(new java.awt.Color(67,88,210));
    }//GEN-LAST:event_confirmPassMouseExited

    private void cancellPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancellPassMouseClicked
        settingsHolder.removeAll();
        settingsHolder.add(defPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_cancellPassMouseClicked

    private void cancellPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancellPassMouseEntered
        cancelPassBG.setBackground(new java.awt.Color(38,38,38));
    }//GEN-LAST:event_cancellPassMouseEntered

    private void cancellPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancellPassMouseExited
        cancelPassBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_cancellPassMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        this.dispose();
        new loginSystem().setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        holder.removeAll();
        holder.add(settingsPanel);
        repaint();
        revalidate();
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsBG.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsBG.setBackground(new java.awt.Color(44,44,44));
    }//GEN-LAST:event_settingsButtonMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new staffUserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG3;
    private javax.swing.JLabel alertLabelPass;
    private javax.swing.JPanel billBG;
    private javax.swing.JPanel cancelPassBG;
    private javax.swing.JLabel cancellPass;
    private javax.swing.JPanel cardBG;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JPanel confirmPassBG;
    private javax.swing.JLabel contNo;
    private javax.swing.JPasswordField currentPass;
    private javax.swing.JLabel customerPhoto;
    private javax.swing.JPanel defPanel;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel homeBG;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logOutBG;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField newPass1;
    private javax.swing.JLabel pack;
    private javax.swing.JLabel pack1;
    private javax.swing.JLabel passChange;
    private javax.swing.JPanel passChanger;
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
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JPanel topPanel3;
    private javax.swing.JLabel uID;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
