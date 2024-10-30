package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EspecialistaTest {
    private Especialista especialista;

    @BeforeEach
    public void setUp() {
        Tratamiento tratamiento1 = new Tratamiento("Examen de Sangre", "Examen para medir el nivel de glucosa");
        Tratamiento tratamiento2 = new Tratamiento("Electrocardiograma", "Examen para evaluar el corazón");

        LinkedList<Tratamiento> tratamientosConsulta = new LinkedList<>();
        tratamientosConsulta.add(tratamiento1);
        tratamientosConsulta.add(tratamiento2);

        Consulta consulta = new Consulta("C001", TipoConsulta.ESPECIALIDAD, LocalDate.now(), 0);
        consulta.setTratamientos(tratamientosConsulta);

        especialista = new Especialista("Dr. Juan Pérez", "123456789", "Calle 1", "123456789",
                TipoEspecialidad.CARDIOLOGIA, 10, consulta);
    }

    @Test
    public void testCalcularCostoConsulta() {
        double costoEsperado = 160000 * 2; 
        assertEquals(costoEsperado, especialista.calcularCostoConsulta());
    }
}
