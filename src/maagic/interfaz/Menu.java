/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



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
        this.setSize(1920,1080);
        this.getRootPane().setSize(1920, 1080);
        DimensionPantalla.adaptarFrame(this);
        DimensionPantalla.adaptarResolucion(panelprincipal);
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        DimensionPantalla.adaptarResolucion(menu);
        DimensionPantalla.adaptarResolucion(Boton1Jugar);
        DimensionPantalla.adaptarResolucion(Boton2Baraja);
        DimensionPantalla.adaptarResolucion(Boton3Salir);
        DimensionPantalla.adaptarResolucion(imagentitulo);
        DimensionPantalla.adaptarResolucion(imagenfondo);
        //El siguiente codigo cambia el tamaño de la imagen de imagentitulo
        DimensionPantalla.resizeImagen("/maagic/interfaz/serien_grosses_logo_239-Recuperado.png",imagentitulo);
        
        
        
        
                

    }


    
    
//    @Override
//    public  Image getIconImage(){
//    Image Imagen = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Runes-of-Magic-1-icon.png"));
//    return Imagen;
//    }   
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Boton3Salir = new javax.swing.JButton();
        Boton2Baraja = new javax.swing.JButton();
        Boton1Jugar = new javax.swing.JButton();
        imagentitulo = new javax.swing.JLabel();
        imagenfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setFocusCycleRoot(true);
        menu.setInheritsPopupMenu(true);
        menu.setOpaque(false);
        menu.setLayout(null);

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
        menu.add(Boton3Salir);
        Boton3Salir.setBounds(200, 174, 212, 35);

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
        menu.add(Boton2Baraja);
        Boton2Baraja.setBounds(60, 100, 501, 45);

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
        menu.add(Boton1Jugar);
        Boton1Jugar.setBounds(26, 11, 575, 61);

        panelprincipal.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 425, 620, 220));

        imagentitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/interfaz/serien_grosses_logo_239-Recuperado.png"))); // NOI18N
        panelprincipal.add(imagentitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 1000, 280));

        imagenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/interfaz/ImagenFondo.jpg"))); // NOI18N
        panelprincipal.add(imagenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(panelprincipal);
        panelprincipal.setBounds(0, 0, 1920, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1JugarActionPerformed
        //panelJugarTest.setOpaque(true);
        //panelJugarTest.setVisible(true);
        //Aki va el menu de jugar la partida
        menu.setVisible(false);
       
       
    }//GEN-LAST:event_Boton1JugarActionPerformed

    private void Boton2BarajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2BarajaActionPerformed
        menu.setVisible(false);
        ElegirBaraja barajaMenu=new ElegirBaraja();
        panelprincipal.add(barajaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080), 1);
        
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
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1Jugar;
    private javax.swing.JButton Boton2Baraja;
    private javax.swing.JButton Boton3Salir;
    private javax.swing.JLabel imagenfondo;
    private javax.swing.JLabel imagentitulo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
