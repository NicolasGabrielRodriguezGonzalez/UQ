package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // Creación de gimnasio.
        Gimnasio gimnasio = new Gimnasio("Smartfit", LocalDate.now());

        // Creación de entrenadores.
        Entrenador entrenador = new Entrenador("Juan", "aerobicos", 123456789, "juan@gmail.com");
        Entrenador entrenador2 = new Entrenador("Sofia", "pesas", 987654321, "sofia@gmail.com");

        // Creación de miembros con la cédula como parámetro adicional.
        Miembro miembro1 = new Miembro("Juliana", 20, "femenina", "1001", TipoMembresia.ANUAL, entrenador);
        Miembro miembro2 = new Miembro("Carlos", 25, "masculino", "1002", TipoMembresia.MENSUAL, entrenador2);
        Miembro miembro3 = new Miembro("Ana", 18, "femenina", "1003", TipoMembresia.ANUAL, entrenador);
        Miembro miembro4 = new Miembro("Luis", 35, "masculino", "1004", TipoMembresia.TRIMESTRAL, entrenador2);
        Miembro miembro5 = new Miembro("Diana", 29, "femenina", "1005", TipoMembresia.MENSUAL, entrenador);

        // Agregar entrenadores y miembros al gimnasio.
        gimnasio.agregarEntrenador(entrenador);
        gimnasio.agregarEntrenador(entrenador2);
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);
        gimnasio.agregarMiembro(miembro4);
        gimnasio.agregarMiembro(miembro5);

        // Imprimir nombres invertidos.
        gimnasio.imprimirNombresInvertidos();

        // Obtener y mostrar miembros menores de edad.
        LinkedList<Miembro> miembrosMenores = gimnasio.ObtenerMiembrosMenoresEdad();
        System.out.println("Miembros menores de 18 años:");
        for (Miembro miembro : miembrosMenores) {
            System.out.println(miembro.getNombre());
        }

        // Calcular y mostrar el promedio de edades.
        double promedioEdades = gimnasio.calcularPromedioEdades();
        System.out.println("El promedio de edades es: " + promedioEdades);

        // Obtener y mostrar la edad más común.
        int edadMasComun = gimnasio.obtenerEdadMasRepetida();
        System.out.println("La edad más común es: " + edadMasComun);
    }
}
