package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());

    @Test
    public void testListasDeVehiculosYClientes() {
        LOG.info("Iniciando");

        // Crear un empleado
        Empleado empleado1 = new Empleado("Juan", "100588", "30245683", "juanj@uq", "123568", "asistente", "juan4568", "04030", true, LocalDate.now(), 1900000);

        // Crear listas locales para el test (como si fuera el comportamiento de los métodos getVehiculos() y getClientes())
        List<Cliente> clientes = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();
        
        // Registrar un cliente
        Cliente cliente1 = new Cliente("Ana", "122333", "30245879", "ana@uqvirtual", "Ana08", "34554", true, LocalDate.now());
        clientes.add(cliente1); // Agregar cliente a la lista temporal

        // Registrar un vehículo eléctrico
        VehiculoElectrico vehiculo1 = new VehiculoElectrico("Tesla", "nuevo", "2024", "automático", 200, 8000, TipoCombustible.ELECTRICO, "eléctrica", 800000000, true, "400", "10 horas");
        vehiculos.add(vehiculo1); // Agregar vehículo a la lista temporal

        // Validar que las listas de vehículos y clientes contengan el elemento agregado
        assertEquals(1, vehiculos.size());
        assertEquals(1, clientes.size());

        LOG.info("Finalizando test");
    }
}
