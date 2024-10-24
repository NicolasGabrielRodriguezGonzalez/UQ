package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Pacho", 20, 5.25);
        Gato gato = new Gato("Pacha", 10, 6.25);
        //Creacion de un menu.
        boolean menu = true;
        while (menu){
            Animal.mostrarMensaje("Bienvenidos \n");
            int animalSeleccionado = Animal.ingresarEntero("Seleccione una mascota: \n1.Perro \n2.Gato \n3.Salir del programa. ");
            
            switch (animalSeleccionado) {
                case 1:
                    Animal.mostrarMensaje("Ha seleccionado  el perro de nombre " + perro.getNombre());
                    mostrarMenu(perro);
                    break;
            
                case 2:
                    Animal.mostrarMensaje("Ha seleccionado el gato de nombre " + gato.getNombre());
                    mostrarMenu(gato);
                    break;
                case 3:
                    menu = false;
                    Animal.mostrarMensaje("Saliendo del programa......");
                    break;
                default:
                    Animal.mostrarMensaje("Error, opción no valida!.");
                    break;
            }
            Animal.mostrarMensaje("-----------------------------------------");
        }
        
    }

    public static void mostrarMenu(Animal animal){          
        boolean continuarMenu = true;
        while (continuarMenu){
            int opciones = Animal.ingresarEntero("Indique una opción " + animal.getNombre()
            + "\n1.Dormir \n2.Hacer sonido \n3.Comer \n4.Volver al menu principal");
            switch (opciones) {
                case 1:
                    animal.dormir();
                    
                    break;
                case 2:
                    animal.hacerSonido();

                    break;
                case 3:
                    animal.comer();

                    break;
                case 4:
                    continuarMenu = false;
                    Animal.mostrarMensaje("Volviendo al menu principal......");
            
                default:
                    Animal.mostrarMensaje("Error, opción no valida");
                    break;
            }

    
        
        }
    }
    
}
