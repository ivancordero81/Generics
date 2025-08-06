import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instancia de Libro
        GenericCatalogo<Libro> catalogoLibros = new GenericCatalogo<>();
        catalogoLibros.agregar(new Libro("L1","Eurogames y pizza", "Chef Jugón", 38_500));
        catalogoLibros.agregar(new Libro("L2","Son pobres porque quieren", "Gomelín Ricón", 85_000));
        catalogoLibros.agregar(new Libro("L3", "Amo telemarionetas", "Gigantón", 45_000));

        //Libros ordenados por nombre
        catalogoLibros.ordenarPorCriterio(Comparator.comparing(Libro::getNombre));
        System.out.println("Libros ordenados por nombre:");
        catalogoLibros.mostrarProductos();

        //Libros ordenados por precio
        catalogoLibros.ordenarPorCriterio(Comparator.comparingDouble(Libro::getPrecio));
        System.out.println("Libros ordenados por precio:");
        catalogoLibros.mostrarProductos();

        System.out.println("");

        //Instancia de Ropa
        GenericCatalogo<Ropa> catalogoRopa = new GenericCatalogo<>();
        catalogoRopa.agregar(new Ropa("R1","Minifalda", "S", 29_700));
        catalogoRopa.agregar(new Ropa("R2", "Pantalón", "L", 85_450));

        //Ropa ordenada por talla
        catalogoRopa.ordenarPorCriterio(Comparator.comparing(Ropa::getTalla));
        catalogoRopa.mostrarProductos();

        System.out.println("");

        //Instancia de Lavadora
        GenericCatalogo<Lavadora> catalogoLavadora = new GenericCatalogo<>();
        catalogoLavadora.agregar(new Lavadora("E1", "Samsung C40", 40, 1_450_000));
        catalogoLavadora.agregar(new Lavadora("E2", "Kaley K25", 25, 987_950));

        //Lavadoras ordenadas por capacidad
        catalogoLavadora.ordenarPorCriterio(Comparator.comparingInt(Lavadora::getCapacidadKG));
        catalogoLavadora.mostrarProductos();

        System.out.println("");

        //Búsqueda
        catalogoLavadora.buscarPorId("E3");
        catalogoLavadora.mostrarResultados(catalogoLavadora.buscarPorId("E3"),"E3");

    }
}