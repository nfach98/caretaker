package caretaker.view;

import caretaker.viewmodel.AppStack;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Toolbar extends javax.swing.JPanel {

    public Toolbar() {
        initComponents();
        back.setVisible(false);
        menu.setVisible(false);
    }
    
    public void addToolbar(JPanel panel){
        if(panel.getLayout() instanceof BorderLayout){
           panel.add(this, java.awt.BorderLayout.PAGE_START);
           setTitle(panel.getName());
        }
    }
    
    public void setBackButtonEnabled(boolean set){
        back.setVisible(set);
    }
    
    public void setMenuEnabled(boolean set){
        menu.setVisible(set);
    }
    
    public void setMenuIcon(ImageIcon icon){
        menu.setIcon(icon);
    }
    
    public void backClicked(){
        AppStack.pop();
    }
    
    public void setTitle(String name){
        nameLabel.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        tab.setBackground(new java.awt.Color(42, 105, 222));
        tab.setPreferredSize(new java.awt.Dimension(674, 56));

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Daftar");

        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        add(tab, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked

    }//GEN-LAST:event_menuMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        backClicked();
    }//GEN-LAST:event_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
}
