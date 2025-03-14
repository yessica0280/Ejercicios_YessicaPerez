package proyecto_base_datos;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto_Base_Datos {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection cone = con.conectar();
        Proyecto_Base_Datos base = new Proyecto_Base_Datos(); 
        
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
                
            case 2:
                System.out.println("---- Agregar zapatos ----");
                System.out.println("Por favor ingresa el nuevo nombre: "); 
                String nombre = scan.nextLine();
                System.out.println("Por favor ingresa la nueva talla: ");
                int talla = scan.nextInt();
                System.out.println("Por favor ingresa el nuevo precio: ");
                int precio = scan.nextInt();
                Zapatos.agregarZapatos(nombre, talla, precio);
                break;
                
            case 3:
                System.out.println("---- Actualizar zapatos ----");
                System.out.println("Por favor ingresa el nombre: ");
                String nombre1 = scan.nextLine();
                System.out.println("Por favor ingresa la talla: ");
                int talla1 = scan.nextInt();
                System.out.println("Por favor ingresa el precio: ");
                int precio1 = scan.nextInt();
                /*Zapatos.agregarZapatos(nombre, talla, precio);*/
                break;
                
            case 4:
                
        }
    } 
}
