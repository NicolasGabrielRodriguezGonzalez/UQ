package co.edu.uniquindio.poo.model;

public class Moto extends vehiculo {
    private Caja caja;
    public Moto(int numeroDeMatricula, String modelo, int marca, int añoDeFabricacion, int diasReserva, Caja caja, int precioBase){
        super(numeroDeMatricula, modelo, marca, añoDeFabricacion, diasReserva, precioBase);
        this.caja=caja;
    }
    public Caja getCaja() {
        return caja;
    }
    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    @Override
    public double calculoDecostoReserva(){
        double calculoDecostoReserva;
        if(caja==Caja.AUTOMATICA){
            calculoDecostoReserva= precioBase+10000;
        }else{
            calculoDecostoReserva= precioBase;
        }
        return calculoDecostoReserva;
    }
}
