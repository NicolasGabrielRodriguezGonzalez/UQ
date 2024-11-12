package co.edu.uniquindio.poo;

public class ProductoRefrigerado extends Producto implements IServicioRefrigeracion {
    private String codigoAprobacion;
    private double temperaturaRefrigeracion;
    public ProductoRefrigerado(String codigo, String nombre, double precioCompra, Proveedor proveedor,
            String codigoAprobacion, double temperaturaRefrigeracion) {
        super(codigo, nombre, precioCompra, proveedor);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }
    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }
    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }
    public double getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }
    public void setTemperaturaRefrigeracion(double temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }
    @Override
    public double precioVenta() {
        double utilidad = getTemperaturaRefrigeracion() * 500;
        return utilidad + getPrecioCompra();
    }

    @Override
    public double precioimpuesto() {
        double calcularImpuesto = precioVenta() * 0.05;
        return calcularImpuesto;
    }
    @Override
    public void iniciarProcesoRefrigeracion() {
        System.out.println("Se esta refrigerando productos y medicamentos farmacologicos." );;        
    }
    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoAprobacion=" + codigoAprobacion + ", temperaturaRefrigeracion="
                + temperaturaRefrigeracion + "]";
    }
    
    

}
