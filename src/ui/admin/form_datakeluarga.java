/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import ui.welcome.*;

/**
 *
 * @author Zidan
 */
public class form_manajemen extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public form_manajemen() {
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
        btn_manaj = new javax.swing.JLabel();
        btn_datart = new javax.swing.JLabel();
        btn_keluarga = new javax.swing.JLabel();
        btn_silsi = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        logo_mini = new javax.swing.JLabel();
        dashboardkiri = new javax.swing.JLabel();
        panel_menu = new javax.swing.JLabel();
        bgkota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Penduduk");
        setLocation(new java.awt.Point(350, 80));

        jPanel1.setBackground(new java.awt.Color(0, 0, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_manaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_manaj.png"))); // NOI18N
        btn_manaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_manaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_manajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_manajMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_manajMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_manajMouseReleased(evt);
            }
        });
        jPanel1.add(btn_manaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, -1));

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
        jPanel1.add(btn_datart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

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
        jPanel1.add(btn_keluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, -1));

        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button/btn_silsi.png"))); // NOI18N
        btn_silsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_silsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_silsiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_silsiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_silsiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_silsiMouseReleased(evt);
            }
        });
        jPanel1.add(btn_silsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 280, -1));

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

    private void btn_manajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manajMouseEntered
        // TODO add your handling code here:
        btn_manaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_manaj1.png")));
    }//GEN-LAST:event_btn_manajMouseEntered

    private void btn_manajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manajMouseExited
        // TODO add your handling code here:
        btn_manaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_manaj.png")));
    }//GEN-LAST:event_btn_manajMouseExited

    private void btn_manajMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manajMousePressed
        // TODO add your handling code here:
        btn_manaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_manaj2.png")));
    }//GEN-LAST:event_btn_manajMousePressed

    private void btn_manajMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manajMouseReleased
        // TODO add your handling code here:
        btn_manaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_manaj1.png")));
    }//GEN-LAST:event_btn_manajMouseReleased

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
    }//GEN-LAST:event_btn_keluargaMousePressed

    private void btn_keluargaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluargaMouseReleased
        // TODO add your handling code here:
        btn_keluarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_kel1.png")));
    }//GEN-LAST:event_btn_keluargaMouseReleased

    private void btn_silsiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_silsiMouseEntered
        // TODO add your handling code here:
        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_silsi1.png")));
    }//GEN-LAST:event_btn_silsiMouseEntered

    private void btn_silsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_silsiMouseExited
        // TODO add your handling code here:
        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_silsi.png")));
    }//GEN-LAST:event_btn_silsiMouseExited

    private void btn_silsiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_silsiMousePressed
        // TODO add your handling code here:
        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_silsi2.png")));
    }//GEN-LAST:event_btn_silsiMousePressed

    private void btn_silsiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_silsiMouseReleased
        // TODO add your handling code here:
        btn_silsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button/btn_silsi1.png")));
    }//GEN-LAST:event_btn_silsiMouseReleased

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
            java.util.logging.Logger.getLogger(form_manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_manajemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgkota;
    private javax.swing.JLabel btn_datart;
    private javax.swing.JLabel btn_keluarga;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_manaj;
    private javax.swing.JLabel btn_silsi;
    private javax.swing.JLabel dashboardkiri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo_mini;
    private javax.swing.JLabel panel_menu;
    // End of variables declaration//GEN-END:variables
}
