package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import java.io.IOException;
import javafx.application.Platform;

public class PrimaryController {

    @FXML
    private Button gestionarReservasButton;

    @FXML
    private void onOpenCrudReserva() {
        // Mostrar mensaje de confirmación
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Gestión de Reservas");
        alert.setHeaderText(null);
        alert.setContentText("¿Deseas abrir la gestión de reservas?");
        
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Abrir la ventana de gestión de reservas si el usuario confirma
                try {
                    // Cargar el archivo FXML para la ventana crudReserva
                    Parent root = FXMLLoader.load(getClass().getResource("/co/edu/uniquindio/poo/crudReserva.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = new Stage(); // Crear una nueva ventana (Stage)
                    stage.setTitle("Gestión de Reservas");
                    stage.setScene(scene);

                    // Mostrar la ventana primero para obtener el tamaño real
                    stage.show();

                    // Cerrar la ventana de bienvenida
                    Stage ventanaActual = (Stage) gestionarReservasButton.getScene().getWindow();
                    ventanaActual.close();

                    // Asegurarse de que el código se ejecute después de que la ventana esté completamente renderizada
                    Platform.runLater(() -> {
                        // Obtener el tamaño de la pantalla
                        double screenWidth = javafx.stage.Screen.getPrimary().getVisualBounds().getWidth();
                        double screenHeight = javafx.stage.Screen.getPrimary().getVisualBounds().getHeight();

                        // Obtener el tamaño de la ventana después de que se haya mostrado
                        double windowWidth = stage.getWidth();
                        double windowHeight = stage.getHeight();

                        // Calcular la posición para centrar la ventana
                        stage.setX((screenWidth - windowWidth) / 2);
                        stage.setY((screenHeight - windowHeight) / 2);
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
