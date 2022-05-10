module com.example.proysistemasoperativos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.proysistemasoperativos to javafx.fxml;
    exports com.example.proysistemasoperativos;
    exports com.example.proysistemasoperativos.Animation;
    opens com.example.proysistemasoperativos.Animation to javafx.fxml;
}