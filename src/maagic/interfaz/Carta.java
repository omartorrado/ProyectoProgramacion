/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

/**
 *
 * @author otorradomiguez
 */
public class Carta extends JPanel {

    public JLabel vida, ataque, coste,fondo;
    public JPanel panelGrid;

    public Carta() {
        vida=new JLabel();
        ataque=new JLabel();
        coste=new JLabel();
        fondo=new JLabel();
        panelGrid= new JPanel();
                
        this.setLayout(new OverlayLayout(this));
        this.setOpaque(false);
        this.setSize(80,120);
        
        fondo.setIcon(new ImageIcon("/maagic/img/fondoCarta.png"));
        
        panelGrid.setLayout(new GridLayout(3, 4));
        panelGrid.setOpaque(false);
        panelGrid.setSize(new Dimension(80,120));
        
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(coste);
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(Box.createGlue());
        panelGrid.add(ataque);
        panelGrid.add(Box.createGlue());
        panelGrid.add(vida);
                
        this.add(panelGrid);
        this.add(fondo);
        
        
        /*
        DimensionPantalla.resizeImagen("/maagic/img/corazon.png", vida);
        DimensionPantalla.resizeImagen("/maagic/img/espada.png", ataque);
        DimensionPantalla.resizeImagen("/maagic/img/mana.png", coste);
        
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png",fondo);
        */
    }
}
