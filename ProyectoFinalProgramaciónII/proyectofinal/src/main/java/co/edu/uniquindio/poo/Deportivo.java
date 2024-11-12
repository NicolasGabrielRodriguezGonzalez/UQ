package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasDeAire;
    private int numeroCaballosDeFuerza;
    private double tiempoParaAlcanzar100KmH;
	public Deportivo(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			int numeroPasajeros, int numeroPuertas, int numeroBolsasDeAire, int numeroCaballosDeFuerza,
			double tiempoParaAlcanzar100KmH) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.numeroBolsasDeAire = numeroBolsasDeAire;
		this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
		this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public int getNumeroBolsasDeAire() {
		return numeroBolsasDeAire;
	}
	public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
		this.numeroBolsasDeAire = numeroBolsasDeAire;
	}
	public int getNumeroCaballosDeFuerza() {
		return numeroCaballosDeFuerza;
	}
	public void setNumeroCaballosDeFuerza(int numeroCaballosDeFuerza) {
		this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
	}
	public double getTiempoParaAlcanzar100KmH() {
		return tiempoParaAlcanzar100KmH;
	}
	public void setTiempoParaAlcanzar100KmH(double tiempoParaAlcanzar100KmH) {
		this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
	}
	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", numeroPasajeros=" + numeroPasajeros + ", nuevoOusado=" + nuevoOusado
				+ ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + ", numeroBolsasDeAire="
				+ numeroBolsasDeAire + ", cambios=" + cambios + ", numeroCaballosDeFuerza=" + numeroCaballosDeFuerza
				+ ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", tiempoParaAlcanzar100KmH="
				+ tiempoParaAlcanzar100KmH + ", tipoDeCombustible=" + tipoDeCombustible + ", transmision=" + transmision
				+ ", precioBase=" + precioBase + "]";
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
