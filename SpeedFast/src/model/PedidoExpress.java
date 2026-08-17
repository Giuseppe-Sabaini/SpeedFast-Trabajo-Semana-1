package model;

/**
 * Esta clase representa un pedido express (Compra de Urgencia) en el sistema Speed Fast.
 * Evalúa la disponibilidad inmediata y cercania del repartidor para su asignacion.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class PedidoExpress extends Pedido {

    private String farmacia;
    private boolean disponibilidad;

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, String cliente, String farmacia, boolean disponibilidad) {
        super(idPedido, direccionEntrega, tipoPedido, cliente);
        this.farmacia = farmacia;
        this.disponibilidad = disponibilidad;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Express] Asignando Repartidor.");
        if (this.disponibilidad){
            System.out.println("-> Repartidor Mas Cercano Con Disponibilidad Inmediata Encontrado.");
            System.out.println("-> ID del Pedido: " + getIdPedido());
            System.out.println("-> Pedido Asignado a: " + nombreRepartidor);
            System.out.println("-> Farmacia: " + farmacia);
            System.out.println("-> Tipo de pedido: " + getTipoPedido());
            System.out.println("-> Direccion De Entrega: " + getDireccionEntrega());
            System.out.println("-> Cliente: " + getCliente());
        } else {
            System.out.println("No Se a Encontrado Repartidor Cercano..");
        }
        util.UtilPedido.mostrarSeparador();
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express] Asignando repartidor...");
        if (this.disponibilidad) {
            System.out.println("-> Repartidor Más Cercano Con Disponibilidad Inmediata Encontrado.");
            System.out.println("-> Pedido Listo Para Asignación Rápida.");
        } else {
            System.out.println("No Se a Encontrado Repartidor Cercano..");
        }
    }

}
