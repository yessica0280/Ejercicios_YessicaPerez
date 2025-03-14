package proyecto_base_datos;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto_Base_Datos {
    public static void main(String[] args) {
        /*Conexion con = new Conexion();
        Connection cone = con.conectar();
        Proyecto_Base_Datos base = new Proyecto_Base_Datos(); */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---- Menú principal ----");
        System.out.println("1. Ver zapatos");
        System.out.println("2. Agregar zapatos");
        System.out.println("3. Actualizar zapatos");
        System.out.println("4. Eliminar zapatos");
        System.out.println("5. Salir del programa");
        System.out.println("Por favor elije una opción: ");
        int opcion = scan.nextInt();
        
        switch(opcion) {
            case 1:
                Zapatos zapatos = new Zapatos();
                zapatos.mostrarDatos();
                break;
        }
    }    
}
