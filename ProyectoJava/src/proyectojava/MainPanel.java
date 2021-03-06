/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

/**
 *
 * @author JAIME
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        perfil1 = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        calendario = new javax.swing.JButton();
        anuncios = new javax.swing.JButton();
        Cursos = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(0, 0, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exit.setBorderPainted(false);
        exit.setFocusable(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 20));

        titulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 50)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 102));
        titulo.setText("WSscheduler");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, -1));

        perfil1.setBackground(new java.awt.Color(153, 153, 153));
        perfil1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perfil1.setForeground(new java.awt.Color(51, 255, 0));
        perfil1.setText("Ajustes");
        perfil1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        perfil1.setBorderPainted(false);
        perfil1.setFocusable(false);
        perfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfil1ActionPerformed(evt);
            }
        });
        getContentPane().add(perfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 60, 40));

        perfil.setBackground(new java.awt.Color(153, 153, 153));
        perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perfil.setForeground(new java.awt.Color(102, 102, 102));
        perfil.setText("PERFIL");
        perfil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        perfil.setBorderPainted(false);
        perfil.setFocusable(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 90, 50));

        calendario.setBackground(new java.awt.Color(0, 0, 255));
        calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calendario.setForeground(new java.awt.Color(255, 255, 255));
        calendario.setText("CALENDAR");
        calendario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        calendario.setBorderPainted(false);
        calendario.setFocusable(false);
        calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioActionPerformed(evt);
            }
        });
        getContentPane().add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, 30));

        anuncios.setBackground(new java.awt.Color(0, 0, 255));
        anuncios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        anuncios.setForeground(new java.awt.Color(255, 255, 255));
        anuncios.setText("UP DATES");
        anuncios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        anuncios.setBorderPainted(false);
        anuncios.setFocusable(false);
        anuncios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anunciosActionPerformed(evt);
            }
        });
        getContentPane().add(anuncios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 90, 30));

        Cursos.setBackground(new java.awt.Color(0, 0, 255));
        Cursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cursos.setForeground(new java.awt.Color(255, 255, 255));
        Cursos.setText("SIGNATURES");
        Cursos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cursos.setBorderPainted(false);
        Cursos.setFocusable(false);
        Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursosActionPerformed(evt);
            }
        });
        getContentPane().add(Cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 90, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectojava/Imagenes/Fondo-pantalla-Samsung-Galaxy-Note-9-5.jpg"))); // NOI18N
        Fondo.setText("jLabel2");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursosActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_CursosActionPerformed

    private void anunciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anunciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anunciosActionPerformed

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarioActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfilActionPerformed

    private void perfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfil1ActionPerformed
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
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
                
                
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cursos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton anuncios;
    private javax.swing.JButton calendario;
    private javax.swing.JButton exit;
    private javax.swing.JButton perfil;
    private javax.swing.JButton perfil1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
