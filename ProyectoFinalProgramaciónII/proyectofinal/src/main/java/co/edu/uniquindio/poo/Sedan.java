package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReversa;
    private boolean tieneVelocidadCrucero;
    private int numeroDeBolsasDeAire;
    private boolean tieneAbs;
    private boolean tieneSensoresColision;
    private boolean tieneSensorTraficoCruzado;
    private boolean tieneAsistentePermanenciaCarril;
	public Sedan(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			int numeroPasajeros, int numeroPuertas, double capacidadMaletero, boolean tieneAireAcondicionado,
			boolean tieneCamaraReversa, boolean tieneVelocidadCrucero, int numeroDeBolsasDeAire, boolean tieneAbs,
			boolean tieneSensoresColision, boolean tieneSensorTraficoCruzado, boolean tieneAsistentePermanenciaCarril) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.capacidadMaletero = capacidadMaletero;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneCamaraReversa = tieneCamaraReversa;
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
		this.numeroDeBolsasDeAire = numeroDeBolsasDeAire;
		this.tieneAbs = tieneAbs;
		this.tieneSensoresColision = tieneSensoresColision;
		this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
		this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
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
	public boolean isTieneVelocidadCrucero() {
		return tieneVelocidadCrucero;
	}
	public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
	}
	public int getNumeroDeBolsasDeAire() {
		return numeroDeBolsasDeAire;
	}
	public void setNumeroDeBolsasDeAire(int numeroDeBolsasDeAire) {
		this.numeroDeBolsasDeAire = numeroDeBolsasDeAire;
	}
	public boolean isTieneAbs() {
		return tieneAbs;
	}
	public void setTieneAbs(boolean tieneAbs) {
		this.tieneAbs = tieneAbs;
	}
	public boolean isTieneSensoresColision() {
		return tieneSensoresColision;
	}
	public void setTieneSensoresColision(boolean tieneSensoresColision) {
		this.tieneSensoresColision = tieneSensoresColision;
	}
	public boolean isTieneSensorTraficoCruzado() {
		return tieneSensorTraficoCruzado;
	}
	public void setTieneSensorTraficoCruzado(boolean tieneSensorTraficoCruzado) {
		this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
	}
	public boolean isTieneAsistentePermanenciaCarril() {
		return tieneAsistentePermanenciaCarril;
	}
	public void setTieneAsistentePermanenciaCarril(boolean tieneAsistentePermanenciaCarril) {
		this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
	}
	@Override
	public String toString() {
		return "Sedan [marca=" + marca + ", numeroPasajeros=" + numeroPasajeros + ", nuevoOusado=" + nuevoOusado
				+ ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + ", capacidadMaletero=" + capacidadMaletero
				+ ", cambios=" + cambios + ", tieneAireAcondicionado=" + tieneAireAcondicionado + ", velocidadMaxima="
				+ velocidadMaxima + ", cilindraje=" + cilindraje + ", tieneCamaraReversa=" + tieneCamaraReversa
				+ ", tipoDeCombustible=" + tipoDeCombustible + ", tieneVelocidadCrucero=" + tieneVelocidadCrucero
				+ ", transmision=" + transmision + ", numeroDeBolsasDeAire=" + numeroDeBolsasDeAire + ", precioBase="
				+ precioBase + ", tieneAbs=" + tieneAbs + ", tieneSensoresColision=" + tieneSensoresColision
				+ ", tieneSensorTraficoCruzado=" + tieneSensorTraficoCruzado + ", tieneAsistentePermanenciaCarril="
				+ tieneAsistentePermanenciaCarril + "]";
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
	}
    


    
}
