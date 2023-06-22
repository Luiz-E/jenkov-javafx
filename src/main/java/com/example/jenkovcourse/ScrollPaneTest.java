package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class ScrollPaneTest extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle(ScrollPaneTest.class.getSimpleName());

        ScrollPane scrollPane = new ScrollPane();

        Image image = new Image(Objects.requireNonNull(ScrollPaneTest.class.getResource("/images/check.png")).toExternalForm());
        ImageView imageView = new ImageView(image);

        scrollPane.setContent(imageView);

        Scene scene = new Scene(scrollPane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
