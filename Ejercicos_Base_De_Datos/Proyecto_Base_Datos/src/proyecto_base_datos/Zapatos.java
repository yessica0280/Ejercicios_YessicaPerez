package proyecto_base_datos;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Zapatos {
    public void mostrarDatos() {
        // Ver los zapatos.
        String query = "select * from zapatos;";
        
        try {
            Connection cone = Conexion.conectar(); // Se establece la conexion con bd
            PreparedStatement ps = cone.prepareStatement(query);// Se prepara el comando a realizar
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
    
    // Agregar zapatos.
    public void agregarZapatos(String nombre, int talla, int precio) {
        String query = "insert into Zapatos(nombre, talla, precio) values(?,?,?);";
        try {
            Connection cone = Conexion.conectar(); 
            PreparedStatement ps = cone.prepareStatement(query);
            ps.setString(2, nombre);
            ps.setInt(3, talla);
            ps.setInt(4, precio);
            
            ps.executeUpdate();
            System.out.println("El zapato fue agregado con exito.");
        }
        catch(SQLException ex) {
            System.out.println("Error al agregar el zapato");
            ex.printStackTrace();
        }
    }
}
