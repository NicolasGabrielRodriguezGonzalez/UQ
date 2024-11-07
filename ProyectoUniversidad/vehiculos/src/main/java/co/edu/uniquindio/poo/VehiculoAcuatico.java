package co.edu.uniquindio.poo;

public class VehiculoAcuatico extends Vehiculo implements IAcuatico {
    private String tipoMotor;

    public VehiculoAcuatico(String marca, String modelo, int capacidad, String tipoMotor) {
        super(marca, modelo, capacidad);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void apagar() {
        System.out.println(getMarca() + "esta apagado");        
    }

    @Override
    public void encender() {
        System.out.println(getMarca() + "esta encendido");         
    }

    @Override
    public String toString() {
        return "VehiculoAcuatico [tipoMotor=" + tipoMotor + "]";
    }
    
    
}
