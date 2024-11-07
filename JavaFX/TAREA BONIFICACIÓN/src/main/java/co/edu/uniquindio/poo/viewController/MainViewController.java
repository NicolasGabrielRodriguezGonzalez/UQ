package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Reserva;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    // Lista de reservas y reserva seleccionada
    private ObservableList<Reserva> reservasList = FXCollections.observableArrayList();
    private Reserva reservaSeleccionada;

    @FXML
    public void initialize() {
        // Configuración de columnas de la tabla
        colFechaInicio.setCellValueFactory(new PropertyValueFactory<>("fechaInicio"));
        colFechaFin.setCellValueFactory(new PropertyValueFactory<>("fechaFin"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        colVehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));
        colCosto.setCellValueFactory(new PropertyValueFactory<>("costo"));

        // Asignar lista predeterminada de clientes y vehículos
        clienteChoiceBox.setItems(FXCollections.observableArrayList("Nicolas", "Juan Jose", "Santiago"));
        vehiculoChoiceBox.setItems(FXCollections.observableArrayList("Bugatti Bolide", "Yamaha YZF-R1", "F-150 Raptor"));

        // Asignar la lista de reservas a la tabla
        reservasTable.setItems(reservasList);

        // Agregar listener para seleccionar una reserva en la tabla
        reservasTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                mostrarReservaSeleccionada(newSelection);
            } else {
                limpiarFormulario();  // Limpiar formulario si no hay selección
            }
        });
    }

    @FXML
    private void calcularCosto() {
        LocalDate fechaInicio = fechaInicioPicker.getValue();
        LocalDate fechaFin = fechaFinPicker.getValue();
        String cliente = clienteChoiceBox.getValue();
        String vehiculo = vehiculoChoiceBox.getValue();

        // Verificación de campos vacíos
        if (fechaInicio == null || fechaFin == null || cliente == null || vehiculo == null) {
            mostrarAlerta("Por favor, complete todos los campos antes de calcular el costo.");
            return;
        }

        // Verificación de fechas correctas
        if (fechaFin.isBefore(fechaInicio)) {
            mostrarAlerta("La fecha de fin no puede ser anterior a la fecha de inicio.");
            return;
        }

        // Calcular el costo de la reserva
        double costo = calcularCostoReserva(vehiculo, fechaInicio, fechaFin);
        costoTextField.setText(String.format("%.2f", costo));
    }

    private double calcularCostoReserva(String vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double tarifaBase = 50.0; // Tarifa base por día
        double costo = tarifaBase * dias;

        if (vehiculo.contains("Moto")) {
            costo += 20; // Tarifa adicional para motos
        } else if (vehiculo.contains("Camioneta")) {
            costo += 0.1 * costo; // Aumento por carga para camionetas
        }

        return costo;
    }

    @FXML
    private void guardarReserva() {
        LocalDate fechaInicio = fechaInicioPicker.getValue();
        LocalDate fechaFin = fechaFinPicker.getValue();
        String cliente = clienteChoiceBox.getValue();
        String vehiculo = vehiculoChoiceBox.getValue();

        // Verificación de campos vacíos
        if (fechaInicio == null || fechaFin == null || cliente == null || vehiculo == null) {
            mostrarAlerta("Por favor, complete todos los campos antes de guardar la reserva.");
            return;
        }

        // Obtener costo del campo de texto
        String costoStr = costoTextField.getText();
        double costo;

        // Verificar si el costo se ha calculado correctamente
        try {
            costo = Double.parseDouble(costoStr.replace(",", "."));
        } catch (NumberFormatException e) {
            mostrarAlerta("El costo no es válido. Asegúrese de que se haya calculado correctamente.");
            return;
        }

        // Crear la nueva reserva y agregarla a la lista
        Reserva nuevaReserva = new Reserva(fechaInicio, fechaFin, cliente, vehiculo, costo);
        reservasList.add(nuevaReserva);
        mostrarAlerta("Reserva guardada exitosamente.");
    }

    @FXML
    private void actualizarReserva() {
        if (reservaSeleccionada != null) {
            // Actualizar los valores de la reserva seleccionada con los datos del formulario
            reservaSeleccionada.setFechaInicio(fechaInicioPicker.getValue());
            reservaSeleccionada.setFechaFin(fechaFinPicker.getValue());
            reservaSeleccionada.setCliente(clienteChoiceBox.getValue());
            reservaSeleccionada.setVehiculo(vehiculoChoiceBox.getValue());

            // Verificar y actualizar el costo
            String costoStr = costoTextField.getText();
            try {
                reservaSeleccionada.setCosto(Double.parseDouble(costoStr.replace(",", ".")));
            } catch (NumberFormatException e) {
                mostrarAlerta("El costo no es válido. Asegúrese de que se haya calculado correctamente.");
                return;
            }

            // Refrescar la tabla para mostrar los cambios
            reservasTable.refresh();
            mostrarAlerta("Reserva actualizada exitosamente.");
        } else {
            mostrarAlerta("Seleccione una reserva para actualizar.");
        }
    }

    @FXML
    private void eliminarReserva() {
        Reserva reservaSeleccionada = reservasTable.getSelectionModel().getSelectedItem();
        if (reservaSeleccionada != null) {
            reservasList.remove(reservaSeleccionada);
            reservasTable.getSelectionModel().clearSelection(); // Limpiar selección actual

            if (reservasList.isEmpty()) {
                limpiarFormulario();  // Limpiar formulario si no quedan reservas
            } else {
                // Seleccionar la primera reserva en la lista después de la eliminación
                seleccionarPrimeraReservaSiExiste();
            }
        } else {
            mostrarAlerta("Seleccione una reserva para eliminar.");
        }
    }

    @FXML
    private void limpiarFormulario() {
        fechaInicioPicker.setValue(null);
        fechaFinPicker.setValue(null);
        clienteChoiceBox.setValue(null);
        vehiculoChoiceBox.setValue(null);
        costoTextField.clear();
        reservaSeleccionada = null;

        // Limpiar selección en la tabla
        reservasTable.getSelectionModel().clearSelection();
    }

    private void seleccionarPrimeraReservaSiExiste() {
        if (!reservasList.isEmpty()) {
            reservasTable.getSelectionModel().select(0);
        }
    }

    private void mostrarReservaSeleccionada(Reserva reserva) {
        reservaSeleccionada = reserva;
        fechaInicioPicker.setValue(reserva.getFechaInicio());
        fechaFinPicker.setValue(reserva.getFechaFin());
        clienteChoiceBox.setValue(reserva.getCliente());
        vehiculoChoiceBox.setValue(reserva.getVehiculo());
        costoTextField.setText(String.format("%.2f", reserva.getCosto()));
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Advertencia");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
