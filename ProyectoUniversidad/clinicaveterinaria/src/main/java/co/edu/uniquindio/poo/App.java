package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear la veterinaria
        Veterinaria veterinaria = new Veterinaria("Veterinaria Salud Animal");

        // Crear dueños
        Dueño dueño1 = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");
        Dueño dueño2 = new Dueño("Maria Lopez", "987654321", "Avenida Siempre Viva 456");

        // Crear animales
        Perro perro1 = new Perro("Firulais", 5, 10.0, TipoAnimal.DOMESTICO, "Labrador", dueño1);
        Gato gato1 = new Gato("Miau", 3, 4.0, TipoAnimal.DOMESTICO, "Gris", dueño2);
        Leon leon1 = new Leon("Simba", 8, 190.0, TipoAnimal.SALVAJE, 20.0, new HabitatNatural("Sabana"));
        Aguila aguila1 = new Aguila("Aquila", 4, 6.0, TipoAnimal.SALVAJE, 2.5, new HabitatNatural("Montañas"));
        Canario canario1 = new Canario("Pico", 1, 0.5, TipoAnimal.DOMESTICO, dueño1);

        // Agregar animales a la veterinaria
        veterinaria.agregarPerro(perro1);
        veterinaria.agregarGato(gato1);
        veterinaria.agregarLeon(leon1);
        veterinaria.agregarAguila(aguila1);
        veterinaria.agregarCanario(canario1);

        // Mostrar información de la veterinaria
        System.out.println(veterinaria);
    }
}
