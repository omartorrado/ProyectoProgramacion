/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Delio
 */
//Esta todo como ejemplo hay que modificar algunas cosas e integrarlo en la interfad
// metodos como insertar borrar o modificar serían los que irian en la parte grafica
//directamente, o podriamos cojerlos de aqui realizando algunos retoques 
//Todos los metodos tienen explicacion
public class MetodosBaseDatos {
  public Connection conexion;
   public static ArrayList<String> nombres= new ArrayList<String>();
  public static ArrayList<String> barajas= new ArrayList<String>();
    public static Connection conectar() {
        // Conectamos con la base de datos ya creada 
        String url = "jdbc:sqlite:maagic.db";
        Connection conn = null;
                
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void IniciarBase() throws ClassNotFoundException {
        try {
            //Cojemos la tabla con la url
            String url = "jdbc:sqlite:maagic.db";
            //le pasamos el Class.forName
            Class.forName("org.sqlite.JDBC");
            this.conexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Si hay conexion  se cierra si no pasa el error
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Se inicio la base correctamente");
    }

    public boolean Creartabla(String Nombretabla, String... campo) throws SQLException {
        try {
            String consulta = "CREATE TABLE " + Nombretabla;
            for (int i = 0; i < campo.length; i++) {
                if (i == (campo.length - 1)) {
                    consulta = consulta + campo[i];
                } else {
                    consulta = consulta + campo[i] + ", ";
                }
            }

            Connection conn = MetodosBaseDatos.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));
            }
            return true;
        } catch (SQLException e) {
            return false;

        }
    }

        

    public void crearBase(String nombredelarchivo) {
        //Le pasamos la url para poder añadirsela en el main
        String url = "jdbc:sqlite:" + nombredelarchivo;
        //hacemos un try catch por  posibles errores
        try (Connection conn = DriverManager.getConnection(url)) {
            //Si la conexión es nula nos crea otra database
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                //Mostramos por pantalla los datos, lo primero que mostramos es si estan los drivers en funcionamiento.
                //Lo segundo es una comprobación para mostrar que se creo la tabla
                System.out.println("El nombre del driver es " + meta.getDriverName());
                System.out.println("La nueva base de datos a sido creada con exito .");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean Seleccionar(String nombretabla, String... campo) {
       try {
            String consulta = "SELECT";
            for (int i = 0; i < campo.length; i++) {
                if (i == (campo.length - 1)) {
                    consulta = consulta + campo[i] + " from " + nombretabla;
                } else {
                    consulta = consulta + campo[i] + ", ";
                }

            }
            Connection conn = MetodosBaseDatos.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));
            }
            return true;

        } catch (SQLException e) {
            return false;
        }
//       Esta es parte antigua que funciona
//        Seleccionamos lo que queremos 
//        String sql = "SELECT id, nombre, vida, ataque, coste FROM Cartas";
//
//        try (Connection conn = this.conectar();
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery(sql)) {
//
//             Imprimimos los resultados por pantalla con un while 
//            while (rs.next()) {
//                System.out.println(rs.getString("id") + "\t"
//                        + rs.getString("nombre") + "\t"
//                        + rs.getInt("vida") + "\t"
//                        + rs.getInt("ataque") + "\t"
//                        + rs.getInt("coste"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
    }

    public boolean insertar(String tabla, String... values) {
       String consulta = "insert into" + tabla + "values(";
        try {
            String insertar = "insert into " + tabla + " values(";
            for (int i = 0; i < values.length; i++) {
                if (i == (values.length - 1)) {
                    insertar = insertar + "'" + values[i] + "')";
                } else {
                    insertar = insertar + "'" + values[i] + "', ";
                }
            }
            Connection conn = MetodosBaseDatos.conectar();
            Statement st = conn.createStatement();
            st.executeUpdate(insertar);
            return true;
        } catch (SQLException e) {
            return false;
        }
       //Codigo que funciona de insertar 
        //Insertamos los datos 
        //String sql = "INSERT INTO Cartas(id,nombre,vida,ataque,coste) VALUES(?,?,?,?,?)";
        //try (Connection conn = this.conectar();
                //PreparedStatement pstmt = conn.prepareStatement(sql)) {

            //le pasamos los parametros que insertamos 
            //pstmt.setInt(1, carta.getId());
            //pstmt.setString(2, carta.getNombre());
            //pstmt.setInt(3, carta.getVida());
            //pstmt.setInt(4, carta.getAtaque());
            //pstmt.setInt(5, carta.getCoste());
            //y insertamos
            //pstmt.executeUpdate();
        //} catch (SQLException e) {
           // System.out.println(e.getMessage());
        //}
    }

    public boolean actualizar(String nombretabla, String campoid, String id, String... campos) {
        try {
            //Le paso el String de la consulta actualizar 
            String actualizar = "update" + nombretabla + "set";
            //Creamos un for con el que podemos pasar los datos de cualquier tabla pasandole sus campos
            //cogemos el 
            for (int i = 0; i < campos.length; i++) {
                if (i == (campos.length - 1)) {
                    actualizar = actualizar + "'" + campos[i] + "where id=" + campoid + "=" + id + ";";
                } else {
                    actualizar = actualizar + "'" + campos[i] + "where id=" + campoid + "=" + id + ";";
                }
            }
            Connection conn = MetodosBaseDatos.conectar();
            Statement st = conn.createStatement();
            st.executeUpdate(actualizar);
            return true;
        } catch (SQLException e) {
            return false;
        }
       //Codigo que funciona de actualizar 
        //Pasamos el String para actualizar 
        //String sql = "UPDATE Cartas SET nombre = ? , "
              //  + "vida = ? "
                //+ "ataque = ? "
                //+ "coste = ? "
                //+ "WHERE id = ?";

        //try (Connection conn = this.conectar();
                //PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // le pasamos el parametro correspondiente que queremos actualizar 
            //pstmt.setInt(1, carta.getId());
            //pstmt.setString(2, carta.getNombre());
            //pstmt.setInt(3, carta.getVida());
            //pstmt.setInt(4, carta.getAtaque());
            //pstmt.setInt(5, carta.getCoste());
            // y actualizamos 
            //pstmt.executeUpdate();
        //} catch (SQLException e) {
            //System.out.println(e.getMessage());
        //}
    }

    public void cerrar() {
        try {
            conexion.close();
            System.out.println("Cerrado exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage() + "Error al cerrar la base de datos");
        }
    }

    public void borrar(String id) {
        //borramos de la tabla
        String sql = "DELETE FROM Cartas WHERE id = ?";
//le pasamos el id i borra toda la fila seleccionada
        try (Connection conn = MetodosBaseDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // le pasamos el parametro correspondiente
            pstmt.setString(1, id);
            // ejecutamos 
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public void borrarjugadores(String id){
    String sql="DELETE FROM jugadores WHERE idjugadores  =?";
    try (Connection conn = MetodosBaseDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
    pstmt.setString(1, id);
    
     pstmt.executeUpdate();
    }
    catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void seleccionarjugadores(){
         String sql="SELECT  idJugador,nombre   FROM   jugadores";
       try {
           Connection conn = MetodosBaseDatos.conectar();
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
       
           
         
           while(rs.next()){
               nombres.add(rs.getString("nombre"));
               rs.getInt("idJugador");
           }
          
         
           
       } catch (SQLException ex) {
           Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
       
      
    
    public void seleccionarjugador(String jugador){
       try {
           String sql="SELECT  idJugador,nombre   FROM   jugadores";
           Connection conn = MetodosBaseDatos.conectar();
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
           rs.getString("nombre");
           
           } catch (SQLException ex) {
           Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    
    
   
    
    
    public void insertarjugadores(int id,String nombre){
   String sql="INSERT INTO jugadores(idJugador,    nombre) VALUES(?,?)";
    try (Connection conn = MetodosBaseDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

//            le pasamos los parametros que insertamos 
           pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
//            y insertamos
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public void insertarcartas(int id,  String nombre,  int vida,   int ataque, int coste){
    String sql="INSERT  INTO    Cartas(id,  nombre, vida,   ataque, coste)  VALUES(?,?,?,?,?)";
     try (Connection conn = MetodosBaseDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

//            le pasamos los parametros que insertamos 
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setInt(3, vida);
            pstmt.setInt(4, ataque);
            pstmt.setInt(5, coste);
//            y insertamos
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    
    
    
    
    }
    
    public void Seleccionarcartas() {
        //Seleccionamos lo que queremos 
        String sql = "SELECT id, nombre, vida, ataque, coste FROM Cartas";

        try (Connection conn = this.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // Imprimimos los resultados por pantalla con un while 
            while (rs.next()) {
                System.out.println(rs.getString("id") + "\t"
                        + rs.getString("nombre") + "\t"
                        + rs.getInt("vida") + "\t"
                        + rs.getInt("ataque") + "\t"
                        + rs.getInt("coste"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}
    public void insertarbarajas(int idJugador,int idBaraja,Array cartas){
    String sql="INSERT INTO barajas(idJugador,  cartas, idBaraja)   VALUES(?,?,?)";
      try (Connection conn = MetodosBaseDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

//            le pasamos los parametros que insertamos 
            pstmt.setInt(1, idJugador);
            pstmt.setArray(2,cartas );
            pstmt.setInt(3,idBaraja );
//            y insertamos
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void seleccionarbarajas(){
      String sql="SELECT  idBaraja,cartas,idJugador   FROM   jugadores";
       try {
           Connection conn = MetodosBaseDatos.conectar();
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(sql);
       
           
         
           while(rs.next()){
               barajas.add(rs.getString("idBaraja"));
               rs.getArray("cartas");
               rs.getInt("idJugador");
           }
          
         
           
       } catch (SQLException ex) {
           Logger.getLogger(MetodosBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
