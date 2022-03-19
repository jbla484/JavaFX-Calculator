module com.example.calculators {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculators to javafx.fxml;
    exports com.example.calculators;
}