package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SeparatorTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(SeparatorTest.class.getSimpleName());
        Label label1 = new Label("Component 1");
        Label label2 = new Label("Component 2");

        Label label3 = new Label("Component 3");
        Label label4 = new Label("Component 4");

        Separator separatorV = new Separator(Orientation.VERTICAL);
        Separator separatorH = new Separator(Orientation.HORIZONTAL);
        VBox vBox1 = new VBox(label1, separatorH, label2);
        VBox vBox2 = new VBox(label3, separatorH, label4);

        HBox hBox = new HBox(vBox1, separatorV, vBox2);

        Scene scene = new Scene(hBox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
