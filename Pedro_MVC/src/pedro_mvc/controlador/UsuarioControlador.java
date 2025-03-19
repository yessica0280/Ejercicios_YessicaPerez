package pedro_mvc.controlador;

import java.util.Scanner;
import pedro_mvc.modelo.Usuario;
import pedro_mvc.modelo.UsuarioDAO;
import pedro_mvc.vista.UsuarioVista;

/**
 *
 * @author Uniminuto Tibu
 */

// Controlador
// Permite manejar los datos entre el módelo y la vista.

public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }
    
    public void iniciar() {
        while (true) {
            System.out.println(" ---- Menu principal ---- ");
            System.out.println("1. Crear usuario.");
            System.out.println("2. Actuaizar usuario.");
            System.out.println("3. Eliminar usuario.");
            System.out.println("4. Buscar usuario");
            System.out.println(":");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.insertUsuario(nuevoUsuario);
                    System.out.println(nuevoUsuario);
                    break;
                    
                case 2:
                    Usuario nuevoUsuario1 = usuarioVista.actualizarUsuario();
                    usuarioDAO.actualizarUsuario(nuevoUsuario1);
                    System.out.println(nuevoUsuario1);
                    break;
                    
                case 3:
                    Usuario nuevoUsuario2 = usuarioVista.EliminarUsuario();
                    usuarioDAO.EliminarUsuario(nuevoUsuario2);
                    break;
                    
                case 4:
                    Usuario nuevoUsuario3 = usuarioVista.buscarUsuarios();
                    usuarioDAO.buscarUsuarios(nuevoUsuario3);
                    break;
            }
        }
    }
}
