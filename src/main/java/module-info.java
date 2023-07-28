module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.javafxjdbc;
    opens com.example.javafxjdbc to javafx.fxml;
}