/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CanarioTest {
    private static final Logger LOG = Logger.getLogger(CanarioTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void edadPromedio() {
        
        LOG.info("Iniciado test de edad promedio");
        Dueño dueño1 = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");
        assertThrows(Throwable.class, ()-> new Canario("Pico", 11, 0.5, TipoAnimal.DOMESTICO, dueño1));
        LOG.info("Finalizando test de edad promedio");

    }
    @Test
    public void testCanarioConTipoInvalido() {
        Dueño dueño = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");

        // Prueba de creación de un Canario con TipoAnimal inválido (SALVAJE)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Canario canario1 = new Canario("Pico", 1, 0.5, TipoAnimal.SALVAJE, dueño);
        });

        // Verificación del mensaje de excepción
        assertEquals("El canario debe ser de tipo DOMESTICO", exception.getMessage());
    }
}
