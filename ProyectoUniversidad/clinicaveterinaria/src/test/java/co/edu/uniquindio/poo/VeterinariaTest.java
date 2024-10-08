/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    
    public void testAgregarPerroConIgualdad() {
        Veterinaria veterinaria = new Veterinaria("Clínica Animal");
        Dueño dueño1 = new Dueño("Juan", "123456789", "Calle 1");
        Dueño dueño2 = new Dueño("Pedro", "987654321", "Calle 2");
        Perro perro1 = new Perro("Bobby", 3, 15.0, TipoAnimal.DOMESTICO, "Labrador", dueño1);
        Perro perro2 = new Perro("Bobby", 3, 15.0, TipoAnimal.DOMESTICO, "Labrador", dueño2);

        veterinaria.agregarPerro(perro1);
        veterinaria.agregarPerro(perro2);

        assertEquals(2, veterinaria.getPerros().size());
        // Verificamos que no sean iguales aunque tengan el mismo nombre
        assertNotEquals(perro1, perro2);
    }
    @Test
    public void testAgregarPerro() {
        Veterinaria veterinaria = new Veterinaria("Clínica Animal");
        Dueño dueño = new Dueño("Juan", "123456789", "Calle 1");
        Perro perro = new Perro("Bobby", 3, 15.0, TipoAnimal.DOMESTICO, "Labrador", dueño);
    
        veterinaria.agregarPerro(perro);
    
        assertEquals(1, veterinaria.getPerros().size());
        assertEquals(perro, veterinaria.getPerros().get(0));
    }
}    