package proyecto_base_datos;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Zapatos {
    public void mostrarDatos() {
        String query = "select * from zapatos;";
        
        try {
            Connection conex = Conexion.conectar(); // Se establece la conexion con bd
            PreparedStatement ps = conex.prepareStatement(query);// Se prepara el comando a realizar
            ResultSet rs = ps.executeQuery();
        
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int talla = rs.getInt("talla");
                int precio = rs.getInt("precio");
                System.out.println("Id: " + id + "\nNombre: " + nombre + "\nTalla: " + talla + "\nPrecio: " + precio);
            }
        }
        catch(SQLException ex) {
            System.out.println("Error al leer los datos");
            ex.printStackTrace();
        }
    }
}
