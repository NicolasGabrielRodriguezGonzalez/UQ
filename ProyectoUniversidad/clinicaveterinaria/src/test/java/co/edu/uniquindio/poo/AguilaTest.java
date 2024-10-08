/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AguilaTest {
    private static final Logger LOG = Logger.getLogger(AguilaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void distanciaAlasNegativa(){
        LOG.info("Iniciado test de envergadura alas negativa");
        assertThrows(Throwable.class, ()-> new Aguila("Aquila", 4, 6.0, TipoAnimal.SALVAJE, -2.5, new HabitatNatural("Montañas")));
        LOG.info("Finalizando test de envergadura alas negativa");
    }
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test de datos vacios");
        assertThrows(Throwable.class, ()-> new Aguila(" ", 0, 0.0, null, 0.0, null));
        LOG.info("Finalizando test datos vacios");
    }

    
}
