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
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Biblioteca.
    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test de datos Completos");
        Biblioteca biblioteca = new Biblioteca("Olimpica");
        assertEquals("Olimpica",biblioteca.getNombre());
        LOG.info("Finalizando test datos completos.");
    }
    //Agregar multiples estudiantes.
    @Test
    public void agregarEstudiante() {
        LOG.info("Iniciado test agregarEstudiante");

        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca("Confenalco");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Luis", "456", "31092421", "nicolas@gmail.com");
        Estudiante estudiante2 = new Estudiante("Ana", "789", "131212312", "ana@gmail.com");
        Estudiante estudiante3 = new Estudiante("Carlos", "123", "3104924160", "carlos@gmail.com");

        // Agregar estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);

        // Verificar si los estudiantes fueron agregados correctamente
        assertTrue(biblioteca.getEstudiantes().contains(estudiante1));
        assertTrue(biblioteca.getEstudiantes().contains(estudiante2));
        assertTrue(biblioteca.getEstudiantes().contains(estudiante3));

        // Verificar el tamaño de la lista de estudiantes
        assertEquals(3, biblioteca.getEstudiantes().size());

        LOG.info("Finalizando test agregarEstudiante");
    }
    @Test
    //Agregar un unico bibliotecario.
    public void agregarListaBibliotecarios() {
        Biblioteca biblioteca = new Biblioteca("Confenalco");
        Bibliotecario bibliotecario = new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com",  1300000);
        biblioteca.agregarBibliotecario(bibliotecario);
        assertEquals(1, biblioteca.getBibliotecarios().size());
        assertTrue(biblioteca.getBibliotecarios().contains(bibliotecario));
    }

    //Bibliotecario.
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test de datos vacios");
        
        Bibliotecario bibliotecario = new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com",  1300000);

        assertThrows(Throwable.class, ()-> new Bibliotecario (" ", " ", " ", " ", 0.0));

        LOG.info("Finalizando test datos vacios");
    

    }
    @Test
    public void salarioMayorASMLMV() {
        LOG.info("Iniciado test de SMLMV");
        assertThrows(Throwable.class, ()-> new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng@gmail.com", 1299999));
        LOG.info("Finalizando test de SMLMV");

    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test de la validacion del correo");
        assertThrows(Throwable.class, ()-> new Bibliotecario("Nicolas Gabriel Rodriguez", "10001", "3012155790", "ng", 1300000));
        LOG.info("Finalizando test de la validacion del correo");
    }

    //Libro.
    
    @Test
    public void unidadesNegativas() {
        LOG.info("Iniciado de unidades disponibles negativas");
        
        Libro libro1 = new Libro("10003", "000000000", "Vargas Lloza", "Satanas", "Norma", null, 10);

        assertThrows(Throwable.class, ()-> new Libro ("10003", "000000000", "Vargas Lloza", "Satanas", "Norma", null, -10));

        LOG.info("Finalizando test de unidades disponibles negativas");
    }

    @Test
    public void librosConMismoIsbnSonIguales() {
        LOG.info("Iniciado test librosConMismoIsbnSonIguales");

        // Crear dos libros con el mismo ISBN pero diferente código
        Libro libro1 = new Libro("001", "1234567890", "Gabriel García Márquez", "Cien años de soledad", "Norma", LocalDate.of(2020, 1, 1), 5);
        Libro libro2 = new Libro("002", "1234567890", "Gabriel García Márquez", "Cien años de soledad", "Norma", LocalDate.of(2020, 1, 1), 3);

        // Comparar si los libros se consideran iguales por ISBN
        assertEquals(libro1.getIsbn(), libro2.getIsbn());
        
        LOG.info("Finalizando test librosConMismoIsbnSonIguales");
    }

    @Test
    public void noPermitirUnidadesNegativasAlActualizar() {
        LOG.info("Iniciado test noPermitirUnidadesNegativasAlActualizar");

        Libro libro = new Libro("003", "0987654321", "Mario Vargas Llosa", "La ciudad y los perros", "Alfaguara", LocalDate.of(2019, 6, 15), 10);

        // Intentar establecer unidades negativas
        assertThrows(IllegalArgumentException.class, () -> libro.setUnidadesDisponibles(-5));

        LOG.info("Finalizando test noPermitirUnidadesNegativasAlActualizar");
    }
    //Prestamo
    @Test
    public void asignarIdCorrectamente() {
        LOG.info("Iniciado test asignarIdCorrectamente");

        // Crear un préstamo con un ID específico
        Prestamo prestamo = new Prestamo("P004", LocalDate.now(), LocalDate.now().plusDays(7));

        // Verificar que el ID se haya asignado correctamente
        assertEquals("P004", prestamo.getId());

        LOG.info("Finalizando test asignarIdCorrectamente");
    }
    @Test
    public void listaDeDetallesNoPuedeSerNula() {
        LOG.info("Iniciado test de lista de detalles nula");
    
        Prestamo prestamo = new Prestamo("P003", LocalDate.now(), LocalDate.now().plusDays(5));
    
        // Verificamos que se lanza una excepción cuando se intenta establecer una lista de detalles nula
        assertThrows(IllegalArgumentException.class, () -> 
            prestamo.setDetallePrestamos(null)
        );
    
        LOG.info("Finalizado test de lista de detalles nula");
    }
    
    @Test
    public void noSePuedenAgregarMasDeCincoDetalles() {
        // Crear un préstamo
        Prestamo prestamo = new Prestamo("P001", LocalDate.now(), LocalDate.now().plusDays(5));

        // Agregar 5 detalles válidos
        for (int j = 1; j <= 5; j++) {
            Libro libro = new Libro("C00" + j, "ISBN" + j, "Autor " + j, "Título " + j, "Editorial " + j, LocalDate.now(), 5);
            DetallePrestamo detalle = new DetallePrestamo(j, libro);
            prestamo.agregarDetallePrestamo(detalle);
        }

        // Intentar agregar un sexto detalle, lo cual debe lanzar una IllegalArgumentException
        Libro libroExtra = new Libro("C006", "ISBN6", "Autor 6", "Título 6", "Editorial 6", LocalDate.now(), 5);
        DetallePrestamo detalleExtra = new DetallePrestamo(6, libroExtra);
        
        // Comprobar que se lanza la excepción
        assertThrows(IllegalArgumentException.class, () -> prestamo.agregarDetallePrestamo(detalleExtra));
    }

    //Estudiante.
    @Test
    public void testToString() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Luisa", "456", "3207180117", "luisa@gmail.com");
        
        // Cadena esperada según el formato definido en el método toString
        String esperado = "Estudiante: Luisa, Cedula: 456, Telefono: 3207180117, Email: luisa@gmail.com";
        
        // Verificar que el método toString devuelve la cadena correcta
        assertEquals(esperado, estudiante.toString());
    }

    @Test
    public void testConstructorEstudianteConDatosDiferentes() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Carlos", "123", "3001234567", "carlos@gmail.com");

        // Verificar que los atributos se inicializan correctamente
        assertEquals("Carlos", estudiante.getNombre());
        assertEquals("123", estudiante.getCedula());
        assertEquals("3001234567", estudiante.getTelefono());
        assertEquals("carlos@gmail.com", estudiante.getEmail());
    }
    @Test
    public void testModificacionAtributosEstudiante() {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Ana", "789", "3109876543", "ana@gmail.com");

        // Modificar los atributos
        estudiante.setNombre("Ana Maria");
        estudiante.setCedula("7890");
        estudiante.setTelefono("3109876543");
        estudiante.setEmail("anamaria@gmail.com");

        // Verificar que los atributos se han modificado correctamente
        assertEquals("Ana Maria", estudiante.getNombre());
        assertEquals("7890", estudiante.getCedula());
        assertEquals("3109876543", estudiante.getTelefono());
        assertEquals("anamaria@gmail.com", estudiante.getEmail());
    }








}