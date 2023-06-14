package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Node extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Main App");
        Label label = new Label("A JavaFX Label");
        VBox vBox = new VBox(label);
        Scene scene = new Scene(vBox, 400, 340);


//        System.out.println(label.layoutBoundsProperty());
//        System.out.println(label.boundsInLocalProperty());
//        System.out.println(label.boundsInParentProperty());
//
//        label.setLayoutX(100);
//        label.setLayoutY(200);
//
//        System.out.println(label.layoutBoundsProperty());
//        System.out.println(label.boundsInLocalProperty());
//        System.out.println(label.boundsInParentProperty());

//        label.setPrefWidth(100);
//        label.setPrefHeight(100);
//
//        label.setMinWidth(50);
//        label.setMinHeight(50);
//
//        label.setMaxWidth(200);
//        label.setMaxHeight(200);

        label.setUserData(new UserDataNodeExample());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
