package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private boolean tieneAireAcondicionado;
    private boolean tieneFrenosDeAire;
    private boolean tieneAbs;
    private int numeroEjes;
    private String tipoDeCamion;
	public Camion(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
			double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase,
			double capacidadCarga, boolean tieneAireAcondicionado, boolean tieneFrenosDeAire, boolean tieneAbs,
			int numeroEjes, String tipoDeCamion) {
		super(marca, nuevoOusado, modelo, cambios, velocidadMaxima, cilindraje, tipoDeCombustible, transmision,
				precioBase);
		this.capacidadCarga = capacidadCarga;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneFrenosDeAire = tieneFrenosDeAire;
		this.tieneAbs = tieneAbs;
		this.numeroEjes = numeroEjes;
		this.tipoDeCamion = tipoDeCamion;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}
	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	public boolean isTieneFrenosDeAire() {
		return tieneFrenosDeAire;
	}
	public void setTieneFrenosDeAire(boolean tieneFrenosDeAire) {
		this.tieneFrenosDeAire = tieneFrenosDeAire;
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
	public String getTipoDeCamion() {
		return tipoDeCamion;
	}
	public void setTipoDeCamion(String tipoDeCamion) {
		this.tipoDeCamion = tipoDeCamion;
	}
	@Override
	public String toString() {
		return "Camion [marca=" + marca + ", capacidadCarga=" + capacidadCarga + ", nuevoOusado=" + nuevoOusado
				+ ", tieneAireAcondicionado=" + tieneAireAcondicionado + ", modelo=" + modelo + ", cambios=" + cambios
				+ ", tieneFrenosDeAire=" + tieneFrenosDeAire + ", velocidadMaxima=" + velocidadMaxima + ", tieneAbs="
				+ tieneAbs + ", cilindraje=" + cilindraje + ", numeroEjes=" + numeroEjes + ", tipoDeCamion="
				+ tipoDeCamion + ", tipoDeCombustible=" + tipoDeCombustible + ", transmision=" + transmision
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
