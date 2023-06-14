//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ToolbarTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        ToolBar toolBar = new ToolBar();
        toolBar.getItems().add(new Button("Click me"));
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(new Button("Click me 2"));
//        toolBar.setOrientation(Orientation.VERTICAL);
        VBox root = new VBox(toolBar);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
