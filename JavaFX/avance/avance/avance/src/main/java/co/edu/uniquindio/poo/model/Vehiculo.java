package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    public int numeroDeMatricula;
    public String modelo;
    public int marca;
    public int añoDeFabricacion;
    public int diasReserva;
    public int precioBase;
    public Vehiculo(int numeroDeMatricula, String modelo, int marca, int añoDeFabricacion, int diasReserva, int precioBase){
        this.numeroDeMatricula= numeroDeMatricula;
        this.modelo=modelo;
        this.marca=marca;
        this.añoDeFabricacion=añoDeFabricacion;
        this.diasReserva=diasReserva;
        this.precioBase=precioBase;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public int getDiasReserva() {
        return diasReserva;
    }
    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }
    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }
    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getMarca() {
        return marca;
    }
    public void setMarca(int marca) {
        this.marca = marca;
    }
    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }
    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
    public abstract double calculoDecostoReserva();
    @Override
    public String toString() {
        return "vehiculo [numeroDeMatricula=" + numeroDeMatricula + ", modelo=" + modelo + ", marca=" + marca
                + ", añoDeFabricacion=" + añoDeFabricacion + ", diasReserva=" + diasReserva + ", precioBase="
                + precioBase + "]";
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}