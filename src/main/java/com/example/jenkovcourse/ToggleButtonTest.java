//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ToggleButtonTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        ToggleButton toggleButton1 = new ToggleButton("Left");
        ToggleButton toggleButton2 = new ToggleButton("Right");
        ToggleButton toggleButton3 = new ToggleButton("Up");
        ToggleButton toggleButton4 = new ToggleButton("Down");

        ToggleGroup toggleGroup = new ToggleGroup();
        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton3.setToggleGroup(toggleGroup);
        toggleButton4.setToggleGroup(toggleGroup);

        toggleButton1.setOnAction(event -> {
            if (toggleButton1.isSelected()) {
                toggleButton1.setFont(Font.font("Aria", FontWeight.BOLD, 36));
            } else {
                toggleButton1.setFont(Font.font("Aria", FontWeight.NORMAL, 36));
            }
        });
        ToggleButton selectedToggleButton =
                (ToggleButton) toggleGroup.getSelectedToggle();

        VBox root = new VBox(toggleButton1, toggleButton2, toggleButton3, toggleButton4);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
