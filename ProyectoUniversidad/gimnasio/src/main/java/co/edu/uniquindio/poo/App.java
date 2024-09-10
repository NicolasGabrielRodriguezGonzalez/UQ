package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Creación de gimnasio.
        Gimnasio gimnasio = new Gimnasio("Smartfit ", LocalDate.now());

        //Creacion de entrenador.
        Entrenador entrendor = new Entrenador("Juan", "aerobicos", "123", "juan@gmail.com");

        //Creación miembros.
        Miembro miembro = new Miembro("JUliana", 20, "femenina", TipoMembresia.ANUAL, entrendor);

        //Agregar entrenador al gimnasio.
        gimnasio.agregarEntrenador(entrendor);
        gimnasio.agregarMiembro(miembro);
        

    }
}
