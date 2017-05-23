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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    public boolean resizeControl=false;
    
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
        menu.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e) {
                if(menu.isShowing()){
                menu.fondo.setSize(marco.getSize());
                DimensionPantalla.resizeImagen("/maagic/img/ImagenFondo.jpg", menu.fondo);
                menu.logo.setSize(marco.getWidth()/3,marco.getHeight()/4);
                DimensionPantalla.resizeImagen("/maagic/img/logo.png",menu.logo);
                }
            }
        });
        marco.setVisible(true);
        
                
    }
    
}
