package caretaker;

import caretaker.helper.Database;
import caretaker.viewmodel.AppStack;
import java.awt.Font;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new keeptoo.KGradientPanel();
        logoLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        loginBtn = new keeptoo.KButton();
        regisLabel = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        loginPanel.setkEndColor(new java.awt.Color(42, 105, 222));
        loginPanel.setkGradientFocus(0);
        loginPanel.setkStartColor(new java.awt.Color(42, 185, 220));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_logo_login.png"))); // NOI18N

        infoLabel.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Asisten pelatih andalan anda");

        userField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        userField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userFieldMouseClicked(evt);
            }
        });

        passField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passFieldMouseClicked(evt);
            }
        });

        loginBtn.setText("Masuk");
        loginBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        loginBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        loginBtn.setkEndColor(new java.awt.Color(255, 255, 255));
        loginBtn.setkForeGround(new java.awt.Color(42, 105, 222));
        loginBtn.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        loginBtn.setkHoverForeGround(new java.awt.Color(42, 105, 222));
        loginBtn.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        loginBtn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        loginBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        regisLabel.setFont(new java.awt.Font("Coco Gothic", 0, 12)); // NOI18N
        regisLabel.setForeground(new java.awt.Color(255, 255, 255));
        regisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regisLabel.setText("Belum punya akun?");
        regisLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regisLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regisLabelMouseExited(evt);
            }
        });

        warning.setFont(new java.awt.Font("Coco Gothic", 0, 12)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 255, 255));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setText(" ");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                        .addGap(28, 28, 28)))
                .addGap(54, 54, 54))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(passField)
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regisLabel)
                .addGap(42, 42, 42))
        );

        add(loginPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if(Database.authLogin(userField.getText(), String.valueOf(passField.getPassword()))){
            AppStack.pop();
            AppStack.push(new Main());
        }
        else{
            warning.setText("Username atau password salah. Coba lagi");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void regisLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisLabelMouseClicked
        AppStack.pop();
        AppStack.push(new Register());
    }//GEN-LAST:event_regisLabelMouseClicked

    private void regisLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisLabelMouseEntered
        regisLabel.setFont(new Font("Coco Gothic", Font.BOLD, 12));
    }//GEN-LAST:event_regisLabelMouseEntered

    private void regisLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisLabelMouseExited
        regisLabel.setFont(new Font("Coco Gothic", Font.PLAIN, 12));
    }//GEN-LAST:event_regisLabelMouseExited

    private void userFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFieldMouseClicked
        if(!warning.getText().equals(" ")){
            userField.setText("");
            passField.setText("");
        }
        warning.setText(" ");
    }//GEN-LAST:event_userFieldMouseClicked

    private void passFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMouseClicked
        if(!warning.getText().equals(" ")){
            userField.setText("");
            passField.setText("");
        }
        warning.setText(" ");
    }//GEN-LAST:event_passFieldMouseClicked

    @Override
    public String getName() {
        return "Login";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    private keeptoo.KButton loginBtn;
    private keeptoo.KGradientPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel regisLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
