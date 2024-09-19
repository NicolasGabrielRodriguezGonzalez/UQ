package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;  // Importación para JUnit 5

public class ClinicaTest {
    private Clinica clinica;
    private Dueño dueño;
    private Veterinario veterinario;
    private Mascota mascota;
    private HistorialMedico historialMedico;

    @BeforeEach
    public void setUp() {
        // Inicialización de objetos antes de cada prueba
        clinica = new Clinica("Salud Animal", "Calle 33 19A 06", "3012155790");
        veterinario = new Veterinario("Santiago Galeano Osorio", "11111", TipoEspecialidad.PERRO);
        historialMedico = new HistorialMedico(LocalDate.now(), "Rabia", "Acetaminofen", "La mascota estaba rabiosa", veterinario);
        mascota = new Mascota("Penelope", 7, "Pastor Alemán", historialMedico);
        dueño = new Dueño("Luisa", "Norte de Armenia", "3207180117");
    }

    @Test
    public void testAgregarVeterinario() {
        clinica.agregarVeterinario(veterinario);
        assertEquals(1, clinica.getVeterinarios().size());
        assertTrue(clinica.getVeterinarios().contains(veterinario));
    }

    @Test
    public void testAgregarMascota() {
        clinica.agregarMascota(mascota);
        assertEquals(1, clinica.getMascotas().size());
        assertTrue(clinica.getMascotas().contains(mascota));
    }

    @Test
    public void testAgregarDueño() {
        dueño.agregarMascota(mascota);
        clinica.agregarDueño(dueño);
        assertEquals(1, clinica.getDueños().size());
        assertTrue(clinica.getDueños().contains(dueño));
        assertEquals(1, dueño.getMascotas().size());
        assertTrue(dueño.getMascotas().contains(mascota));
    }

    @Test
    public void testHistorialMedico() {
        assertEquals("Rabia", historialMedico.getDiagnostico());
        assertEquals("Acetaminofen", historialMedico.getTratamiento());
        assertEquals("La mascota estaba rabiosa", historialMedico.getObservacion());
        assertEquals(veterinario, historialMedico.getVeterinario());
    }

    // Prueba para nombre vacío de veterinario
    @Test
    public void testAgregarVeterinarioNombreVacio() {
        Veterinario veterinarioVacio = new Veterinario("", "12345", TipoEspecialidad.GATO);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clinica.agregarVeterinario(veterinarioVacio);
        });
        assertEquals("El nombre del veterinario no puede estar vacío", exception.getMessage());
    }

    // Prueba para nombre vacío de mascota
    @Test
    public void testAgregarMascotaNombreVacio() {
        Mascota mascotaVacia = new Mascota("", 2, "Labrador", historialMedico);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clinica.agregarMascota(mascotaVacia);
        });
        assertEquals("El nombre de la mascota no puede estar vacío", exception.getMessage());
    }

    // Prueba para edad negativa de la mascota
    @Test
    public void testAgregarMascotaEdadNegativa() {
        Mascota mascotaEdadNegativa = new Mascota("Max", -3, "Labrador", historialMedico);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clinica.agregarMascota(mascotaEdadNegativa);
        });
        assertEquals("La edad de la mascota no puede ser negativa", exception.getMessage());
    }

    // Prueba para teléfono vacío del dueño
    @Test
    public void testAgregarDueñoTelefonoVacio() {
        Dueño dueñoTelefonoVacio = new Dueño("Laura", "Calle 10", "");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clinica.agregarDueño(dueñoTelefonoVacio);
        });
        assertEquals("El número de teléfono del dueño no puede estar vacío", exception.getMessage());
    }

    // Prueba para diagnóstico vacío en el historial médico
    @Test
    public void testHistorialMedicoDiagnosticoVacio() {
        HistorialMedico historialDiagnosticoVacio = new HistorialMedico(LocalDate.now(), "", "Ibuprofeno", "Observación", veterinario);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mascota.setHistorialMedico(historialDiagnosticoVacio);
        });
        assertEquals("El diagnóstico no puede estar vacío", exception.getMessage());
    }
}
