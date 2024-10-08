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
public class LeonTest {
    private static final Logger LOG = Logger.getLogger(LeonTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLeonSinHabitatNaturalLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Leon("Simba", 5, 190.0, TipoAnimal.SALVAJE, 25.0, null);
        });
        
        assertEquals("El león debe tener un hábitat natural", exception.getMessage());
    }
    @Test
    public void testConstructorLeonConDatosCorrectos() {
        // Crear un hábitat natural
        HabitatNatural habitat = new HabitatNatural("Sabana");

        // Crear un león
        Leon leon = new Leon("Simba", 5, 190.0, TipoAnimal.SALVAJE, 25.0, habitat);

        // Verificar que los atributos se inicializan correctamente
        assertEquals("Simba", leon.getNombre());
        assertEquals(5, leon.getEdad());
        assertEquals(190.0, leon.getPeso());
        assertEquals(TipoAnimal.SALVAJE, leon.getTipoAnimal());
        assertEquals(25.0, leon.getDiametroMelena());
        assertEquals(habitat, leon.getHabitatNatural());
    }
}
