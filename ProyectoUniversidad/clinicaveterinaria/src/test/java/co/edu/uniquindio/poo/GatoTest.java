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
public class GatoTest {
    private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAsignarNuevoDueño() {
        Dueño dueñoOriginal = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");
        Gato gato = new Gato("Mish", 3, 4.5, TipoAnimal.DOMESTICO, "Negro", dueñoOriginal);

        Dueño nuevoDueño = new Dueño("Carlos Rodriguez", "987654321", "Avenida Siempre Viva 742");
        gato.setDueño(nuevoDueño);
        
        assertEquals(nuevoDueño, gato.getDueño());
    }
    @Test
    public void testGatoSinDueñoLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Gato("Mish", 2, 3.2, TipoAnimal.DOMESTICO, "Blanco", null);
        });
        
        assertEquals("El gato debe tener un dueño", exception.getMessage());
    }
}
