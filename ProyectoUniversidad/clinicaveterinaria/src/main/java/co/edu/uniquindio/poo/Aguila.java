package co.edu.uniquindio.poo;

public class Aguila extends Animal{
    private double envergaduraAlas;
    private HabitatNatural habitatNatural;
    public Aguila(String nombre, int edad, double peso, TipoAnimal tipoAnimal, double envergaduraAlas,
            HabitatNatural habitatNatural) {
        super(nombre, edad, peso, tipoAnimal);
        this.envergaduraAlas = envergaduraAlas;
        this.habitatNatural = habitatNatural;
        assert envergaduraAlas > 0;
    }
    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }
    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }
    public HabitatNatural getHabitatNatural() {
        return habitatNatural;
    }
    public void setHabitatNatural(HabitatNatural habitatNatural) {
        this.habitatNatural = habitatNatural;
    }
    @Override
    public String toString() {
        return "Aguila [nombre=" + nombre + ", envergaduraAlas=" + envergaduraAlas + ", edad=" + edad + ", peso=" + peso
                + ", habitatNatural=" + habitatNatural + ", tipoAnimal=" + tipoAnimal + "]";
    }
    
    
    
    
}
