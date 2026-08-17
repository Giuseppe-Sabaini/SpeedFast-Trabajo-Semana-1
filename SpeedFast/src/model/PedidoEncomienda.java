package model;

/**
 * Esta clase representa un pedido de encomienda (Envio de Paquete) en el sistema Speed Fast.
 * Contiene la logica para validar el estado del embalaje y el limite de peso.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class PedidoEncomienda extends Pedido {

    private String paquete;
    private boolean pesoPaquete;
    private boolean embalaje;

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, String cliente, String paquete, boolean pesoPaquete, boolean embalaje) {
        super(idPedido, direccionEntrega, tipoPedido, cliente);
        this.paquete = paquete;
        this.pesoPaquete = pesoPaquete;
        this.embalaje = embalaje;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public boolean isPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(boolean pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public boolean isEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(boolean embalaje) {
        this.embalaje = embalaje;
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Entrega Paquete] Asignando Repartidor.");
        if (this.embalaje && this.pesoPaquete) {
            System.out.println("-> Verificando peso y embalaje..OK");
            System.out.println("-> ID del Pedido: " + getIdPedido());
            System.out.println("-> Tipo de Pedido: " + getTipoPedido());
            System.out.println("-> Pedido Asignado a: " + nombreRepartidor);
            System.out.println("-> Tipo de Paquete: " + paquete);
            System.out.println("-> Direccion de Entrega: " + getDireccionEntrega());
            System.out.println("-> Cliente: " + getCliente());
        } else {
            System.out.println("El Pedido no se Puede Asignar a: " + nombreRepartidor);
        }
        util.UtilPedido.mostrarSeparador();
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda] Asignando repartidor...");
        if (this.embalaje && this.pesoPaquete) {
            System.out.println("-> Validando peso y embalaje... OK");
            System.out.println("-> Pedido de encomienda listo para asignación.");
        } else {
            System.out.println("-> Error, No cumple con la verificacion de peso y embalaje.");
        }
    }
}
