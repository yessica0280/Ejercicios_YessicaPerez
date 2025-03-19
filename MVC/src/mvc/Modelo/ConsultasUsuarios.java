package mvc.Modelo;

/**
 *
 * @author Uniminuto Tibu
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasUsuarios extends Conexion{
    
    public boolean registrar(Usuarios u) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "insert into usuarios(nombre, email) values (?,?)";
        
        try {
            ps = con.prepareStatement((sql));
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean modificar(Usuarios u) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "update usuarios set nombre = ?, email = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);    
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setInt(3, u.getId());
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean eliminar(Usuarios u) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "delete from usuarios where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, u.getId());
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean buscar(Usuarios u) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "select * from usuarios where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, u.getId());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                u.setId(Integer.parseInt(rs.getString("id")));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
