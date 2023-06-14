package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SceneTest extends Application {
    @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception {
        primaryStage.setTitle("Main App");

        VBox vBox = new VBox(new Label("A JavaFX Label"));
        Scene scene = new Scene(vBox, 400, 340);

        scene.setCursor(Cursor.DEFAULT);
//        scene.setCursor(Cursor.OPEN_HAND);
//        scene.setCursor(Cursor.CLOSED_HAND);
//        scene.setCursor(Cursor.CROSSHAIR);
//        scene.setCursor(Cursor.HAND);
//        scene.setCursor(Cursor.WAIT);
//        scene.setCursor(Cursor.H_RESIZE);
//        scene.setCursor(Cursor.V_RESIZE);
//        scene.setCursor(Cursor.MOVE);
//        scene.setCursor(Cursor.TEXT);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}