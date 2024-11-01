// MainViewController.java
package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Reserva; // Asegúrate de que esta línea esté presente
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.time.LocalDate;

public class MainViewController {
    // Campos de la interfaz
    @FXML private DatePicker fechaInicioPicker;
    @FXML private DatePicker fechaFinPicker;
    @FXML private ChoiceBox<String> clienteChoiceBox;
    @FXML private ChoiceBox<String> vehiculoChoiceBox;
    @FXML private TextField costoTextField;
    @FXML private TableView<Reserva> reservasTable;
    @FXML private TableColumn<Reserva, LocalDate> colFechaInicio;
    @FXML private TableColumn<Reserva, LocalDate> colFechaFin;
    @FXML private TableColumn<Reserva, String> colCliente;
    @FXML private TableColumn<Reserva, String> colVehiculo;
    @FXML private TableColumn<Reserva, Double> colCosto;

    private ObservableList<Reserva> reservasList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configuración de columnas de la tabla
        colFechaInicio.setCellValueFactory(new PropertyValueFactory<>("fechaInicio"));
        colFechaFin.setCellValueFactory(new PropertyValueFactory<>("fechaFin"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        colVehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));
        colCosto.setCellValueFactory(new PropertyValueFactory<>("costo"));

        // Asignar lista predeterminada de clientes y vehículos
        clienteChoiceBox.setItems(FXCollections.observableArrayList("Cliente 1", "Cliente 2", "Cliente 3"));
        vehiculoChoiceBox.setItems(FXCollections.observableArrayList("Auto 1", "Moto 1", "Camioneta 1"));

        // Asignar la lista de reservas a la tabla
        reservasTable.setItems(reservasList);
    }

    @FXML
    private void calcularCosto() {
        // Obtener valores de fechas y elección de cliente y vehículo
        LocalDate fechaInicio = fechaInicioPicker.getValue();
        LocalDate fechaFin = fechaFinPicker.getValue();
        String cliente = clienteChoiceBox.getValue();
        String vehiculo = vehiculoChoiceBox.getValue();

        if (fechaInicio == null || fechaFin == null || cliente == null || vehiculo == null) {
            mostrarAlerta("Por favor, complete todos los campos antes de calcular el costo.");
            return;
        }

        // Realizar cálculo de costo
        double costo = calcularCostoReserva(vehiculo, fechaInicio, fechaFin);

        // Mostrar costo en el campo correspondiente
        costoTextField.setText(String.format("%.2f", costo));

        // Cambiar a la siguiente ventana de confirmación
        abrirVentanaConfirmacion(fechaInicio, fechaFin, cliente, vehiculo, costo);
    }

    private double calcularCostoReserva(String vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        // Lógica de cálculo de costo según tipo de vehículo (simplificada para ejemplo)
        long dias = java.time.temporal.ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double tarifaBase = 50.0;
        double costo = tarifaBase * dias;

        if (vehiculo.contains("Moto")) {
            costo += 20; // Ejemplo de tarifa adicional
        } else if (vehiculo.contains("Camioneta")) {
            costo += 0.1 * costo; // Ejemplo de aumento por carga
        }

        return costo;
    }

    private void abrirVentanaConfirmacion(LocalDate fechaInicio, LocalDate fechaFin, String cliente, String vehiculo, double costo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("crudReserva.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));

            ConfirmacionViewController controller = loader.getController();
            controller.setDatosReserva(fechaInicio, fechaFin, cliente, vehiculo, costo);

            stage.showAndWait();

            if (controller.isReservaGenerada()) {
                // Agregar reserva a la lista si se generó
                reservasList.add(new Reserva(fechaInicio, fechaFin, cliente, vehiculo, costo));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Advertencia");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
