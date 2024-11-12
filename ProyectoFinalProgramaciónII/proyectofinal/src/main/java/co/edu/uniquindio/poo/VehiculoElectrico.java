package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo implements IElectrico{
    private double autonomia;
    private double tiempoPromedioDeCarga;
	public VehiculoElectrico(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			double autonomia, double tiempoPromedioDeCarga) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.autonomia = autonomia;
		this.tiempoPromedioDeCarga = tiempoPromedioDeCarga;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	public double getTiempoPromedioDeCarga() {
		return tiempoPromedioDeCarga;
	}
	public void setTiempoPromedioDeCarga(double tiempoPromedioDeCarga) {
		this.tiempoPromedioDeCarga = tiempoPromedioDeCarga;
	}
	@Override
	public String toString() {
		return "VehiculoElectrico [autonomia=" + autonomia + ", tiempoPromedioDeCarga=" + tiempoPromedioDeCarga + "]";
	}
	@Override
	public double obtenerAutonomia() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double obtenerTiempoPromedioDeCarga() {
		// TODO Auto-generated method stub
		return 0;
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
