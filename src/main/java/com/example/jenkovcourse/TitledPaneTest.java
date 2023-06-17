package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class TitledPaneTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(this.getClass().getSimpleName());

        Label label = new Label("The content inside the TitledPane");
        TitledPane pane = new TitledPane("The title", label);
        pane.setCollapsible(false);

        Scene scene = new Scene(pane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
