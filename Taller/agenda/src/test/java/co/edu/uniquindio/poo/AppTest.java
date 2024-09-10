package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    // Pruebas para la clase Contacto
    @Test
    public void testConstructorContacto() {
        Contacto contacto = new Contacto("Juan", "Juanito", "Calle Falsa 123", "1234567890", "juan@example.com");
        assertEquals("Juan", contacto.getNombre());
        assertEquals("Juanito", contacto.getAlias());
        assertEquals("Calle Falsa 123", contacto.getDireccion());
        assertEquals("1234567890", contacto.getTelefono());
        assertEquals("juan@example.com", contacto.getEmail());
    }

    @Test
    public void testToStringContacto() {
        Contacto contacto = new Contacto("Juan", "Juanito", "Calle Falsa 123", "1234567890", "juan@example.com");
        String expected = "Contacto [nombre=Juan, alias=Juanito, direccion=Calle Falsa 123, telefono=1234567890, email=juan@example.com]";
        assertEquals(expected, contacto.toString());
    }

    // Pruebas para la clase Grupo
    @Test
    public void testAgregarContacto() {
        Grupo grupo = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        Contacto contacto = new Contacto("Pedro", "Pedrito", "Calle Real", "555555555", "pedro@example.com");
        grupo.agregarContacto(contacto);
        assertEquals(1, grupo.getListaContactos().size());
        assertTrue(grupo.getListaContactos().contains(contacto));
    }

    @Test
    public void testEliminarContacto() {
        Grupo grupo = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        Contacto contacto = new Contacto("Pedro", "Pedrito", "Calle Real", "555555555", "pedro@example.com");
        grupo.agregarContacto(contacto);
        grupo.eliminarContacto(contacto);
        assertEquals(0, grupo.getListaContactos().size());
        assertFalse(grupo.getListaContactos().contains(contacto));
    }

    @Test
    public void testAgregarContactoDuplicado() {
        Grupo grupo = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        Contacto contacto = new Contacto("Pedro", "Pedrito", "Calle Real", "555555555", "pedro@example.com");
        grupo.agregarContacto(contacto);
        // Intentar agregar el mismo contacto de nuevo
        assertThrows(IllegalArgumentException.class, () -> grupo.agregarContacto(contacto));
    }

    @Test
    public void testEliminarContactoNoExistente() {
        Grupo grupo = new Grupo("Amigos", Grupo.Categoria.AMIGOS);
        Contacto contacto = new Contacto("Pedro", "Pedrito", "Calle Real", "555555555", "pedro@example.com");
        // Intentar eliminar un contacto que no existe en el grupo
        assertThrows(IllegalArgumentException.class, () -> grupo.eliminarContacto(contacto));
    }
}