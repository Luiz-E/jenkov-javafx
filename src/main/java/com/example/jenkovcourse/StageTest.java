package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class StageTest extends Application {
    @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX App");

        Stage stage = new Stage();
        //stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);
        //stage.initOwner(primaryStage);

//        stage.initStyle(StageStyle.DECORATED);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        primaryStage.initStyle(StageStyle.UNIFIED);
//        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();

        primaryStage.setOnHiding((event) -> {
            System.out.println("Hiding Stage");
        });
        primaryStage.setOnHidden((event) -> {
            System.out.println("Stage hidden");
        });
        primaryStage.setOnShowing((event) -> {
            System.out.println("Showing Stage");
        });
        primaryStage.setOnShown((event) -> {
            System.out.println("Stage Shown");
        });
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
            System.out.println("Key pressed: " + event.toString());

            switch (event.getCode().getCode()) {
                case 27: { // 27 = ESC key
                    primaryStage.close();
                    break;
                }
                case 10: { // 10 = Return
                    primaryStage.setWidth(primaryStage.getWidth() * 2);
                }
                default: {
                    System.out.println("Unrecognized key");
                }
            }
        });
        stage.showAndWait();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}