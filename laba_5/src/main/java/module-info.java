module com.example.lr6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lr6 to javafx.fxml;
    exports com.example.lr6;
}