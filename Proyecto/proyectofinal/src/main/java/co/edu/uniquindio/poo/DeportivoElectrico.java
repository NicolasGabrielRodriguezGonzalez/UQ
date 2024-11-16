package co.edu.uniquindio.poo;

public class DeportivoElectrico extends VehiculoElectrico{
    private int numPasajeros;
    private int numPuertas;
    private int numBolsasAire;
    private int numCaballosFuerza;
    private double tiempoParaAlcanzar100KmH;
    public DeportivoElectrico(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, String autonomia, String tiempoPromedio, int numPasajeros, int numPuertas,
            int numBolsasAire, int numCaballosFuerza, double tiempoParaAlcanzar100KmH) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica, autonomia, tiempoPromedio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numCaballosFuerza = numCaballosFuerza;
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
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
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }
    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }
    public double getTiempoParaAlcanzar100KmH() {
        return tiempoParaAlcanzar100KmH;
    }
    public void setTiempoParaAlcanzar100KmH(double tiempoParaAlcanzar100KmH) {
        this.tiempoParaAlcanzar100KmH = tiempoParaAlcanzar100KmH;
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
        return "DeportivoElectrico [marca=" + marca + ", numPasajeros=" + numPasajeros + ", estado=" + estado
                + ", autonomia=" + autonomia + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", tiempoPromedio="
                + tiempoPromedio + ", cambios=" + cambios + ", numBolsasAire=" + numBolsasAire + ", velocidadMaxima="
                + velocidadMaxima + ", numCaballosFuerza=" + numCaballosFuerza + ", cilindraje=" + cilindraje
                + ", tiempoParaAlcanzar100KmH=" + tiempoParaAlcanzar100KmH + ", tipoCombustible=" + tipoCombustible
                + ", transmision=" + transmision + ", precioBase=" + precioBase + ", revisionTecnica=" + revisionTecnica
                + "]";
    }
    
    
}
