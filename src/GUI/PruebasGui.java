/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import maagic.Carta;
import maagic.Jugador;
import maagic.interfaz.InterfadSeleccion;
import maagic.interfaz.InterfadSeleccionfinal;
import maagic.interfaz.MainInterfaz;
import maagic.interfaz.MetodosBaseDatos;

/**
 *
 * @author otorradomiguez
 */
public class PruebasGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
            /*
            VentanaPrincipal v=new VentanaPrincipal();
            v.NuevoFrame();
            JFrame2 f=new JFrame2();
            f.iniciar();
            */
            //VentanaComponentes vc=new VentanaComponentes();
            //vc.ventanaComponentes();
        MainInterfaz mI=new MainInterfaz();

/*
JFrame f=new JFrame();
f.setSize(80,120);
f.add(new Carta());
f.setVisible(true);
*/
//        InterfadSeleccion seleccionar=new InterfadSeleccion();
//        Jugador("1");
//MetodosBaseDatos metodos=new MetodosBaseDatos();
//metodos.IniciarBase();
////metodos.insertarjugadores(1, "Jugador1");
//metodos.insertarjugadores(2, "Jugador2");
//metodos.seleccionarjugadores();
////metodos.Seleccionarcartas();
//InterfadSeleccionfinal interfad =new InterfadSeleccionfinal();
//interfad.setVisible(true);

//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(PruebasGui.class.getName()).log(Level.SEVERE, null, ex);
//        }
//   
Jugador("1");
    }
      public static void Jugador(String id) {
        try {
            
            String jugador="SELECT cartas FROM    jugadores   WHERE id=  "+id;
            Connection conn = MetodosBaseDatos.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(jugador);
            while(rs.next()){
                    int cId=rs.getInt("id");
                    String cnombre=rs.getString("nombre");
                    int cvida =rs.getInt("vida");
                    int cataque = rs.getInt("ataque");
                    int ccoste = rs.getInt("coste");
                    rs.getArray(cnombre);
                    System.out.println(cId + "," +cnombre+"," +cvida + "," + cataque + "," + ccoste);
//                    Carta c = new Carta(cId,cnombre,cvida, cataque, ccoste);
//                    this.baraja.add(c);

                }
                
           

    }   catch (SQLException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
