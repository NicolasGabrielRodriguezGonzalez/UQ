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
        double valorFijo= 100.000;
        double operacion = valorFijo + (numeroIntervenciones * 50.000);

        return operacion;
    }

    @Override
    public String toString() {
        return "Cirujano [nombre=" + nombre + ", numeroIntervenciones=" + numeroIntervenciones + ", cedula=" + cedula
                + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
    
    
}
