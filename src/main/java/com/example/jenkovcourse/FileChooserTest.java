//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;

public class FileChooserTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle(this.getClass().getSimpleName());

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
                ,new FileChooser.ExtensionFilter("HTML Files", "*.htm")
        );

        Stage test = new Stage();
        Button button = new Button("Select File");
        button.setOnAction(e -> {
            File SelectedFile = fileChooser.showOpenDialog(test);
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
