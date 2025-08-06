import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericCatalogo<T extends Producto > {
    private List<T> productos = new ArrayList<>();

    void agregar (T producto){
        productos.add(producto);
    }

    void eliminar (T producto){
        productos.remove(producto);
    }

    T buscarId (String id){
        return productos.getFirst();
    }

    void mostrarProductos (){
        for (T producto : productos)
        System.out.println(producto);
        }

    void ordenarPorCriterio (Comparator<T> criterio){
        productos.sort(criterio);
    }


}
