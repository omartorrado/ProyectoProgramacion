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
import javax.swing.JFrame;

/**
 *
 * @author Delio
 */
import javax.swing.JPanel;
public class DimensionPantalla extends JPanel{
    
    
    
    public static void adaptarFrame(JFrame f){
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension tamaño=tk.getScreenSize();
        System.out.println("Nuevo tamaño: "+tamaño.toString());
        System.out.println("Antiguo tamaño: "+f.getSize());
        f.setSize(tamaño);
        System.out.println("Tamaño modificado: "+f.getSize());
        
        f.setLocationRelativeTo(null);
    }
    
    //Metodo para ajustar el tamaño del componente a la pantalla, manteniendo
    //La proporcion de tamaño original
    public static void resizeComponente(JComponent j){
    Toolkit tk=Toolkit.getDefaultToolkit();
    Dimension tamaño=tk.getScreenSize();
    float proporcionH=(float)tamaño.width/(float)j.getRootPane().getWidth();
    float proporcionV=(float)tamaño.height/(float)j.getRootPane().getHeight();
    Dimension tamañoNuevo=new Dimension((int)((float)j.getWidth()*proporcionH),(int)((float)j.getHeight()*proporcionV));
    System.out.println("Componente"+j.toString());
    System.out.println("Tamaño original: "+j.getWidth()+" "+j.getHeight());
        System.out.println("Tamaño del panel Root: "+j.getRootPane().getWidth());
    j.setSize(tamañoNuevo);
    System.out.println("Nuevo tamaño: "+j.getWidth()+" "+j.getHeight());
    
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
        float proporcionH=(float)tamaño.width/(float)j.getRootPane().getWidth();
        float proporcionV=(float)tamaño.height/(float)j.getRootPane().getHeight();
        Point posicionNueva=new Point((int)(j.getLocation().x*proporcionH),(int)(j.getLocation().y*proporcionV));
        //Test
        System.out.println("location original:"+j.getLocation().x+" "+j.getLocation().y);
        System.out.println("proporcion: "+proporcionH+" "+proporcionV);
        //End Test
        j.setLocation(posicionNueva);
        //Test
        System.out.println("Posicion nueva :"+j.getLocation());
        //End Test        
    }
    
    //Meto ambos metodos en uno por comodidad. Los dejo escritos por separado por claridad
    public static void adaptarResolucion(JComponent j){
        resizeComponente(j);
        recolocarComponente(j);
              
        
    }
    public static void  TransparentarJpanel (JPanel x){
x.setOpaque(false);


}
    
}
