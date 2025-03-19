/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controlador;

/**
 *
 * @author Uniminuto Tibu
 */
import mvc.Modelo.ConsultasUsuarios;
import mvc.Modelo.Usuarios;
import mvc.Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlUsuarios implements ActionListener{
    private final Usuarios modelo;
    private final ConsultasUsuarios consultas;
    private final Vista vista;
    
    public CtrlUsuarios(Usuarios modelo, ConsultasUsuarios consultas, Vista vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.agregar.addActionListener(this);
        this.vista.Actualizar.addActionListener(this);
        this.vista.Eliminar.addActionListener(this);
        this.vista.Buscar.addActionListener(this);
        this.vista.Limpiar.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Usuarios");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.agregar) {
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEmail(vista.txtEmail.getText());

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }

        if (e.getSource() == vista.Actualizar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEmail(vista.txtEmail.getText());

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.Eliminar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == vista.Buscar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.buscar(modelo)) {
                vista.txtId.setText(String.valueOf(modelo.getId()));
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtEmail.setText(String.valueOf(modelo.getEmail()));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }

        if (e.getSource() == vista.Limpiar) {
            limpiar();
        }
    }
    
    public void limpiar() {
        vista.txtId.setText(null);
        vista.txtNombre.setText(null);
        vista.txtEmail.setText(null);
    }
}
