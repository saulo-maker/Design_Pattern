module com.saulodev.pedidoksb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.saulodev.Singleton to javafx.fxml;
    exports com.saulodev.Singleton;
}