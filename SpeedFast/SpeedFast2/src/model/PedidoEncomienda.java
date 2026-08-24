package model;
/**
 * Representa un pedido de envío de encomiendas o paquetes dentro del sistema SpeedFast.
 * Hereda de la clase abstracta e implementa el cálculo
 * de tiempo de entrega ajustado a números enteros.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */
public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * getDistanciaKm()));
    }
}
