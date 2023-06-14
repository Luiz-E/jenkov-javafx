//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class SplitMenuButtonTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        MenuItem choice1 = new MenuItem("Choice 1");
        MenuItem choice2 = new MenuItem("Choice 2");
        MenuItem choice3 = new MenuItem("Choice 3");
        javafx.scene.control.SplitMenuButton splitMenuButton = new javafx.scene.control.SplitMenuButton(choice1, choice2, choice3);
        splitMenuButton.setText("Split Menu Button");

        VBox root = new VBox(splitMenuButton);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
