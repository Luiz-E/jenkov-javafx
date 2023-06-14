package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;

public class FXML_CSS extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
//        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/com/example/jenkovcourse/testFXML.fxml"));
//
//        Scene scene = new Scene(loader.load(), 320, 240);
//        stage.setScene(scene);
//        stage.show();

        //Main.class.getResource() return a URL inside the project folder
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:/Users/luize/Documents/Cursos/jenkov/jenkov-course/src/main/resources/com/example/jenkovcourse/testFXML.fxml"));
        VBox vbox = loader.<VBox>load();

        Scene scene = new Scene(vbox);

        scene.getStylesheets().add(getClass().getResource("/css/button-style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
