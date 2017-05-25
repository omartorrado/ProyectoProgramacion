/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    Connection conexion;

    public static Connection conectar() {
        // Conectamos con la base de datos ya creada 
        String url = "jdbc:sqlite:CartasBase";
        Connection conn 
                = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void IniciarTabla() throws ClassNotFoundException {
        try {
            //Cojemos la tabla con la url
            String url = "jdbc:sqlite:CartasBase.db";
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

    public void Creartabla() {
        //Donde va a crear la tabla
        String url = "jdbc:sqlite:CartasBase.db";
        //Le pasamos los datos para crear la tabla 
        String sql = "CREATE TABLE IF NOT EXISTS Alumnos (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	nombre text NOT NULL,\n"
                + "	apellidos real\n"
                + "	Curso real\n"
                + ");";
        //Realizamos un try catch en donde optenemos la conexion y la igualamos a DriverManager.getConnection(url);
        //para que lo iguale a la url
        try (Connection conexion = DriverManager.getConnection(url);
                Statement stmt = conexion.createStatement()) {
            // Creamos una nueva tabla
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

    public void Seleccionar() {
        //Seleccionamos lo que queremos 
        String sql = "SELECT id, nombre, apellidos FROM Cartas";

        try (Connection conn = this.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // Imprimimos los resultados por pantalla con un while 
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("nombre") + "\t"
                        + rs.getDouble("apellidos"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertar(String nombre, String apellidos) {
        //Insertamos los datos 
        String sql = "INSERT INTO alumnos(nombre,apellidos,curso) VALUES(?,?)";
        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //le pasamos los parametros que insertamos 
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            //y insertamos
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizar(int id, String nombre, String apellidos) {
        //Pasamos el String para actualizar 
        String sql = "UPDATE Cartas SET nombre = ? , "
                + "apellidos = ? "
                + "WHERE id = ?";

        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // le pasamos el parametro correspondiente que queremos actualizar 
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            pstmt.setInt(3, id);
            // y actualizamos 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void borrar(int id) {
        //borramos de la tabla
        String sql = "DELETE FROM alumnos WHERE id = ?";
//le pasamos el id i borra toda la fila seleccionada
        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // le pasamos el parametro correspondiente
            pstmt.setInt(1, id);
            // ejecutamos 
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
