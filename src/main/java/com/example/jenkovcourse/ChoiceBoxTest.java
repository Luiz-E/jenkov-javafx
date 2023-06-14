//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ChoiceBoxTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
//        ChoiceBox<String> choiceBox = new ChoiceBox<>();
//
//        choiceBox.getItems().add("Choice 1");
//        choiceBox.getItems().add("Choice 2");
//        choiceBox.getItems().add("Choice 3");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().add(new Label("Choice 1").getText());
        choiceBox.getItems().add(new Label("Choice 2").getText());
        choiceBox.getItems().add(new Label("Choice 3").getText());

        VBox root = new VBox(choiceBox);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
