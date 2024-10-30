package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClinicaTest {
    private Clinica clinica;
    private Cirujano cirujano1;
    private Cirujano cirujano2;

    @BeforeEach
    public void setUp() {
        clinica = new Clinica("Clínica Vida Saludable", "555-1234", "Avenida 123");
        cirujano1 = new Cirujano("Dr. Carlos Ruiz", "456789123", "Calle 3", "456789123", 5);
        cirujano2 = new Cirujano("Dr. Miguel Torres", "654321789", "Calle 4", "654321789", 2);
        clinica.getCirujanos().add(cirujano1);
        clinica.getCirujanos().add(cirujano2);
    }

    @Test
    public void testObtenerCirugiasMayor3() {
        assertTrue(clinica.getCirujanos().stream().anyMatch(c -> c.getNumeroIntervenciones() > 3));
    }
}
