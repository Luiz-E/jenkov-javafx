//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class CheckBoxTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        CheckBox box1 = new CheckBox("Green");
        VBox root = new VBox(box1);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
