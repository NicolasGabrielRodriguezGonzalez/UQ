package co.edu.uniquindio.poo;
public class Perro extends Animal {
    private String raza;
    private Dueño dueño;
    public Perro(String nombre, int edad, double peso, TipoAnimal tipoAnimal, String raza, Dueño dueño) {
        super(nombre, edad, peso, tipoAnimal);
        this.raza = raza;
        this.dueño = dueño;
        if (peso < 0) throw new IllegalArgumentException("El peso no puede ser negativo.");
    }
    public String getRaza() {
        return raza;
    }
    public Dueño getDueño() {
        return dueño;
    }
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", dueño=" + dueño + ", peso=" + peso
                + ", tipoAnimal=" + tipoAnimal + "]";
    }
    
}
