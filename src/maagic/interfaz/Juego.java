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
        this.setSize(MainInterfaz.marco.getSize());
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
        fondo.addComponentListener(MainInterfaz.ajustarImagen);
        //Definimos propiedades de panelGridBag
        panelGridBag.setPreferredSize(this.getSize());
       
        panelGridBag.setOpaque(false);
        //Definimos las propiedades de los paneles de cada jugador
        panelManoJ1.setSize(this.getSize().width/4,this.getSize().height);
        panelManoJ1.setBackground(Color.red);        
        panelMesaJ1.setBackground(Color.blue);
        panelManoJ2.setBackground(Color.yellow);
        panelMesaJ2.setBackground(Color.GREEN);
        System.out.println(panelGridBag.getSize());
        
        //Defino las constraints iniciales
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.BOTH;
        c.weightx=this.getSize().width/4;
        c.weighty=this.getSize().height;
        //pruebas
        JButton b1=new JButton("K cojones?¿");
        panelManoJ1.add(b1);
        JButton b5=new JButton("K cojones?¿");
        panelMesaJ1.add(b5);
        JButton b3=new JButton("K cojones?¿");
        panelMesaJ2.add(b3);
        JButton b4=new JButton("K cojones?¿");
        panelManoJ2.add(b4);
        JButton b2=new JButton("es esta jodida mierda");
        panelGridBag.add(b2);
        
        //Añadimos los componentes, 
        panelGridBag.add(panelManoJ1,c);
        c.gridx=1;
        c.gridy=1;
        panelGridBag.add(panelMesaJ1,c);
        c.gridx=2;
        c.gridy=1;
        panelGridBag.add(panelMesaJ2,c);
        c.gridx=3;
        c.gridy=1;
        panelGridBag.add(panelManoJ2,c);
        
        this.add(panelGridBag);
        
        this.add(fondo);
    }
    
}
