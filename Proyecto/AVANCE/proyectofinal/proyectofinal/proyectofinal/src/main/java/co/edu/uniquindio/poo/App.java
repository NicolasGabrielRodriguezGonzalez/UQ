package co.edu.uniquindio.poo;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class App {

    // Lista de vehículos
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static LinkedList<Empleado> listaEmpleados = new LinkedList<>();
    private static LinkedList<Transaccion> transacciones = new LinkedList<>();
    private static LinkedList<Reporte> reportes = new LinkedList<>();
    
    public static void main(String[] args) {
        // Crear un administrador con usuario y contraseña
        Administrador administrador = new Administrador(
                "Carlos Pérez", "A123", "3001234567", "carlos@admin.com", 
                "admin", "admin", "12345", // Nueva contraseña
                true, LocalDate.of(2020, 1, 1), 5000000, 
                "¿Cuál es tu mascota?", "pacho"
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
                autenticarEmpleado();
            } else if (opcion.equals("3")) {
                autenticarCliente();
            }
        }
    }
    
    private static void autenticarAdministrador(Administrador administrador) {
    // Solicitar el nombre de usuario y contraseña
    String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Administrador:");
    String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Administrador:");

    // Autenticar con los datos proporcionados
    if (administrador.autenticar(usuario, contrasena)) {
        JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
        // Mostrar el menú del administrador
        mostrarMenuAdministrador(); // Llamar directamente al menú del administrador
    } else {
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        // Llamar al método de seguridad si las credenciales son incorrectas
        autenticarSeguridadAdministrador(administrador);
    }
}

private static void autenticarSeguridadAdministrador(Administrador administrador) {
    // Solicitar la respuesta a la pregunta de seguridad
    String respuestaSeguridad = JOptionPane.showInputDialog(administrador.getPreguntaSeguridad());

    // Verificar si la respuesta es correcta
    if (administrador.getRespuestaSeguridad().equals(respuestaSeguridad)) {
        JOptionPane.showMessageDialog(null, "Respuesta correcta.");
        
        // Opción para cambiar la contraseña
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cambiar la contraseña?", "Cambio de Contraseña", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            // Solicitar nueva contraseña
            String nuevaContrasena = JOptionPane.showInputDialog("Ingrese la nueva contraseña:");
            
            // Verificar si la nueva contraseña es válida (puedes agregar validación aquí)
            if (nuevaContrasena != null && nuevaContrasena.length() > 0) {
                // Cambiar la contraseña en el objeto administrador
                cambiarContraseñaAdministrador(administrador, nuevaContrasena);
                JOptionPane.showMessageDialog(null, "Contraseña cambiada exitosamente.");
                
                // Intentar nuevamente la autenticación con la nueva contraseña
                autenticarAdministrador(administrador);
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.");
            }
        } else {
            // Si no quiere cambiar la contraseña, volver a intentar la autenticación
            JOptionPane.showMessageDialog(null, "La autenticación ha fallado.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Respuesta incorrecta.");
    }
}

private static void cambiarContraseñaAdministrador(Administrador administrador, String nuevaContraseña) {
    // Actualiza la contraseña en el objeto Administrador
    administrador.setContraseña(nuevaContraseña);
}
    
private static void autenticarEmpleado() {
    // Check if there are no employees created
    if (listaEmpleados.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se ha creado ningún empleado.");
        return;
    }

    String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Empleado:");
    if (usuario == null || usuario.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El nombre de usuario es obligatorio.");
        return;
    }

    String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Empleado:");
    if (contrasena == null || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(null, "La contraseña es obligatoria.");
        return;
    }
    
    // Buscar el empleado en la lista de empleados
    Empleado empleadoEncontrado = null;
    for (Empleado empleado : listaEmpleados) {
        if (empleado.getUsuario().equals(usuario) && empleado.getContraseña().equals(contrasena)) {
            empleadoEncontrado = empleado;
            break;
        }
    }

    // Si se encontró al empleado, proceder con la autenticación
    if (empleadoEncontrado != null) {
        JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
        mostrarMenuEmpleado(); // Mostrar el menú del empleado autenticado
    } else {
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
    }
}


    private static void autenticarCliente() {
    // Check if there are no clients created
    if (clientes.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se ha creado ningún cliente.");
        return;
    }

    String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del Cliente:");
    if (usuario == null || usuario.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El nombre de usuario es obligatorio.");
        return;
    }

    String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del Cliente:");
    if (contrasena == null || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(null, "La contraseña es obligatoria.");
        return;
    }
    
    // Buscar el cliente en la lista de clientes
    Cliente clienteEncontrado = null;
    for (Cliente cliente : clientes) {
        // Usar el método autenticar de la clase Cliente para validar credenciales
        if (cliente.autenticar(usuario, contrasena)) {
            clienteEncontrado = cliente;
            break;
        }
    }

    // Si se encontró al cliente, proceder con la autenticación
    if (clienteEncontrado != null) {
        JOptionPane.showMessageDialog(null, "Autenticación exitosa.");
        mostrarMenuCliente(clienteEncontrado); // Mostrar el menú del cliente autenticado
    } else {
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
    }
}


    
        private static void mostrarMenuAdministrador() {
    // Aquí mostramos el menú del administrador
    while (true) {
        String accion = JOptionPane.showInputDialog(
                null,
                "Menú Administrador:\n" +
                "1. Gestionar empleados\n" + // Puedes incluir otras opciones que sean relevantes para el administrador
                "2. Ver reportes\n" +
                "3. Salir",
                "Menú Administrador",
                JOptionPane.INFORMATION_MESSAGE);
    
        if (accion == null || accion.equals("3")) {
            JOptionPane.showMessageDialog(null, "Cerrando sesión...");
            break;
        } else if (accion.equals("1")) {
            gestionarEmpleados(); // Método para gestionar empleados, si es relevante
        } else if (accion.equals("2")) {
            verReportes(); // Método para ver reportes, si es relevante
        }
    }
}

        
        private static void gestionarEmpleados() {
            String[] opciones = {"Agregar Empleado", "Modificar Empleado", "Eliminar Empleado", "Ver Detalles de Empleado", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de Empleados",
                                                      JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                      null, opciones, opciones[0]);
        
            switch (opcion) {
                case 0: // Agregar Empleado
                    agregarEmpleado();
                    break;
                case 1: // Modificar Empleado
                    modificarEmpleado();
                    break;
                case 2: // Eliminar Empleado
                    eliminarEmpleado(); // Llama al método para eliminar un empleado
                    break;
                case 3: // Ver Detalles de Empleado
                    verDetallesEmpleado(); // Llama al método para ver los detalles del empleado
                    break;
                default:
                    // Salir de la gestión de empleados
                    break;
            }
        }
        
        
        
        

        private static void agregarEmpleado() {
            try {
                // Solicitar datos del empleado al usuario
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado:");
                String email = JOptionPane.showInputDialog("Ingrese el email del empleado:");
                String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
                String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");
                String usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado:");
                String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña del empleado:");
    
                boolean estadoEmpleado = JOptionPane.showConfirmDialog(null, "¿El empleado está activo?", "Estado del Empleado", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    
                String fechaContratacionStr = JOptionPane.showInputDialog("Ingrese la fecha de contratación (YYYY-MM-DD):");
                LocalDate fechaContratacion = LocalDate.parse(fechaContratacionStr);
    
                String salarioStr = JOptionPane.showInputDialog("Ingrese el salario del empleado:");
                double salario = Double.parseDouble(salarioStr);
    
                // Crear objeto Empleado
                Empleado nuevoEmpleado = new Empleado(nombre, cedula, telefono, email, idEmpleado, puesto, usuario, contraseña, estadoEmpleado, fechaContratacion, salario);
    
                // Agregar el empleado a la lista
                listaEmpleados.add(nuevoEmpleado);
                JOptionPane.showMessageDialog(null, "Empleado agregado con éxito: " + nuevoEmpleado);
    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al agregar empleado: " + e.getMessage());
            }
        }
    
        // Método para seleccionar un empleado de la lista
        // Método para seleccionar un empleado
        private static Empleado seleccionarEmpleado() {
            // Verificar si hay empleados registrados
            if (listaEmpleados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados disponibles.");
                return null;
            }
        
            // Crear un JComboBox con los nombres de los empleados
            String[] opcionesEmpleados = obtenerOpcionesDeEmpleados();
            JComboBox<String> comboBox = new JComboBox<>(opcionesEmpleados);
        
            // Mostrar el JComboBox en un JOptionPane
            int seleccion = JOptionPane.showConfirmDialog(null, comboBox, 
                "Seleccione el empleado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
            // Verificar si el usuario hizo una selección
            if (seleccion != JOptionPane.OK_OPTION) {
                return null;  // El usuario canceló
            }
        
            // Obtener el nombre del empleado seleccionado
            String nombreSeleccionado = (String) comboBox.getSelectedItem();
        
            // Buscar el empleado correspondiente
            for (Empleado e : listaEmpleados) {
                if (e.getNombre().equals(nombreSeleccionado)) {
                    return e;  // Devolver el empleado seleccionado
                }
            }
        
            return null;  // Si no se encuentra el empleado
        }
        

    
        // Método para generar las opciones de empleados
        private static String[] obtenerOpcionesDeEmpleados() {
            // Genera una lista de opciones basada en la lista de empleados
            String[] opciones = new String[listaEmpleados.size()];
            for (int i = 0; i < listaEmpleados.size(); i++) {
                opciones[i] = listaEmpleados.get(i).getNombre(); // Agregamos solo el nombre del empleado
            }
            return opciones;
        }
    
        
        private static void modificarEmpleado() {
            if (listaEmpleados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados registrados para modificar.");
                return;
            }
        
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado que desea modificar:");
        
            // Buscar empleado en la lista por ID
            Empleado empleadoAModificar = null;
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getIdEmpleado().equals(idEmpleado)) {
                    empleadoAModificar = empleado;
                    break;
                }
            }
        
            // Verificar si el empleado fue encontrado
            if (empleadoAModificar == null) {
                JOptionPane.showMessageDialog(null, "No se encontró un empleado con el ID proporcionado.");
                return;
            }
        
            // Crear un panel con BoxLayout para mostrar las opciones en vertical
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Establecer el layout a vertical
        
            // Crear los campos de entrada para modificar los datos del empleado
            JTextField nombreField = new JTextField(empleadoAModificar.getNombre());
            JTextField cedulaField = new JTextField(empleadoAModificar.getCedula());
            JTextField telefonoField = new JTextField(empleadoAModificar.getTelefono());
            JTextField emailField = new JTextField(empleadoAModificar.getEmail());
            JTextField puestoField = new JTextField(empleadoAModificar.getPuesto());
            JTextField usuarioField = new JTextField(empleadoAModificar.getUsuario());
            JTextField contraseñaField = new JTextField(empleadoAModificar.getContraseña());
        
            String estadoEmpleado = empleadoAModificar.isEstadoEmpleado() ? "Activo" : "Inactivo";  // Cambio aquí
            String[] opcionesEstado = {"Activo", "Inactivo"};
            JComboBox<String> estadoCombo = new JComboBox<>(opcionesEstado);
            estadoCombo.setSelectedItem(estadoEmpleado);
        
            JTextField salarioField = new JTextField(String.valueOf(empleadoAModificar.getSalario()));
            JTextField fechaContratacionField = new JTextField(empleadoAModificar.getFechaContratacion().toString());
        
            // Agregar los campos al panel en orden vertical
            panel.add(new JLabel("Modificar Nombre:"));
            panel.add(nombreField);
            panel.add(new JLabel("Modificar Cédula:"));
            panel.add(cedulaField);
            panel.add(new JLabel("Modificar Teléfono:"));
            panel.add(telefonoField);
            panel.add(new JLabel("Modificar Email:"));
            panel.add(emailField);
            panel.add(new JLabel("Modificar Puesto:"));
            panel.add(puestoField);
            panel.add(new JLabel("Modificar Usuario:"));
            panel.add(usuarioField);
            panel.add(new JLabel("Modificar Contraseña:"));
            panel.add(contraseñaField);
            panel.add(new JLabel("Modificar Estado:"));
            panel.add(estadoCombo);
            panel.add(new JLabel("Modificar Salario:"));
            panel.add(salarioField);
            panel.add(new JLabel("Modificar Fecha de Contratación:"));
            panel.add(fechaContratacionField);
        
            // Crear un JScrollPane para hacer scroll si los campos no caben
            JScrollPane scrollPane = new JScrollPane(panel);
            scrollPane.setPreferredSize(new Dimension(300, 400));  // Establecer un tamaño para el JScrollPane
        
            // Mostrar la ventana con los campos
            int option = JOptionPane.showConfirmDialog(null, scrollPane, "Modificar Empleado", JOptionPane.OK_CANCEL_OPTION);
        
            // Si el usuario hizo clic en OK, actualizar los datos del empleado
            if (option == JOptionPane.OK_OPTION) {
                try {
                    // Obtener los nuevos valores y actualizar el empleado
                    if (!nombreField.getText().isEmpty()) {
                        empleadoAModificar.setNombre(nombreField.getText());
                    }
                    if (!cedulaField.getText().isEmpty()) {
                        empleadoAModificar.setCedula(cedulaField.getText());
                    }
                    if (!telefonoField.getText().isEmpty()) {
                        empleadoAModificar.setTelefono(telefonoField.getText());
                    }
                    if (!emailField.getText().isEmpty()) {
                        empleadoAModificar.setEmail(emailField.getText());
                    }
                    if (!puestoField.getText().isEmpty()) {
                        empleadoAModificar.setPuesto(puestoField.getText());
                    }
                    if (!usuarioField.getText().isEmpty()) {
                        empleadoAModificar.setUsuario(usuarioField.getText());
                    }
                    if (!contraseñaField.getText().isEmpty()) {
                        empleadoAModificar.setContraseña(contraseñaField.getText());
                    }
                    if (estadoCombo.getSelectedItem().equals("Activo")) {
                        empleadoAModificar.setEstadoEmpleado(true);
                    } else {
                        empleadoAModificar.setEstadoEmpleado(false);
                    }
                    if (!salarioField.getText().isEmpty()) {
                        empleadoAModificar.setSalario(Double.parseDouble(salarioField.getText()));
                    }
                    if (!fechaContratacionField.getText().isEmpty()) {
                        empleadoAModificar.setFechaContratacion(LocalDate.parse(fechaContratacionField.getText()));
                    }
        
                    JOptionPane.showMessageDialog(null, "Empleado modificado con éxito:\n" + empleadoAModificar);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al modificar el empleado: " + e.getMessage());
                }
            }
        }
        

        
        private static void eliminarEmpleado() {
            if (listaEmpleados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados registrados para eliminar.");
                return;
            }
        
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado que desea eliminar:");
        
            // Buscar empleado en la lista por ID
            Empleado empleadoAEliminar = null;
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getIdEmpleado().equals(idEmpleado)) {
                    empleadoAEliminar = empleado;
                    break;
                }
            }
        
            // Verificar si el empleado fue encontrado
            if (empleadoAEliminar == null) {
                JOptionPane.showMessageDialog(null, "No se encontró un empleado con el ID proporcionado.");
                return;
            }
        
            // Confirmar la eliminación del empleado
            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro que desea eliminar al empleado con ID: " + idEmpleado + "?",
                    "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Eliminar empleado de la lista
                listaEmpleados.remove(empleadoAEliminar);
                JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        }
        
        private static void verDetallesEmpleado() {
            if (listaEmpleados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                return;
            }
        
            // Solicitar el ID del empleado
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado que desea ver:");
        
            // Buscar el empleado en la lista
            Empleado empleadoEncontrado = null;
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getIdEmpleado().equals(idEmpleado)) {
                    empleadoEncontrado = empleado;
                    break;
                }
            }
        
            // Verificar si el empleado fue encontrado
            if (empleadoEncontrado == null) {
                JOptionPane.showMessageDialog(null, "No se encontró un empleado con el ID proporcionado.");
                return;
            }
        
            // Crear un JPanel para mostrar los detalles de forma ordenada
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Layout vertical para los detalles
        
            // Agregar los detalles del empleado en el panel
            panel.add(new JLabel("ID Empleado: " + empleadoEncontrado.getIdEmpleado()));
            panel.add(new JLabel("Nombre: " + empleadoEncontrado.getNombre()));
            panel.add(new JLabel("Cédula: " + empleadoEncontrado.getCedula()));
            panel.add(new JLabel("Teléfono: " + empleadoEncontrado.getTelefono()));
            panel.add(new JLabel("Email: " + empleadoEncontrado.getEmail()));
            panel.add(new JLabel("Puesto: " + empleadoEncontrado.getPuesto()));
            panel.add(new JLabel("Usuario: " + empleadoEncontrado.getUsuario()));
            panel.add(new JLabel("Estado: " + (empleadoEncontrado.isEstadoEmpleado() ? "Activo" : "Inactivo")));
            panel.add(new JLabel("Salario: " + empleadoEncontrado.getSalario()));
            panel.add(new JLabel("Fecha de Contratación: " + empleadoEncontrado.getFechaContratacion()));
        
            // Crear un JScrollPane para permitir desplazarse por el panel si es necesario
            JScrollPane scrollPane = new JScrollPane(panel);
            scrollPane.setPreferredSize(new Dimension(300, 400));  // Establecer el tamaño del JScrollPane
        
            // Mostrar el cuadro de diálogo con los detalles
            JOptionPane.showMessageDialog(null, scrollPane, "Detalles del Empleado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        

        private static void verReportes() {
            if (reportes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se han registrado reportes.");
                return;
            }
        
            // Crear una cadena de texto con los detalles de todos los reportes
            StringBuilder reporteMostrar = new StringBuilder("Reportes registrados:\n");
        
            for (Reporte reporte : reportes) {
                reporteMostrar.append("Fecha de inicio: ").append(reporte.getFechaInicio())
                              .append("\nFecha de fin: ").append(reporte.getFechaFin())
                              .append("\nTransacciones: \n");
        
                // Mostrar las transacciones de cada reporte
                for (Transaccion transaccion : reporte.getTransacciones()) {
                    reporteMostrar.append("\t- ID: ").append(transaccion.getIdTransaccion())
                                  .append(", Fecha: ").append(transaccion.getFecha())
                                  .append(", Monto Total: ").append(transaccion.getMontoTotal())
                                  .append(", Estado: ").append(transaccion.getEstadoTransaccion())
                                  .append("\n");
                }
                reporteMostrar.append("\n---------------------------------\n");
            }
        
            // Mostrar la lista de reportes con sus transacciones
            JOptionPane.showMessageDialog(null, reporteMostrar.toString(), "Mostrar Reportes", JOptionPane.INFORMATION_MESSAGE);
        }
       
        private static void mostrarMenuEmpleado() {
            while (true) {
                String opcionEmpleado = JOptionPane.showInputDialog(
                    null,
                    "Menú Empleado:\n" +
                    "1. Registrar cliente\n" +
                    "2. Ver cliente\n" +
                    "3. Agregar vehículo\n" +
                    "4. Mostrar vehículos\n" +
                    "5. Registrar transacción\n" +
                    "6. Mostrar transacciones\n" +  // Opción para mostrar las transacciones
                    "7. Registrar reporte\n" +    // Opción para registrar un reporte
                    "8. Salir",
                    "Menú Empleado",
                    JOptionPane.INFORMATION_MESSAGE
                );
        
                if (opcionEmpleado == null || opcionEmpleado.equals("8")) {
                    JOptionPane.showMessageDialog(null, "Cerrando sesión...");
                    break;
                } else if (opcionEmpleado.equals("1")) {
                    registrarCliente();
                } else if (opcionEmpleado.equals("2")) {
                    verClientes();
                } else if (opcionEmpleado.equals("3")) {
                    agregarVehiculo();
                } else if (opcionEmpleado.equals("4")) {
                    mostrarVehiculos();
                } else if (opcionEmpleado.equals("5")) {
                    registrarTransaccion();
                } else if (opcionEmpleado.equals("6")) { 
                    mostrarTransacciones();  // Muestra las transacciones
                } else if (opcionEmpleado.equals("7")) { // Opción para registrar un reporte
                    registrarReporte();  // Llamada al método para registrar un reporte
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción del menú.");
                }
            }
        }
        
        //Empleado
        // Método para registrar la transacción
        private static void registrarTransaccion() {
            // Mostrar lista de vehículos disponibles para alquilar, comprar o vender
            Vehiculo vehiculoSeleccionado = seleccionarVehiculo();
        
            if (vehiculoSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un vehículo.");
                return;
            }
        
            // Solicitar el tipo de transacción
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
            
            // Seleccionar al cliente
            Cliente clienteSeleccionado = seleccionarCliente();
            if (clienteSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un cliente.");
                return;
            }
        
            // Seleccionar al empleado
            Empleado empleadoSeleccionado = seleccionarEmpleado();
            if (empleadoSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un empleado.");
                return;
            }
        
            // Resto de la lógica para registrar la transacción
            String idTransaccion = JOptionPane.showInputDialog("Ingrese el ID de la transacción:");
            LocalDate fecha = LocalDate.now();
            double montoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de la transacción:"));
            String estadoTransaccion = JOptionPane.showInputDialog("Ingrese el estado de la transacción (Activo/Finalizado):");
        
            // Lógica para registrar el tipo de transacción
            if (tipoTransaccion.equals("1")) { // Alquiler
                LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):"));
                LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):"));
                double costoDiario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo diario:"));
                double costoTotal = costoDiario * (fechaFin.getDayOfYear() - fechaInicio.getDayOfYear());
                
                Alquiler alquiler = new Alquiler(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado, fecha,
                                                 montoTotal, estadoTransaccion, fechaInicio, fechaFin, costoDiario, costoTotal);
                transacciones.add(alquiler);  // Agregar a la lista de transacciones
                JOptionPane.showMessageDialog(null, "Transacción de alquiler registrada con éxito.");
            } else if (tipoTransaccion.equals("2")) { // Compra
                double precioCompraVehiculo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra:"));
                
                Compra compra = new Compra(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado, fecha,
                                          montoTotal, estadoTransaccion, precioCompraVehiculo);
                transacciones.add(compra);
                JOptionPane.showMessageDialog(null, "Transacción de compra registrada con éxito.");
            } else if (tipoTransaccion.equals("3")) { // Venta
                double montoVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la venta:"));
                
                Venta venta = new Venta(idTransaccion, vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado, fecha,
                                        montoTotal, estadoTransaccion, montoVenta);
                transacciones.add(venta);
                JOptionPane.showMessageDialog(null, "Transacción de venta registrada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
        private static void mostrarTransacciones() {
            if (transacciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay transacciones registradas.");
                return;
            }
        
            StringBuilder sb = new StringBuilder();
            sb.append("Lista de Transacciones Registradas:\n\n");
        
            // Recorre la lista de transacciones y agrega cada una al StringBuilder
            for (Transaccion t : transacciones) {
                sb.append("ID: ").append(t.getIdTransaccion()).append("\n");
                sb.append("Vehículo: ").append(t.getVehiculo().getMarca()).append("\n");
                sb.append("Cliente: ").append(t.getCliente().getNombre()).append("\n");
                sb.append("Empleado: ").append(t.getEmpleado().getNombre()).append("\n");
                sb.append("Fecha: ").append(t.getFecha()).append("\n");
                sb.append("Monto Total: ").append(t.getMontoTotal()).append("\n");
                sb.append("Estado: ").append(t.getEstadoTransaccion()).append("\n");
                sb.append("\n-----------------------------\n");
            }
        
            // Mostrar el listado de transacciones en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, sb.toString());
        }

        private static void registrarReporte() {
            try {
                // Solicitar la fecha de inicio y fin para el reporte
                LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):"));
                LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):"));
        
                // Validar si la fecha fin es posterior a la fecha inicio
                if (fechaFin.isBefore(fechaInicio)) {
                    JOptionPane.showMessageDialog(null, "La fecha de fin debe ser posterior a la fecha de inicio.");
                    return;
                }
        
                // Filtrar las transacciones en el rango de fechas
                LinkedList<Transaccion> transaccionesFiltradas = new LinkedList<>();
                for (Transaccion transaccion : transacciones) {
                    if ((transaccion.getFecha().isEqual(fechaInicio) || transaccion.getFecha().isAfter(fechaInicio)) &&
                        (transaccion.getFecha().isEqual(fechaFin) || transaccion.getFecha().isBefore(fechaFin))) {
                        transaccionesFiltradas.add(transaccion);
                    }
                }
        
                if (transaccionesFiltradas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones en este rango de fechas.");
                    return;
                }
        
                // Construir un menú de selección con las transacciones filtradas
                StringBuilder opcionesTransacciones = new StringBuilder("Seleccione una transacción para agregar al reporte:\n");
                for (int i = 0; i < transaccionesFiltradas.size(); i++) {
                    Transaccion transaccion = transaccionesFiltradas.get(i);
                    opcionesTransacciones.append(i + 1).append(". ID: ").append(transaccion.getIdTransaccion())
                        .append(", Fecha: ").append(transaccion.getFecha())
                        .append(", Monto Total: ").append(transaccion.getMontoTotal())
                        .append(", Estado: ").append(transaccion.getEstadoTransaccion())
                        .append("\n");
                }
        
                String opcionSeleccionada = JOptionPane.showInputDialog(opcionesTransacciones.toString());
        
                // Validar la selección
                int indiceSeleccionado;
                try {
                    indiceSeleccionado = Integer.parseInt(opcionSeleccionada) - 1;
                    if (indiceSeleccionado < 0 || indiceSeleccionado >= transaccionesFiltradas.size()) {
                        throw new IndexOutOfBoundsException();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Selección inválida. Intente nuevamente.");
                    return;
                }
        
                // Obtener la transacción seleccionada
                Transaccion transaccionSeleccionada = transaccionesFiltradas.get(indiceSeleccionado);
        
                // Crear el reporte con la transacción seleccionada
                Reporte reporte = new Reporte(fechaInicio, fechaFin);
                reporte.getTransacciones().add(transaccionSeleccionada);
        
                // Agregar el reporte a la lista de reportes
                reportes.add(reporte);
        
                // Mostrar confirmación
                JOptionPane.showMessageDialog(null, "Reporte creado con éxito:\n" + reporte.toString(),
                        "Reporte de Transacciones", JOptionPane.INFORMATION_MESSAGE);
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar el reporte: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        private static Vehiculo seleccionarVehiculo() {
    // Verificar si la lista de vehículos está vacía
    if (vehiculos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay vehículos disponibles.");
        return null;
    }

    // Crear un JComboBox con las marcas y tipos de los vehículos
    String[] opcionesVehiculos = obtenerOpcionesDeVehiculos();
    JComboBox<String> comboBox = new JComboBox<>(opcionesVehiculos);

    // Mostrar el JComboBox en un JOptionPane
    int seleccion = JOptionPane.showConfirmDialog(null, comboBox, 
        "Seleccione el vehículo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    // Verificar si el usuario hizo una selección
    if (seleccion != JOptionPane.OK_OPTION) {
        return null;  // El usuario canceló
    }

    // Obtener la opción seleccionada
    String seleccionada = (String) comboBox.getSelectedItem();

    // Mostrar la opción seleccionada para depuración
    System.out.println("Vehículo seleccionado: " + seleccionada);

    // Buscar el vehículo correspondiente
    for (Vehiculo vehiculo : vehiculos) {
        String descripcionVehiculo = vehiculo.getMarca() + " - " + vehiculo.getClass().getSimpleName();
        if (descripcionVehiculo.equals(seleccionada)) {
            return vehiculo;  // Devolver el vehículo seleccionado
        }
    }

    return null;  // Si no se encuentra el vehículo
}

private static String[] obtenerOpcionesDeVehiculos() {
    // Genera una lista de opciones basada en la lista de vehículos disponibles
    String[] opciones = new String[vehiculos.size()];
    for (int i = 0; i < vehiculos.size(); i++) {
        // Concatenar la marca y el tipo de vehículo (Clase del objeto)
        String tipoVehiculo = vehiculos.get(i).getClass().getSimpleName(); // Esto obtiene el tipo de vehículo (Clase)
        opciones[i] = vehiculos.get(i).getMarca() + " - " + tipoVehiculo;
    }
    return opciones;
}


private static Cliente seleccionarCliente() {
    // Verificar si hay clientes registrados
    if (clientes.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay clientes disponibles.");
        return null;
    }

    // Crear un JComboBox con los nombres de los clientes
    String[] opcionesClientes = obtenerOpcionesDeClientes();
    JComboBox<String> comboBox = new JComboBox<>(opcionesClientes);

    // Mostrar el JComboBox en un JOptionPane
    int seleccion = JOptionPane.showConfirmDialog(null, comboBox, 
        "Seleccione el cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    // Verificar si el usuario hizo una selección
    if (seleccion != JOptionPane.OK_OPTION) {
        return null;  // El usuario canceló
    }

    // Obtener el nombre del cliente seleccionado
    String nombreSeleccionado = (String) comboBox.getSelectedItem();

    // Buscar el cliente correspondiente
    for (Cliente c : clientes) {
        if (c.getNombre().equals(nombreSeleccionado)) {
            return c;  // Devolver el cliente seleccionado
        }
    }

    return null;  // Si no se encuentra el cliente
}

private static String[] obtenerOpcionesDeClientes() {
    // Genera una lista de opciones basada en la lista de clientes disponibles
    String[] opciones = new String[clientes.size()];
    for (int i = 0; i < clientes.size(); i++) {
        // Agregar solo el nombre del cliente a las opciones
        opciones[i] = clientes.get(i).getNombre(); // O cualquier atributo que desees mostrar
    }
    return opciones;
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

    // Crear el objeto Cliente
    Cliente nuevoCliente = new Cliente(
        nombre,
        codigo,
        telefono,
        correo,
        usuario,
        password,
        true, // El cliente está activo por defecto
        LocalDate.now() // Fecha actual
    );

    // Añadir el cliente a la lista
    clientes.add(nuevoCliente);

    // Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito:\n" + nuevoCliente.toString());
}

// Método para ver los clientes registrados
private static void verClientes() {
    if (clientes.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
    } else {
        StringBuilder sb = new StringBuilder("Clientes registrados:\n");
        for (Cliente c : clientes) {
            sb.append(c.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Información de Clientes", JOptionPane.INFORMATION_MESSAGE);
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
                "Sedan Electrico", "Camioneta Electrica", "Deportivo Electrico", 
                "Van Hibrida", "Bus Hibrido", "Pick Up Hibrido", 
                "Camion Hibrido", "Moto"
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
                enchufable = JOptionPane.showConfirmDialog(null, "¿Es un vehículo híbrido enchufable?") == JOptionPane.YES_OPTION;
            
                if (!enchufable) {
                    hibridoLigero = JOptionPane.showConfirmDialog(null, "¿Es un vehículo híbrido ligero?") == JOptionPane.YES_OPTION;
                }
            
                // Validar que al menos uno de los dos valores sea verdadero
                if (!enchufable && !hibridoLigero) {
                    JOptionPane.showMessageDialog(null, "Debe especificar si el vehículo es enchufable o ligero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

    
            // Ingresar detalles específicos según el tipo de vehículo seleccionado
            if (tipoVehiculo.equals("Sedan Electrico")) {
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
                JOptionPane.showMessageDialog(null, "¡Vehículo Sedan Electrico agregado exitosamente!");
            } 
            if (tipoVehiculo.equals("Camioneta Electrica")) {
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
                JOptionPane.showMessageDialog(null, "¡Camioneta Electrica agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Deportivo Electrico")) {
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
                JOptionPane.showMessageDialog(null, "¡Deportivo Electrico agregado exitosamente!");
            }
            if (tipoVehiculo.equals("Van Hibrida")) {
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
                JOptionPane.showMessageDialog(null, "¡Van Hibrida agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Bus Hibrido")) {
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
                JOptionPane.showMessageDialog(null, "¡Bus Hibrido agregado exitosamente!");
            }
            
            if (tipoVehiculo.equals("PickUp Hibrido")) {
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
                JOptionPane.showMessageDialog(null, "¡PickUp Hibrido agregada exitosamente!");
            }
            if (tipoVehiculo.equals("Camion Hibrido")) {
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
                JOptionPane.showMessageDialog(null, "¡Camión Hibrido agregado exitosamente!");
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
    private static void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    
        StringBuilder detallesVehiculos = new StringBuilder("Lista de Vehículos:\n\n");
    
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            detallesVehiculos.append("Vehículo ").append(i + 1).append(":\n");
            detallesVehiculos.append(vehiculo).append("\n\n"); // Usar el método toString de cada clase
        }
    
        JOptionPane.showMessageDialog(null, detallesVehiculos.toString(), "Vehículos Registrados", JOptionPane.INFORMATION_MESSAGE);
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

        // Verifica si la opción es nula o "2" para salir
        if (opcionCliente == null || opcionCliente.equals("2")) {
            JOptionPane.showMessageDialog(null, "Cerrando sesión...");
            break; // Sale del ciclo
        } else if (opcionCliente.equals("1")) {
            JOptionPane.showMessageDialog(null, cliente.toString()); // Muestra la información del cliente
        }
    }
}

}
