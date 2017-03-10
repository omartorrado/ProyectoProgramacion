/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Delio
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu2
     */
    public Menu() {
        initComponents();
        DimensionPantalla.adaptarFrame(this);
        DimensionPantalla.adaptarResolucion(jLabel1);
        DimensionPantalla.adaptarResolucion(jLabel2);
        DimensionPantalla.adaptarResolucion(jPanel1);
        DimensionPantalla.adaptarResolucion(Boton1Jugar);
        DimensionPantalla.adaptarResolucion(Boton2Baraja);
        DimensionPantalla.adaptarResolucion(Boton3Salir);
       
      
    }

      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Boton3Salir = new javax.swing.JButton();
        Boton2Baraja = new javax.swing.JButton();
        Boton1Jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 290));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1080));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Boton3Salir.setBackground(new java.awt.Color(102, 140, 144));
        Boton3Salir.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        Boton3Salir.setForeground(new java.awt.Color(153, 0, 0));
        Boton3Salir.setText("Salir");
        Boton3Salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton3Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3SalirActionPerformed(evt);
            }
        });

        Boton2Baraja.setBackground(new java.awt.Color(102, 140, 144));
        Boton2Baraja.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        Boton2Baraja.setForeground(new java.awt.Color(0, 102, 102));
        Boton2Baraja.setText("Crear Baraja");
        Boton2Baraja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton2Baraja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2BarajaActionPerformed(evt);
            }
        });

        Boton1Jugar.setBackground(new java.awt.Color(102, 140, 144));
        Boton1Jugar.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        Boton1Jugar.setForeground(new java.awt.Color(102, 0, 102));
        Boton1Jugar.setText("Jugar");
        Boton1Jugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton1Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1JugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Boton2Baraja, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Boton1Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(Boton3Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(Boton1Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Boton2Baraja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Boton3Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 630, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1JugarActionPerformed
        Interfaz2 Jugar = new Interfaz2();
        Jugar.setVisible(true);
    }//GEN-LAST:event_Boton1JugarActionPerformed

    private void Boton2BarajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2BarajaActionPerformed
        Baraja Baraja = new Baraja();
        Baraja.setVisible(true);
    }//GEN-LAST:event_Boton2BarajaActionPerformed

    private void Boton3SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_Boton3SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1Jugar;
    private javax.swing.JButton Boton2Baraja;
    private javax.swing.JButton Boton3Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
