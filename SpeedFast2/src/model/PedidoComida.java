package model;
/**
 * Representa un pedido de comida rápida dentro del sistema SpeedFast.
 * Hereda de la clase abstracta  e implementa el cálculo
 * de tiempo de entrega específico para alimentos.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */
public class PedidoComida  extends  Pedido {

    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega(){
        return (int) (15 + (2 * getDistanciaKm()));
    }
}
