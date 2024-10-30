package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicoGeneralTest {
    private MedicoGeneral medicoGeneral;

    @BeforeEach
    public void setUp() {
        Tratamiento tratamiento1 = new Tratamiento("Consulta General", "Consulta médica general");
        LinkedList<Tratamiento> tratamientosConsulta = new LinkedList<>();
        tratamientosConsulta.add(tratamiento1);

        Consulta consulta = new Consulta("C002", TipoConsulta.GENERAL, LocalDate.now(), 0);
        consulta.setTratamientos(tratamientosConsulta);

        medicoGeneral = new MedicoGeneral("Dra. Ana Gómez", "987654321", "Calle 2", "987654321", 
                "Medicina Interna", consulta);
    }

    @Test
    public void testCalcularCostoConsulta() {
        double costoEsperado = 30000 + (5000 * 1); 
        assertEquals(costoEsperado, medicoGeneral.calcularCostoConsulta());
    }
}
