import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogo <T extends Producto > {
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


}
