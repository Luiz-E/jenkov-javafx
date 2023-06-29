package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(FlowPaneTest.class.getSimpleName());

        FlowPane flowPane = new FlowPane();

        Button button1 = new Button("Button Number 1");
        Button button2 = new Button("Button Number 2");
        Button button3 = new Button("Button Number 3");

        flowPane.getChildren().addAll(button1, button2, button3);

        flowPane.setHgap(10);
        flowPane.setVgap(10);

        flowPane.setOrientation(Orientation.VERTICAL);

        Scene scene = new Scene(flowPane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
