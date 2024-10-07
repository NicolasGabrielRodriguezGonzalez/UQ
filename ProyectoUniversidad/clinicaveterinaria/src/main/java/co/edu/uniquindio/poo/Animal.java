package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public double peso;
    public TipoAnimal tipoAnimal;
    public Animal(String nombre, int edad, double peso, TipoAnimal tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String accionComer(){
        return nombre + " esta comiendo";
    }
    public String accionDormir(){
        return nombre + " esta durmiendo";
    }
}