package Proyecto;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class HiloEjemplo extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Hola soy un hilo. " + LocalDateTime.now());
            Thread.sleep(4000); // Son los segundos para que aparezca el mensaje.
            System.out.println("Adios soy un hilo. " + LocalDateTime.now());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
