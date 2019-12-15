package caretaker;

import caretaker.helper.Database;
import caretaker.utils.Password;
import caretaker.utils.SmartImageIcon;
import caretaker.view.Toolbar;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class EditPelatih extends javax.swing.JPanel {

    FileDialog fd = new FileDialog(App.getFrame(), "Pilih foto", FileDialog.LOAD);
    String image_path;
    
    ArrayList<JLabel> menuText = new ArrayList<>();
    int active;
    
    public EditPelatih() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panEdit = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        uploadBtn = new keeptoo.KButton();
        jLabel5 = new javax.swing.JLabel();
        imagePelatih = new javax.swing.JLabel();
        subBtn = new keeptoo.KButton();
        cancelBtn = new javax.swing.JLabel();
        panDel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        delBtn = new keeptoo.KButton();
        cancelDelBtn = new javax.swing.JLabel();
        panPassVer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        passField = new javax.swing.JPasswordField();
        verBtn = new keeptoo.KButton();
        panPass = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        passChgField1 = new javax.swing.JPasswordField();
        passChgField2 = new javax.swing.JPasswordField();
        subPassBtn = new keeptoo.KButton();
        cancelPassBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(42, 105, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 485));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(42, 105, 222));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 180));
        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edit Profil");
        jPanel3.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ganti Kata Sandi");
        jPanel3.add(jLabel4);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hapus Akun");
        jPanel3.add(jLabel6);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel1.setLayout(new java.awt.CardLayout());

        panEdit.setBackground(new java.awt.Color(255, 255, 255));

        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 105, 222));
        jLabel1.setText("Nama");

        jPanel8.setBackground(new java.awt.Color(42, 105, 222));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        userField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userField.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 105, 222));
        jLabel2.setText("Nama pengguna");

        jPanel6.setBackground(new java.awt.Color(42, 105, 222));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        uploadBtn.setText("Pilih");
        uploadBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        uploadBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        uploadBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        uploadBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        uploadBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        uploadBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        uploadBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        uploadBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        uploadBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 105, 222));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Foto");

        imagePelatih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        subBtn.setText("Ubah");
        subBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        subBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        subBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        subBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        subBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        subBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        subBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        subBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(42, 105, 222));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("Batal");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panEditLayout = new javax.swing.GroupLayout(panEdit);
        panEdit.setLayout(panEditLayout);
        panEditLayout.setHorizontalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditLayout.createSequentialGroup()
                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditLayout.createSequentialGroup()
                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panEditLayout.createSequentialGroup()
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panEditLayout.createSequentialGroup()
                                .addComponent(imagePelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(userField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(41, 41, 41))))
        );
        panEditLayout.setVerticalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditLayout.createSequentialGroup()
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(imagePelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        jPanel1.add(panEdit, "card5");

        panDel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 105, 222));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" Data profil pelatih termasuk seluruh data tim akan dihapus");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PERINGATAN :");

        delBtn.setText("Hapus");
        delBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        delBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        delBtn.setkEndColor(new java.awt.Color(255, 0, 0));
        delBtn.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        delBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        delBtn.setkHoverStartColor(new java.awt.Color(230, 30, 30));
        delBtn.setkPressedColor(new java.awt.Color(255, 0, 0));
        delBtn.setkSelectedColor(new java.awt.Color(255, 0, 0));
        delBtn.setkStartColor(new java.awt.Color(255, 0, 0));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        cancelDelBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelDelBtn.setForeground(new java.awt.Color(42, 105, 222));
        cancelDelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelDelBtn.setText("Batal");
        cancelDelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelDelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panDelLayout = new javax.swing.GroupLayout(panDel);
        panDel.setLayout(panDelLayout);
        panDelLayout.setHorizontalGroup(
            panDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(panDelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelDelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDelLayout.setVerticalGroup(
            panDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDelLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(panDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jPanel1.add(panDel, "card2");

        panPassVer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 105, 222));
        jLabel7.setText("Masukkan kata sandi");

        jPanel9.setBackground(new java.awt.Color(42, 105, 222));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        passField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passField.setBorder(null);

        verBtn.setText("Lanjut");
        verBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        verBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        verBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        verBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        verBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        verBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        verBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        verBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        verBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        verBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPassVerLayout = new javax.swing.GroupLayout(panPassVer);
        panPassVer.setLayout(panPassVerLayout);
        panPassVerLayout.setHorizontalGroup(
            panPassVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPassVerLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panPassVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(panPassVerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panPassVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(verBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panPassVerLayout.setVerticalGroup(
            panPassVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPassVerLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(verBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jPanel1.add(panPassVer, "card3");

        panPass.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 105, 222));
        jLabel8.setText("Kata sandi");

        jPanel11.setBackground(new java.awt.Color(42, 105, 222));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 105, 222));
        jLabel9.setText("Konfirmasi");

        jPanel7.setBackground(new java.awt.Color(42, 105, 222));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        passChgField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passChgField1.setBorder(null);

        passChgField2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passChgField2.setBorder(null);

        subPassBtn.setText("Ubah");
        subPassBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        subPassBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        subPassBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        subPassBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        subPassBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subPassBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        subPassBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        subPassBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        subPassBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        subPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subPassBtnActionPerformed(evt);
            }
        });

        cancelPassBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelPassBtn.setForeground(new java.awt.Color(42, 105, 222));
        cancelPassBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelPassBtn.setText("Batal");
        cancelPassBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelPassBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panPassLayout = new javax.swing.GroupLayout(panPass);
        panPass.setLayout(panPassLayout);
        panPassLayout.setHorizontalGroup(
            panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPassLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(passChgField1)
                    .addComponent(passChgField2))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panPassLayout.setVerticalGroup(
            panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPassLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passChgField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passChgField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        jPanel1.add(panPass, "card4");

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        
    }//GEN-LAST:event_subBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        fd.setFile("*.jpg;*.jpeg;*.png;*.gif");
        fd.setVisible(true);
        String name = fd.getDirectory() + fd.getFile();
        if(name != null){
            image_path = name;
            imagePelatih.setIcon(new SmartImageIcon(image_path, imagePelatih));
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        imagePelatih.setIcon(new SmartImageIcon(Database.currentPelatih.getImage(), imagePelatih));
        nameField.setText(Database.currentPelatih.getNama());
        userField.setText(Database.currentPelatih.getUsername());
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void verBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBtnActionPerformed
        try {
            PreparedStatement ps = Database.con.prepareStatement("SELECT * FROM pelatih WHERE username=? AND password=?");
            ps.setString(1, Database.currentPelatih.getUsername());
            ps.setString(2, new Password(String.valueOf(passField.getPassword())).hashPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                switch(active){
                    case 1:
                        panEdit.setVisible(false);
                        panPassVer.setVisible(false);
                        panPass.setVisible(true);
                        panDel.setVisible(false);
                        break;
                        
                    case 2:
                        panEdit.setVisible(false);
                        panPassVer.setVisible(false);
                        panPass.setVisible(false);
                        panDel.setVisible(true);
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditPelatih.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verBtnActionPerformed

    private void subPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subPassBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subPassBtnActionPerformed

    private void cancelPassBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPassBtnMouseClicked
        resetPassField();
        panEdit.setVisible(false);
        panPassVer.setVisible(true);
        panPass.setVisible(false);
        panDel.setVisible(false);
    }//GEN-LAST:event_cancelPassBtnMouseClicked

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

    private void cancelDelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelDelBtnMouseClicked
        resetPassField();
        panEdit.setVisible(false);
        panPassVer.setVisible(true);
        panPass.setVisible(false);
        panDel.setVisible(false);
    }//GEN-LAST:event_cancelDelBtnMouseClicked

    private void init() {
        Toolbar toolbar = new Toolbar(){
            @Override
            public void backClicked() {
                super.backClicked();
                Main.getPanel().update();
            }
        };
        toolbar.addToolbar(this);
        toolbar.setBackButtonEnabled(true);
        
        imagePelatih.setSize(100, 100);
        
        active = 0;
        
        menuText.addAll(Arrays.asList(jLabel3,jLabel4,jLabel6));
        
        imagePelatih.setIcon(new SmartImageIcon(Database.currentPelatih.getImage(), imagePelatih));
        nameField.setText(Database.currentPelatih.getNama());
        userField.setText(Database.currentPelatih.getUsername());
        
        for(JLabel p: menuText){
            p.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseExited(MouseEvent e) {
                    menuText.get(menuText.indexOf(p)).setForeground(new Color(255,255,255));
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    menuText.get(menuText.indexOf(p)).setForeground(new Color(190,190,190));
                }
                
                @Override
                public void mouseClicked(MouseEvent e) {
                    active = menuText.indexOf(p);
                    menuText.get(menuText.indexOf(p)).setFont(new java.awt.Font("Century Gothic", 1, 16));
                    for(int i=0;i<menuText.size();i++){
                        if(i!=active){
                            menuText.get(i).setFont(new java.awt.Font("Century Gothic", 0, 16));
                        }
                    }
                    
                    switch(menuText.indexOf(p)){
                        case 0:
                            panEdit.setVisible(true);
                            panPassVer.setVisible(false);
                            panPass.setVisible(false);
                            panDel.setVisible(false);
                            break;
                        case 1:
                            resetPassField();
                            panEdit.setVisible(false);
                            panPassVer.setVisible(true);
                            panPass.setVisible(false);
                            panDel.setVisible(false);
                            break;
                        case 2:
                            resetPassField();
                            panEdit.setVisible(false);
                            panPassVer.setVisible(true);
                            panPass.setVisible(false);
                            panDel.setVisible(false);
                            break;
                    }
                    
                }
                
            });
        }
    }
    
    private void resetPassField(){
        passField.setText("");
    }
    
    @Override
    public String getName() {
        return "Pengaturan";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel cancelDelBtn;
    private javax.swing.JLabel cancelPassBtn;
    private keeptoo.KButton delBtn;
    private javax.swing.JLabel imagePelatih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panDel;
    private javax.swing.JPanel panEdit;
    private javax.swing.JPanel panPass;
    private javax.swing.JPanel panPassVer;
    private javax.swing.JPasswordField passChgField1;
    private javax.swing.JPasswordField passChgField2;
    private javax.swing.JPasswordField passField;
    private keeptoo.KButton subBtn;
    private keeptoo.KButton subPassBtn;
    private keeptoo.KButton uploadBtn;
    private javax.swing.JTextField userField;
    private keeptoo.KButton verBtn;
    // End of variables declaration//GEN-END:variables

    
}
