package Proyecto;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        
        // Tuve varios problemas con los nombres de las clases y el package porque los tenia como java y no me funcionaba
        // entonces asumi que eso tiene que ver con algo que trae interno en la creación de hilos.
         
        HiloEjemplo hiloEjemplo = new HiloEjemplo(); // Es la clase que se hereda del Threads.
        hiloEjemplo.start(); // Se ejecuta el método starts el cual va a hacer que se ejecute en segundo plano.
        
        EjecutableEjemplo ejecutableEjemplo = new EjecutableEjemplo();
        Thread thread = new Thread(ejecutableEjemplo); // acepta un ejecutable (Runnable).
        thread.start();
        
        // LocalDateTime.now() Sirve para indicar el tiempo en que se inicializara y finaliza un hilo.
    }
}
