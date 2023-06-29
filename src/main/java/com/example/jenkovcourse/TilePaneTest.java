package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(FlowPaneTest.class.getSimpleName());

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button Number 2");
        Button button3 = new Button("Button No 3");
        Button button4 = new Button("Button No 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button Number 6");

        TilePane pane = new TilePane();

        pane.getChildren().addAll(button1, button2, button3, button4, button5, button6);
        pane.setTileAlignment(Pos.TOP_LEFT);
        pane.setHgap(10);
        pane.setVgap(10);

        Scene scene = new Scene(pane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
