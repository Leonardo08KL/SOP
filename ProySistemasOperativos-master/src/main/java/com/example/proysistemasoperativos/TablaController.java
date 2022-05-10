package com.example.proysistemasoperativos;

import javafx.animation.PathTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TablaController implements Initializable {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNoControl;

    @FXML
    private ComboBox comboCubre;

    public static String opcionSeleccion = "";

    public static int filaVacia = 0;
    //int filaVacia = 0;
    int filaVacia2 = 0;
    public static int sacarUs = 0;
    public static int lugarOcupado = 0;
    public static String lugares[] = new String[11];

    @FXML
    private Circle UsuarioConCubrebocas, UsuarioSinCubrebocas, UCON7,UCON6, UCON5,UCON4, UCON3, UCON2, UCON1, USIN7,USIN6,USIN5,USIN4, USIN3, USIN2, USIN1;

    @FXML
    private void Insertar(ActionEvent event) throws IOException {
        System.out.println(txtNombre.getText() + " " + txtNoControl.getText() + comboCubre.getSelectionModel().getSelectedItem().toString());


        opcionSeleccion = comboCubre.getSelectionModel().getSelectedItem().toString();

        /**filaVacia = filaVacia + 1;
        lugarOcupado = lugarOcupado + 1;

        Parent Root = FXMLLoader.load(getClass().getResource("/com/example/proysistemasoperativos/FIFOAnimation.fxml"));
        Stage Stage = new Stage();
        Stage.setTitle("Another Window Triggered by Clicking");
        Stage.setScene(new Scene(Root, 800, 600));
        Stage.show();**/

        if (opcionSeleccion == "Si tiene") {
            UsuarioConCubrebocas.setFill(Color.BLUE);
            filaVacia = filaVacia + 1;
            if (filaVacia == 1) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 60), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();

            }
            if (filaVacia == 2) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 125), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON1.setFill(Color.BLUE);
            }
            if (filaVacia == 3) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 185), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON2.setFill(Color.BLUE);
            }
            if (filaVacia == 4) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 250), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON3.setFill(Color.BLUE);
            }
            if (filaVacia == 5) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 310), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON4.setFill(Color.BLUE);
            }
            if (filaVacia == 6) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 375), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON5.setFill(Color.BLUE);
            }
            if (filaVacia == 7) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 435), UsuarioConCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                UCON6.setFill(Color.BLUE);
            }

        }
        if (opcionSeleccion == "No tiene") {
            UsuarioSinCubrebocas.setFill(Color.RED);
            filaVacia2 = filaVacia2 + 1;
            if (filaVacia2 == 1) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 60), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
            }
            if (filaVacia2 == 2) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 125), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN1.setFill(Color.RED);
            }
            if (filaVacia2 == 3) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 185), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN2.setFill(Color.RED);
            }
            if (filaVacia2 == 4) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 250), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN3.setFill(Color.RED);
            }
            if (filaVacia2 == 5) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 310), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN4.setFill(Color.RED);
            }
            if (filaVacia2 == 6) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 375), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN5.setFill(Color.RED);
            }
            if (filaVacia2 == 7) {
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 0, 435), UsuarioSinCubrebocas);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                USIN6.setFill(Color.RED);
            }
        }

    }

    @FXML
    private void limpiar() {
        txtNombre.setText(" ");
        txtNoControl.setText(" ");
        comboCubre.promptTextProperty();
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
    public void Salir(ActionEvent event) throws IOException {
        sacarUs = sacarUs + 1;

        Parent Root = FXMLLoader.load(getClass().getResource("/com/example/proysistemasoperativos/FIFOAnimation.fxml"));
        Stage Stage = new Stage();
        Stage.setTitle("Another Window Triggered by Clicking");
        Stage.setScene(new Scene(Root, 800, 600));
        Stage.show();
    }

    @FXML
    void seleccion(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listaCombo = FXCollections.observableArrayList("Si tiene", "No tiene");
        comboCubre.setItems(listaCombo);

        UCON1.setFill(Color.TRANSPARENT);
        UCON2.setFill(Color.TRANSPARENT);
        UCON3.setFill(Color.TRANSPARENT);
        UCON4.setFill(Color.TRANSPARENT);
        UCON5.setFill(Color.TRANSPARENT);
        UCON6.setFill(Color.TRANSPARENT);
        UCON7.setFill(Color.TRANSPARENT);
        USIN1.setFill(Color.TRANSPARENT);
        USIN2.setFill(Color.TRANSPARENT);
        USIN3.setFill(Color.TRANSPARENT);
        USIN4.setFill(Color.TRANSPARENT);
        USIN5.setFill(Color.TRANSPARENT);
        USIN6.setFill(Color.TRANSPARENT);
        USIN7.setFill(Color.TRANSPARENT);
    }

}