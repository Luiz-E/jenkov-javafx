package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Properties extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        ReadOnlyDoubleProperty widthProperty = pane.widthProperty();
        widthProperty.addListener( new ChangeListener<Number>(){
            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldVal, Number newVal) {

                System.out.println("widthProperty changed from "
                        + oldVal.doubleValue() + " to " + newVal.doubleValue());
            }
        });


        DoubleProperty prefWidthProperty = pane.prefWidthProperty();
        prefWidthProperty.addListener(
                (ObservableValue<? extends Number> prop,
                 Number oldVal, Number newVal) -> {

                    System.out.println("prefWidthProperty changed from "
                            + oldVal.doubleValue() + " to " + newVal.doubleValue());
                });

        prefWidthProperty.set(123);

        Scene scene = new Scene(pane, 1024, 800, true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Example");


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
