//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        ProgressBar progressBarUndetermined = new ProgressBar();
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setProgress(0.5);

        VBox root = new VBox(progressBar, progressBarUndetermined);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle(this.getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
