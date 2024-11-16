package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta extends Transaccion {
    private double precioVehiculoVenta;

    public Venta(String idTransaccion, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha,
            double montoTotal, String estadoTransaccion, double precioVehiculoVenta) {
        super(idTransaccion, vehiculo, cliente, empleado, fecha, montoTotal, estadoTransaccion);
        this.precioVehiculoVenta = precioVehiculoVenta;
    }

    public double getPrecioVehiculoVenta() {
        return precioVehiculoVenta;
    }

    public void setPrecioVehiculoVenta(double precioVehiculoVenta) {
        this.precioVehiculoVenta = precioVehiculoVenta;
    }

    @Override
    public double calcularMontoTotal() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Venta [precioVehiculoVenta=" + precioVehiculoVenta + ", idTransaccion=" + idTransaccion + ", vehiculo="
                + vehiculo + ", cliente=" + cliente + ", empleado=" + empleado + ", fecha=" + fecha + ", montoTotal="
                + montoTotal + ", estadoTransaccion=" + estadoTransaccion + "]";
    }
    
    
}
