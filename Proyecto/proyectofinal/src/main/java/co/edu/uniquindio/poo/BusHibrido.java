package co.edu.uniquindio.poo;

public class BusHibrido extends VehiculoHibrido {
    private int numPasajeros;
    private int numPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;
    private int numEjes;
    private int numSalidasEmergencia;
    
    public BusHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero, int numPasajeros, int numPuertas,
            double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean abs,
            int numEjes, int numSalidasEmergencia) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, enchufable, hibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
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

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
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

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
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
        return "BusHibrido [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado + ", enchufable="
                + enchufable + ", numPuertas=" + numPuertas + ", modelo=" + modelo + ", hibridoLigero=" + hibridoLigero
                + ", capacidadMaletero=" + capacidadMaletero + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", aireAcondicionado=" + aireAcondicionado + ", cilindraje=" + cilindraje
                + ", camaraReversa=" + camaraReversa + ", tipoCombustible=" + tipoCombustible + ", numBolsasAire="
                + numBolsasAire + ", transmision=" + transmision + ", Abs=" + abs + ", numEjes=" + numEjes
                + ", precioBase=" + precioBase + ", numSalidasEmergencia=" + numSalidasEmergencia + ", revisionTecnica="
                + revisionTecnica + "]";
    }
    
    
}
