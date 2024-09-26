package scenario;

import java.awt.Toolkit;

/**
 *
 * @author eltho
 */
public class GameOver extends javax.swing.JFrame {
    String finalMessage;

    public GameOver(String finalMessage) {
        this.finalMessage = finalMessage;
        initComponents();
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/images.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackToMenu = new javax.swing.JButton();
        labelFinalMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBackToMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBackToMenu.setText("Voltar ao início");
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 176, 53));

        labelFinalMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelFinalMessage.setForeground(new java.awt.Color(255, 255, 255));
        labelFinalMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFinalMessage.setText("Default");
        getContentPane().add(labelFinalMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 437, 840, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GameOver.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        labelFinalMessage.setText(finalMessage);
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelFinalMessage;
    // End of variables declaration//GEN-END:variables
}
