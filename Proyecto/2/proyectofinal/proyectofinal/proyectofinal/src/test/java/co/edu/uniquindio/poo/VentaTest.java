package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VentaTest {
    private static final Logger LOG = Logger.getLogger(VentaTest.class.getName());

    @Test
    public void testVentaCompletada() {
        LOG.info("Iniciando Test testVentaCompletada");
        Venta venta1 = new Venta("7889", null, null, null, LocalDate.now(), 8000000, "Completada", 8000000);
        assertTrue(venta1.getEstadoTransaccion().equals("Completada"));
        LOG.info("Finalizando Test testVentaCompletada");
    }

    @Test
    public void testToString() {
        // Usar una fecha específica para mantener consistencia
        LocalDate fechaActual = LocalDate.now();
        Venta venta2 = new Venta("7569", null, null, null, fechaActual, 0.0, "Cancelada", 0.0);
        
        // Construcción del string esperado según el formato del método toString()
        String expectedString = "Venta {" +
                "\n  Monto Venta: 0.0" +
                "\n  ID Transacción: 7569" +
                "\n  Vehículo: null" +
                "\n  Cliente: null" +
                "\n  Empleado: null" +
                "\n  Fecha: " + fechaActual +
                "\n  Estado: Cancelada\n}";

        // Comparación del resultado con la salida esperada
        assertEquals(expectedString, venta2.toString());
    }

    @Test
    public void testDatosVacios() {
        LOG.info("Iniciando Test testDatosVacios");

        // Creación de una venta con datos vacíos o nulos
        Venta ventaVacia = new Venta("", null, null, null, null, 0.0, "", 0.0);

        // Verificaciones para datos vacíos o nulos
        assertEquals("", ventaVacia.getIdTransaccion(), "El ID de la transacción debería ser una cadena vacía");
        assertNull(ventaVacia.getVehiculo(), "El vehículo debería ser null");
        assertNull(ventaVacia.getCliente(), "El cliente debería ser null");
        assertNull(ventaVacia.getEmpleado(), "El empleado debería ser null");
        assertNull(ventaVacia.getFecha(), "La fecha debería ser null");
        assertEquals(0.0, ventaVacia.getMontoVenta(), "El monto de la venta debería ser 0.0");
        assertEquals("", ventaVacia.getEstadoTransaccion(), "El estado de la transacción debería ser una cadena vacía");
        assertEquals(0.0, ventaVacia.getMontoTotal(), "El monto total debería ser 0.0");

        LOG.info("Finalizando Test testDatosVacios");
    }
}
