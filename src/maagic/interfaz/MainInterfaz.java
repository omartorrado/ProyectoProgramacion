/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class MainInterfaz {
    
    public static JFrame marco=new JFrame();
    public Menu menu;
    public JPanel juego;
    
    public MainInterfaz(){
        initMain();
    }
    
    public void initMain(){
        //Creamos el frame
        //marco.setUndecorated(true);
        marco.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        //añadimos el menu
        menu= new Menu();
        marco.add(menu);
        //Lo hacemos visible
        marco.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e) {
                menu.fondo.setSize(marco.getSize());
                DimensionPantalla.resizeImagen("/maagic/img/ImagenFondo.jpg", menu.fondo);
                menu.fondo.repaint();
                menu.fondo.revalidate();
            }
            
        });
        marco.setVisible(true);
        
                
    }
    
}
