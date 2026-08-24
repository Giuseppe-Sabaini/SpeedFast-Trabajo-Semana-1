package model;
/**
 * Representa la clase abstracta base para los diferentes tipos de pedidos
 * en el sistema de logística SpeedFast.
 * Centraliza los atributos y comportamientos comunes de un pedido.
 *
 * @author Giuseppe Sabaini
 * @version 1.0
 */

public abstract class Pedido {
    private String idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract int calcularTiempoEntrega();


    public void mostrarResumen() {

        util.UtilPedido.mostrarTitulo();

        System.out.println(getClass().getSimpleName() + " #" + idPedido);
        System.out.println("-> Direccion: " + direccionEntrega);
        System.out.println("-> Distancia: " + (int)distanciaKm + " km");
        System.out.println("Tiempo Estimado De Entrega: " + calcularTiempoEntrega() + " minutos");

        util.UtilPedido.mostrarSeparador();

    }

}
