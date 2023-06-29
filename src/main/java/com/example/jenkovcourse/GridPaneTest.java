package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(this.getClass().getSimpleName());

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        GridPane gridPane = new GridPane();
//        gridPane.add(button1, 0, 0, 1, 1);
//        gridPane.add(button2, 1, 0, 1, 1);
//        gridPane.add(button3, 2, 0, 1, 1);
//        gridPane.add(button4, 0, 1, 1, 1);
//        gridPane.add(button5, 1, 1, 1, 1);
//        gridPane.add(button6, 2, 1, 1, 1);

        gridPane.add(button1, 0, 0, 2, 2);

        gridPane.add(button2, 2, 0, 1, 1);
        gridPane.add(button3, 2, 1, 1, 1);
        gridPane.add(button4, 0, 2, 1, 1);
        gridPane.add(button5, 1, 2, 1, 1);
        gridPane.add(button6, 2, 2, 1, 1);

        Scene scene = new Scene(gridPane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
