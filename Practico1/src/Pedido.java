
import java.util.ArrayList;

/**Un pedido está representado por un número, una fecha de entrega, un cliente y una
colección de artículos cada uno con cantidad y precio unitario. Los pedidos son
cancelados por una serie de remitos que contienen uno o varios artículos del pedido. El
pedido puede estar abierto (se le pueden agregar artículos, pero no remitos), cerrado (se
le pueden agregar remitos, no artículos) o entregado (no se le pueden agregar artículos
ni remitos)
*/

/**
 * Se entiende que el pedido tiene 3 estados, "abierto", "cerrado" y "entregado".
 * Se implementaria un patron State para resolver las operaciones de agregar articulos y agregar remitos
 * Cada uno resolvera el mensaje de manera pertinente
 */
public class Pedido {
    
    private int numero;
    private String cliente;
    private ArrayList <Articulo> articulos;
    private ArrayList <Remito> remitos;
    private String fecha;
    private Estado estado;
    
    public Pedido(int numero, String cliente, String fecha){
        this.cambiarEstadoAbierto();
        this.setNumero(numero);
        this.setCliente(cliente);
        this.setFecha(fecha);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void cambiarEstadoCerrado(){
        this.setEstado(new Cerrado());
    }
    
    public void cambiarEstadoEntregado(){
        this.setEstado(new Entregado());
    }
    
    public void cambiarEstadoAbierto(){
        this.setEstado(new Abierto());
    }
    
    public void agregarArticulo(float precio, int cantidad, ArrayList<Articulo> articulos){
        estado.agregarArticulos(precio, cantidad, articulos);
    }

    public void agregarRemito(String descripcion, ArrayList<Remito> remito){
        estado.agregarRemito(descripcion, remito);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Remito> getRemitos() {
        return remitos;
    }

    public void setRemitos(ArrayList<Remito> remitos) {
        this.remitos = remitos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    } 
}