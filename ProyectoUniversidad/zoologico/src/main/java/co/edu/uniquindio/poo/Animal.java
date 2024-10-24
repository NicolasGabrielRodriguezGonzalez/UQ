package co.edu.uniquindio.poo;

import java.util.Scanner;

//La clase se vuelve abstract debido a que tiene metodos abstractos. Si tiene por lo menos un metodo abstracto la clase se convierte abstract.
public abstract class Animal {
    public String nombre;
    public int edad;
    public double peso;
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
   
    //Metodo estatico.
    public void comer(){
        mostrarMensaje("Todos los animales comen a las 6:00 PM");
        
    }
    //Metodo abstracto, no estatico, es decir, varia para cada una de las clases hijas.
    public abstract void dormir();

    
    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
}
