/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

/**
 *
 * @author Delio
 */
public class AñadirJugadores extends javax.swing.JPanel {

    /**
     * Creates new form AñadirJugadores
     */
    public AñadirJugadores() {
        initComponents();
//        this.setSize(1920, 1080);
//        this.getRootPane().setSize(1920, 1080);
//        DimensionPantalla.adaptarFrame(this);
        DimensionPantalla.adaptarResolucion(jLabel1);
        DimensionPantalla.adaptarResolucion( botonseleccionar);
        DimensionPantalla.adaptarResolucion(botonvolvermenu);
        DimensionPantalla.adaptarResolucion(scrolldeañadirjugadores);
        DimensionPantalla.adaptarResolucion(listajugadores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonvolvermenu = new javax.swing.JButton();
        botonseleccionar = new javax.swing.JButton();
        scrolldeañadirjugadores = new javax.swing.JScrollPane();
        listajugadores = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(botonvolvermenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 60, 20));

        botonseleccionar.setBackground(new java.awt.Color(102, 140, 144));
        botonseleccionar.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        botonseleccionar.setForeground(new java.awt.Color(102, 0, 102));
        botonseleccionar.setText("Selecione un Jugador");
        botonseleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonseleccionarActionPerformed(evt);
            }
        });
        add(botonseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 170, 40));

        listajugadores.setBackground(new java.awt.Color(153, 204, 0));
        listajugadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listajugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrolldeañadirjugadores.setViewportView(listajugadores);

        add(scrolldeañadirjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 590, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/interfaz/ImagenFondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonvolvermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvolvermenuActionPerformed
        //panelJugarTest.setOpaque(true);
        //panelJugarTest.setVisible(true);
        //Aki va el menu de jugar la partida
        this.setVisible(false);
        this.getParent().getComponent(0).setVisible(true);

    }//GEN-LAST:event_botonvolvermenuActionPerformed

    private void botonseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonseleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonseleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonseleccionar;
    private javax.swing.JButton botonvolvermenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> listajugadores;
    private javax.swing.JScrollPane scrolldeañadirjugadores;
    // End of variables declaration//GEN-END:variables
}
