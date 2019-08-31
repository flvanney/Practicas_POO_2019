
import java.util.ArrayList;

public class Entregado implements Estado {

    @Override
    public void agregarArticulos(float precio, int cantidad, ArrayList<Articulo> articulos) {
        throw new UnsupportedOperationException("No se pueden añadir Articulos a un Pedido Entregado.");
    }

    @Override
    public void agregarRemito(String descripcion, ArrayList<Remito> remito) {
        throw new UnsupportedOperationException("No se pueden añadir Remitos a un Pedido Entregado."); 
    }
}