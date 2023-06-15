package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(this.getClass().getSimpleName());

        Accordion accordion = new Accordion();
        TitledPane pane1 = new TitledPane("Boats", new Label("show all boats available"));
        TitledPane pane2 = new TitledPane("Cars", new Label("show all cars available"));
        TitledPane pane3 = new TitledPane("Planes", new Label("show all planes available"));

        accordion.getPanes().add(pane1);
        accordion.getPanes().add(pane2);
        accordion.getPanes().add(pane3);

        VBox vbox = new VBox(accordion);
        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}