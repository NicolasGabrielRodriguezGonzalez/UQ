package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    public String marca;
    public String nuevoOusado;
    public String modelo;
    public String cambios;
    public double velocidadMaxima;
    public double cilindraje;
    public TipoDeCombustible tipoDeCombustible;
    public String transmision;
    public double precioBase;
    public Vehiculo(String marca, String nuevoOusado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoDeCombustible tipoDeCombustible, String transmision, double precioBase) {
        this.marca = marca;
        this.nuevoOusado = nuevoOusado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoDeCombustible = tipoDeCombustible;
        this.transmision = transmision;
        this.precioBase = precioBase;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNuevoOusado() {
        return nuevoOusado;
    }
    public void setNuevoOusado(String nuevoOusado) {
        this.nuevoOusado = nuevoOusado;
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
    public TipoDeCombustible getTipoDeCombustible() {
        return tipoDeCombustible;
    }
    public void setTipoDeCombustible(TipoDeCombustible tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
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
        return "Vehiculo [marca=" + marca + ", nuevoOusado=" + nuevoOusado + ", modelo=" + modelo + ", cambios="
                + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                + ", tipoDeCombustible=" + tipoDeCombustible + ", transmision=" + transmision + ", precioBase="
                + precioBase + "]";
    }
    //Metodos Estaticos
    public void determinarTransmision(){
    }
    public void determinarTipoVehiculo(){
    }
    //Metodos Abstractos.
    public abstract double calcularPrecioVenta();

    public abstract double calcularPrecioAlquiler();

    //Metodo MostrarMensaje.
    public static void MostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }


    
}
