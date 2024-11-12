package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReversa;
    private int numeroBolsasDeAire;
    private boolean tieneAbs;
    private boolean tiene4x4;
    private double capacidadCajaDeCarga;
	public PickUp(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraReversa,
			int numeroBolsasDeAire, boolean tieneAbs, boolean tiene4x4, double capacidadCajaDeCarga) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneCamaraReversa = tieneCamaraReversa;
		this.numeroBolsasDeAire = numeroBolsasDeAire;
		this.tieneAbs = tieneAbs;
		this.tiene4x4 = tiene4x4;
		this.capacidadCajaDeCarga = capacidadCajaDeCarga;
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
	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}
	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	public boolean isTieneCamaraReversa() {
		return tieneCamaraReversa;
	}
	public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
		this.tieneCamaraReversa = tieneCamaraReversa;
	}
	public int getNumeroBolsasDeAire() {
		return numeroBolsasDeAire;
	}
	public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
		this.numeroBolsasDeAire = numeroBolsasDeAire;
	}
	public boolean isTieneAbs() {
		return tieneAbs;
	}
	public void setTieneAbs(boolean tieneAbs) {
		this.tieneAbs = tieneAbs;
	}
	public boolean isTiene4x4() {
		return tiene4x4;
	}
	public void setTiene4x4(boolean tiene4x4) {
		this.tiene4x4 = tiene4x4;
	}
	public double getCapacidadCajaDeCarga() {
		return capacidadCajaDeCarga;
	}
	public void setCapacidadCajaDeCarga(double capacidadCajaDeCarga) {
		this.capacidadCajaDeCarga = capacidadCajaDeCarga;
	}
	@Override
	public String toString() {
		return "PickUp [marca=" + marca + ", numeroPasajeros=" + numeroPasajeros + ", nuevoOusado=" + nuevoOusado
				+ ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + ", tieneAireAcondicionado="
				+ tieneAireAcondicionado + ", cambios=" + cambios + ", velocidadMaxima=" + velocidadMaxima
				+ ", tieneCamaraReversa=" + tieneCamaraReversa + ", cilindraje=" + cilindraje + ", numeroBolsasDeAire="
				+ numeroBolsasDeAire + ", tipoDeCombustible=" + tipoDeCombustible + ", tieneAbs=" + tieneAbs
				+ ", tiene4x4=" + tiene4x4 + ", transmision=" + transmision + ", capacidadCajaDeCarga="
				+ capacidadCajaDeCarga + ", precioBase=" + precioBase + "]";
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
