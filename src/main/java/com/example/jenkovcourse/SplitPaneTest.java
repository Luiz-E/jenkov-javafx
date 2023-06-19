package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplitPaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(SplitPaneTest.class.getSimpleName());

        SplitPane splitPane = new SplitPane();
        VBox leftControl = new VBox(new Label("Left Control"));
        VBox midControl = new VBox(new Label("Mid Control"));
        VBox rightControl = new VBox(new Label("Right Control"));

        splitPane.getItems().addAll(leftControl, midControl, rightControl);

        Scene scene = new Scene(splitPane,300,250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
