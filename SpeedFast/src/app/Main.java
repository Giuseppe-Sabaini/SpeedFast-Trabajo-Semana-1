package app;


import util.UtilPedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

/**
 * Clase principal del sistema Speed Fast.
 * Permite ejecutar la aplicacion, instanciar los diferentes tipos de pedidos
 * y probar la logica de asignacion de repartidores mediante polimorfismo.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class Main {


    public static void main(String[] args) {

        UtilPedido.mostrarTitulo(
                "SPEED FAST - SISTEMA DE PEDIDOS"
        );


        PedidoComida comida = new PedidoComida(
                9283,
                "Santiago Centro",
                "Comida",
                "Jerrie",
                "Hamburgesa",
                "Restaurante Azafrán",
                true

        );
        comida.asignarRepartidor("Juan Pérez");


        PedidoEncomienda encomienda = new PedidoEncomienda(
                2845,
                "Viña Del Mar",
                "Paquete",
                "Javier",
                "Fragil",
                true,true

        );
        encomienda.asignarRepartidor("Yuyito");


        PedidoExpress express = new PedidoExpress(
                7932,
                "Valparaiso",
                "Medicamentos",
                "Lupita",
                "Farmacia Cruz Verde",
                true
        );
        express.asignarRepartidor("Yuyito");

    }

}