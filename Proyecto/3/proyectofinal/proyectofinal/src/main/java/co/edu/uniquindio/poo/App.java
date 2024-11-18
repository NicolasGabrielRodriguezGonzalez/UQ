package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {

    // Lista de vehículos
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        private static Object cliente;
    
        public static void main(String[] args) {
            // Crear un administrador con usuario y contraseña
            Administrador administrador = new Administrador(
                    "Carlos Pérez", "A123", "3001234567", "carlos@admin.com", 
                    "admin", "admin", "12345", // Nueva contraseña
                    true, LocalDate.of(2020, 1, 1), 5000000, 
                    "¿Cuál es tu mascota?", "Fluffy"
            );
    
            // Crear un empleado con usuario y contraseña
            Empleado empleado = new Empleado(
                    "Juan Pérez", "123456789", "3001234567", "juan@example.com", 
                    "E001", "Vendedor", "1", "2", 
                    true, LocalDate.now(), 2500.50
            );
    
            // Crear un cliente con usuario y contraseña
            Cliente cliente = new Cliente(
                "Juan Pérez", "C001", "3001122333", "juan@cliente.com", 
                "cliente", "password", true, LocalDate.of(2023, 5, 10)
            );
    
            // Menú principal
            while (true) {
                String opcion = JOptionPane.showInputDialog(
                        null,
                        "Bienvenido, seleccione una opción:\n" +
                        "1. Administrador\n" +
                        "2. Empleado\n" +
                        "3. Cliente\n" +
                        "4. Salir",
                        "Menú Principal",
                        JOptionPane.INFORMATION_MESSAGE);
    
                if (opcion == null || opcion.equals("4")) {
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                } else if (opcion.equals("1")) {
                    autenticarAdministrador(administrador);
                } else if (opcion.equals("2")) {
                    autenticarEmpleado(empleado);
                } else if (opcion.equals("3")) {
                    autenticarCliente(cliente);
                }
            }
        }
    
        private static void autenticarAdministrador(Administrador administrador) {
            String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Administrador:");
            String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Administrador:");
    
            if (administrador.autenticar(usuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
                mostrarMenuAdministrador();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        }
    
        private static void autenticarEmpleado(Empleado empleado) {
            String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Empleado:");
            String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Empleado:");
    
            if (empleado.autenticar(usuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
                mostrarMenuEmpleado();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        }
    
        private static void autenticarCliente(Cliente cliente) {
            String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Cliente:");
            String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Cliente:");
    
            if (cliente.autenticar(usuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
                mostrarMenuCliente(cliente);
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        }
    
        private static void mostrarMenuAdministrador() {
            while (true) {
                String accion = JOptionPane.showInputDialog(
                        null,
                        "Menú Administrador:\n" +
                        "1. Gestionar vehículos\n" +
                        "2. Salir",
                        "Menú Administrador",
                        JOptionPane.INFORMATION_MESSAGE);
    
                if (accion == null || accion.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                    break;
                } else if (accion.equals("1")) {
                    gestionarVehiculos();
                }
            }
        }
    
        private static void mostrarMenuEmpleado() {
            while (true) {
                String opcionEmpleado = JOptionPane.showInputDialog(
                    null,
                    "Menú Empleado:\n" +
                    "1. Ver ventas\n" +
                    "2. Registrar cliente\n" +
                    "3. Ver cliente\n" +
                    "4. Agregar vehiculo\n" +
                    "5. Registrar transacción\n" + 
                    "6. Salir",
                    "Menú Empleado",
                    JOptionPane.INFORMATION_MESSAGE
                );
        
                if (opcionEmpleado == null || opcionEmpleado.equals("6")) {
                    JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                    break;
                } else if (opcionEmpleado.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Mostrando ventas...");
                } else if (opcionEmpleado.equals("2")) {
                    registrarCliente(); 
                } else if (opcionEmpleado.equals("3")) {
                    verCliente();
                } else if (opcionEmpleado.equals("4")) {
                    agregarVehiculo();
                } else if (opcionEmpleado.equals("5")) {
                    registrarTransaccion(); // Método para registrar transacciones
                }
            }
        }
        private static void registrarTransaccion() {
            // Solicitar la transacción a realizar
            String tipoTransaccion = JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de transacción:\n" +
                "1. Alquiler\n" +
                "2. Compra\n" +
                "3. Venta",
                "Tipo de Transacción",
                JOptionPane.QUESTION_MESSAGE
            );
        
            if (tipoTransaccion == null) return;
        
            String idTransaccion = JOptionPane.showInputDialog("Ingrese el ID de la transacción:");
            Vehiculo vehiculoSeleccionado = seleccionarVehiculo();
            Cliente clienteSeleccionado = seleccionarCliente();
            LocalDate fecha = LocalDate.now();
            double montoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de la transacción:"));
            String estadoTransaccion = JOptionPane.showInputDialog("Ingrese el estado de la transacción (Activo/Finalizado):");
            Empleado empleado = new Empleado("Juan Pérez", "123456789", "3001234567", "juan@example.com", 
                                             "E001", "Vendedor", "juan123", "123", true, LocalDate.now(), 2500.50);
        
            // Lógica para registrar el tipo de transacción
            if (tipoTransaccion.equals("1")) { // Alquiler
                LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):"));
                LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):"));
                double costoDiario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo diario:"));
                double costoTotal = costoDiario * (fechaFin.getDayOfYear() - fechaInicio.getDayOfYear());
                
                Alquiler alquiler = new Alquiler(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleado, fecha,
                                                 montoTotal, estadoTransaccion, fechaInicio, fechaFin, costoDiario, costoTotal);
                JOptionPane.showMessageDialog(null, "Transacción de alquiler registrada con éxito.");
            } else if (tipoTransaccion.equals("2")) { // Compra
                double precioCompraVehiculo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra:"));
                
                Compra compra = new Compra(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleado, fecha,
                                           montoTotal, estadoTransaccion, precioCompraVehiculo);
                JOptionPane.showMessageDialog(null, "Transacción de compra registrada con éxito.");
            } else if (tipoTransaccion.equals("3")) { // Venta
                double montoVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la venta:"));
                
                Venta venta = new Venta(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleado, fecha,
                                        montoTotal, estadoTransaccion, montoVenta);
                JOptionPane.showMessageDialog(null, "Transacción de venta registrada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
        
        // Método para seleccionar un vehículo
        private static Vehiculo seleccionarVehiculo() {
            // En este caso, seleccionamos el primer vehículo de la lista, en una implementación real deberías mostrar un listado.
            return vehiculos.isEmpty() ? null : vehiculos.get(0); // Seleccionar el primer vehículo registrado
        }
        
        // Método para seleccionar un cliente
        private static Cliente seleccionarCliente() {
            // En este caso, usamos un cliente ficticio, lo ideal sería seleccionar un cliente de la base de datos o lista.
            return new Cliente("Juan Pérez", "C001", "3001122333", "juan@cliente.com", 
                               "cliente", "password", true, LocalDate.of(2023, 5, 10));
        }
        private static void registrarCliente() {
            // Solicitar información del cliente
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
            if (nombre == null || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.");
                return;
            }
        
            String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del cliente:");
            if (codigo == null || codigo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El código no puede estar vacío.");
                return;
            }
        
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del cliente:");
            if (telefono == null || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El teléfono no puede estar vacío.");
                return;
            }
        
            String correo = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico del cliente:");
            if (correo == null || correo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El correo electrónico no puede estar vacío.");
                return;
            }
        
            String usuario = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario del cliente:");
            if (usuario == null || usuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El usuario no puede estar vacío.");
                return;
            }
        
            String password = JOptionPane.showInputDialog(null, "Ingrese la contraseña del cliente:");
            if (password == null || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.");
                return;
            }
        
            // Registrar al cliente como activo y asignar la fecha de registro actual
            cliente = new Cliente(
                nombre,
                codigo,
                telefono,
                correo,
                usuario,
                password,
                true,
                LocalDate.now() // Fecha actual
            );
        
            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito:\n" + cliente.toString());
        }
        private static void verCliente() {
            Object Cliente;
                    if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Nombre: Juan Pérez\n" + //
                                        "Código: C001\n" + //
                                        "Teléfono: 3001122333\n" + //
                                        "Correo: juan@cliente.com\n" + //
                                        "Usuario: cliente\n" + //
                                        "Estado: Activo\n" + //
                                        "Fecha de Registro: 2023-05-10");
            } else {
                JOptionPane.showMessageDialog(null, cliente.toString(), "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void gestionarVehiculos() {
        while (true) {
            String accion = JOptionPane.showInputDialog(
                    null,
                    "¿Qué acción desea realizar con los vehículos?\n" +
                    "1. Agregar\n" +
                    "2. Ver detalles\n" +
                    "3. Salir",
                    "Gestión de Vehículos",
                    JOptionPane.INFORMATION_MESSAGE);

            if (accion == null || accion.equals("3")) {
                break;
            } else if (accion.equals("1")) {
                agregarVehiculo();
            } else if (accion.equals("2")) {
                verDetallesVehiculos();
            }
        }
    }

    private static void agregarVehiculo() {
        try {
            // Opción de selección de tipo de vehículo
            String[] opcionesVehiculos = {
                "Sedan Eléctrico", "Camioneta Eléctrica", "Deportivo Eléctrico", 
                "Van Híbrida", "Bus Híbrido", "Pick Up Híbrido", 
                "Camión Híbrido", "Moto"
            };
            
            String tipoVehiculo = (String) JOptionPane.showInputDialog(
                null, 
                "Seleccione el tipo de vehículo:", 
                "Selección de vehículo", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcionesVehiculos, 
                opcionesVehiculos[0]
            );
    
            if (tipoVehiculo == null) {
                return; // Si el usuario cancela, salir del método
            }
    
            // Ingresar detalles generales del vehículo
            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
            String estado = JOptionPane.showInputDialog("Ingrese el estado del vehículo:");
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
            String cambios = JOptionPane.showInputDialog("Ingrese el número de cambios del vehículo:");
            double velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad máxima del vehículo (km/h):"));
            double cilindraje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cilindraje del vehículo:"));
            String tipoCombustibleString = JOptionPane.showInputDialog("Ingrese el tipo de combustible (GASOLINA, DIESEL, ELECTRICO, HIBRIDO):");
            String transmision = JOptionPane.showInputDialog("Ingrese el tipo de transmisión (Manual o Automática):");
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del vehículo:"));
            boolean revisionTecnica = JOptionPane.showConfirmDialog(null, "¿Ha pasado la revisión técnica?") == JOptionPane.YES_OPTION;
            
            // Preguntar detalles específicos según el tipo de combustible
            boolean enchufable = false;
            boolean hibridoLigero = false;
            String autonomia = "";
            String tiempoPromedio = "";
            
            if (tipoCombustibleString.equalsIgnoreCase("ELECTRICO")) {
                // Preguntar para vehículos eléctricos
                autonomia = JOptionPane.showInputDialog("Ingrese la autonomía del vehículo (en km):");
                tiempoPromedio = JOptionPane.showInputDialog("Ingrese el tiempo promedio de carga del vehículo (en horas):");
            } else if (tipoCombustibleString.equalsIgnoreCase("HIBRIDO")) {
                // Preguntar para vehículos híbridos
                enchufable = JOptionPane.showConfirmDialog(null, "¿Es un vehículo híbrido enchufable?") == JOptionPane.YES_OPTION;
            
                if (!enchufable) {  // Si no es enchufable, preguntar por híbrido ligero
                    hibridoLigero = JOptionPane.showConfirmDialog(null, "¿Es un vehículo híbrido ligero?") == JOptionPane.YES_OPTION;
                }
            }

    
            // Ingresar detalles específicos según el tipo de vehículo seleccionado
            if (tipoVehiculo.equals("Sedan Eléctrico")) {
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                double capacidadMaletero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad del maletero (en litros):"));
                boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
                boolean camaraReserva = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
                boolean velocidadCrucero = JOptionPane.showConfirmDialog(null, "¿Tiene control de velocidad crucero?") == JOptionPane.YES_OPTION;
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
                boolean sensoresColision = JOptionPane.showConfirmDialog(null, "¿Tiene sensores de colisión?") == JOptionPane.YES_OPTION;
                boolean sensorTraficoCruzado = JOptionPane.showConfirmDialog(null, "¿Tiene sensor de tráfico cruzado?") == JOptionPane.YES_OPTION;
                boolean permanenciaCarril = JOptionPane.showConfirmDialog(null, "¿Tiene sistema de permanencia en el carril?") == JOptionPane.YES_OPTION;
    
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
    
                // Crear un nuevo vehículo de tipo Sedan Eléctrico
                SedanElectrico sedanElectrico = new SedanElectrico(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    autonomia, tiempoPromedio, numPasajeros, numPuertas,
                    capacidadMaletero, aireAcondicionado, camaraReserva, velocidadCrucero,
                    numBolsasAire, abs, sensoresColision, sensorTraficoCruzado, permanenciaCarril
                );
    
                vehiculos.add(sedanElectrico);
                JOptionPane.showMessageDialog(null, "¡Vehículo Sedan Eléctrico agregado exitosamente!");
            } 
            if (tipoVehiculo.equals("Camioneta Eléctrica")) {
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                double capacidadMaletero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad del maletero (en litros):"));
                double aireAcondicionado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de aire acondicionado:"));
                boolean camaraReversa = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
                boolean velocidadCrucero = JOptionPane.showConfirmDialog(null, "¿Tiene control de velocidad crucero?") == JOptionPane.YES_OPTION;
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
                boolean sensoresColision = JOptionPane.showConfirmDialog(null, "¿Tiene sensores de colisión?") == JOptionPane.YES_OPTION;
                boolean sensorTraficoCruzado = JOptionPane.showConfirmDialog(null, "¿Tiene sensor de tráfico cruzado?") == JOptionPane.YES_OPTION;
                boolean permanenciaCarril = JOptionPane.showConfirmDialog(null, "¿Tiene sistema de permanencia en el carril?") == JOptionPane.YES_OPTION;
                boolean cuatroXCuatro = JOptionPane.showConfirmDialog(null, "¿Es 4x4?") == JOptionPane.YES_OPTION;
            
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
            
                // Crear un nuevo vehículo de tipo Camioneta Eléctrica
                CamionetaElectrica camionetaElectrica = new CamionetaElectrica(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    autonomia, tiempoPromedio, numPasajeros, numPuertas,
                    capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero,
                    numBolsasAire, abs, sensoresColision, sensorTraficoCruzado, permanenciaCarril, cuatroXCuatro
                );
            
                vehiculos.add(camionetaElectrica);
                JOptionPane.showMessageDialog(null, "¡Camioneta Eléctrica agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Deportivo Eléctrico")) {
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                int numCaballosFuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de caballos de fuerza:"));
                double tiempoParaAlcanzar100KmH = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo para alcanzar 100 km/h (en segundos):"));
            
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
            
                // Crear un nuevo vehículo de tipo Deportivo Eléctrico
                DeportivoElectrico deportivoElectrico = new DeportivoElectrico(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    autonomia, tiempoPromedio, numPasajeros, numPuertas,
                    numBolsasAire, numCaballosFuerza, tiempoParaAlcanzar100KmH
                );
            
                vehiculos.add(deportivoElectrico);
                JOptionPane.showMessageDialog(null, "¡Deportivo Eléctrico agregado exitosamente!");
            }
            if (tipoVehiculo.equals("Van Híbrida")) {
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                double capacidadMaletero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad del maletero (en litros):"));
                boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
                boolean camaraReversa = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
            
            
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
            
                // Crear un nuevo vehículo de tipo Van Híbrida
                VanHibrida vanHibrida = new VanHibrida(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    enchufable, hibridoLigero, numPasajeros, numPuertas,
                    capacidadMaletero, aireAcondicionado, camaraReversa,
                    numBolsasAire, abs
                );
            
                vehiculos.add(vanHibrida);
                JOptionPane.showMessageDialog(null, "¡Van Híbrida agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Bus Híbrido")) {
                // Atributos específicos para el Bus Híbrido
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                double capacidadMaletero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad del maletero (en litros):"));
                boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
                boolean camaraReversa = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
                int numEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejes:"));
                int numSalidasEmergencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de salidas de emergencia:"));
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());

                // Crear un nuevo vehículo de tipo Bus Híbrido, con los atributos previamente obtenidos
                BusHibrido busHibrido = new BusHibrido(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    enchufable, hibridoLigero, numPasajeros, numPuertas,
                    capacidadMaletero, aireAcondicionado, camaraReversa,
                    numBolsasAire, abs, numEjes, numSalidasEmergencia
                );
                
                // Agregar el vehículo a la lista
                vehiculos.add(busHibrido);
                JOptionPane.showMessageDialog(null, "¡Bus Híbrido agregado exitosamente!");
            }
            
            if (tipoVehiculo.equals("PickUp Híbrido")) {
                // Atributos específicos para la PickUp Híbrido
                int numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros:"));
                int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
                boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
                boolean camaraReversa = JOptionPane.showConfirmDialog(null, "¿Tiene cámara de reversa?") == JOptionPane.YES_OPTION;
                int numBolsasAire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:"));
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
                boolean cuatroXCuatro = JOptionPane.showConfirmDialog(null, "¿Es 4x4?") == JOptionPane.YES_OPTION;
                double capacidadCajaCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de la caja de carga (en kg):"));
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());

                
                // Crear un nuevo vehículo de tipo PickUp Híbrido con los atributos obtenidos
                PickUpHibrido pickUpHibrido = new PickUpHibrido(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    enchufable, hibridoLigero, numPasajeros, numPuertas,
                    aireAcondicionado, camaraReversa, numBolsasAire, abs, cuatroXCuatro, capacidadCajaCarga
                );
                
                // Agregar el vehículo a la lista de vehículos
                vehiculos.add(pickUpHibrido);
                JOptionPane.showMessageDialog(null, "¡PickUp Híbrido agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Camion Híbrido")) {
                // Atributos específicos para el Camion Híbrido
                double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (en kg):"));
                boolean aireAcondicionado = JOptionPane.showConfirmDialog(null, "¿Tiene aire acondicionado?") == JOptionPane.YES_OPTION;
                boolean frenosAire = JOptionPane.showConfirmDialog(null, "¿Tiene frenos de aire?") == JOptionPane.YES_OPTION;
                boolean abs = JOptionPane.showConfirmDialog(null, "¿Tiene sistema ABS?") == JOptionPane.YES_OPTION;
                int numEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejes:"));
                String tipoCamion = JOptionPane.showInputDialog("Ingrese el tipo de camión (e.g., Carga pesada, Carga ligera):");
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());

                // Crear un nuevo vehículo de tipo Camion Híbrido con los atributos obtenidos
                CamionHibrido camionHibrido = new CamionHibrido(
                    marca, estado, modelo, cambios, velocidadMaxima,
                    cilindraje, tipoCombustible, transmision, precioBase, revisionTecnica,
                    enchufable, hibridoLigero, capacidadCarga, aireAcondicionado,
                    frenosAire, abs, numEjes, tipoCamion
                );
                
                // Agregar el vehículo a la lista de vehículos
                vehiculos.add(camionHibrido);
                JOptionPane.showMessageDialog(null, "¡Camión Híbrido agregado exitosamente!");
            }
            if (tipoVehiculo.equals("Moto")) {
                // Crear un nuevo vehículo de tipo Moto con los atributos generales obtenidos previamente
                TipoCombustible tipoCombustible = TipoCombustible.valueOf(tipoCombustibleString.toUpperCase());
                Moto moto = new Moto(marca, estado, modelo, cambios, velocidadMaxima, cilindraje,
                                     tipoCombustible, transmision, precioBase, revisionTecnica);
                                     
                
                // Agregar el vehículo a la lista de vehículos
                vehiculos.add(moto);
                JOptionPane.showMessageDialog(null, "¡Moto agregada exitosamente!");
            }
            
            

            // Aquí puedes agregar otros bloques 'if' para los otros tipos de vehículos (camioneta eléctrica, moto, etc.)
    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el vehículo. Por favor, verifica los datos ingresados.");
        }
    }
    

    private static void verDetallesVehiculos() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos registrados.");
        } else {
            StringBuilder detalles = new StringBuilder();
            for (Vehiculo vehiculo : vehiculos) {
                detalles.append(vehiculo.toString()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, detalles.toString());
        }
    }

    private static void mostrarMenuCliente(Cliente cliente) {
        while (true) {
            String opcionCliente = JOptionPane.showInputDialog(
                    null,
                    "Menú Cliente:\n" +
                    "1. Ver información de cuenta\n" +
                    "2. Salir",
                    "Menú Cliente",
                    JOptionPane.INFORMATION_MESSAGE);

            if (opcionCliente == null || opcionCliente.equals("2")) {
                JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                break;
            } else if (opcionCliente.equals("1")) {
                JOptionPane.showMessageDialog(null, cliente.toString());
            }
        }
    }
    
}
