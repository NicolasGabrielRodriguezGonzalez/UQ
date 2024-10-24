package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // Creación de gimnasio.
        Gimnasio gimnasio = new Gimnasio("Smartfit", LocalDate.now());

        // Creación de entrenadores.
        Entrenador entrenador = new Entrenador("Juan Pérez", "001", 310123456, "juan.perez@gmail.com", "Futbol");
        Entrenador entrenador2 = new Entrenador("María López", "002", 310765432, "maria.lopez@gmail.com", "Culturismo");
 
        /*public Miembro(String nombre, String cedula, String telefono, String correo, int edad, String genero,
        TipoMembresia tipoMembresia, Entrenador entrenador) { */
        // Creación de miembros con la cédula como parámetro adicional.
        Miembro miembro1 = new Miembro("Juliana", "111111", 300215579, "juli@gmail.com",19,"femenino", TipoMembresia.ANUAL,entrenador);
        Miembro miembro2 = new Miembro("Carlos", "222222", 301315679, "carlos@gmail.com", 25, "masculino", TipoMembresia.TRIMESTRAL, entrenador);
        Miembro miembro3 = new Miembro("Ana", "333333", 302415779, "ana@gmail.com", 20, "femenino", TipoMembresia.MENSUAL, entrenador);
        Miembro miembro4 = new Miembro("Luis", "444444", 303515879, "luis@gmail.com", 20, "masculino", TipoMembresia.ANUAL, entrenador);
        Miembro miembro5 = new Miembro("Sofía", "555555", 304615979, "sofia@gmail.com", 15, "femenino", TipoMembresia.TRIMESTRAL, entrenador);

        // Agregar entrenadores y miembros al gimnasio.
        gimnasio.agregarEntrenador(entrenador);
        gimnasio.agregarEntrenador(entrenador2);
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);
        gimnasio.agregarMiembro(miembro4);
        gimnasio.agregarMiembro(miembro5);
        Gimnasio.mostrarMensaje(gimnasio.toString());
        // Imprimir nombres invertidos.
        Gimnasio.mostrarMensaje("Lista Invertida:");
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
