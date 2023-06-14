package com.example.jenkovcourse;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerFXML {
    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private void reactToClick() {
        label1.setText("Button clicked");
    }

}
