package model;

/**
 * Clase base que representa un pedido en el sistema Speed Fast.
 * Sirve como superclase para especializar diferentes tipos de entregas,
 * aplicando sobrecarga.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class Pedido {


    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;
    private String cliente;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, String cliente) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedidos) {
        this.idPedido = idPedidos;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando el Pedido a: " + nombreRepartidor);
    }

    public void asignarRepartidor() {
        System.out.println("Pedido Confirmado");
        System.out.println("Nombre del Cliente: " + cliente);
        System.out.println("Entrega: " + direccionEntrega);

    }
}
