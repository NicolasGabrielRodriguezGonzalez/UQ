package co.edu.uniquindio.poo;

public class VehiculoAereo extends Vehiculo implements IAereo {
    private double altitudMaxima;

    public VehiculoAereo(String marca, String modelo, int capacidad, double altitudMaxima) {
        super(marca, modelo, capacidad);
        this.altitudMaxima = altitudMaxima;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void aterrizar() {
        System.out.println(getMarca() + "esta aterrizado");        
        
    }

    @Override
    public void despegar() {
        System.out.println(getMarca() + "esta despegado");        
        
    }

    @Override
    public String toString() {
        return "VehiculoAereo [altitudMaxima=" + altitudMaxima + "]";
    }
    
    
    
}
