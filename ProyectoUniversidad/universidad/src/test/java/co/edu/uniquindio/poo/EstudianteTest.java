/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test de datos vacios");
        assertThrows(Throwable.class, ()-> new Estudiante(" ", " ", " ", " ", " ",
        0, 0, 0, 0, 0, 0));
        LOG.info("Finalizando test datos vacios");
    }
    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test de edad negativa");
        assertThrows(Throwable.class, ()-> new Estudiante("1138274319", "Camilo", "Zuñiga", "cz@gmail.com", "32000000",
        -20, 3.0, 3.5, 4.5,2.0,4.4));
        LOG.info("Finalizando test edad negativa");
    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test de la validacion del correo");
        assertThrows(Throwable.class, ()-> new Estudiante("1138274319", "Camilo", "Zuñiga", "cz", "32000000",
        20, 3.0, 3.5, 4.5,2.0,4.4));
        LOG.info("Finalizando test de la validacion del correo");
    }
}
