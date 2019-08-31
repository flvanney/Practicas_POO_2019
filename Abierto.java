
import java.util.ArrayList;

public class Abierto implements Estado{
   
    @Override
    public void agregarRemito(String descripcion, ArrayList<Remito> remitos){
        Remito rem = new Remito (descripcion);
        remitos.add(rem);
    }

    @Override
    public void agregarArticulos(float precio, int cantidad, ArrayList<Articulo> articulos) {
        Articulo art = new Articulo (precio, cantidad);
        articulos.add(art);
    }   
}