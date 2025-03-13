package pkgsynchronized;

/**
 *
 * @author Usuario
 */
public class Synchronized {
    public static void main(String[] args) {
        Contador contador = new Contador(); 
        
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 10000; i ++) {
                contador.sumar(); // En este hilo lo que se hace es llamar al contador sumar 100 veces.
            }
        });
        
        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 10000; i ++) {
                contador.sumar(); // En este hilo lo que se hace es llamar al contador sumar 100 veces.
            }
        });
        
        hilo1.start();
        hilo2.start();
        
        try {
            hilo1.join();
            hilo2.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("El contador vale: " + contador.getContador());
    }
}
