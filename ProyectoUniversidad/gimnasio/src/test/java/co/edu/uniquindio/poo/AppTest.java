/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciando test de datos vacíos");

        // Crear un entrenador para pasar como argumento al constructor de Miembro.
        Entrenador entrenador = new Entrenador("EntrenadorTest", "test", 123456789, "test@example.com");

        // Prueba con todos los datos vacíos y el entrenador creado.
        assertThrows(Throwable.class, () -> new Miembro(" ", 0, " ", " ", TipoMembresia.ANUAL, entrenador),
            "Se esperaba una IllegalArgumentException para datos vacíos");
        
        LOG.info("Finalizando test datos vacíos");
    }
}
