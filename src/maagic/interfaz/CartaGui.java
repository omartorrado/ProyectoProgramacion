/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class CartaGui extends JPanel {

    public JLabel vida, ataque, coste,fondo;
    public JPanel panelGrid;

    public CartaGui() {
        vida=new JLabel();
        ataque=new JLabel();
        coste=new JLabel();
        fondo=new JLabel();
        panelGrid= new JPanel();
                
        //this.setLayout(new OverlayLayout(this));
        this.setOpaque(false);
        this.setSize(80,120);
        fondo.setSize(160,200);
        this.setBorder(BorderFactory.createLineBorder(Color.yellow));
        //fondo.setIcon(new ImageIcon("/maagic/img/fondoCarta.png"));
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png", fondo);
        
        panelGrid.setOpaque(false);
        panelGrid.setSize(new Dimension(80,120));
        
        panelGrid.add(coste);
        
        panelGrid.add(ataque);
        
        panelGrid.add(vida);
                
        //this.add(panelGrid);
        this.add(fondo);
        
        
        /*
        DimensionPantalla.resizeImagen("/maagic/img/corazon.png", vida);
        DimensionPantalla.resizeImagen("/maagic/img/espada.png", ataque);
        DimensionPantalla.resizeImagen("/maagic/img/mana.png", coste);
        
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png",fondo);
        */
    }
}
