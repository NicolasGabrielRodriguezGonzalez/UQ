package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class DueñoTest {

    private Dueño dueño;
    private Mascota mascota;

    @BeforeEach
    public void setUp() {
        dueño = new Dueño("Luisa", "Norte de Armenia", "3207180117");
        mascota = new Mascota("Rex", 5, "Labrador", null);
    }

    // Prueba que la lista de mascotas esté vacía cuando se crea un dueño
    @Test
    public void testMascotasVaciasAlCrearDueño() {
        assertEquals(0, dueño.getMascotas().size());
    }

    // Prueba que se pueda agregar una mascota correctamente
    @Test
    public void testAgregarMascota() {
        dueño.agregarMascota(mascota);
        assertEquals(1, dueño.getMascotas().size());
        assertTrue(dueño.getMascotas().contains(mascota));
    }

    // Prueba que se lance una excepción si se establece un nombre vacío
    @Test
    public void testNombreVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setNombre("");
        });
    }

    // Prueba que se lance una excepción si se establece un nombre nulo
    @Test
    public void testNombreNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setNombre(null);
        });
    }

    // Prueba que se lance una excepción si se establece una dirección vacía
    @Test
    public void testDireccionVacia() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setDireccion("");
        });
    }

    // Prueba que se lance una excepción si se establece una dirección nula
    @Test
    public void testDireccionNula() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setDireccion(null);
        });
    }

    // Prueba que se lance una excepción si se establece un teléfono vacío
    @Test
    public void testTelefonoVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setTelefono("");
        });
    }

    // Prueba que se lance una excepción si se establece un teléfono nulo
    @Test
    public void testTelefonoNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            dueño.setTelefono(null);
        });
    }

    // Prueba que el método toString devuelve la cadena correcta
    @Test
    public void testToString() {
        String esperado = "Dueño [nombre=Luisa, direccion=Norte de Armenia, telefono=3207180117, mascotas=[]]";
        assertEquals(esperado, dueño.toString());
    }

    // Prueba que se puede establecer una lista de mascotas
    @Test
    public void testSetMascotas() {
        LinkedList<Mascota> mascotas = new LinkedList<>();
        mascotas.add(mascota);
        dueño.setMascotas(mascotas);
        assertEquals(1, dueño.getMascotas().size());
        assertTrue(dueño.getMascotas().contains(mascota));
    }
}
