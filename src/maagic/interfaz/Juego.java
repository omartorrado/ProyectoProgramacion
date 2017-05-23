/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

/**
 *
 * @author otorradomiguez
 */
public class Juego extends JPanel {
    
    JPanel panelGridBag=new JPanel();
    JPanel panelManoJ1=new JPanel();
    JPanel panelManoJ2=new JPanel();
    JPanel panelMesaJ1=new JPanel();
    JPanel panelMesaJ2=new JPanel();
    
    JLabel fondo=new JLabel();
    
    public Juego(){
        initJuego();
    }
    
    public void initJuego(){
        //Establecemos los layouts del panel principal y los subpaneles
        this.setLayout(new OverlayLayout(this));
        panelGridBag.setLayout(new GridBagLayout());
        panelManoJ1.setLayout(new BoxLayout(panelManoJ1,BoxLayout.Y_AXIS));
        panelMesaJ1.setLayout(new BoxLayout(panelMesaJ1,BoxLayout.Y_AXIS));
        panelManoJ2.setLayout(new BoxLayout(panelManoJ2,BoxLayout.Y_AXIS));
        panelMesaJ2.setLayout(new BoxLayout(panelMesaJ2,BoxLayout.Y_AXIS));
        
        //Definimos las propiedades del panel Juego
        fondo.setSize(MainInterfaz.marco.getSize());
        fondo.setAlignmentX(0.5f);
        DimensionPantalla.resizeImagen("/maagic/img/pantallazo.png", fondo);
        //Definimos propiedades de panelGridBag
        panelGridBag.setOpaque(false);
        //Definimos las propiedades de los paneles de cada jugador
        
        panelManoJ1.setBackground(Color.red);        
        panelMesaJ1.setBackground(Color.blue);
        panelManoJ2.setBackground(Color.yellow);
        panelMesaJ2.setBackground(Color.GREEN);
        
        //pruebas
        JButton b1=new JButton("K cojones?¿");
        //panelManoJ1.add(b1);
        //panelManoJ1.add(b1);
        //panelMesaJ2.add(b1);
        panelManoJ2.add(b1);
        
        //Añadimos los componentes, hay k definir las constrains
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        panelGridBag.add(panelManoJ1,c);
        c.gridx=1;
        panelGridBag.add(panelMesaJ1,c);
        c.gridx=2;
        panelGridBag.add(panelMesaJ2,c);
        c.gridx=3;
        panelGridBag.add(panelManoJ2,c);
        
        this.add(panelGridBag);
        
        this.add(fondo);
    }
    
}
