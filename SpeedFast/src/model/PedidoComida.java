package model;

import util.UtilPedido;

/**
 * Esta clase representa un pedido de comida rapida dentro del sistema Speed Fast.
 * Incluye la verificación de la mochila termica para asegurar la temperatura de los alimentos.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public class PedidoComida extends Pedido {
    private String tipoOrden;
    private String restaurante;
    private boolean mochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, String cliente, String tipoOrden, String restaurante, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, tipoPedido,  cliente);
        this.tipoOrden = tipoOrden;
        this.restaurante = restaurante;
        this.mochilaTermica = mochilaTermica;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isMochilaTermica() {
        return mochilaTermica;
    }

    public void setMochilaTermica(boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida] Asignando repartidor.");
        if (this.mochilaTermica){
            System.out.println("-> Verificando Mochila Termica...OK");
            System.out.println("-> ID Del Pedido: " + getIdPedido());
            System.out.println("-> Restaurante: " + restaurante);
            System.out.println("-> Tipo de Pedido: " + getTipoPedido());
            System.out.println("-> Orden: " + tipoOrden);
            System.out.println("-> Direccion de Entrega: " + getDireccionEntrega());
            System.out.println("-> Cliente: " + getCliente());
            System.out.println("-> Pedido asignado a: " + nombreRepartidor);
        }else{
            System.out.println("-> No se puede asignar a: " + nombreRepartidor + "No Lleva Mochila Termica");
        }
        util.UtilPedido.mostrarSeparador();
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida] Asignando repartidor...");
        if (this.mochilaTermica) {
            System.out.println("-> Verificando Mochila Térmica... OK");
            System.out.println("-> Pedido listo para asignación.");
        } else {
            System.out.println("-> Error, Requiere repartidor con Mochila Térmica.");
        }
    }


}
