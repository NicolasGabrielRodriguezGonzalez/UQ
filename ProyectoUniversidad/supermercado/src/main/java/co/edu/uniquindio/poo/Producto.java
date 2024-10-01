package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double precioUnitario;
    private int stock;

    public Producto(String nombre, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    // Método para reducir el stock del producto
    public boolean reducirStockProducto(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true; // Stock reducido exitosamente
        }
        return false; // No hay suficiente stock
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }
}
