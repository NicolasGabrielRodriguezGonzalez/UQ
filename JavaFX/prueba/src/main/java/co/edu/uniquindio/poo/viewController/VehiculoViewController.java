package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class VehiculoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtAnioFabricacion;

    @FXML
    private ComboBox<String> comboTipoVehiculo;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnCancelar;

    @FXML
    void onGuardarVehiculo() {
        // Lógica para guardar el vehículo
        String placa = txtPlaca.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String anioFabricacion = txtAnioFabricacion.getText();
        String tipoVehiculo = comboTipoVehiculo.getSelectionModel().getSelectedItem();

        // Aquí añadirías la lógica para validar y guardar los datos
        System.out.println("Guardando vehículo: " + placa + ", " + marca + ", " + modelo + ", " + anioFabricacion + ", " + tipoVehiculo);
    }

    @FXML
    void onCancelar() {
        // Lógica para limpiar o cancelar el formulario
        txtPlaca.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtAnioFabricacion.clear();
        comboTipoVehiculo.getSelectionModel().clearSelection();
        System.out.println("Operación cancelada, campos limpios.");
    }

    @FXML
    void initialize() {
        // Inicialización adicional, si es necesario
        comboTipoVehiculo.getItems().addAll("Auto", "Camioneta", "Moto");
    }
}
    