package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.LinkedList;
public class Cliente extends Persona{
    private String idCliente;
    private String tipoCliente;
    private boolean estadoCuenta;
    private LocalDate fechaRegistro;
    private LinkedList<Transaccion> transacciones;
    public Cliente(String nombre, String cedula, String telefono, String email, String idCliente, String tipoCliente,
            boolean estadoCuenta, LocalDate fechaRegistro) {
        super(nombre, cedula, telefono, email);
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.estadoCuenta = estadoCuenta;
        this.fechaRegistro = fechaRegistro;
        this.transacciones=new LinkedList<>();
    }
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }
    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public void agregarTransaccion (Transaccion transaccion){
        transacciones.add(transaccion);
    }
    public void actualizarDatos() {
        try {
            String nuevoNombre = JOptionPane.showInputDialog(null,
                    "Ingrese el nuevo nombre (actual: " + getNombre() + "):", "Actualizar Nombre", JOptionPane.QUESTION_MESSAGE);
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                setNombre(nuevoNombre.trim());
            }

            String nuevoTelefono = JOptionPane.showInputDialog(null,
                    "Ingrese el nuevo teléfono (actual: " + getTelefono() + "):", "Actualizar Teléfono", JOptionPane.QUESTION_MESSAGE);
            if (nuevoTelefono != null && !nuevoTelefono.trim().isEmpty()) {
                setTelefono(nuevoTelefono.trim());
            }

            String nuevoCorreo = JOptionPane.showInputDialog(null,
                    "Ingrese el nuevo correo (actual: " + getEmail() + "):", "Actualizar Correo", JOptionPane.QUESTION_MESSAGE);
            if (nuevoCorreo != null && !nuevoCorreo.trim().isEmpty()) {
                setEmail(nuevoCorreo.trim());
            }

            JOptionPane.showMessageDialog(null, "Datos actualizados con éxito.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
}
