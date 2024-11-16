package co.edu.uniquindio.poo;

public class PickUpHibrido extends VehiculoHibrido {
    private int numPasajeros;
    private int numPuertas;
    private boolean aireAcondicionado;
    private boolean camaraRevera;
    private int numBolsasAire;
    private boolean abs;
    private boolean cuatroXCuatro;
    private double capacidadCajaCarga;
    public PickUpHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, int numPasajeros, int numPuertas,
            boolean aireAcondicionado, boolean camaraRevera, int numBolsasAire, boolean abs, boolean cuatroXCuatro,
            double capacidadCajaCarga) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraRevera = camaraRevera;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.cuatroXCuatro = cuatroXCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isCamaraRevera() {
        return camaraRevera;
    }
    public void setCamaraRevera(boolean camaraRevera) {
        this.camaraRevera = camaraRevera;
    }
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public boolean isCuatroXCuatro() {
        return cuatroXCuatro;
    }
    public void setCuatroXCuatro(boolean cuatroXCuatro) {
        this.cuatroXCuatro = cuatroXCuatro;
    }
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
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
        return "PickUpHibrido [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado
                + ", enchufable=" + enchufable + ", numPuertas=" + numPuertas + ", modelo=" + modelo
                + ", hibridoLigero=" + hibridoLigero + ", cambios=" + cambios + ", aireAcondicionado="
                + aireAcondicionado + ", velocidadMaxima=" + velocidadMaxima + ", camaraRevera=" + camaraRevera
                + ", cilindraje=" + cilindraje + ", numBolsasAire=" + numBolsasAire + ", tipoCombustible="
                + tipoCombustible + ", abs=" + abs + ", cuatroXCuatro=" + cuatroXCuatro + ", transmision=" + transmision
                + ", capacidadCajaCarga=" + capacidadCajaCarga + ", precioBase=" + precioBase + ", revisionTecnica="
                + revisionTecnica + "]";
    }
    
    
    
}
