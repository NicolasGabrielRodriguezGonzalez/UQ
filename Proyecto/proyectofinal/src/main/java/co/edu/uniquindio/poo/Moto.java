package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{

    public Moto(String marca, String estado, String modelo, String cambios, double velocidadMaxima, double cilindraje,
            TipoCombustible tipoCombustible, String transmision, double precioBase, boolean revisionTecnica) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
    }

    @Override
    public double calcularPrecioAlquiler() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calcularPrecioVenta() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
    
}
