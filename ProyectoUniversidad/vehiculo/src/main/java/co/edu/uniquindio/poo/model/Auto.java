package co.edu.uniquindio.poo.model;

public class Auto extends vehiculo {
    private int numeroDePuertas;
    public Auto (int numeroDeMatricula, String modelo, int marca, int añoDeFabricacion, int diasReserva, int numeroDePuertas, int precioBase){
        super(numeroDeMatricula, modelo, marca, añoDeFabricacion, diasReserva, precioBase);
        this.numeroDePuertas=numeroDePuertas;
    }
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public double calculoDecostoReserva(){
        double costoReserva= precioBase*diasReserva;
        return costoReserva;
    }

}
