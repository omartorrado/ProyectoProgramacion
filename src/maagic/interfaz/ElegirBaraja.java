/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import maagic.Carta;

/**
 *
 * @author Orom
 */
public class ElegirBaraja extends javax.swing.JPanel {

    /**
     * Creates new form ElegirBaraja
     */
    public ElegirBaraja() {
        initComponents();
        this.setSize(800,600);
        DimensionPantalla.adaptarResolucion(jButtonCargar);
        DimensionPantalla.adaptarResolucion(jButtonVolver);
        DimensionPantalla.adaptarResolucion(jButtonGuardar);
        DimensionPantalla.adaptarResolucion(jLabelFondo);
        DimensionPantalla.adaptarResolucion(jScrollPaneCartas);
        jScrollPaneCartas.setSize(jScrollPaneCartas.getWidth(), 280);
        DimensionPantalla.adaptarResolucion(jScrollPaneBaraja);
        jScrollPaneBaraja.setSize(jScrollPaneBaraja.getWidth(), 280);
        DimensionPantalla.adaptarResolucion(jLabel1);
        DimensionPantalla.adaptarResolucion(jLabel2);
        
        DimensionPantalla.adaptarPanel(this);
        jScrollPaneBaraja.getViewport().setOpaque(false);
        //jScrollPaneBaraja.getViewport().setSize(2000, 200);
        ////
        
        
        Carta c6 = new Carta(6, 6, 6);
                CartaInterfaz c67=new CartaInterfaz(c6);
                
                jPanelViewportBaraja.add(c67);
                //c67.setLocation(5, 5);
                
                Carta c7 = new Carta(2, 2, 2);
                CartaInterfaz c77=new CartaInterfaz(c7);
                //c77.setLocation(200, 5);
                jPanelViewportBaraja.add(c77);
                
                
                /*
       File path=new File("barajas/");
        String[] archivos=path.list();
        Scanner scBaraja;
        //Aki tiene k crear un panel donde escoger la baraja
        //Por cada archivo añadir una opcion
        for(String s : archivos){
            
        }
        //Luego tiene que devolver la opcion escogida y leer dicho archivo
        String opcionEscogida=path.getPath()+"/Cartas.txt";
        System.out.println(opcionEscogida);
        File archivo=new File(opcionEscogida);
        
        try {
            scBaraja = new Scanner(archivo);
            int posicion=5;
            
                int cvida = scBaraja.nextInt();
                int cataque = scBaraja.nextInt();
                int ccoste = scBaraja.nextInt();
                Carta c = new Carta(cvida, cataque, ccoste);
                CartaInterfaz displayCarta=new CartaInterfaz(c);
                displayCarta.setLocation(200, 5);
                jScrollPaneBaraja.getViewport().add(displayCarta,2);
                
                
                posicion+=185;
                System.out.println("Carta Creada");
            
            scBaraja.close();
        } catch (Exception e) {
            System.out.println("Error");
        }         

                */
    }

    
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneBaraja = new javax.swing.JScrollPane();
        jPanelViewportBaraja = new javax.swing.JPanel();
        jButtonCargar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPaneCartas = new javax.swing.JScrollPane();
        jPanelViewportCartas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jScrollPaneBaraja.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneBaraja.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        jScrollPaneBaraja.setAutoscrolls(true);
        jScrollPaneBaraja.setOpaque(false);

        jPanelViewportBaraja.setBackground(new java.awt.Color(255, 153, 255));
        jPanelViewportBaraja.setPreferredSize(new java.awt.Dimension(5555, 250));
        jPanelViewportBaraja.setLayout(new java.awt.GridLayout());
        jScrollPaneBaraja.setViewportView(jPanelViewportBaraja);

        add(jScrollPaneBaraja);
        jScrollPaneBaraja.setBounds(100, 340, 600, 250);

        jButtonCargar.setText("Cargar baraja");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        add(jButtonCargar);
        jButtonCargar.setBounds(100, 280, 150, 50);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver);
        jButtonVolver.setBounds(550, 280, 150, 50);

        jButtonGuardar.setText("Guardar baraja");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        add(jButtonGuardar);
        jButtonGuardar.setBounds(300, 280, 150, 50);

        jScrollPaneCartas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneCartas.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        jScrollPaneCartas.setAutoscrolls(true);
        jScrollPaneCartas.setHorizontalScrollBar(null);
        jScrollPaneCartas.setOpaque(false);

        jPanelViewportCartas.setBackground(new java.awt.Color(0, 255, 255));
        jPanelViewportCartas.setLayout(null);
        jScrollPaneCartas.setViewportView(jPanelViewportCartas);

        add(jScrollPaneCartas);
        jScrollPaneCartas.setBounds(100, 20, 600, 250);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cartas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1);
        jLabel1.setBounds(20, 30, 60, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tu Baraja");
        add(jLabel2);
        jLabel2.setBounds(20, 350, 70, 220);

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/interfaz/ImagenFondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel3");
        add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        //Guarda en archivos todos larchivos en el directorio barajas
        File path=new File("barajas/");
        String[] archivos=path.list();
        Scanner scBaraja;
        //Aki tiene k crear un panel donde escoger la baraja
        //Por cada archivo añadir una opcion
        for(String s : archivos){
            
        }
        //Luego tiene que devolver la opcion escogida y leer dicho archivo
        String opcionEscogida=path.getPath()+"/Cartas.txt";
        System.out.println(opcionEscogida);
        File archivo=new File(opcionEscogida);
        
        try {
            scBaraja = new Scanner(archivo);
            int posicion=5;
            jPanelViewportBaraja.removeAll();
            while (scBaraja.hasNextLine()) {
                int cvida = scBaraja.nextInt();
                int cataque = scBaraja.nextInt();
                int ccoste = scBaraja.nextInt();
                Carta c = new Carta(cvida, cataque, ccoste);
                CartaInterfaz displayCarta=new CartaInterfaz(c);
                displayCarta.setSize(180,250);
                jPanelViewportBaraja.setSize(posicion+185,250);
                jPanelViewportBaraja.add(displayCarta);
                //displayCarta.setLocation(posicion, 5);
                
                posicion+=185;
                System.out.println("Carta Creada");
            }
            scBaraja.close();
            jPanelViewportBaraja.setSize(posicion+185,250);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        this.getParent().getComponent(0).setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanelViewportBaraja;
    private javax.swing.JPanel jPanelViewportCartas;
    private javax.swing.JScrollPane jScrollPaneBaraja;
    private javax.swing.JScrollPane jScrollPaneCartas;
    // End of variables declaration//GEN-END:variables
}
