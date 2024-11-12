package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    public Moto(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
    double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase){
        super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
        this.marca = marca;
        this.nuevoOusado = nuevoOusado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoDeCombustible = tipoDeCombustible;
        this.transmision = transmision;
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Moto" + marca;
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

    @Override
    public void determinarTipoVehiculo() {
        // TODO Auto-generated method stub
        super.determinarTipoVehiculo();
    }

    @Override
    public void determinarTransmision() {
        // TODO Auto-generated method stub
        super.determinarTransmision();
    }
    
    



    
    
}
