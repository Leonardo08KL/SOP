package com.example.proysistemasoperativos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CubreBocaController implements Initializable {
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNoControl;

    @FXML
    private ComboBox comboCubre;

    public static String opcionSeleccion = "";

    public static int filaVacia = 0;
    public static int filaVacia2 = 0;
    public static int lugarOcupado1 = 0;
    public static int lugarOcupado2 = 0;


    public static String lugares1[] = new String[3];
    public static String lugares2[] = new String[3];


    @FXML
    void Insertar(ActionEvent event) throws IOException{
        System.out.println(txtNombre.getText() + " "+ txtNoControl.getText() + comboCubre.getSelectionModel().getSelectedItem().toString());

        opcionSeleccion=comboCubre.getSelectionModel().getSelectedItem().toString();

        if (opcionSeleccion == "Si tiene"){
            filaVacia = filaVacia + 1;
            lugarOcupado1 = lugarOcupado1 + 1;
        }
        if (opcionSeleccion == "No tiene"){
            filaVacia2 = filaVacia2 + 1;
            lugarOcupado2 = lugarOcupado2 + 1;
        }

        Parent Root = FXMLLoader.load(getClass().getResource("/com/example/proysistemasoperativos/PrioridadAnimation.fxml"));
        Stage Stage = new Stage();
        Stage.setTitle("Another Window Triggered by Clicking");
        Stage.setScene(new Scene(Root, 800, 600));
        Stage.show();
    }

    @FXML
    private void regresar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Inicio-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML
    void seleccion(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listaCombo = FXCollections.observableArrayList("Si tiene", "No tiene");
        comboCubre.setItems(listaCombo);
    }
}
