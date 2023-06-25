package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(HBoxTest.class.getSimpleName());

        Button button1 = new Button("Button number 1");
        Button button2 = new Button("Button number 2");

        HBox hBox = new HBox(20, button1, button2);
        hBox.setSpacing(50);
        HBox.setMargin(button1, new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.BASELINE_CENTER);
        HBox.setHgrow(button1, Priority.ALWAYS);

        button1.setMaxHeight(99999.0D); //or Double.MAX_VALUE;
        hBox.setFillHeight(true);
        Scene scene = new Scene(hBox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
