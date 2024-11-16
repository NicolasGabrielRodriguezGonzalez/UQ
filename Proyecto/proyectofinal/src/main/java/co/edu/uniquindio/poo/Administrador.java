package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;
public class Administrador extends Persona {
    private String idAdministrador;
    private String usuario;
    private String contraseña;
    private boolean estadoAdministrador;
    private LocalDate fechaContratacion;
    private double salario;
    private String preguntaSeguridad;
    private String respuestaSeguridad;
    private LinkedList<Empleado> empleados;
    private LinkedList<Reporte> reportes;
    public Administrador(String nombre, String cedula, String telefono, String email, String idAdministrador,
            String usuario, String contraseña, boolean estadoAdministrador, LocalDate fechaContratacion, double salario,
            String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, cedula, telefono, email);
        this.idAdministrador = idAdministrador;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estadoAdministrador = estadoAdministrador;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.empleados = new LinkedList<>();
    }
    public String getIdAdministrador() {
        return idAdministrador;
    }
    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public boolean isEstadoAdministrador() {
        return estadoAdministrador;
    }
    public void setEstadoAdministrador(boolean estadoAdministrador) {
        this.estadoAdministrador = estadoAdministrador;
    }
    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    public Empleado buscarEmpleadoPorCedula(String cedula) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado; // Si encontramos el empleado, lo devolvemos
            }
        }
        return null; // Si no encontramos el empleado, devolvemos null
    }

    public void gestionarEmpleado(String accion, Empleado empleado, String cedula) {
        switch (accion.toLowerCase()) {
            case "agregar":
                empleados.add(empleado);
                System.out.println("Empleado agregado con éxito.");
                break;
    
            case "eliminar":
                Empleado empleadoAEliminar = buscarEmpleadoPorCedula(cedula);
                if (empleadoAEliminar != null) {
                    empleados.remove(empleadoAEliminar);
                    System.out.println("Empleado eliminado con éxito.");
                } else {
                    System.out.println("No se encontró un empleado con la cédula indicada.");
                }
                break;
    
            case "actualizar":
                Empleado empleadoAActualizar = buscarEmpleadoPorCedula(cedula);
                if (empleadoAActualizar != null) {
                    // Aquí actualizas los datos del empleado encontrado
                    empleadoAActualizar.setNombre(empleado.getNombre());
                    empleadoAActualizar.setTelefono(empleado.getTelefono());
                    empleadoAActualizar.setEmail(empleado.getEmail());
                    System.out.println("Empleado actualizado con éxito.");
                } else {
                    System.out.println("No se encontró un empleado con la cédula indicada.");
                }
                break;
    
            default:
                System.out.println("Acción no válida. Usa agregar, eliminar o actualizar.");
        }
    }
    public void verReportes() {
        if (reportes.isEmpty()) {
            System.out.println("No hay reportes disponibles.");
        } else {
            System.out.println("Listado de Reportes:");
            for (Reporte reporte : reportes) {
                System.out.println(reporte.toString()); // Suponiendo que Reporte tiene un buen toString() para mostrar sus detalles
            }
        }
    }
    public boolean autenticar(String usuarioIngresado, String contraseñaIngresada) {
        // Verifica si el nombre de usuario y la contraseña coinciden con las credenciales almacenadas
        return usuarioIngresado.equals(this.usuario) && contraseñaIngresada.equals(this.contraseña);
    }
    public boolean validarRespuestaSeguridad(String respuestaIngresada) {
        // Compara la respuesta ingresada con la respuesta de seguridad almacenada
        if (respuestaIngresada.equals(this.respuestaSeguridad)) {
            // Si la respuesta es correcta, el administrador puede recuperar la contraseña
            System.out.println("Respuesta correcta. Procediendo con la recuperación de la contraseña.");
            // Aquí puedes agregar lógica adicional si deseas mostrar la contraseña o permitir el cambio de la misma
            System.out.println("La contraseña es: " + this.contraseña);
            return true;
        } else {
            // Si la respuesta es incorrecta, muestra un mensaje de error
            System.out.println("Respuesta incorrecta. No se puede recuperar la contraseña.");
            return false;
        }
    }

    
    
}
