package com.example.proysistemasoperativos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InicioController implements Initializable {

    @FXML
    public void FiFo(ActionEvent event) throws IOException {
        Parent Root = FXMLLoader.load(getClass().getResource("/com/example/proysistemasoperativos/tabla-view.fxml"));
        Stage Stage = new Stage();
        Stage.setTitle("Another Window Triggered by Clicking");
        Stage.setScene(new Scene(Root, 1300, 650));
        Stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }


    @FXML
    void Cubrebocas(ActionEvent event) throws IOException {
        Parent Root = FXMLLoader.load(getClass().getResource("/com/example/proysistemasoperativos/tablaCubre-view.fxml"));
        Stage Stage = new Stage();
        Stage.setTitle("Another Window Triggered by Clicking");
        Stage.setScene(new Scene(Root, 1300, 650));
        Stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
