package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo implements IHibrido {
    public boolean enchufable;
    public boolean hibridoLigero;
    public VehiculoHibrido(String marca, String estado, String modelo, String cambios, double velocidadMaxima,
            double cilindraje, TipoCombustible tipoCombustible, String transmision, double precioBase,
            boolean revisionTecnica, boolean enchufable, boolean hibridoLigero) {
        super(marca, estado, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, precioBase,
                revisionTecnica);
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }
    public boolean isEnchufable() {
        return enchufable;
    }
    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }
    public boolean isHibridoLigero() {
        return hibridoLigero;
    }
    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }
    @Override
    public double calcularPrecioAlquiler() {
        // TODO Auto-generated method stub
        return 0;
    }
    public String determinarEnchufableHibridoLigero() {
        if (enchufable) {
            return "El vehículo es enchufable.";
        } else if (hibridoLigero) {
            return "El vehículo no es enchufable, pero es híbrido ligero.";
        } else {
            return "El vehículo no es enchufable ni híbrido ligero.";
        }
    }    
    @Override
    public double calcularPrecioVenta() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + "]";
    }
    

    
}
