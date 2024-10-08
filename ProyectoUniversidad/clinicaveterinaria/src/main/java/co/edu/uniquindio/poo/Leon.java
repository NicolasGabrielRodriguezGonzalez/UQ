package co.edu.uniquindio.poo;

public class Leon extends Animal{
    private double diametroMelena;
    private HabitatNatural habitatNatural;
    public Leon(String nombre, int edad, double peso,TipoAnimal tipoAnimal, double diametroMelena, HabitatNatural habitatNatural) {
        super(nombre, edad, peso, tipoAnimal);
        this.diametroMelena = diametroMelena;
        this.habitatNatural = habitatNatural;
         if (habitatNatural == null) {
            throw new IllegalArgumentException("El león debe tener un hábitat natural");
        }

        this.habitatNatural = habitatNatural;
    }
    public double getDiametroMelena() {
        return diametroMelena;
    }
    public void setDiametroMelena(double diametroMelena) {
        this.diametroMelena = diametroMelena;
    }
    public HabitatNatural getHabitatNatural() {
        return habitatNatural;
    }
    public void setHabitatNatural(HabitatNatural habitatNatural) {
        this.habitatNatural = habitatNatural;
    }
    @Override
    public String toString() {
        return "Leon [nombre=" + nombre + ", diametroMelena=" + diametroMelena + ", edad=" + edad + ", peso=" + peso
                + ", habitatNatural=" + habitatNatural + ", tipoAnimal=" + tipoAnimal + "]";
    }
    
    
}
