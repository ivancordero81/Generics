public class Lavadora implements Producto{
    private String Id;
    private String Nombre;
    private int capacidadKG;
    private double Precio;

    public Lavadora(String id, String nombre, int capacidadKG, double precio) {
        Id = id;
        Nombre = nombre;
        this.capacidadKG = capacidadKG;
        Precio = precio;
    }

    @Override
    public String toString(){
        return "Id = " + getId() +
                " | Nombre: " + getNombre() +
                " | Capacidad en kg: " + getCapacidadKG() +
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

    public int getCapacidadKG() {
        return capacidadKG;
    }
}
