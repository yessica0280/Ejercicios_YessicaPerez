package mvc.Modelo;

/**
 *
 * @author Uniminuto Tibu
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con = null;
    
    String url = "jdbc:mysql://bog4kfhaixynbid5hg1n-mysql.services.clever-cloud.com:3306/bog4kfhaixynbid5hg1n";
    String usuario = "uaoamehd1sqpji95";
    String password = "vv5qoNy2O9ADdBzNehpI";
    
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, password);
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
 }
