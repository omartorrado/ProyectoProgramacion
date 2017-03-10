/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JComponent;

/**
 *
 * @author Delio
 */
public class Dimensionpantalla {
    
    //Metodo para ajustar el tamaño del componente a la pantalla, manteniendo
    //La proporcion de tamaño original
    public static void resizeComponente(JComponent j){
    Toolkit tk=Toolkit.getDefaultToolkit();
    Dimension tamaño=tk.getScreenSize();
    Dimension tamañoNuevo=new Dimension(((int)((j.getWidth()/j.getRootPane().getWidth())*tamaño.getWidth())),((int)((j.getHeight()/j.getRootPane().getHeight())*tamaño.getHeight())));
    j.setSize(tamañoNuevo);
    /*
    //Ancho del componente
    int jW=j.getWidth();
    //Alto del componente
    int jH=j.getHeight();
    //Ancho del panel padre
    int pW=j.getRootPane().getWidth();
    //Alto del panel padre
    int pH=j.getRootPane().getHeight();
    //Formula generica
    int anchoNuevo=(int)((jW/pW)*tamaño.getWidth());
    int altoNuevo=(int)((jH/pH)*tamaño.getHeight());
    //Todo esto lo meto directamente en el constructor de tamañoNuevo
    */    
    }
    
    //Metodo para recolocar el componente adapatandose al cambio de resolucion
    public static void recolocarComponente(JComponent j){
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension tamaño=tk.getScreenSize();
        float proporcionH=tamaño.width/j.getRootPane().getWidth();
        float proporcionV=tamaño.height/j.getRootPane().getHeight();
        Point posicionNueva=new Point((int)(j.getLocation().x*proporcionH),(int)(j.getLocation().y*proporcionV));
        j.setLocation(posicionNueva);
                
    }
    
    //Meto ambos metodos en uno por comodidad. Los dejo escritos por separado por claridad
    public static void adaptarResolucion(JComponent j){
        resizeComponente(j);
        recolocarComponente(j);
    }
    
}
