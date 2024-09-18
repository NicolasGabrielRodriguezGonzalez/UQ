package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Salud Animal", "Calle 33 19A 06", "3012155790");
        
        Veterinario veterinario1 = new Veterinario("Santiago Galeano Osorio", "11111", TipoEspecialidad.PERRO);
        Veterinario veterinario2 = new Veterinario("Victor Sanchez", "22222", TipoEspecialidad.AVE);
        Veterinario veterinario3 = new Veterinario("Nicolas Rodriguez", "33333", TipoEspecialidad.GATO);

        clinica.agregarVeterinario(veterinario1);
        clinica.agregarVeterinario(veterinario2);
        clinica.agregarVeterinario(veterinario3);


        
        HistorialMedico historialMedico1 = new HistorialMedico(LocalDate.now(), "Rabia", "Acetaminofen", "La mascota estaba rabiosa", veterinario1);
        HistorialMedico historialMedico2 = new HistorialMedico(LocalDate.now(), "Ceguera", "Gotas", "La mascota no podia ver", veterinario2);

        Mascota mascota1 = new Mascota("Penelope", 7, "Pastor Aleman", historialMedico1);
        Mascota mascota2 = new Mascota("Sureya", 4, "Gato", historialMedico2);

        Dueño dueño = new Dueño("Luisa", "Norte de Armenia", "3207180117");
        dueño.agregarMascota(mascota1);
        dueño.agregarMascota(mascota2); 
        clinica.agregarMascota(mascota1);
        clinica.agregarMascota(mascota2);
        clinica.agregarDueño(dueño);

        Clinica.mostrarMensaje(clinica.toString());



    }
}
