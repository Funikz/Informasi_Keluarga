/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.warga;

import ui.admin.*;
import ui.welcome.*;

/**
 *
 * @author Zidan
 */
public class form_silsilah_warga extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public form_silsilah_warga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_datart = new javax.swing.JLabel();
        btn_keluarga = new javax.swing.JLabel();
        btn_silsi = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        logo_mini = new javax.swing.JLabel();
        Label_Nokk = new javax.swing.JLabel();
        Label_silsilah = new javax.swing.JLabel();
        field_nokk = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        dashboardkiri = new javax.swing.JLabel();
        panel_menu = new javax.swing.JLabel();
        bgkota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Penduduk");
        setLocation(new java.awt.Point(315, 150));

        jPanel1.setBackground(new java.awt.Color(0, 0, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 770, 420));

        btn_datart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_dataRT.png"))); // NOI18N
        btn_datart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_datart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_datartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_datartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_datartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_datartMouseReleased(evt);
            }
        });
        jPanel1.add(btn_datart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, -1));

        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_kel.png"))); // NOI18N
        btn_keluarga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_keluarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_keluargaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_keluargaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_keluargaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_keluargaMouseReleased(evt);
            }
        });
        jPanel1.add(btn_keluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_silsi1.png"))); // NOI18N
        btn_silsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btn_silsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, -1));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_logout.png"))); // NOI18N
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_logoutMouseReleased(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 280, -1));

        logo_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_mini.png"))); // NOI18N
        jPanel1.add(logo_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        Label_Nokk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label_Nokk.setForeground(new java.awt.Color(255, 255, 255));
        Label_Nokk.setText("No. Kartu Keluarga");
        jPanel1.add(Label_Nokk, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        Label_silsilah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label_silsilah.setForeground(new java.awt.Color(255, 255, 255));
        Label_silsilah.setText("Silsilah :");
        jPanel1.add(Label_silsilah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        field_nokk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        field_nokk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_nokk.setBorder(null);
        field_nokk.setPreferredSize(new java.awt.Dimension(415, 50));
        jPanel1.add(field_nokk, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        btn_update.setBackground(new java.awt.Color(0, 151, 230));
        btn_update.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Cari");
        btn_update.setBorder(null);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.setPreferredSize(new java.awt.Dimension(160, 50));
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, -1, -1));

        dashboardkiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_dashboardkiri.png"))); // NOI18N
        jPanel1.add(dashboardkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/panel_menu.png"))); // NOI18N
        jPanel1.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        bgkota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_adminuserkota.png"))); // NOI18N
        jPanel1.add(bgkota, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_datartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datartMouseEntered
        // TODO add your handling code here:
        btn_datart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_dataRT1.png")));
    }//GEN-LAST:event_btn_datartMouseEntered

    private void btn_datartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datartMouseExited
        // TODO add your handling code here:
        btn_datart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_dataRT.png")));
    }//GEN-LAST:event_btn_datartMouseExited

    private void btn_datartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datartMousePressed
        // TODO add your handling code here:
        btn_datart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_dataRT2.png")));
        
        this.dispose();
        new ui.warga.form_dataper_rt_warga().setVisible(true);
    }//GEN-LAST:event_btn_datartMousePressed

    private void btn_datartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datartMouseReleased
        // TODO add your handling code here:
        btn_datart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_dataRT1.png")));
    }//GEN-LAST:event_btn_datartMouseReleased

    private void btn_keluargaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluargaMouseEntered
        // TODO add your handling code here:
        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_kel1.png")));
    }//GEN-LAST:event_btn_keluargaMouseEntered

    private void btn_keluargaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluargaMouseExited
        // TODO add your handling code here:
        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_kel.png")));
    }//GEN-LAST:event_btn_keluargaMouseExited

    private void btn_keluargaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluargaMousePressed
        // TODO add your handling code here:
        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_kel2.png")));
        
        this.dispose();
        new ui.warga.form_datakeluarga_warga().setVisible(true);
    }//GEN-LAST:event_btn_keluargaMousePressed

    private void btn_keluargaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluargaMouseReleased
        // TODO add your handling code here:
        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_kel1.png")));
    }//GEN-LAST:event_btn_keluargaMouseReleased

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        // TODO add your handling code here:
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_logout1.png")));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        // TODO add your handling code here:
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_logout.png")));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        // TODO add your handling code here:
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_logout2.png")));
        
        this.dispose();
        new ui.welcome.login().setVisible(true);
    }//GEN-LAST:event_btn_logoutMousePressed

    private void btn_logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseReleased
        // TODO add your handling code here:
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_logout1.png")));
    }//GEN-LAST:event_btn_logoutMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_silsilah_warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_silsilah_warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_silsilah_warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_silsilah_warga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_silsilah_warga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Nokk;
    private javax.swing.JLabel Label_silsilah;
    private javax.swing.JLabel bgkota;
    private javax.swing.JLabel btn_datart;
    private javax.swing.JLabel btn_keluarga;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_silsi;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel dashboardkiri;
    private javax.swing.JTextField field_nokk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo_mini;
    private javax.swing.JLabel panel_menu;
    // End of variables declaration//GEN-END:variables
}
