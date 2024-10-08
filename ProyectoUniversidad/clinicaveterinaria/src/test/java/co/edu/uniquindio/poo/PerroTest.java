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
public class PerroTest {
    private static final Logger LOG = Logger.getLogger(PerroTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConstructorPerroConPesoNegativoLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Perro("Bobby", 3, -5.0, TipoAnimal.DOMESTICO, "Labrador", null);
        });
        assertEquals("El peso no puede ser negativo.", exception.getMessage());
    }

    @Test
    public void testToStringDePerro() {
        Dueño dueño = new Dueño("Juan", "456", "Calle Falsa 123");
        Perro perro = new Perro("Bobby", 3, 15.0, TipoAnimal.DOMESTICO, "Labrador", dueño);

        String expected = "Perro [nombre=Bobby, raza=Labrador, edad=3, dueño=Dueño [nombre=Juan, cedula=456, direccion=Calle Falsa 123], peso=15.0, tipoAnimal=DOMESTICO]";
        assertEquals(expected, perro.toString());
    }
}