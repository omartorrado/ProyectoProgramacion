/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Toolkit;
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
    
    public void initMain(){
        //Creamos el frame
        marco.setLocationRelativeTo(null);
        //marco.setUndecorated(true);
        marco.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //añadimos el menu
        menu= new Menu();
        menu.initComponents();
        marco.add(menu);
        //Lo hacemos visible
        marco.setVisible(true);
                
    }
    
}
