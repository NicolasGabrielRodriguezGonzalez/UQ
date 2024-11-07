package co.edu.uniquindio.poo;

public class VehiculoAnfibio extends Vehiculo implements ITerrestre, IAcuatico{
    private String tipoCombustible;
    private int numRuedas;
    private String motor;
    public VehiculoAnfibio(String marca, String modelo, int capacidad, String tipoCombustible, int numRuedas,
            String motor) {
        super(marca, modelo, capacidad);
        this.tipoCombustible = tipoCombustible;
        this.numRuedas = numRuedas;
        this.motor = motor;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    @Override
    public void apagar() {
        System.out.println(getMarca() + "esta apagado");        
    }
    @Override
    public void avanzar() {
        System.out.println(getMarca() + "esta avanzando");        
        
    }
    @Override
    public void detenerse() {
        System.out.println(getMarca() + "esta detenido");        
        
    }
    @Override
    public void girar() {
        System.out.println(getMarca() + "esta girando");        
        
    }
    @Override
    public void retroceder() {
        System.out.println(getMarca() + "esta retrociendo");        
        
    }
    @Override
    public void encender() {
        // TODO Auto-generated method stub
        
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "VehiculoAnfibio [tipoCombustible=" + tipoCombustible + ", numRuedas=" + numRuedas + ", motor=" + motor
                + "]";
    }
    
}
