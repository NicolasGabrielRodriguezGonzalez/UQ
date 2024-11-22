package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        // Creación de un administrador con datos vacíos
        Administrador administrador = new Administrador(
                "",        // Nombre vacío
                "",        // Cédula vacía
                "",        // Teléfono vacío
                "",        // Email vacío
                "",        // ID Administrador vacío
                "",        // Usuario vacío
                "",        // Contraseña vacía
                false,     // Estado Administrador falso
                null,      // Fecha de contratación nula
                0,         // Salario cero
                "",        // Pregunta de seguridad vacía
                ""         // Respuesta de seguridad vacía
        );

        // Verificar que los valores estén establecidos como vacíos o nulos
        assertEquals("", administrador.getNombre(), "El nombre debería ser una cadena vacía");
        assertEquals("", administrador.getCedula(), "La cédula debería ser una cadena vacía");
        assertEquals("", administrador.getTelefono(), "El teléfono debería ser una cadena vacía");
        assertEquals("", administrador.getEmail(), "El email debería ser una cadena vacía");
        assertEquals("", administrador.getIdAdministrador(), "El ID Administrador debería ser una cadena vacía");
        assertEquals("", administrador.getUsuario(), "El usuario debería ser una cadena vacía");
        assertEquals("", administrador.getContraseña(), "La contraseña debería ser una cadena vacía");
        assertEquals(false, administrador.isEstadoAdministrador(), "El estado del administrador debería ser false");

        // Verificación del valor nulo usando assertEquals
        assertEquals(null, administrador.getFechaContratacion(), "La fecha de contratación debería ser null");

        assertEquals(0, administrador.getSalario(), "El salario debería ser 0");
        assertEquals("", administrador.getPreguntaSeguridad(), "La pregunta de seguridad debería ser una cadena vacía");
        assertEquals("", administrador.getRespuestaSeguridad(), "La respuesta de seguridad debería ser una cadena vacía");

        LOG.info("Finalizando Test datosVacios");
    }

    @Test
    public void datosCompletosAdministrador() {
        LOG.info("Iniciando test datos completos Administrador");
        Administrador administrador= new Administrador("Carlos Pérez", "A123", "3001234567", "carlos@admin.com", "admin", "admin_usuario", "12345", true, LocalDate.of(2020, 1, 1), 5000000, "¿Cuál es tu mascota?", "Fluffy");
        assertEquals("Carlos Pérez", administrador.getNombre());
        LOG.info("datosCompletosAdministrador");
    }
    
}
