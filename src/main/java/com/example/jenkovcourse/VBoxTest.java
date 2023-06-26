package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(VBoxTest.class.getSimpleName());
        Button button1 = new Button("Button number 1");
        Button button2 = new Button("Button number 2");
        VBox vBox = new VBox(20, button1, button2);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        Scene scene = new Scene(vBox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
