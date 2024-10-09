package co.edu.uniquindio.poo;

public class Perro extends Animal {
    public Perro(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    @Override
    public void domir() {
        Animal.mostrarMensaje("Perro durmiendo ZZZZZZZZZZZ");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hacerSonido() {
        Animal.mostrarMensaje("GUAU GUAU");
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "Perro" + super.toString();
    }
    

}


 

