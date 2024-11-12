package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
   private int numeroPasajeros;
   private int numeroPuertas;
   private double capacidadMaletero;
   private boolean tieneAireAcondicionado;
   private boolean tieneCamaraReversa;
   private int numeroBolsasDeAire;
   private boolean tieneAbs;
   private int numeroEjes;
   private int numeroSalidasDeEmergencia;
    public Bus(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima, double cilindraje,
            TipoDeCombustible tipoDeCombustible, String transmision, double precioBase, int numeroPasajeros,
            int numeroPuertas, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa,
            int numeroBolsasDeAire, boolean tieneAbs, int numeroEjes, int numeroSalidasDeEmergencia) {
        super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision, precioBase);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasDeAire = numeroBolsasDeAire;
        this.tieneAbs = tieneAbs;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasDeEmergencia = numeroSalidasDeEmergencia;
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
	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}
	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
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
	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	public int getNumeroSalidasDeEmergencia() {
		return numeroSalidasDeEmergencia;
	}
	public void setNumeroSalidasDeEmergencia(int numeroSalidasDeEmergencia) {
		this.numeroSalidasDeEmergencia = numeroSalidasDeEmergencia;
	}
	@Override
	public String toString() {
		return "Bus [numeroPasajeros=" + numeroPasajeros + ", marca=" + marca + ", nuevoOusado=" + nuevoOusado
				+ ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + ", capacidadMaletero=" + capacidadMaletero
				+ ", cambios=" + cambios + ", tieneAireAcondicionado=" + tieneAireAcondicionado + ", velocidadMaxima="
				+ velocidadMaxima + ", cilindraje=" + cilindraje + ", tieneCamaraReversa=" + tieneCamaraReversa
				+ ", numeroBolsasDeAire=" + numeroBolsasDeAire + ", tipoDeCombustible=" + tipoDeCombustible
				+ ", tieneAbs=" + tieneAbs + ", transmision=" + transmision + ", numeroEjes=" + numeroEjes
				+ ", precioBase=" + precioBase + ", numeroSalidasDeEmergencia=" + numeroSalidasDeEmergencia + "]";
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
