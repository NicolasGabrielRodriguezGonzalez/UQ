package co.edu.uniquindio.poo.viewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.time.LocalDate;
public class ConfirmacionViewController {

    @FXML
    private Button generarReservaButton;

    private boolean reservaGenerada = false;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String cliente;
    private String vehiculo;
    private double costo;

    public void setDatosReserva(LocalDate fechaInicio, LocalDate fechaFin, String cliente, String vehiculo, double costo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.costo = costo;
    }

    @FXML
    private void generarReserva() {
        // Aquí podríamos agregar la lógica para registrar la reserva en una base de datos o lista

        reservaGenerada = true;
        generarReservaButton.getScene().getWindow().hide(); // Cerrar ventana
    }

    public boolean isReservaGenerada() {
        return reservaGenerada;
    }
}
