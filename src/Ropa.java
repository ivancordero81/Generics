public class Ropa implements Producto{
    private String Id;
    private String Nombre;
    private String Talla;
    private double Precio;
    public Ropa(String id, String nombre, String talla, double precio) {
        Id = id;
        Nombre = nombre;
        Talla = talla;
        Precio = precio;
    }

    @Override
    public String toString(){
        return "Id = " + getId() +
                " | Nombre: " + getNombre() +
                " | Talla: " + getTalla() +
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

    public String getTalla() {
        return Talla;
    }
}
