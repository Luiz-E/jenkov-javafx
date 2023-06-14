//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ListViewTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        ListView<String> listView = new ListView<>();

        listView.getItems().add("Item 1");
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Button button = new Button("Read Selected Value");



        button.setOnAction(event -> {
            ObservableList<Integer> selectedIndices = listView.getSelectionModel().getSelectedIndices();

            for(Object o : selectedIndices){
                System.out.println("o = " + o + " (" + o.getClass() + ")");
            }
        });

        VBox root = new VBox(listView, button);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
