//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ButtonTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        String path = ButtonTest.class.getResource("/images/check.png").toExternalForm();
        Image image = new Image(path);
        ImageView view = new ImageView(image);
        Button root = new javafx.scene.control.Button("My button", view);
        root.setMnemonicParsing(true);
        root.setText("_Click");
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
