package co.edu.uniquindio.poo;

public class Canario extends Animal {
    private Dueño dueño;

    public Canario(String nombre, int edad, double peso, TipoAnimal tipoAnimal, Dueño dueño) {
        super(nombre, edad, peso, tipoAnimal);
        this.dueño = dueño;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Canario [nombre=" + nombre + ", dueño=" + dueño + ", edad=" + edad + ", peso=" + peso + ", tipoAnimal="
                + tipoAnimal + "]";
    }
    

    
}
