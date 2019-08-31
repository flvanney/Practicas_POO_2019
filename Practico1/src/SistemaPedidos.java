
import java.util.ArrayList;

public class SistemaPedidos {
    private ArrayList<Pedido> pedidos;
    
    public void nuevoPedido(int numero, String fecha, String cliente ){
        Pedido aux = new Pedido(numero, cliente, fecha);
        pedidos.add(aux);
    }
}