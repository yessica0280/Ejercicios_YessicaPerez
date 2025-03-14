package proyecto_base_datos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    static String bd = "Prueba";
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String password = "campus2023";
    static String driver = "com.mysql.cj.jdbc.Driver";
    
    public Conexion() {}
    
    public static Connection conectar() {
        Connection cx = null;
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection( url + bd, user, password);
            System.out.println("Se conecto a BD " +bd);
        }
        catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se conecto a BD " +bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return cx;
    }
}
