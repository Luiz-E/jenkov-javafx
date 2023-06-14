package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperlinkTest extends Application {

    @Override
    public void start(Stage primaryStage) {

        Hyperlink link = new javafx.scene.control.Hyperlink("click me");
        link.setText("new text");
        link.setOnAction(e -> {
            System.out.println("the hyperlink was clicked");
        });
        VBox root = new VBox(link);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
