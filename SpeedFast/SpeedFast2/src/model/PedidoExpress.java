package model;
/**
 * Representa un pedido de entrega rápida o exprés dentro del sistema SpeedFast.
 * Hereda de la clase abstracta  e implementa la lógica de cálculo
 * de tiempo basada en tramos de distancia.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class PedidoExpress extends Pedido {

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega(){

        int tiempoBase = 10;
        if (getDistanciaKm() > 5) {
            tiempoBase += 5;

        }
        return tiempoBase;
    }
}
