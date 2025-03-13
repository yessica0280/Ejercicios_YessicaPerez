package pkgsynchronized;

/**
 *
 * @author Usuario
 */
public class Contador {
    private int contador = 0;
    
    public synchronized void sumar() { 
        contador++;
    }
    
    public int getContador() {
        return contador;
    }
}
