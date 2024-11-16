package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo implements IElectrico{
    public String autonomia;
    public String tiempoPromedio;
    public VehiculoElectrico(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, String autonomia, String tiempoPromedio) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
        this.autonomia = autonomia;
        this.tiempoPromedio = tiempoPromedio;
    }
    public String getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }
    public String getTiempoPromedio() {
        return tiempoPromedio;
    }
    public void setTiempoPromedio(String tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }
    @Override
    public String toString() {
        return "VehiculoElectrico [autonomia=" + autonomia + ", tiempoPromedio=" + tiempoPromedio + "]";
    }
    @Override
    public double calcularPrecioAlquiler() {
        // No se sobreescribe
        return 0;//Marcador de lugar
    }
    @Override
    public double calcularPrecioVenta() {
        //No se sobreescribe
        return 0;//Marcador de lugar
    }
    @Override
    public String obtenerAutonomia() {
        return "La autonomía del vehiculo eléctrico es: " + autonomia + "km";
    }
    @Override
    public String obtenerTiempoPromedio() {
        return "El tiempo promedio en que demora realizar una carga es: " + tiempoPromedio +"h";
    }
    
    
    
}
