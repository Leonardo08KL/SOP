package com.example.proysistemasoperativos.Animation;

import com.example.proysistemasoperativos.HelloApplication;
import com.example.proysistemasoperativos.TablaController;
import javafx.animation.PathTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FIFOAnimationController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private GridPane EntradaSalida;
    @FXML
    private Circle Usuario, UsuarioFila2, UsuarioFila3, U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12;
    @FXML
    private TextField txtNombre, txtNoCtrl;
    @FXML
    private ComboBox<String> ConSin;
    @FXML
    private Button btnEntrada, btnSalida;
    String rOa;
    String opcionAnterior;

    @FXML
    public void Entrada(ActionEvent event) throws IOException {
        TablaController opcion = new TablaController();
        rOa = opcion.opcionSeleccion;
        opcionAnterior = opcion.opcionSeleccion;

        opcion.lugares[opcion.filaVacia - 1] = rOa;

        if (rOa == "Si tiene") {
            Usuario.setFill(Color.BLUE);
            PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 80, 0), Usuario);
            pathTransition.setCycleCount(1);
            pathTransition.play();

            if (opcion.filaVacia == 1) {
                U1.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 2) {
                U2.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 3) {
                U3.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 4) {
                U4.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 5) {
                U5.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 6) {
                U6.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 7) {
                U7.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 8) {
                U8.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 9) {
                U9.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 10) {
                U10.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 11) {
                U11.setFill(Color.BLUE);
            }
            if (opcion.filaVacia == 12) {
                U12.setFill(Color.BLUE);
            }
        }
        if (rOa == "No tiene") {
            Usuario.setFill(Color.RED);
            PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 80, 0), Usuario);
            pathTransition.setCycleCount(1);
            pathTransition.play();

            if (opcion.filaVacia == 1) {
                U1.setFill(Color.RED);
            }
            if (opcion.filaVacia == 2) {
                U2.setFill(Color.RED);
            }
            if (opcion.filaVacia == 3) {
                U3.setFill(Color.RED);
            }
            if (opcion.filaVacia == 4) {
                U4.setFill(Color.RED);
            }
            if (opcion.filaVacia == 5) {
                U5.setFill(Color.RED);
            }
            if (opcion.filaVacia == 6) {
                U6.setFill(Color.RED);
            }
            if (opcion.filaVacia == 7) {
                U7.setFill(Color.RED);
            }
            if (opcion.filaVacia == 8) {
                U8.setFill(Color.RED);
            }
            if (opcion.filaVacia == 9) {
                U9.setFill(Color.RED);
            }
            if (opcion.filaVacia == 10) {
                U10.setFill(Color.RED);
            }
            if (opcion.filaVacia == 11) {
                U11.setFill(Color.RED);
            }
            if (opcion.filaVacia == 12) {
                U12.setFill(Color.RED);
            }
        }
    }

    @FXML
    public void Salir(ActionEvent event) throws IOException {
        TablaController opcion = new TablaController();

        if (opcion.sacarUs == 1) {
            U1.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 2) {
            U2.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 3) {
            U3.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 4) {
            U4.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 5) {
            U5.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 6) {
            U6.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 7) {
            U7.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 8) {
            U8.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 9) {
            U9.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 10) {
            U10.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 11) {
            U11.setFill(Color.TRANSPARENT);
        }
        if (opcion.sacarUs == 12) {
            U12.setFill(Color.TRANSPARENT);
        }
    }

    @FXML
    public void Exit(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tabla-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TablaController opcion = new TablaController();
        rOa = opcion.opcionSeleccion;

        /*U1.setFill(Color.TRANSPARENT);
        U2.setFill(Color.TRANSPARENT);
        U3.setFill(Color.TRANSPARENT);
        U4.setFill(Color.TRANSPARENT);
        U5.setFill(Color.TRANSPARENT);
        U6.setFill(Color.TRANSPARENT);
        U7.setFill(Color.TRANSPARENT);
        U8.setFill(Color.TRANSPARENT);
        U9.setFill(Color.TRANSPARENT);
        U10.setFill(Color.TRANSPARENT);
        U11.setFill(Color.TRANSPARENT);
        U12.setFill(Color.TRANSPARENT);*/

        for (int i = 0; i < opcion.lugares.length; i++) {
            if (opcion.lugares[i] == "Si tiene") {
                if (i == 0) {
                    U1.setFill(Color.BLUE);
                }
                if (i == 1) {
                    U2.setFill(Color.BLUE);
                }
                if (i == 2) {
                    U3.setFill(Color.BLUE);
                }
                if (i == 3) {
                    U4.setFill(Color.BLUE);
                }
                if (i == 4) {
                    U5.setFill(Color.BLUE);
                }
                if (i == 5) {
                    U6.setFill(Color.BLUE);
                }
                if (i == 6) {
                    U7.setFill(Color.BLUE);
                }
                if (i == 7) {
                    U8.setFill(Color.BLUE);
                }
                if (i == 8) {
                    U9.setFill(Color.BLUE);
                }
                if (i == 9) {
                    U10.setFill(Color.BLUE);
                }
                if (i == 10) {
                    U11.setFill(Color.BLUE);
                }
                if (i == 11) {
                    U12.setFill(Color.BLUE);
                }
            }
            if (opcion.lugares[i] == "No tiene") {
                if (i == 0) {
                    U1.setFill(Color.RED);
                }
                if (i == 1) {
                    U2.setFill(Color.RED);
                }
                if (i == 2) {
                    U3.setFill(Color.RED);
                }
                if (i == 3) {
                    U4.setFill(Color.RED);
                }
                if (i == 4) {
                    U5.setFill(Color.RED);
                }
                if (i == 5) {
                    U6.setFill(Color.RED);
                }
                if (i == 6) {
                    U7.setFill(Color.RED);
                }
                if (i == 7) {
                    U8.setFill(Color.RED);
                }
                if (i == 8) {
                    U9.setFill(Color.RED);
                }
                if (i == 9) {
                    U10.setFill(Color.RED);
                }
                if (i == 10) {
                    U11.setFill(Color.RED);
                }
                if (i == 11) {
                    U12.setFill(Color.RED);
                }
            }
        }
    }
}