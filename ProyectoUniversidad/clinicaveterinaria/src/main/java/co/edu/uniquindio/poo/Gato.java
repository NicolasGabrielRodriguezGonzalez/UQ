package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String colorPelaje;
    private Dueño dueño;
    public Gato(String nombre, int edad, double peso, TipoAnimal tipoAnimal, String colorPelaje, Dueño dueño) {
        super(nombre, edad, peso, tipoAnimal);
        this.colorPelaje = colorPelaje;
        this.dueño = dueño;
         // Lanza una excepción si el dueño es null
         if (dueño == null) {
            throw new IllegalArgumentException("El gato debe tener un dueño");
        }
    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public Dueño getDueño() {
        return dueño;
    }
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", colorPelaje=" + colorPelaje + ", edad=" + edad + ", dueño=" + dueño
                + ", peso=" + peso + ", tipoAnimal=" + tipoAnimal + "]";
    }
    
    

    
}
