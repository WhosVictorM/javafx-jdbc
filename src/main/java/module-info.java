module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports com.example.javafxjdbc;
    opens com.example.javafxjdbc to javafx.fxml;
}