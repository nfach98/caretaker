package caretaker;

import caretaker.helper.Database;
import caretaker.model.Pelatih;
import caretaker.model.Tim;
import caretaker.utils.SmartImageIcon;
import caretaker.view.Toolbar;
import caretaker.viewmodel.AppStack;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class EditTim extends javax.swing.JPanel {

    FileDialog fd = new FileDialog(App.getFrame(), "Pilih foto", FileDialog.LOAD);
    String image_pathLogo, image_pathJersey, image_pathJerseyGk;
    PreparedStatement ps;
    ResultSet resultSet;
    
    Tim tim;
    
    public EditTim() {
        initComponents();
        if(Database.currentTim != null)
            this.tim = Database.currentTim;
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        createBtn = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        imageJersey = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uploadLogoBtn = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        uploadJerseyBtn = new keeptoo.KButton();
        imageLogo = new javax.swing.JLabel();
        imageJerseyGk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uploadJerseyGkBtn = new keeptoo.KButton();
        cancelBtn = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        createBtn.setText("Buat Tim");
        createBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        createBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        createBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        createBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        createBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        createBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        createBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        createBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        createBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
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

        nameField.setFont(new java.awt.Font("Coco Gothic", 0, 14)); // NOI18N
        nameField.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 105, 222));
        jLabel1.setText("Nama Tim");

        jPanel5.setOpaque(false);

        imageJersey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageJersey.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 105, 222));
        jLabel2.setText("Logo");

        uploadLogoBtn.setText("Pilih");
        uploadLogoBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        uploadLogoBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        uploadLogoBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        uploadLogoBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        uploadLogoBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        uploadLogoBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        uploadLogoBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        uploadLogoBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        uploadLogoBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        uploadLogoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadLogoBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 105, 222));
        jLabel3.setText("Jersey");

        uploadJerseyBtn.setText("Pilih");
        uploadJerseyBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        uploadJerseyBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        uploadJerseyBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        uploadJerseyBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        uploadJerseyBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        uploadJerseyBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        uploadJerseyBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        uploadJerseyBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        uploadJerseyBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        uploadJerseyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadJerseyBtnActionPerformed(evt);
            }
        });

        imageLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLogo.setPreferredSize(new java.awt.Dimension(150, 150));

        imageJerseyGk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageJerseyGk.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 105, 222));
        jLabel4.setText("Jersey GK");

        uploadJerseyGkBtn.setText("Pilih");
        uploadJerseyGkBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        uploadJerseyGkBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        uploadJerseyGkBtn.setkEndColor(new java.awt.Color(42, 105, 222));
        uploadJerseyGkBtn.setkHoverEndColor(new java.awt.Color(42, 105, 222));
        uploadJerseyGkBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        uploadJerseyGkBtn.setkHoverStartColor(new java.awt.Color(42, 74, 207));
        uploadJerseyGkBtn.setkPressedColor(new java.awt.Color(42, 105, 222));
        uploadJerseyGkBtn.setkSelectedColor(new java.awt.Color(42, 105, 222));
        uploadJerseyGkBtn.setkStartColor(new java.awt.Color(42, 105, 222));
        uploadJerseyGkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadJerseyGkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(uploadLogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uploadJerseyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageJersey, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageJerseyGk, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadJerseyGkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageJersey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageJerseyGk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uploadLogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(uploadJerseyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(uploadJerseyGkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cancelBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(42, 105, 222));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("Batal");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                                    .addComponent(nameField)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void uploadLogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadLogoBtnActionPerformed
        fd.setFile("*.jpg;*.jpeg;*.png;*.gif");
        fd.setVisible(true);
        String name = fd.getDirectory() + fd.getFile();
        if(name != null){
            image_pathLogo = name;
            imageLogo.setIcon(new SmartImageIcon(name, imageLogo));
        }
    }//GEN-LAST:event_uploadLogoBtnActionPerformed

    private void uploadJerseyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadJerseyBtnActionPerformed
        fd.setFile("*.jpg;*.jpeg;*.png;*.gif");
        fd.setVisible(true);
        String name = fd.getDirectory() + fd.getFile();
        if(name != null){
            image_pathJersey = name;
            imageJersey.setIcon(new SmartImageIcon(name, imageJersey));
        }
    }//GEN-LAST:event_uploadJerseyBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        try {
            int timId = 0;
            
            if(tim != null){
                ps = Database.con.prepareStatement("UPDATE tim SET nama = ? WHERE id = ?");
                ps.setString(1, nameField.getText());
                ps.setInt(2, Database.currentTim.getId());
                ps.executeUpdate();
                Database.currentTim.setNama(nameField.getText());
                
                if(image_pathLogo != null){
                    ps = Database.con.prepareStatement("UPDATE tim SET logo = ? WHERE id = ?");
                    ps.setBlob(1, new FileInputStream(new File(image_pathLogo)));
                    ps.setInt(2, Database.currentTim.getId());
                    ps.executeUpdate();
                    Database.currentTim.setLogo(ImageIO.read(new FileInputStream(new File(image_pathLogo))));
                }
                
                if(image_pathJersey != null){
                    ps = Database.con.prepareStatement("UPDATE tim SET jersey = ? WHERE id = ?");
                    ps.setBlob(1, new FileInputStream(new File(image_pathJersey)));
                    ps.setInt(2, Database.currentTim.getId());
                    ps.executeUpdate();
                    Database.currentTim.setJersey(ImageIO.read(new FileInputStream(new File(image_pathJersey))));
                }
                
                if(image_pathJerseyGk != null){
                    ps = Database.con.prepareStatement("UPDATE tim SET jersey_gk = ? WHERE id = ?");
                    ps.setBlob(1, new FileInputStream(new File(image_pathJerseyGk)));
                    ps.setInt(2, Database.currentTim.getId());
                    ps.executeUpdate();
                    Database.currentTim.setJerseyGk(ImageIO.read(new FileInputStream(new File(image_pathJerseyGk))));
                }
                
                AppStack.pop();
                Main.getPanel().update();
            }
                
            else{
                if(image_pathLogo!=null && image_pathJersey!=null && Register.image_path!=null){
                    //insert pelatih
                    ps = Database.con.prepareStatement("INSERT INTO pelatih(nama, username, password, image) VALUES(?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, Register.nama);
                    ps.setString(2, Register.user);
                    ps.setString(3, Register.pass);
                    ps.setBlob(4, new FileInputStream(new File(Register.image_path)));
                    ps.executeUpdate();
                    resultSet = ps.getGeneratedKeys();
                    if(resultSet.next()){
                        Database.currentPelatih = new Pelatih(resultSet.getInt(1), Register.nama, Register.user);
                        Database.currentPelatih.setImage(ImageIO.read(new FileInputStream(new File(Register.image_path))));
                    }

                    //insert tim
                    ps = Database.con.prepareStatement("INSERT INTO tim(nama, logo, jersey, jersey_gk) VALUES(?, ?, ?, ?)",
                        Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, nameField.getText());
                    ps.setBlob(2, new FileInputStream(new File(image_pathLogo)));
                    ps.setBlob(3, new FileInputStream(new File(image_pathJersey)));
                    ps.setBlob(4, new FileInputStream(new File(image_pathJerseyGk)));
                    ps.executeUpdate();
                    resultSet = ps.getGeneratedKeys();
                    if(resultSet.next()){
                        timId = resultSet.getInt(1);
                        Database.currentTim = new Tim(timId, nameField.getText());
                        Database.currentTim.setLogo(ImageIO.read(new FileInputStream(new File(image_pathLogo))));
                        Database.currentTim.setJersey(ImageIO.read(new FileInputStream(new File(image_pathJersey))));
                        Database.currentTim.setJerseyGk(ImageIO.read(new FileInputStream(new File(image_pathJerseyGk))));
                    }

                     //update tim pelatih
                    ps = Database.con.prepareStatement("UPDATE pelatih SET tim = ? WHERE id = ?");
                    ps.setInt(1, timId);
                    ps.setInt(2, Database.currentPelatih.getId());
                    ps.executeUpdate();
                    Database.currentPelatih.setIdTim(timId);

                    AppStack.pop();
                    AppStack.pop();
                    AppStack.push(new Main());
                }
            }
        } catch (FileNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditTim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void uploadJerseyGkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadJerseyGkBtnActionPerformed
        fd.setFile("*.jpg;*.jpeg;*.png;*.gif");
        fd.setVisible(true);
        String name = fd.getDirectory() + fd.getFile();
        if(name != null){
            image_pathJerseyGk = name;
            imageJerseyGk.setIcon(new SmartImageIcon(name, imageJerseyGk));
        }
    }//GEN-LAST:event_uploadJerseyGkBtnActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        nameField.setText(Database.currentTim.getNama());
        imageLogo.setIcon(new SmartImageIcon(Database.currentTim.getLogo(), imageLogo));
        imageJersey.setIcon(new SmartImageIcon(Database.currentTim.getJersey(), imageJersey));
        imageJerseyGk.setIcon(new SmartImageIcon(Database.currentTim.getJerseyGk(), imageJerseyGk));
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void init(){
        Toolbar toolbar = new Toolbar(){
            @Override
            public void backClicked() {
                super.backClicked();
                if(tim != null)
                    Main.getPanel().update();
            }
        };
        toolbar.addToolbar(this);
        toolbar.setBackButtonEnabled(true);
        
        imageLogo.setSize(150, 150);
        imageJersey.setSize(150, 150);
        imageJerseyGk.setSize(150, 150);
        
        if(tim != null){
            toolbar.setTitle("Edit Tim");
            
            nameField.setText(Database.currentTim.getNama());
            imageLogo.setIcon(new SmartImageIcon(Database.currentTim.getLogo(), imageLogo));
            imageJersey.setIcon(new SmartImageIcon(Database.currentTim.getJersey(), imageJersey));
            imageJerseyGk.setIcon(new SmartImageIcon(Database.currentTim.getJerseyGk(), imageJerseyGk));
            createBtn.setText("Simpan");
            cancelBtn.setVisible(true);
        }
        else{
            toolbar.setTitle("Buat Tim");
            
            createBtn.setText("Buat");
            cancelBtn.setVisible(false);
        }
    }
    
    @Override
    public String getName() {
        return "Buat Tim";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private keeptoo.KButton createBtn;
    private javax.swing.JLabel imageJersey;
    private javax.swing.JLabel imageJerseyGk;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nameField;
    private keeptoo.KButton uploadJerseyBtn;
    private keeptoo.KButton uploadJerseyGkBtn;
    private keeptoo.KButton uploadLogoBtn;
    // End of variables declaration//GEN-END:variables
}
