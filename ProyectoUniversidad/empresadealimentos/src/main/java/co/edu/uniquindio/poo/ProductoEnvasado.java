package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto{
    private LocalDate fechaEnvasado;
    private double pesoEnvase;
    private TipoPaisOrigen tipoPaisOrigen;
    public ProductoEnvasado(String codigo, String nombre, double precioCompra, Proveedor proveedor,
            LocalDate fechaEnvasado, double pesoEnvase, TipoPaisOrigen tipoPaisOrigen) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.tipoPaisOrigen = tipoPaisOrigen;
    }
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public double getPesoEnvase() {
        return pesoEnvase;
    }
    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }
    public TipoPaisOrigen getTipoPaisOrigen() {
        return tipoPaisOrigen;
    }
    public void setTipoPaisOrigen(TipoPaisOrigen tipoPaisOrigen) {
        this.tipoPaisOrigen = tipoPaisOrigen;
    }
    @Override
    public double precioVenta() {
        double utilidad = getPesoEnvase() * 300;
        return utilidad + getPrecioCompra();
    }

    @Override
    public double precioimpuesto() {
        double calcularImpuesto = precioVenta() * 0.10;
        return calcularImpuesto;
    }
    @Override
    public String toString() {
        return "ProductoEnvasado [fechaEnvasado=" + fechaEnvasado + ", pesoEnvase=" + pesoEnvase + ", tipoPaisOrigen="
                + tipoPaisOrigen + "]";
    }
    
    
    
}
