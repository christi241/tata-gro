module com.example.toto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.toto to javafx.fxml;
    exports com.example.toto;
}