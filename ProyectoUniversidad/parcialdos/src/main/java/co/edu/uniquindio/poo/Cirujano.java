package co.edu.uniquindio.poo;

public class Cirujano extends PersonalApoyo {
    private int numeroIntervenciones;

    public Cirujano(String nombre, String cedula, String direccion, String telefono, int numeroIntervenciones) {
        super(nombre, cedula, direccion, telefono);
        this.numeroIntervenciones = numeroIntervenciones;
    }

    public int getNumeroIntervenciones() {
        return numeroIntervenciones;
    }

    public void setNumeroIntervenciones(int numeroIntervenciones) {
        this.numeroIntervenciones = numeroIntervenciones;
    }
    
    @Override
    public double calcularCostoConsulta() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Cirujano [nombre=" + nombre + ", numeroIntervenciones=" + numeroIntervenciones + ", cedula=" + cedula
                + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
    
    
}
