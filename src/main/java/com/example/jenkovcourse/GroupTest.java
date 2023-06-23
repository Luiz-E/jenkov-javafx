package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GroupTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(GroupTest.class.getSimpleName());

        Group group = new Group();

        Scene scene = new Scene(group);

        group.getChildren().add(new Button("Button number 1"));
        group.getChildren().add(new Button("Button 2"));

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
