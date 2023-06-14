//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class DatePickerTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        DatePicker datePicker = new DatePicker();
        datePicker.setEditable(true);
        VBox root = new VBox(datePicker);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
