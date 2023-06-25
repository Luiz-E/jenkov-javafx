package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaneTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(PaneTest.class.getSimpleName());

        Pane pane = new Pane();

        pane.getChildren().add(new Label("Hello Pane"));

        Scene scene = new Scene(pane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
