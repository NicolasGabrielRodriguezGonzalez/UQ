/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

    /**
     * Rigorous Test :-)
     */
    public class AppTest {

        private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    
        // Test para Entrenador
        /*String nombre, String cedula, int telefono, String correo, String especialidad) */
        @Test
        public void testDatosCompletosEntrenador() {
            LOG.info("Iniciando test de datos completos para Entrenador");
            Entrenador entrenador = new Entrenador("Carlos", "123456", 310123456, "carlos@gmail.com", "Personal Trainer");
            assertEquals("Carlos", entrenador.getNombre());
            assertEquals("123456", entrenador.getCedula());
            assertEquals(310123456, entrenador.getTelefono());
            assertEquals("carlos@gmail.com", entrenador.getCorreo());
            assertEquals("Personal Trainer", entrenador.getEspecialidad());
            LOG.info("Finalizando test de datos completos para Entrenador");
        }
    
        @Test
        public void testDatosVaciosEntrenador() {
            LOG.info("Iniciando test de datos vacíos para Entrenador");
            assertThrows(AssertionError.class, () -> new Entrenador(" ", " ", 0, " ", " "));
            LOG.info("Finalizando test de datos vacíos para Entrenador");
        }
    /*(String nombre, String cedula, int telefono, String correo, int edad, String genero */
        // Test para Miembro
        @Test
        public void testDatosCompletosMiembro() {
            LOG.info("Iniciando test de datos completos para Miembro");
            Entrenador entrenador = new Entrenador("Lucia", "654321", 320654321, "lucia@gmail.com", "Fisioterapeuta");
            Miembro miembro = new Miembro("Ana", "789012", 300789012, "ana@gmail.com", 25, "Femenino", TipoMembresia.ANUAL, entrenador);
            assertEquals("Ana", miembro.getNombre());
            assertEquals("789012", miembro.getCedula());
            assertEquals(300789012, miembro.getTelefono());
            assertEquals("ana@gmail.com", miembro.getCorreo());
            assertEquals(25, miembro.getEdad());
            assertEquals("Femenino", miembro.getGenero());
            assertEquals(TipoMembresia.ANUAL, miembro.getTipoMembresia());
            assertEquals(entrenador, miembro.getEntrenador());
            LOG.info("Finalizando test de datos completos para Miembro");
        }
    
        @Test
        public void testDatosVaciosMiembro() {
            LOG.info("Iniciando test de datos vacíos para Miembro");
            Entrenador entrenador = new Entrenador("Lucia", "654321", 320654321, "lucia@gmail.com", "Fisioterapeuta");
            assertThrows(IllegalArgumentException.class, () -> new Miembro("", "", 0, "", 0, "", null, entrenador));
            LOG.info("Finalizando test de datos vacíos para Miembro");
        }
    
        @Test
        public void testModificarAtributosMiembro() {
            LOG.info("Iniciando test de modificación de atributos de Miembro");
            Entrenador entrenador = new Entrenador("Lucia", "654321", 344420645, "lucia@gmail.com", "Fisioterapeuta");
            Miembro miembro = new Miembro("Juan", "123456", 300123456, "juan@gmail.com", 30, "Masculino", TipoMembresia.ANUAL, entrenador);
    
            miembro.setNombre("Juan Perez");
            miembro.setCedula("654321");
            miembro.setTelefono(320654321);
            miembro.setCorreo("juanp@gmail.com");
            miembro.setEdad(35);
            miembro.setGenero("Masculino");
            miembro.setTipoMembresia(TipoMembresia.MENSUAL);
    
            assertEquals("Juan Perez", miembro.getNombre());
            assertEquals("654321", miembro.getCedula());
            assertEquals(320654321, miembro.getTelefono());
            assertEquals("juanp@gmail.com", miembro.getCorreo());
            assertEquals(35, miembro.getEdad());
            assertEquals("Masculino", miembro.getGenero());
            assertEquals(TipoMembresia.MENSUAL, miembro.getTipoMembresia());
            LOG.info("Finalizando test de modificación de atributos de Miembro");
        }
    }
    





