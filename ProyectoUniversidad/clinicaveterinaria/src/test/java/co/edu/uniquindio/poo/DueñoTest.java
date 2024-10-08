/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DueñoTest {
    private static final Logger LOG = Logger.getLogger(DueñoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testModificarNombreDueño() {
        Dueño dueño = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");
        dueño.setNombre("Carlos Rodriguez");
        
        assertEquals("Carlos Rodriguez", dueño.getNombre());
    }

    @Test
    public void testModificarDireccionDueño() {
        Dueño dueño = new Dueño("Juan Perez", "123456789", "Calle Falsa 123");
        dueño.setDireccion("Avenida Siempre Viva 742");
        
        assertEquals("Avenida Siempre Viva 742", dueño.getDireccion());
    }
}
