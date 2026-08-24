package app;
/**
 * Clase principal de ejecución para la aplicación SpeedFast.
 * Contiene el punto de entrada (main) donde se instancian los diferentes
 * tipos de pedidos y se visualizan sus resúmenes por consola.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida("011","Santiago", 10);
        Pedido pedido2 = new PedidoEncomienda("020", "Viña Del Mar", 14);
        Pedido pedido3 = new PedidoExpress("040", "Valparaiso" , 7);

        pedido2.mostrarResumen();
        pedido1.mostrarResumen();
        pedido3.mostrarResumen();

    }


}