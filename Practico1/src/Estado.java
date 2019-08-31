
import java.util.ArrayList;

public interface Estado {
    
    public abstract void agregarArticulos(float precio, int cantidad, ArrayList<Articulo> articulos);
    public abstract void agregarRemito(String descripcion, ArrayList<Remito> remito);
}