module com.example.openbootjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.openbootjava to javafx.fxml;
    exports com.example.openbootjava;
}