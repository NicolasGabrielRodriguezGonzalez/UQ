package co.edu.uniquindio.poo;


//Si tiene un atributo, toca generar gets y sets y los this.
public class Gato extends Animal {
    public Gato (String nombre, int edad, double peso){
        super(nombre, edad, peso);
        


    }

    @Override
    public void domir() {
        Animal.mostrarMensaje("Gato durmiendo ZZZZ");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hacerSonido() {
        Animal.mostrarMensaje("MIAW MIAW");
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "Gato" + super.toString();//Solo mostrar nombre seria super.getNombre()
    }

    
    
}
