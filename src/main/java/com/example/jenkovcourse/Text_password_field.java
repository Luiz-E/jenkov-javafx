//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Text_password_field extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        VBox root = new VBox(textField, passwordField);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
