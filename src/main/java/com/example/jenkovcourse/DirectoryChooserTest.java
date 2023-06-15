//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;

public class DirectoryChooserTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle(this.getClass().getSimpleName());

        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setInitialDirectory(new File("src"));
        Button button = new Button("search directory");
        button.setOnAction(e -> {
            directoryChooser.showDialog(primaryStage);
        });
        VBox root = new VBox(button);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
