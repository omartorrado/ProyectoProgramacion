/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Label.CENTER;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class CartaVacia extends JPanel {

    public JLabel fondoVacio;

    public CartaVacia() {
        fondoVacio = new JLabel();
        this.setSize(160, 200);
        fondoVacio.setSize(160, 200);
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png",fondoVacio);
        fondoVacio.setHorizontalAlignment(0);
        this.add(fondoVacio);
        this.setAlignmentX(0f);
        fondoVacio.setAlignmentY(0.5f);
        fondoVacio.setVerticalAlignment(CENTER);
        fondoVacio.setPreferredSize(new Dimension(160, 200));
        this.setBorder(BorderFactory.createLineBorder(Color.blue));
        
        this.setOpaque(false);
    }
}
