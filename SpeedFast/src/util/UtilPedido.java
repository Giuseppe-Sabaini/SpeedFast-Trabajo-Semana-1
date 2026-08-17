package util;

/**
 * Clase de utilidad para formatear la salida en consola del sistema Speed Fast.
 * Proporciona métodos estáticos para imprimir títulos y separadores visuales.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class UtilPedido {

public static void mostrarTitulo(String titulo) {

    System.out.println();
    System.out.println("========================================");
    System.out.println(titulo);
    System.out.println("========================================");

   }

    public static void mostrarSeparador() {
        System.out.println("----------------------------------------");
    }
}
