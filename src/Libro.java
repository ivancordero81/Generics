import java.text.NumberFormat;

public class Libro implements Producto{
    private String Id;
    private String Nombre;
    private String Autor;
    private double Precio;
    public Libro(String id, String nombre, String autor, double precio) {
        Id = id;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
    }

    @Override
    public String toString(){
        return "Id = " + getId() +
                " | Nombre: " + getNombre() +
                " | Autor: " + getAutor() +
                " | Precio: " + getPrecio();
    }

    @Override
    public String getId() {
        return Id;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public double getPrecio() {
        return Precio;
    }

    public String getAutor() {
        return Autor;
    }
}
