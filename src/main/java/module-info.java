module com.example.jenkovcourse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jenkovcourse to javafx.fxml;
    exports com.example.jenkovcourse;
}