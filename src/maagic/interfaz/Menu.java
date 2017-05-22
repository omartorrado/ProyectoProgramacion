/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import miLibreria.DimensionPantalla;

/**
 *
 * @author otorradomiguez
 */
public class Menu extends JPanel{
    
    public JLabel fondo;
    public JLabel logo;
    public JPanel panelMenu;
    public JButton nuevaPartida;
    public JButton modificarBaraja;
    public JButton salir;
    
    public void initComponents(){
        
        //Tengo k buscar un layout que coloque bien las cosas encima unas de otras
        //kiza usar layered pane?
        this.setLayout(new OverlayLayout(this));
        
        fondo=new JLabel();
        fondo.setSize(MainInterfaz.marco.getSize());
        fondo.setAlignmentX(0.5f);
        DimensionPantalla.resizeImagen("/maagic/img/ImagenFondo.jpg", fondo);
        
        

        panelMenu=new JPanel();
        panelMenu.setLayout(new BoxLayout(panelMenu,BoxLayout.Y_AXIS));
        panelMenu.setOpaque(false);
        panelMenu.setSize(MainInterfaz.marco.getSize());
        
        logo= new JLabel();
        logo.setSize(MainInterfaz.marco.getWidth()/3,MainInterfaz.marco.getHeight()/4);
        DimensionPantalla.resizeImagen("/maagic/img/logo.png",logo);
        nuevaPartida=new JButton("Nueva partida");
        modificarBaraja=new JButton("Editar barajas");
        salir=new JButton("Salir al escritorio");
        
        logo.setAlignmentX(0.5f);
        nuevaPartida.setAlignmentX(0.5f);
        modificarBaraja.setAlignmentX(0.5f);
        salir.setAlignmentX(0.5f);
        nuevaPartida.setPreferredSize(new Dimension(100,100));
        
        //panelMenu.add(Box.createHorizontalStrut(MainInterfaz.marco.getWidth()/2));
        panelMenu.add(Box.createVerticalStrut(30));
        panelMenu.add(logo);
        panelMenu.add(Box.createVerticalStrut(MainInterfaz.marco.getHeight()/8));
        panelMenu.add(nuevaPartida);
        panelMenu.add(Box.createVerticalStrut(20));
        panelMenu.add(modificarBaraja);
        panelMenu.add(Box.createVerticalStrut(20));
        panelMenu.add(salir);
        //panelMenu.add(Box.createVerticalStrut(30));
        
        panelMenu.setAlignmentX(0.5f);
        this.add(panelMenu);
        this.add(fondo);

    }
}
