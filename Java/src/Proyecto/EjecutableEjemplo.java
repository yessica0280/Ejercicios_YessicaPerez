package Proyecto;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class EjecutableEjemplo implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Hola soy un ejecutable. " + LocalDateTime.now());
            Thread.sleep(3000);
            System.out.println("Adios soy un ejecutable. " + LocalDateTime.now());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
