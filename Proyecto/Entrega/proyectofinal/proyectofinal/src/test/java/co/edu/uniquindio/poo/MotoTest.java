package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotoTest {
    @Test
    void testCalcularPrecioAlquilerGasolinaAltaVelocidad() {
        // Crear una Moto con gasolina y velocidad mayor a 120 km/h
        Moto moto = new Moto("Yamaha", "nuevo", "YZF-R1", "Manual", 180, 1000, 
                             TipoCombustible.GASOLINA, "Manual", 50000, true);

        // Calcular el precio de alquiler
        double precioAlquiler = moto.calcularPrecioAlquiler();
        
        // Verificar que el precio de alquiler se ajusta correctamente
        assertEquals(80000.0, precioAlquiler, 0.1, 
            "El precio de alquiler debería considerar el tipo de combustible y la velocidad.");
    }

    @Test
    void testCalcularPrecioAlquilerElectricaBajaVelocidad() {
        // Crear una Moto con eléctrico y velocidad menor a 120 km/h
        Moto moto = new Moto("Harley-Davidson", "nuevo", "LiveWire", "Automático", 110, 120, 
                             TipoCombustible.ELECTRICO, "Automático", 50000, true);

        // Calcular el precio de alquiler
        double precioAlquiler = moto.calcularPrecioAlquiler();
        
        // Verificar que el precio de alquiler se ajusta correctamente
        assertEquals(67500.0, precioAlquiler, 0.1, 
            "El precio de alquiler debería considerar el tipo de combustible y la velocidad.");
    }

    @Test
    void testCalcularPrecioVentaGasolinaAltoCilindraje() {
        // Crear una Moto de gasolina con cilindraje alto (>500)
        Moto moto = new Moto("Honda", "nuevo", "CBR 1000RR", "Manual", 200, 1000, 
                             TipoCombustible.GASOLINA, "Manual", 60000, true);

        // Calcular el precio de venta
        double precioVenta = moto.calcularPrecioVenta();
        
        // Verificar que el precio de venta se ajusta correctamente
        assertEquals(105000.0, precioVenta, 0.1, 
            "El precio de venta debería considerar el cilindraje alto y el tipo de combustible.");
    }

    @Test
    void testCalcularPrecioVentaElectricaBajoCilindraje() {
        // Crear una Moto eléctrica con cilindraje bajo (<500)
        Moto moto = new Moto("Zero", "nuevo", "S", "Automático", 120, 400, 
                             TipoCombustible.ELECTRICO, "Automático", 45000, true);

        // Calcular el precio de venta
        double precioVenta = moto.calcularPrecioVenta();
        
        // Verificar que el precio de venta se ajusta correctamente
        assertEquals(60750.0, precioVenta, 0.1, 
            "El precio de venta debería considerar el cilindraje bajo y el tipo de combustible.");
    }

    @Test
    void testAtributosMoto() {
        // Crear una moto con atributos específicos
        Moto moto = new Moto("Ducati", "nuevo", "Panigale V4", "Manual", 300, 1100, 
                             TipoCombustible.GASOLINA, "Manual", 70000, true);

        // Verificar atributos específicos de la moto
        assertEquals("Ducati", moto.getMarca(), "La marca de la moto debería ser Ducati");
        assertEquals("nuevo", moto.getEstado(), "El estado de la moto debería ser nuevo");
        assertEquals(300, moto.getVelocidadMaxima(), "La velocidad máxima debería ser 300 km/h");
        assertEquals(1100, moto.getCilindraje(), "El cilindraje debería ser 1100 cc");
        assertEquals(TipoCombustible.GASOLINA, moto.getTipoCombustible(), "El tipo de combustible debería ser gasolina");
    }
}

