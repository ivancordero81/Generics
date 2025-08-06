import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class GenericCatalogo<T extends Producto > {
    private List<T> productos = new ArrayList<>();

    void agregar (T producto){
        productos.add(producto);
    }

    void eliminar (T producto){
        productos.remove(producto);
    }

    public List<T> buscarPorId(String texto) {
        List<T> resultado = new ArrayList<>();
        try {
            for (T producto : productos) {
                if (producto.getId() != null &&
                        producto.getId().contains(texto)) {
                    resultado.add(producto);
                }
            }
        } catch (Exception e) {
            System.out.println("Producto no encontrado: " + e.getMessage());
        }
        return resultado;
    }

   public void mostrarResultados(List<T> resultados,String texto) {
       if (resultados.isEmpty()) {
           System.out.println("Producto no encontrado: "+ texto);
       } else {
            for (T producto : resultados) {
                System.out.println(" - " + producto);
            }
        }
    }

    void mostrarProductos (){
        for (T producto : productos)
        System.out.println(producto);
        }

    void ordenarPorCriterio (Comparator<T> criterio){
        productos.sort(criterio);
    }


}
