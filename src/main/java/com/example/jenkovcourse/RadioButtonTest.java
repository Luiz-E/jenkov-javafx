//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class RadioButtonTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        RadioButton radio1 = new RadioButton("Left");
        RadioButton radio2 = new RadioButton("Right");
        RadioButton radio3 = new RadioButton("Up");
        RadioButton radio4 = new RadioButton("Down");

        ToggleGroup group = new ToggleGroup();
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);
        radio3.setToggleGroup(group);
        radio4.setToggleGroup(group);
        VBox root = new VBox(radio1, radio2, radio3, radio4);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
