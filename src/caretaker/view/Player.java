package caretaker.view;

import caretaker.DetPemain;
import caretaker.model.Pemain;
import caretaker.viewmodel.AppStack;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Player extends javax.swing.JPanel {

    JPopupMenu pMenu;
    Pemain pemain;
    
    public Player(Pemain p) {
        initComponents();
        this.pemain = p;
        img.setSize(110, 110);
        neg.setSize(30, 22);
        
        initPopUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        posBack = new javax.swing.JPanel();
        pos = new javax.swing.JLabel();
        neg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 244));
        setPreferredSize(new java.awt.Dimension(200, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        name.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        name.setForeground(new java.awt.Color(42, 105, 222));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Naca Asc");

        num.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        num.setForeground(new java.awt.Color(42, 105, 222));
        num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num.setText("99");
        num.setPreferredSize(new java.awt.Dimension(30, 30));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_profile.png"))); // NOI18N
        img.setToolTipText("");

        posBack.setBackground(new java.awt.Color(245, 194, 0));
        posBack.setLayout(new java.awt.BorderLayout());

        pos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pos.setForeground(new java.awt.Color(255, 255, 255));
        pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos.setText("CDM");
        pos.setPreferredSize(new java.awt.Dimension(30, 30));
        posBack.add(pos, java.awt.BorderLayout.CENTER);

        neg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neg.setPreferredSize(new java.awt.Dimension(30, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(neg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(posBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(posBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(neg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(name)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new Color(163,191,244));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new Color(245,245,245));
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(SwingUtilities.isRightMouseButton(evt) && evt.getClickCount() == 1){
            pMenu.show(this, evt.getX(), evt.getY());
        }
        else{
            AppStack.push(new DetPemain(pemain));
        }
    }//GEN-LAST:event_formMouseClicked
    
    private void initPopUp(){
        pMenu = new JPopupMenu();
        
        JMenuItem det = new JMenuItem("Detail");
        det.addActionListener((ActionEvent e) -> {
            AppStack.push(new DetPemain(pemain));
        });
        det.setOpaque(true);
        det.setForeground(new Color(42,105,222));
        det.setBackground(Color.WHITE);
        det.setFont(new java.awt.Font("Century Gothic", 1, 12));
        
        JMenuItem edit = new JMenuItem("Edit");
        edit.addActionListener((ActionEvent e) -> {
            
        });
        edit.setOpaque(true);
        edit.setForeground(new Color(42,105,222));
        edit.setBackground(Color.WHITE);
        edit.setFont(new java.awt.Font("Century Gothic", 1, 12));
        
        JMenuItem hapus = new JMenuItem("Hapus");
        hapus.addActionListener((ActionEvent e) -> {
            
        });
        hapus.setOpaque(true);
        hapus.setForeground(new Color(248,15,20));
        hapus.setBackground(Color.WHITE);
        hapus.setFont(new java.awt.Font("Century Gothic", 1, 12));
        
        pMenu.add(det);
        pMenu.add(edit);
        pMenu.add(hapus);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel img;
    public javax.swing.JLabel name;
    public javax.swing.JLabel neg;
    public javax.swing.JLabel num;
    public javax.swing.JLabel pos;
    public javax.swing.JPanel posBack;
    // End of variables declaration//GEN-END:variables

}
