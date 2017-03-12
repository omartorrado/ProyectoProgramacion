/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

/**
 *
 * @author Orom
 */
public class Baraja extends javax.swing.JPanel {
    
    //Varaibles
    private javax.swing.JButton cargarBaraja;
    private javax.swing.JButton guardarBaraja;
    private javax.swing.JScrollPane visor;
    private javax.swing.JPanel baraja;
    
    //Asignamos tamaños y posicion;
    
    
    
    public Baraja(){
        initComponents();
    }
    
    private void initComponents() {
        cargarBaraja=new javax.swing.JButton();
        guardarBaraja=new javax.swing.JButton();;
        visor=new javax.swing.JScrollPane();
        baraja=new javax.swing.JPanel();
        
        //Asignamos tamaños y posicion;
        this.setBounds(this.getRootPane().getBounds());
        cargarBaraja.setSize(250,50);
        cargarBaraja.setVisible(true);
        this.setVisible(true);
    }
    
}
