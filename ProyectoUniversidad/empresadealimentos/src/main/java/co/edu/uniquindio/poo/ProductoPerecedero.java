package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String codigo, String nombre, double precioCompra, Proveedor proveedor,
            LocalDate fechaVencimiento) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double precioVenta() {
        double utilidad = getPrecioCompra() * 0.35;
        return utilidad + getPrecioCompra();
    }

    @Override
    public double precioimpuesto() {
        double calcularImpuesto = precioVenta() * 0.08;
        return calcularImpuesto;
    }

    @Override
    public String toString() {
        return "ProductoPerecedero [fechaVencimiento=" + fechaVencimiento + "]";
    }
    
    
}
