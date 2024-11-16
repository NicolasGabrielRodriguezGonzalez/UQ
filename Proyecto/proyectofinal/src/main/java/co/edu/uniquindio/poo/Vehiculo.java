package co.edu.uniquindio.poo;

public abstract class Vehiculo{
    public String marca;
    public String estado;
    public String modelo;
    public String cambios;
    public double velocidadMaxima;
    public double cilindraje;
    public TipoCombustible tipoCombustible;
    public String transmision;
    public double precioBase;
    public boolean revisionTecnica;
    public Vehiculo(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase, boolean revisionTecnica) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.precioBase = precioBase;
        this.revisionTecnica=revisionTecnica;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean getRevisionTecnica() {
        return revisionTecnica;
    }
    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCambios() {
        return cambios;
    }
    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
   
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public String getTransmision() {
        return transmision;
    }
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", tipoCombustible="
                + tipoCombustible + ", transmision=" + transmision + ", precioBase=" + precioBase + ", revisionTecnica="
                + revisionTecnica + "]";
    }
    //Metodo abstracto para calcular el precio de venta.
    public abstract double calcularPrecioVenta();
    //Metodo abstracto para calcular el precio de alquiler.
    public abstract double calcularPrecioAlquiler();
    //Metodo para determinar si el vehiculo ha pasado la revisión tecnica.
    public boolean determinarRevisionTecnica(){
        return this.revisionTecnica;//Retorna true si pasa, false si no.
    }

    

    
}
