package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Creación de gimnasio.
        Gimnasio gimnasio = new Gimnasio("Smartfit ", LocalDate.now());

        //Creacion de entrenador.
        Entrenador entrenador = new Entrenador("Juan", "aerobicos", "123", "juan@gmail.com");

        //Creación miembros.
        Miembro miembro1 = new Miembro("JUliana", 20, "femenino", "111111", TipoMembresia.ANUAL);
        Miembro miembro2 = new Miembro ("Nicolas", 17, "masculino", "1138274319", TipoMembresia.MENSUAL);

        //Agregar entrenador al gimnasio.
        gimnasio.agregarEntrenador(entrenador);
        //Agregar miembros al gimnasio.
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        //Agregar miembro a entrenador.
        entrenador.agregarMiembroAEntrenador (miembro1);
        
        //Se muestra el mensaje.
        Gimnasio.mostrarMensaje(gimnasio.toString());

        //Devolver lista con nombres invertidos.
        Gimnasio.mostrarMensaje("Lista nombres invertidos: ");
        gimnasio.imprimirNombresInvertidos();

        //Obtener miembros menores a 18 años:
        Gimnasio.mostrarMensaje("Los miembros con una edad menor a 18 años son: ");
        LinkedList<Miembro> menores = gimnasio.ObtenerMiembrosMenoresEdad();
        for (Miembro miembro: menores){
            Gimnasio.mostrarMensaje(miembro.toString());
        }

        //Calcular el promedio de las edades:
        double promedio = gimnasio.calcularPromedioEdades();
        Gimnasio.mostrarMensaje("El promedio de las edades es: " + promedio);

        //Obtener la edad que mas se repite:
        int edadMasRepetida = gimnasio.obtenerEdadMasRepetida();
        Gimnasio.mostrarMensaje("La edad que más se repite es: " + edadMasRepetida);

        //Eliminar miembros con al menos 3 vocales:
        gimnasio.eliminarMiembrosCon3Vocales();
        // Mostrar los miembros restantes
        Gimnasio.mostrarMensaje("Miembros restantes después de eliminar los nombres con 3 o más vocales:");
        // Obtener la lista actualizada de miembros
        LinkedList<Miembro> miembrosRestantes = gimnasio.getMiembros();

        // Mostrar cada miembro restante
        for (Miembro miembro : miembrosRestantes) {
            Gimnasio.mostrarMensaje(miembro.toString());
        }
        Gimnasio.mostrarMensaje(gimnasio.toString());
    }
}
