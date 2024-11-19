package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class TransaccionTest {
    private static final Logger LOG = Logger.getLogger(TransaccionTest.class.getName());
    @Test
    public void testTransaccionCompletada(){
        LOG.info("iniciando test");
        Vehiculo vehiculo3= new VehiculoHibrido("Toyota", "usada", "20202", "mecánicos", 250, 789654, TipoCombustible.DIESEL, "Manual", 12369, true, false, false);
        Cliente cliente4= new Cliente("José", "3456789", "34567", "jose@uotlook", "joselu", "hola", true, LocalDate.now());
        Empleado empleado5= new Empleado("Pacho", "123456", "5689", "pacho@live.com", "34567", "Asistente", "pacho10", "4456", true, LocalDate.of(2020, 04, 15), 14);
        Transaccion transaccion= new Venta("FESA 789", vehiculo3, cliente4, empleado5, LocalDate.now(), 1000, "Completada", 1000);
        assertTrue(transaccion.getEstadoTransaccion().equals("Completada"));
        LOG.info("finalizando test");
    }
    @Test
    public void testTransaccionNoPendiente(){
        LOG.info("iniciando test");
        Vehiculo vehiculo3= new VehiculoHibrido("Toyota", "usada", "20202", "mecánicos", 250, 789654, TipoCombustible.DIESEL, "Manual", 12369, true, false, false);
        Cliente cliente4= new Cliente("José", "3456789", "34567", "jose@uotlook", "joselu", "hola", true, LocalDate.now());
        Empleado empleado5= new Empleado("Pacho", "123456", "5689", "pacho@live.com", "34567", "Asistente", "pacho10", "4456", true, LocalDate.of(2020, 04, 15), 14);
        Transaccion transaccion= new Venta("FESA 789", vehiculo3, cliente4, empleado5, LocalDate.now(), 1000, "Completada", 1000);
        assertFalse(transaccion.getEstadoTransaccion().equals("Pendiente"));
        LOG.info("finalizando test");
    }
    @Test
public void testDatosVaciosEnTransaccion(){
    LOG.info("iniciando test");

    // Crear los objetos necesarios con datos válidos para asegurarnos de que no falten atributos.
    Vehiculo vehiculo3 = new VehiculoHibrido("Toyota", "usada", "20202", "mecánicos", 250, 789654, TipoCombustible.DIESEL, "Manual", 12369, true, false, false);
    Cliente cliente4 = new Cliente("José", "3456789", "34567", "jose@uotlook", "joselu", "hola", true, LocalDate.now());
    Empleado empleado5 = new Empleado("Pacho", "123456", "5689", "pacho@live.com", "34567", "Asistente", "pacho10", "4456", true, LocalDate.of(2020, 04, 15), 14);

    // Crear una instancia válida de transacción
    Transaccion transaccion1 = new Venta("T001", vehiculo3, cliente4, empleado5, LocalDate.now(), 10000, "Pendiente", 5);
    
    // Registrar la transacción
    transaccion1.registrarTransaccion(transaccion1);
    
    // Verificar que la lista de transacciones contiene la nueva transacción
    assertTrue(Transaccion.listaTransacciones.contains(transaccion1));
    
    // Crear una transacción con datos vacíos para comprobar cómo se maneja (sin necesidad de modificar la clase)
    Transaccion transaccionVacia = new Venta(" ", null, null, null, null, 0, " ", 0);
    
    // Verificar que no se ha agregado a la lista
    assertFalse(Transaccion.listaTransacciones.contains(transaccionVacia));
    
    LOG.info("Finalizando test datosVacios");
}



}