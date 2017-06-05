/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

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
                
        this.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        this.setLayout(new OverlayLayout(this));
        
        this.setSize(160,200);
        fondo.setSize(160,200);
        
        
        panelGrid.setSize(new Dimension(160,200));
        panelGrid.setLayout(new GridLayout(2,2));
        
        vida.setSize(40,40);
        ataque.setSize(40,40);
        coste.setSize(40,40);
        
        
        
        panelGrid.add(coste);
        
        panelGrid.add(Box.createGlue());
        
        panelGrid.add(ataque);
        
        panelGrid.add(vida);
        
        panelGrid.setAlignmentX(0f);
        coste.setHorizontalAlignment(0);
        ataque.setHorizontalAlignment(0);
        vida.setHorizontalAlignment(0);
        
        DimensionPantalla.resizeImagen("/maagic/img/corazon.png", vida);
        DimensionPantalla.resizeImagen("/maagic/img/espada.png", ataque);
        DimensionPantalla.resizeImagen("/maagic/img/mana.png", coste);
        
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png",fondo);
                
        this.add(panelGrid);
        this.add(fondo);
              
        panelGrid.setOpaque(false);
        this.setOpaque(false);
    }
}
