//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ColorPickerTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        ColorPicker colorPicker = new ColorPicker();
        Pane pane = new Pane();
        Pane line = new Pane();
        line.setMinHeight(15);
        pane.setMaxWidth(50);
        pane.setPrefHeight(50);

        VBox root = new VBox(colorPicker, line, pane);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        colorPicker.setOnAction(event -> {
            pane.setBackground(new Background(new BackgroundFill(colorPicker.getValue(), new CornerRadii(0), Insets.EMPTY)));
        });

    }

    public static void main(String[] args) {
        launch();
    }
}
