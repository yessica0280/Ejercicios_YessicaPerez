package pedro_mvc.vista;

import java.util.List;
import java.util.Scanner;
import pedro_mvc.modelo.Usuario;

/**
 *
 * @author Uniminuto Tibu
 */
public class UsuarioVista {
    Scanner sc = new Scanner(System.in);
    public void mostrarUsuario(List<Usuario> usuarios) {
        System.out.println("Lista del usuarios: ");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
    
    public Usuario agregarUsuario() {
        System.out.println("Datos para un nuevo usuario: ");
        System.out.println("Nombre: ");
        
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }
    
    public Usuario actualizarUsuario() {
        System.out.println("Datos para un nuevo usuario: ");
        System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        return new Usuario(id,nombre,email);
    }
    
    public Usuario EliminarUsuario() {
        System.out.println("Id: ");
        int id = sc.nextInt();
        return new Usuario(id);
    }
    
    public Usuario buscarUsuarios() {
        System.out.println("Datos para un nuevo usuario: ");
        System.out.println("Id: ");
        int id = sc.nextInt();
        return new Usuario(id);
    }
}
