package pedro_mvc;

/**
 *
 * @author Uniminuto Tibu
 */

import pedro_mvc.controlador.UsuarioControlador;
import pedro_mvc.modelo.UsuarioDAO;
import pedro_mvc.vista.UsuarioVista;

public class Pedro_MVC {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO, usuarioVista);
        
        usuarioControlador.iniciar();
    }
}
 