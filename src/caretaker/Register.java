package caretaker;

import caretaker.utils.Password;
import caretaker.view.Toolbar;
import caretaker.viewmodel.AppStack;
import java.awt.FileDialog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register extends javax.swing.JPanel {

    FileDialog fd = new FileDialog(App.getFrame(), "Pilih foto", FileDialog.LOAD);
    static String image_path, image_name;
    PreparedStatement ps;
    ResultSet resultSet;
    boolean samePass;
    
    static String nama, user, pass;
    
    public Register() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBackPanel = new keeptoo.KGradientPanel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uploadBtn = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passField1 = new javax.swing.JPasswordField();
        passField2 = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        regBtn = new keeptoo.KButton();
        nameFile = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        registerBackPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        registerBackPanel.setkGradientFocus(0);
        registerBackPanel.setkStartColor(new java.awt.Color(255, 255, 255));

        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setBorder(null);

        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameField.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 105, 222));
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 105, 222));
        jLabel2.setText("Nama pengguna");

        uploadBtn.setText("Unggah");
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

        jPanel4.setBackground(new java.awt.Color(42, 105, 222));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(42, 105, 222));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 15, 5));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 105, 222));
        jLabel3.setText("Kata sandi");
        jPanel6.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 105, 222));
        jLabel4.setText("Konfirmasi");
        jPanel6.add(jLabel4);

        passField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passField1.setBorder(null);
        jPanel6.add(passField1);

        passField2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passField2.setBorder(null);
        jPanel6.add(passField2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(302, 18));
        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 15, 0));

        jPanel9.setBackground(new java.awt.Color(42, 105, 222));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);

        jPanel8.setBackground(new java.awt.Color(42, 105, 222));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 105, 222));
        jLabel5.setText("Foto Profil");

        regBtn.setText("Daftar");
        regBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        regBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        regBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        regBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        regBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        regBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        regBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        regBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        regBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        nameFile.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nameFile.setText(" ");
        nameFile.setMaximumSize(new java.awt.Dimension(359, 20));
        nameFile.setMinimumSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout registerBackPanelLayout = new javax.swing.GroupLayout(registerBackPanel);
        registerBackPanel.setLayout(registerBackPanelLayout);
        registerBackPanelLayout.setHorizontalGroup(
            registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerBackPanelLayout.createSequentialGroup()
                .addGroup(registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerBackPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerBackPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerBackPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nameFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                            .addComponent(usernameField)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                            .addGroup(registerBackPanelLayout.createSequentialGroup()
                                .addGroup(registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        registerBackPanelLayout.setVerticalGroup(
            registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerBackPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(registerBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        add(registerBackPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        fd.setFile("*.jpg;*.jpeg;*.png;*.gif");
        fd.setVisible(true);
        String name = fd.getDirectory() + fd.getFile();
        if(name != null){
            image_path = name;
            image_name = fd.getFile();
        }
        if(image_name != null){
            nameFile.setText(image_name);
            System.out.println(image_path);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        samePass = String.valueOf(passField1.getPassword()).equals(String.valueOf(passField2.getPassword()));
        if(samePass && image_path!=null){
            nama = nameField.getText();
            user = usernameField.getText();
            pass = new Password(String.valueOf(passField1.getPassword())).hashPassword();
            AppStack.push(new EditTim());
        }
    }//GEN-LAST:event_regBtnActionPerformed
    
    private void init(){
        Toolbar toolbar = new Toolbar(){
            @Override
            public void backClicked() {
                super.backClicked();
                AppStack.push(new Login());
            }
        };
        toolbar.addToolbar(this);
        toolbar.setBackButtonEnabled(true);
    }
    
    @Override
    public String getName() {
        return "Daftar";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameFile;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JPasswordField passField2;
    private keeptoo.KButton regBtn;
    private keeptoo.KGradientPanel registerBackPanel;
    private keeptoo.KButton uploadBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
