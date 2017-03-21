/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Delio
 */
public class AñadirJugadores extends javax.swing.JPanel {

    /**
     * Creates new form AñadirJugadores
     * @throws java.io.IOException
     */
    public AñadirJugadores() throws IOException {
        initComponents();
//        this.setSize(1920, 1080);
//        this.getRootPane().setSize(1920, 1080);
//        DimensionPantalla.adaptarFrame(this);
        miLibreria.DimensionPantalla.adaptarResolucion(imagenfondo);
        miLibreria.DimensionPantalla.adaptarResolucion(botonirajuego);
        miLibreria.DimensionPantalla.adaptarResolucion(botonvolvermenu);
        miLibreria.DimensionPantalla.adaptarResolucion(scrolldeañadirjugadores);
        miLibreria.DimensionPantalla.adaptarResolucion(listajugadores);
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelañadirjugadores = new javax.swing.JPanel();
        botonvolvermenu = new javax.swing.JButton();
        botonirajuego = new javax.swing.JButton();
        try {
            scrolldeañadirjugadores =(javax.swing.JScrollPane)java.beans.Beans.instantiate(getClass().getClassLoader(), "maagic/interfaz.AñadirJugadores_scrolldeañadirjugadores");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        listajugadores = new javax.swing.JList<>();
        imagenfondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelañadirjugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonvolvermenu.setBackground(new java.awt.Color(102, 140, 144));
        botonvolvermenu.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        botonvolvermenu.setForeground(new java.awt.Color(102, 0, 102));
        botonvolvermenu.setText("Salir");
        botonvolvermenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonvolvermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolvermenuActionPerformed(evt);
            }
        });
        panelañadirjugadores.add(botonvolvermenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 60, 20));

        botonirajuego.setBackground(new java.awt.Color(102, 140, 144));
        botonirajuego.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        botonirajuego.setForeground(new java.awt.Color(102, 0, 102));
        botonirajuego.setText("Cargar Juego");
        botonirajuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonirajuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonirajuegoActionPerformed(evt);
            }
        });
        panelañadirjugadores.add(botonirajuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 170, 40));

        listajugadores.setBackground(new java.awt.Color(153, 204, 0));
        listajugadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listajugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listajugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listajugadoresMouseClicked(evt);
            }
        });
        scrolldeañadirjugadores.setViewportView(listajugadores);

        panelañadirjugadores.add(scrolldeañadirjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 590, 250));

        imagenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/interfaz/ImagenFondo.jpg"))); // NOI18N
        imagenfondo.setText("jLabel1");
        panelañadirjugadores.add(imagenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        add(panelañadirjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonvolvermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvolvermenuActionPerformed
        //panelJugarTest.setOpaque(true);
        //panelJugarTest.setVisible(true);
        //Aki va el menu de jugar la partida
        this.setVisible(false);
        this.getParent().getComponent(0).setVisible(true);
      
    }//GEN-LAST:event_botonvolvermenuActionPerformed

    private void botonirajuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonirajuegoActionPerformed

        if(listajugadores.isSelectionEmpty()){
            Interfaz2 IrJuego=new Interfaz2();
        panelañadirjugadores.add(IrJuego,new org.netbeans.lib.awtextra.AbsoluteConstraints (0, 0, 1920, 1080), 1);
        listajugadores.getSelectedIndex();
            }
        else{
        JOptionPane.showInputDialog("No se a seleccionado jugador escoja uno");
        
        }
    }//GEN-LAST:event_botonirajuegoActionPerformed

    private void listajugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listajugadoresMouseClicked
        Scanner sc = null;      
        File cartas;
        cartas= new File("");
//        Mirar listajugadores para seleccionar un jugador
        while(sc.hasNextLine()){
//            int cvida=sc.hasNextInt();
//            int cataque=sc.hasNextInt();
            
        
        
        
        
        
       listajugadores.grabFocus();
        listajugadores.requestFocusInWindow(); 
        }
    }//GEN-LAST:event_listajugadoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonirajuego;
    private javax.swing.JButton botonvolvermenu;
    private javax.swing.JLabel imagenfondo;
    private javax.swing.JList<String> listajugadores;
    private javax.swing.JPanel panelañadirjugadores;
    private javax.swing.JScrollPane scrolldeañadirjugadores;
    // End of variables declaration//GEN-END:variables
}
