package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Alquiler extends Transaccion{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoDiario;
    private double costoTotal;
    
    public Alquiler(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha,
            double montoTotal, String estadoTransaccion, LocalDate fechaInicio, LocalDate fechaFin, double costoDiario,
            double costoTotal) {
        super(idTransaccion, vehiculo, cliente, empleado, fecha, montoTotal, estadoTransaccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoDiario = costoDiario;
        this.costoTotal = costoTotal;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getCostoDiario() {
        return costoDiario;
    }
    public void setCostoDiario(double costoDiario) {
        this.costoDiario = costoDiario;
    }
    public double getCostoTotal() {
        return costoTotal;
    }
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    @Override
    public double calcularMontoTotal() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "Alquiler [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costoDiario=" + costoDiario
                + ", costoTotal=" + costoTotal + ", idTransaccion=" + idTransaccion + ", vehiculo=" + vehiculo
                + ", cliente=" + cliente + ", empleado=" + empleado + ", fecha=" + fecha + ", montoTotal=" + montoTotal
                + ", estadoTransaccion=" + estadoTransaccion + "]";
    }
    
    
    
}
