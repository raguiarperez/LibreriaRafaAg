
package libreriaio;

/**
 * @author raguiarperez
 */
public class LibreriaIO {


    public static void main(String[] args) {
        float numero = IO.introducir(IO.VENTANA,IO.INT);
        IO.imprimir(numero, IO.VENTANA);
        System.out.println(numero);
                
        int numero2 = IO.introducirInt(IO.VENTANA);
        IO.imprimir(numero2, IO.CONSOLA);
        
        int numero3 = IO.introducirInt(IO.VENTANA,"¿cuantos coches tienes?");
        IO.imprimir(numero3, IO.VENTANA);
    }
}
