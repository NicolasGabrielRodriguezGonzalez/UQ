package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado;
    private boolean tieneVelocidadCrucero;
    private int numeroBolsasDeAire;
    private boolean tieneAbs;
    private boolean tieneSensoresColision;
    private boolean tieneSensorTraficoCruzado;
    private boolean tieneAsistentePermanenciaCarril;
    private boolean tiene4x4;
	public Camioneta(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			int numeroPasajeros, int numeroPuertas, double capacidadMaletero, boolean tieneAireAcondicionado,
			boolean tieneVelocidadCrucero, int numeroBolsasDeAire, boolean tieneAbs, boolean tieneSensoresColision,
			boolean tieneSensorTraficoCruzado, boolean tieneAsistentePermanenciaCarril, boolean tiene4x4) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.capacidadMaletero = capacidadMaletero;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
		this.numeroBolsasDeAire = numeroBolsasDeAire;
		this.tieneAbs = tieneAbs;
		this.tieneSensoresColision = tieneSensoresColision;
		this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
		this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
		this.tiene4x4 = tiene4x4;
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
	public boolean isTieneVelocidadCrucero() {
		return tieneVelocidadCrucero;
	}
	public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
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
	public boolean isTiene4x4() {
		return tiene4x4;
	}
	public void setTiene4x4(boolean tiene4x4) {
		this.tiene4x4 = tiene4x4;
	}
    
	@Override
	public String toString() {
		return "Camioneta [marca=" + marca + ", numeroPasajeros=" + numeroPasajeros + ", nuevoOusado=" + nuevoOusado
				+ ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + ", capacidadMaletero=" + capacidadMaletero
				+ ", cambios=" + cambios + ", velocidadMaxima=" + velocidadMaxima + ", tieneAireAcondicionado="
				+ tieneAireAcondicionado + ", cilindraje=" + cilindraje + ", tieneVelocidadCrucero="
				+ tieneVelocidadCrucero + ", tipoDeCombustible=" + tipoDeCombustible + ", numeroBolsasDeAire="
				+ numeroBolsasDeAire + ", transmision=" + transmision + ", tieneAbs=" + tieneAbs + ", precioBase="
				+ precioBase + ", tieneSensoresColision=" + tieneSensoresColision + ", tieneSensorTraficoCruzado="
				+ tieneSensorTraficoCruzado + ", tieneAsistentePermanenciaCarril=" + tieneAsistentePermanenciaCarril
				+ ", tiene4x4=" + tiene4x4 + "]";
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
