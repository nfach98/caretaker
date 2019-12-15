package caretaker;

import caretaker.adapter.PlayerAdapter;
import caretaker.helper.Database;
import caretaker.model.Pemain;
import caretaker.utils.SmartImageIcon;
import caretaker.viewmodel.AppStack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Main extends javax.swing.JPanel{
    static Main mainPanel;
    
    int active;
    ArrayList<JLabel> labels = new ArrayList<>();
    PlayerAdapter adapter;
    JPopupMenu pMenu;
    
    public Main() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileTab = new javax.swing.JPanel();
        pelatihLabel = new javax.swing.JLabel();
        timLabel = new javax.swing.JLabel();
        imagePelatih = new javax.swing.JLabel();
        pelatihMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tab = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        skuat = new javax.swing.JLabel();
        tim = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        field = new javax.swing.JPanel();
        fieldLineUp = new javax.swing.JPanel();
        fieldBack = new javax.swing.JLabel();
        info = new javax.swing.JScrollPane();
        infoContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bestPlayerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reccomPanel = new javax.swing.JPanel();
        skuatPanel = new javax.swing.JPanel();
        skuatScroll = new javax.swing.JScrollPane();
        skuatContainer = new javax.swing.JPanel();
        timPanel = new javax.swing.JScrollPane();
        timContent = new javax.swing.JPanel();
        profil = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnEdit = new keeptoo.KButton();
        timProfil = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        timLogo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        timJersey = new javax.swing.JLabel();
        timJerseyGk = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        susunan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRekom = new keeptoo.KButton();
        timSusunan = new javax.swing.JPanel();
        timSkuat = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timSkuatContainer = new javax.swing.JPanel();
        timField = new javax.swing.JPanel();
        timFieldLineUp = new javax.swing.JPanel();
        timFieldBack = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        profileTab.setBackground(new java.awt.Color(42, 105, 222));
        profileTab.setPreferredSize(new java.awt.Dimension(674, 72));

        pelatihLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        pelatihLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelatihLabel.setText("Nama Pelatih");

        timLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        timLabel.setForeground(new java.awt.Color(255, 255, 255));
        timLabel.setText("Tim");

        imagePelatih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pelatihMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelatihMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_arrow.png"))); // NOI18N
        pelatihMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelatihMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imagePelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timLabel)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addComponent(pelatihLabel)
                        .addGap(6, 6, 6)
                        .addComponent(pelatihMenu)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagePelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pelatihMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pelatihLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(timLabel)))
                .addGap(8, 8, 8))
        );

        add(profileTab, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tab.setOpaque(false);
        tab.setPreferredSize(new java.awt.Dimension(726, 56));
        tab.setLayout(new java.awt.GridLayout(1, 3));

        home.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(42, 105, 222));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.setMaximumSize(new java.awt.Dimension(32767, 32767));
        tab.add(home);

        skuat.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        skuat.setForeground(new java.awt.Color(153, 153, 153));
        skuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skuat.setText("Skuat");
        skuat.setMaximumSize(new java.awt.Dimension(32767, 32767));
        tab.add(skuat);

        tim.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tim.setForeground(new java.awt.Color(153, 153, 153));
        tim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tim.setText("Tim");
        tim.setMaximumSize(new java.awt.Dimension(32767, 32767));
        tab.add(tim);

        jPanel1.add(tab, java.awt.BorderLayout.PAGE_START);

        main.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(null);

        field.setBackground(new java.awt.Color(0, 102, 255));
        field.setMinimumSize(new java.awt.Dimension(0, 0));
        field.setPreferredSize(new java.awt.Dimension(300, 454));
        field.setLayout(new javax.swing.OverlayLayout(field));

        fieldLineUp.setBackground(new java.awt.Color(102, 102, 255));
        fieldLineUp.setOpaque(false);
        fieldLineUp.setPreferredSize(new java.awt.Dimension(300, 454));

        javax.swing.GroupLayout fieldLineUpLayout = new javax.swing.GroupLayout(fieldLineUp);
        fieldLineUp.setLayout(fieldLineUpLayout);
        fieldLineUpLayout.setHorizontalGroup(
            fieldLineUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        fieldLineUpLayout.setVerticalGroup(
            fieldLineUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        field.add(fieldLineUp);

        fieldBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/field_y.jpg"))); // NOI18N
        fieldBack.setText("jLabel6");
        field.add(fieldBack);

        homePanel.add(field);
        field.setBounds(460, 0, 290, 454);

        info.setBorder(null);
        info.setForeground(new java.awt.Color(42, 105, 222));
        info.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        infoContent.setBackground(new java.awt.Color(255, 255, 255));
        infoContent.setPreferredSize(new java.awt.Dimension(459, 576));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 105, 222));
        jLabel1.setText("Pemain Terbaik");

        bestPlayerPanel.setPreferredSize(new java.awt.Dimension(541, 180));

        javax.swing.GroupLayout bestPlayerPanelLayout = new javax.swing.GroupLayout(bestPlayerPanel);
        bestPlayerPanel.setLayout(bestPlayerPanelLayout);
        bestPlayerPanelLayout.setHorizontalGroup(
            bestPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bestPlayerPanelLayout.setVerticalGroup(
            bestPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 105, 222));
        jLabel2.setText("Rekomendasi Formasi");

        reccomPanel.setPreferredSize(new java.awt.Dimension(541, 240));

        javax.swing.GroupLayout reccomPanelLayout = new javax.swing.GroupLayout(reccomPanel);
        reccomPanel.setLayout(reccomPanelLayout);
        reccomPanelLayout.setHorizontalGroup(
            reccomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        reccomPanelLayout.setVerticalGroup(
            reccomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout infoContentLayout = new javax.swing.GroupLayout(infoContent);
        infoContent.setLayout(infoContentLayout);
        infoContentLayout.setHorizontalGroup(
            infoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(infoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reccomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(bestPlayerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        infoContentLayout.setVerticalGroup(
            infoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(bestPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(reccomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        info.setViewportView(infoContent);

        homePanel.add(info);
        info.setBounds(0, 0, 459, 455);

        main.add(homePanel, "card2");

        skuatPanel.setLayout(new java.awt.BorderLayout(2, 0));

        skuatScroll.setBorder(null);
        skuatScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        skuatContainer.setBackground(new java.awt.Color(255, 255, 255));
        skuatContainer.setPreferredSize(new java.awt.Dimension(749, 1000));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20);
        flowLayout1.setAlignOnBaseline(true);
        skuatContainer.setLayout(flowLayout1);
        skuatScroll.setViewportView(skuatContainer);

        skuatPanel.add(skuatScroll, java.awt.BorderLayout.CENTER);

        main.add(skuatPanel, "card3");

        timPanel.setBorder(null);
        timPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        timContent.setBackground(new java.awt.Color(255, 255, 255));
        timContent.setOpaque(false);
        timContent.setLayout(new javax.swing.BoxLayout(timContent, javax.swing.BoxLayout.Y_AXIS));

        profil.setBackground(new java.awt.Color(255, 255, 255));
        profil.setPreferredSize(new java.awt.Dimension(794, 56));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 105, 222));
        jLabel7.setText("Profil Tim");

        btnEdit.setText("Edit");
        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEdit.setkEndColor(new java.awt.Color(42, 105, 222));
        btnEdit.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        btnEdit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEdit.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        btnEdit.setkPressedColor(new java.awt.Color(42, 105, 222));
        btnEdit.setkSelectedColor(new java.awt.Color(42, 105, 222));
        btnEdit.setkStartColor(new java.awt.Color(42, 105, 222));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilLayout = new javax.swing.GroupLayout(profil);
        profil.setLayout(profilLayout);
        profilLayout.setHorizontalGroup(
            profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        profilLayout.setVerticalGroup(
            profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        timContent.add(profil);

        timProfil.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setOpaque(false);

        timLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 105, 222));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Logo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel8);

        jPanel7.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 105, 222));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Jersey");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 105, 222));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Jersey GK");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timJersey, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timJerseyGk, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timJerseyGk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timJersey, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel7);

        javax.swing.GroupLayout timProfilLayout = new javax.swing.GroupLayout(timProfil);
        timProfil.setLayout(timProfilLayout);
        timProfilLayout.setHorizontalGroup(
            timProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timProfilLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        timProfilLayout.setVerticalGroup(
            timProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timProfilLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        timContent.add(timProfil);

        susunan.setBackground(new java.awt.Color(255, 255, 255));
        susunan.setPreferredSize(new java.awt.Dimension(794, 56));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 105, 222));
        jLabel5.setText("Susunan Pemain");

        btnRekom.setText("Rekomendasi");
        btnRekom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRekom.setkEndColor(new java.awt.Color(42, 105, 222));
        btnRekom.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        btnRekom.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnRekom.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        btnRekom.setkPressedColor(new java.awt.Color(42, 105, 222));
        btnRekom.setkSelectedColor(new java.awt.Color(42, 105, 222));
        btnRekom.setkStartColor(new java.awt.Color(42, 105, 222));

        javax.swing.GroupLayout susunanLayout = new javax.swing.GroupLayout(susunan);
        susunan.setLayout(susunanLayout);
        susunanLayout.setHorizontalGroup(
            susunanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(susunanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btnRekom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        susunanLayout.setVerticalGroup(
            susunanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(susunanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(susunanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnRekom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        timContent.add(susunan);

        timSusunan.setMinimumSize(new java.awt.Dimension(0, 0));
        timSusunan.setOpaque(false);
        timSusunan.setPreferredSize(new java.awt.Dimension(0, 400));
        timSusunan.setLayout(null);

        timSkuat.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(741, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        timSkuat.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 165));

        timSkuatContainer.setBackground(new java.awt.Color(255, 255, 255));
        timSkuatContainer.setPreferredSize(new java.awt.Dimension(150, 1500));

        javax.swing.GroupLayout timSkuatContainerLayout = new javax.swing.GroupLayout(timSkuatContainer);
        timSkuatContainer.setLayout(timSkuatContainerLayout);
        timSkuatContainerLayout.setHorizontalGroup(
            timSkuatContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        timSkuatContainerLayout.setVerticalGroup(
            timSkuatContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(timSkuatContainer);

        timSkuat.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        timSusunan.add(timSkuat);
        timSkuat.setBounds(0, 0, 460, 630);

        timField.setOpaque(false);
        timField.setPreferredSize(new java.awt.Dimension(715, 634));
        timField.setLayout(new javax.swing.OverlayLayout(timField));

        timFieldLineUp.setOpaque(false);

        javax.swing.GroupLayout timFieldLineUpLayout = new javax.swing.GroupLayout(timFieldLineUp);
        timFieldLineUp.setLayout(timFieldLineUpLayout);
        timFieldLineUpLayout.setHorizontalGroup(
            timFieldLineUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        timFieldLineUpLayout.setVerticalGroup(
            timFieldLineUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        timField.add(timFieldLineUp);

        timFieldBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timFieldBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/field_x.jpg"))); // NOI18N
        timFieldBack.setOpaque(true);
        timFieldBack.setPreferredSize(new java.awt.Dimension(715, 634));
        timField.add(timFieldBack);

        timSusunan.add(timField);
        timField.setBounds(460, 0, 280, 630);

        timContent.add(timSusunan);

        timPanel.setViewportView(timContent);

        main.add(timPanel, "card5");

        jPanel1.add(main, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        updateField();
        updateSkuatHeight();
    }//GEN-LAST:event_formComponentResized

    private void pelatihMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelatihMenuMouseClicked
        pMenu.show(this, pelatihMenu.getX(), pelatihMenu.getY() + pelatihMenu.getHeight());
    }//GEN-LAST:event_pelatihMenuMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        AppStack.push(new EditTim());
    }//GEN-LAST:event_btnEditActionPerformed

    private void init(){
        mainPanel = this;
        
        skuatContainer.setPreferredSize(new Dimension(main.getSize().width, 240));
        timLogo.setSize(150,150);
        timJersey.setSize(110,110);
        timJerseyGk.setSize(110,110);
        
        getPemain();
        active = 0;
        
        pMenu = new JPopupMenu();
        
        JMenuItem edit = new JMenuItem("Pengaturan");
        edit.addActionListener((ActionEvent e) -> {
            AppStack.push(new EditPelatih());
        });
        edit.setOpaque(true);
        edit.setForeground(new Color(42,105,222));
        edit.setBackground(Color.WHITE);
        edit.setFont(new java.awt.Font("Century Gothic", 1, 12));
        
        JMenuItem logout = new JMenuItem("Keluar");
        logout.addActionListener((ActionEvent e) -> {
            Database.currentPelatih = null;
            Database.currentTim = null;
            
            AppStack.pop();
            AppStack.push(new Login());
        });
        logout.setOpaque(true);
        logout.setForeground(new Color(42,105,222));
        logout.setBackground(Color.WHITE);
        logout.setFont(new java.awt.Font("Century Gothic", 1, 12));
        
        pMenu.add(edit);
        pMenu.add(logout);
        pMenu.setOpaque(true);
        pMenu.setBackground(Color.WHITE);
                
        imagePelatih.setBounds(imagePelatih.getX(), imagePelatih.getY(), 56, 56);
        update();
        updateField();
        labels.addAll(Arrays.asList(home,skuat,tim));
        setAdapter();
        
        for(JLabel label:labels){
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    active = labels.indexOf(label);
                    labels.get(labels.indexOf(label)).setFont(new java.awt.Font("Century Gothic", 1, 18));
                    labels.get(labels.indexOf(label)).setForeground(new Color(42,105,222));
                    for(int i=0;i<labels.size();i++){
                        if(i!=active){
                            labels.get(i).setFont(new java.awt.Font("Century Gothic", 0, 18));
                            labels.get(i).setForeground(new Color(153,153,153));
                        }
                    }
                    switch(labels.indexOf(label)){
                        case 0:
                            updateField();
                            homePanel.setVisible(true);
                            skuatPanel.setVisible(false);
                            timPanel.setVisible(false);
                            break;
                            
                        case 1:
                            updateAdapter();
                            homePanel.setVisible(false);
                            skuatPanel.setVisible(true);
                            timPanel.setVisible(false);
                            break;
                            
                        case 2:
                            updateField();
                            update();
                            homePanel.setVisible(false);
                            skuatPanel.setVisible(false);
                            timPanel.setVisible(true);
                            break;
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if(labels.indexOf(label)!=active)
                        labels.get(labels.indexOf(label)).setForeground(new Color(153,153,153));
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if(labels.indexOf(label)!=active)
                        labels.get(labels.indexOf(label)).setForeground(new Color(42,105,222));
                }
            });
        }
    }
    
    @Override
    public String getName() {
        return "Main";
    }
    
    public void setAdapter(){
        adapter = new PlayerAdapter(Database.currentTim.getPemainList());
        adapter.bindViewHolder(skuatContainer);
        updateSkuatHeight();
    }
    
    public void updateAdapter(){
        skuatContainer.removeAll();
        adapter = new PlayerAdapter(Database.currentTim.getPemainList());
        adapter.bindViewHolder(skuatContainer);
        updateSkuatHeight();
    }
    
    public void getPemain(){
        try {
            PreparedStatement ps = Database.con.prepareStatement("SELECT * FROM pemain WHERE tim=?");
            ps.setInt(1, Database.currentTim.getId());
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                Pemain p = new Pemain(resultSet.getInt("id"),
                        resultSet.getInt("tim"),
                        resultSet.getString("nama_depan"),
                        resultSet.getString("nama_tengah"),
                        resultSet.getString("nama_belakang"),
                        resultSet.getString("nama_display"),
                        resultSet.getString("posisi"),
                        resultSet.getInt("no_punggung"),
                        resultSet.getInt("asal"),
                        new SimpleDateFormat("dd/MM/yyyy").parse(resultSet.getString("tgl_lahir")),
                        ImageIO.read(resultSet.getBinaryStream("image")));
                
                p.setAttribute(resultSet.getInt("acceleration"), resultSet.getInt("sprint_speed"), 
                        resultSet.getInt("finishing"), resultSet.getInt("att_positioning"), resultSet.getInt("shot_power"), 
                        resultSet.getInt("long_shot"), resultSet.getInt("volley"), resultSet.getInt("penalty"), 
                        resultSet.getInt("vision"), resultSet.getInt("crossing"), resultSet.getInt("free_kick"), 
                        resultSet.getInt("short_pass"), resultSet.getInt("long_pass"), resultSet.getInt("curve"), 
                        resultSet.getInt("agility"), resultSet.getInt("balance"), resultSet.getInt("reaction"), 
                        resultSet.getInt("ball_control"), resultSet.getInt("dribbling"), resultSet.getInt("composure"), 
                        resultSet.getInt("interception"), resultSet.getInt("heading"), resultSet.getInt("marking"), 
                        resultSet.getInt("stand_tackle"), resultSet.getInt("slide_tackle"), resultSet.getInt("jumping"), 
                        resultSet.getInt("stamina"), resultSet.getInt("strength"), resultSet.getInt("agression"), 
                        resultSet.getInt("diving"), resultSet.getInt("gk_kicking"), resultSet.getInt("handling"), 
                        resultSet.getInt("reflex"), resultSet.getInt("gk_position"));
                
                Database.currentTim.addPemain(p);
            }
            ps.close();
        } catch (SQLException | ParseException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Main getPanel(){
        return mainPanel;
    }
    
    public void updateSkuatHeight(){
        if(adapter.countList > 1 && skuatContainer.getWidth() > 0){
            int row = adapter.countList/((skuatContainer.getWidth()-15 - (skuatContainer.getWidth()-15)/200*20)/200);
            if(adapter.countList%((skuatContainer.getWidth()-15 - (skuatContainer.getWidth()-15)/200*20)/200) > 0){
                row++;
            }
            skuatContainer.setPreferredSize(new Dimension(getWidth()-15, 220*row + 20));
        }
    }
    
    public void updateField(){
        switch(active){
            case 0:
                Image img0 = new ImageIcon(getClass().getResource("/res/field_y.jpg")).getImage();
                float ratio0 = (float) img0.getWidth(null) / (float) img0.getHeight(null);

                int heightField0 = main.getSize().height;
                int widthField0 = (int) (heightField0 * ratio0);

                if(widthField0 > 0 && heightField0 > 0)
                    fieldBack.setIcon(new ImageIcon(img0.getScaledInstance(widthField0, 
                            heightField0, 
                            Image.SCALE_SMOOTH)));
                
                info.setSize(new Dimension(main.getWidth() - widthField0, heightField0));
                field.setBounds(info.getWidth(), 0, widthField0, heightField0);
                fieldLineUp.setBounds(0, 0, widthField0, heightField0);
                fieldBack.setBounds(0, 0, widthField0, heightField0);
                break;
                
            case 2:
                Image img2 = new ImageIcon(getClass().getResource("/res/field_y.jpg")).getImage();
                float ratio2 = (float) img2.getWidth(null) / (float) img2.getHeight(null);
                
                int heightField2 =  timField.getSize().height;
                int widthField2 = (int) (heightField2 * ratio2);
                
                if(widthField2 > 0 && heightField2 > 0)
                    timFieldBack.setIcon(new ImageIcon(img2.getScaledInstance(widthField2, heightField2, Image.SCALE_SMOOTH)));
                
                timSusunan.setSize(main.getSize().width, heightField2);
                timSkuat.setBounds(0, 0, main.getSize().width - widthField2, heightField2);
                timField.setBounds(timSkuat.getWidth(), 0, widthField2, heightField2);
                timFieldLineUp.setBounds(0, 0, widthField2, heightField2);
                timFieldBack.setBounds(0, 0, widthField2, heightField2);
                
                timContent.setPreferredSize(new Dimension(main.getSize().width, 
                        112 + timSusunan.getHeight() + timProfil.getHeight()));
                break;
        }
    }
    
    public void update(){
        pelatihLabel.setText(Database.currentPelatih.getNama());
        timLabel.setText(Database.currentTim.getNama());
        imagePelatih.setIcon(new SmartImageIcon(Database.currentPelatih.getImage(), imagePelatih));
        
        switch(active){
            case 2:
                timLogo.setIcon(new SmartImageIcon(Database.currentTim.getLogo(), timLogo));
                timJersey.setIcon(new SmartImageIcon(Database.currentTim.getJersey(), timJersey));
                timJerseyGk.setIcon(new SmartImageIcon(Database.currentTim.getJerseyGk(), timJerseyGk));
                break;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bestPlayerPanel;
    private keeptoo.KButton btnEdit;
    private keeptoo.KButton btnRekom;
    private javax.swing.JPanel field;
    private javax.swing.JLabel fieldBack;
    private javax.swing.JPanel fieldLineUp;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel imagePelatih;
    private javax.swing.JScrollPane info;
    private javax.swing.JPanel infoContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel main;
    private javax.swing.JLabel pelatihLabel;
    private javax.swing.JLabel pelatihMenu;
    private javax.swing.JPanel profil;
    private javax.swing.JPanel profileTab;
    private javax.swing.JPanel reccomPanel;
    private javax.swing.JLabel skuat;
    private static javax.swing.JPanel skuatContainer;
    private javax.swing.JPanel skuatPanel;
    private javax.swing.JScrollPane skuatScroll;
    private javax.swing.JPanel susunan;
    private javax.swing.JPanel tab;
    private javax.swing.JLabel tim;
    private javax.swing.JPanel timContent;
    private javax.swing.JPanel timField;
    private javax.swing.JLabel timFieldBack;
    private javax.swing.JPanel timFieldLineUp;
    private javax.swing.JLabel timJersey;
    private javax.swing.JLabel timJerseyGk;
    private javax.swing.JLabel timLabel;
    private javax.swing.JLabel timLogo;
    private javax.swing.JScrollPane timPanel;
    private javax.swing.JPanel timProfil;
    private javax.swing.JPanel timSkuat;
    private javax.swing.JPanel timSkuatContainer;
    private javax.swing.JPanel timSusunan;
    // End of variables declaration//GEN-END:variables
}
