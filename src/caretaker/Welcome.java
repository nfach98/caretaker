package caretaker;

import caretaker.helper.Database;
import caretaker.viewmodel.AppStack;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

public class Welcome extends javax.swing.JPanel {

    public Welcome() {
        initComponents();
        startLoading();
    }

    private void startLoading(){
        SwingWorker loadDb = new SwingWorker(){
            @Override
            protected Boolean doInBackground() {
                boolean success = false;
                
                try{
                    Database.startConnection();
                    Database.getNegara();
                    success = true;
                }catch(Exception e){
                    success = false;
                }
    
                return success;
            }
            
            @Override
            protected void done() {
                boolean success = false;
                try {
                    success = (boolean) get();
                    
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(success){
                    AppStack.pop();
                    AppStack.push(new Login());
                }else{
                    infoLabel.setText("Periksa kembali koneksi internet anda");
                    loadBar.setVisible(false);
                }
            }
        };
        
        loadDb.execute();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new keeptoo.KGradientPanel();
        logoLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        loadBar = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        loginPanel.setkEndColor(new java.awt.Color(42, 105, 222));
        loginPanel.setkGradientFocus(0);
        loginPanel.setkStartColor(new java.awt.Color(42, 185, 220));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_logo_login.png"))); // NOI18N

        infoLabel.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Memuat");

        loadBar.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        loadBar.setForeground(new java.awt.Color(255, 255, 255));
        loadBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ellipsis-1s-51px.gif"))); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addGap(8, 8, 8)
                .addComponent(loadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        add(loginPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel loadBar;
    private keeptoo.KGradientPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
