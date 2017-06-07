/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import maagic.Main;

/**
 *
 * @author Delio
 */

public final class InterfadSeleccion extends JPanel {
    public  JPanel jugador1;
    public  JButton botonSelectj1;
    public  JButton botonBorrarJugador;
    public  JButton botonCancelarj1;  
    public  JButton botonCrearj;
    public  JComboBox   cajaJugadoresj1;
    public  JComboBox   cajaJugadoresj2 ;
    public  JButton botonSelectj2;  
    public  JButton botonCancelar2;
    public  JButton botonJugar;
    public  JButton volverMenu;
    public  JPanel  crearJugador;
    public  JTextField nombre;
    public  JTextField   baraja;
    public  JButton crearJugadorPanelCrear;
    public  JButton cancelarCreacion;
    public InterfadSeleccion() {
        initComponents();
    }
    public void initComponents(){
         this.setLayout(new OverlayLayout(this));
        
        JLabel fondo = new JLabel();
        fondo.setSize(MainInterfaz.marco.getSize());
        fondo.setAlignmentX(0.5f);
        DimensionPantalla.resizeImagen("/maagic/img/ImagenFondo.jpg", fondo);
    //
    
    //
    jugador1.add(botonSelectj1);
    jugador1.add(botonCancelarj1);
    jugador1.add(cajaJugadoresj1);
    jugador1.add(botonBorrarJugador);
    jugador1.add(botonCrearj);
    jugador1.add(cajaJugadoresj2);
    jugador1.add(botonSelectj2);
    jugador1.add(botonCancelar2);
    jugador1.add(botonJugar);
    jugador1.add(volverMenu);
    //
    crearJugador.add(nombre);
    crearJugador.add(baraja);
    crearJugador.add(crearJugadorPanelCrear);
    crearJugador.add(cancelarCreacion);
    //
    botonSelectj1.setPreferredSize(new Dimension(100, 40));
    botonCancelarj1.setPreferredSize(new Dimension(100, 40));
    botonBorrarJugador.setPreferredSize(new Dimension(100, 40));
    botonCrearj.setPreferredSize(new Dimension(100, 40));
    botonSelectj2.setPreferredSize(new Dimension(100, 40));
    botonCancelar2.setPreferredSize(new Dimension(100, 40));
    botonJugar.setPreferredSize(new Dimension(100, 40));
    volverMenu.setPreferredSize(new Dimension(100, 40));
    //
    botonSelectj1.setText("Seleccionar Jugador 1");
    botonCancelarj1.setText("Cancelar Selección");
    botonBorrarJugador.setText("Borrar un Jugador");
    botonCrearj.setText("CrearJugador");
    botonSelectj2.setText("Seleccionar Jugador 2 ");
    botonCancelar2.setText("Cancelar Selección");
    botonJugar.setText("Jugar");
    volverMenu.setText("Volver al Menu");
    //
    nombre.setText("Nombre");
    baraja.setText("baraja");
    crearJugadorPanelCrear.setText("Crear Jugador");
    cancelarCreacion.setText("Cancelar");
    //
//    ArrayList<String> nombreArrayList = new ArrayList<String>();
//    nombreArrayList.
//    cajaJugadoresj1.setModel(new javax.swing.DefaultComboBoxModel<>(nombreArrayList.));
//    cajaJugadoresj1.getSelectedItem();
    //
    botonSelectj1.setAlignmentX(0.5f);
        botonSelectj1.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonSelectj1ActionPerformed(evt);
        });
        botonCancelarj1.setAlignmentX(0.5f);
        botonCancelarj1.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonCancelarj1ActionPerformed(evt);
        });
        botonBorrarJugador.setAlignmentX(0.5f);
        botonBorrarJugador.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonBorrarJugadorActionPerformed(evt);
        });
        botonCrearj.setAlignmentX(0.5f);
        botonCrearj.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonCrearjActionPerformed(evt);
        });
        botonSelectj2.setAlignmentX(0.5f);
        botonSelectj2.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonSelectj2ActionPerformed(evt);
        });
        botonCancelar2.setAlignmentX(0.5f);
        botonCancelar2.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonCancelar2ActionPerformed(evt);
        });
        botonJugar.setAlignmentX(0.5f);
        botonJugar.addActionListener((java.awt.event.ActionEvent evt) -> {
            botonJugarActionPerformed(evt);
        });
        volverMenu.setAlignmentX(0.5f);
        volverMenu.addActionListener((java.awt.event.ActionEvent evt) -> {
            volverMenuActionPerformed(evt);
        });
        //
        crearJugadorPanelCrear.setAlignmentX(0.5f);
        crearJugadorPanelCrear.addActionListener((java.awt.event.ActionEvent evt) -> {
            crearJugadorPanelCrearActionPerformed(evt);
        });
        cancelarCreacion.setAlignmentX(0.5f);
        cancelarCreacion.addActionListener((java.awt.event.ActionEvent evt) -> {
            cancelarCreacionActionPerformed(evt);
        });
        
    
    
    
    }

    private void botonSelectj1ActionPerformed(ActionEvent evt) {
        MetodosBaseDatos metodos=new MetodosBaseDatos();
        
        metodos.seleccionarjugadores((String) cajaJugadoresj1.getSelectedItem());
        JOptionPane.showInputDialog("Se ha introducido el nombre correctamente");
    }

    private void botonCrearjActionPerformed(ActionEvent evt) {
        this.removeAll();
        this.add(this.crearJugador);
        this.repaint();
        this.revalidate();  
    }

    private void botonBorrarJugadorActionPerformed(ActionEvent evt) {
        MetodosBaseDatos metodos=new MetodosBaseDatos();
        metodos.borrarjugadores((String) cajaJugadoresj1.getSelectedItem());
    }

    private void botonSelectj2ActionPerformed(ActionEvent evt) {
       MetodosBaseDatos metodos=new MetodosBaseDatos();
       metodos.seleccionarjugadores((String) cajaJugadoresj1.getSelectedItem());
       JOptionPane.showInputDialog("Se ha seleccionado");
       
       
        
        
    }

    private void botonCancelar2ActionPerformed(ActionEvent evt) {
       JOptionPane.showInputDialog("Se ha cancelado la selección");
        
        
    }

    private void botonJugarActionPerformed(ActionEvent evt) {
         MainInterfaz.juego = new Juego();
        Main.initGame();
        MainInterfaz.marco.getContentPane().removeAll();
        MainInterfaz.marco.add(MainInterfaz.juego);
        //Hay que poner el repaint() revalidate() para que redibuje todo tras quitar/poner panels
        MainInterfaz.marco.repaint();
        MainInterfaz.marco.revalidate();
        
        
    }

    private void volverMenuActionPerformed(ActionEvent evt) {
       Menu   menu = new Menu();
       menu.getRootPane();
       this.repaint();
       this.revalidate();
       this.add(menu);
        
        
    }

    private void botonCancelarj1ActionPerformed(ActionEvent evt) {
       JOptionPane.showInputDialog("Se ha cancelado la selección");
       
        
        
    }

    private void crearJugadorPanelCrearActionPerformed(ActionEvent evt) {
      MetodosBaseDatos metodos= new MetodosBaseDatos();
//      metodos.
    }

    private void cancelarCreacionActionPerformed(ActionEvent evt) {
         this.removeAll();
        this.add(this.jugador1);
        this.repaint();
        this.revalidate();
    }

    
}
