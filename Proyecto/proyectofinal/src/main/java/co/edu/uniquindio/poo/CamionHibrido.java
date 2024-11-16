package co.edu.uniquindio.poo;

public class CamionHibrido extends VehiculoHibrido {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean abs;
    private int numEjes;
    private String tipoCamion;
    public CamionHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, double capacidadCarga,
            boolean aireAcondicionado, boolean frenosAire, boolean abs, int numEjes, String tipoCamion) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.tipoCamion = tipoCamion;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isFrenosAire() {
        return frenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    public String getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    @Override
    public double calcularPrecioAlquiler() {
        // TODO Auto-generated method stub
        return super.calcularPrecioAlquiler();
    }
    @Override
    public double calcularPrecioVenta() {
        // TODO Auto-generated method stub
        return super.calcularPrecioVenta();
    }
    @Override
    public String toString() {
        return "CamionHibrido [marca=" + marca + ", capacidadCarga=" + capacidadCarga + ", estado=" + estado
                + ", enchufable=" + enchufable + ", modelo=" + modelo + ", aireAcondicionado=" + aireAcondicionado
                + ", hibridoLigero=" + hibridoLigero + ", cambios=" + cambios + ", frenosAire=" + frenosAire
                + ", velocidadMaxima=" + velocidadMaxima + ", abs=" + abs + ", cilindraje=" + cilindraje + ", numEjes="
                + numEjes + ", tipoCamion=" + tipoCamion + ", tipoCombustible=" + tipoCombustible + ", transmision="
                + transmision + ", precioBase=" + precioBase + ", revisionTecnica=" + revisionTecnica + "]";
    }
    
    
}
