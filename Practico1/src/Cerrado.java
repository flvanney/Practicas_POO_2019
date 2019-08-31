
import java.util.ArrayList;

public class Cerrado implements Estado {

    @Override
    public void agregarRemito(String descripcion, ArrayList<Remito> remitos) {
        Remito rem = new Remito(descripcion);
        remitos.add(rem);
    }      

    @Override
    public void agregarArticulos(float precio, int cantidad, ArrayList<Articulo> articulos) {
        throw new UnsupportedOperationException("No se pueden añadir articulos a un Pedido cerrado");
    }
}