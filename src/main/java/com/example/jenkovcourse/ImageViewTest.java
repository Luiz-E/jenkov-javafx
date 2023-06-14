package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class ImageViewTest extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

//        FileInputStream imagePath = new FileInputStream("src/main/resources/images/check.png");
        String imagePath = ImageViewTest.class.getResource("/images/check.png").toExternalForm();
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);


        VBox box = new VBox(imageView);
        box.setStyle("-fx-background-color: #0000ff;");
        Scene scene = new Scene(box, 320, 240);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
