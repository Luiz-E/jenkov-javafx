package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabPaneTest extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle(TabPaneTest.class.getSimpleName());

        TabPane tabPane = new TabPane();

        Tab tab1 = new Tab("Planes", new Label("Show all planes available"));
        Tab tab2 = new Tab("Cars", new Label("Show all cars available"));
        Tab tab3 = new Tab("Boats", new Label("Show all boats available"));

        tabPane.getTabs().addAll(tab1, tab2, tab3);

        VBox root = new VBox(tabPane);
        Scene scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        stage.show();

        for (Object child : tabPane.getChildrenUnmodifiable()) {
            System.out.println(child);
        }
    }

}
