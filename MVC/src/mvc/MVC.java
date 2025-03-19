package mvc;

/**
 *
 * @author Uniminuto Tibu
 */

import mvc.Controlador.CtrlUsuarios;
import mvc.Modelo.ConsultasUsuarios;
import mvc.Modelo.Usuarios;
import mvc.Vista.Vista;

public class MVC {
    public static void main(String[] args) {
        Usuarios us = new Usuarios();
        ConsultasUsuarios cons = new ConsultasUsuarios();
        Vista vis = new Vista();
        
        CtrlUsuarios ctrl = new CtrlUsuarios(us, cons, vis);
        ctrl.iniciar();
        vis.setVisible(true);
    }
    
}
