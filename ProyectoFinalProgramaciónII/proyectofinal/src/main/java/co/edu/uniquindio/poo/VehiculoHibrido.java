package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo implements IHibrido{
    private boolean enchufable;
    private boolean hibridoLigero;
	public VehiculoHibrido(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			boolean enchufable, boolean hibridoLigero) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.enchufable = enchufable;
		this.hibridoLigero = hibridoLigero;
	}
	public boolean isEnchufable() {
		return enchufable;
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
	public boolean determinarEnchufable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean determinarHibridoLigero() {
		// TODO Auto-generated method stub
		return false;
	}
	public void setEnchufable(boolean enchufable) {
		this.enchufable = enchufable;
	}
	public boolean isHibridoLigero() {
		return hibridoLigero;
	}
	public void setHibridoLigero(boolean hibridoLigero) {
		this.hibridoLigero = hibridoLigero;
	}
	@Override
	public String toString() {
		return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + "]";
	}
    
    
}
