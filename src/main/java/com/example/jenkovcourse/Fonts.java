package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fonts extends Application {

    @Override
    public void start(Stage primaryStage) {

        String      fontFamily  = "Arial";
        double      fontSize    = 13;
        FontWeight  fontWeight  = FontWeight.BOLD;
        FontPosture fontPosture = FontPosture.ITALIC;

        Font[] fonts = new Font[6];
        Text[] texts = new Text[6];
        fonts[0] = Font.font(fontFamily);
        fonts[1] = Font.font(fontSize);
        fonts[2] = Font.font(fontFamily, fontSize);
        fonts[3] = Font.font(fontFamily, fontWeight , fontSize);
        fonts[4] = Font.font(fontFamily, fontPosture, fontSize);
        fonts[5] = Font.font(fontFamily, fontWeight , fontPosture, fontSize);
        for (int i = 0; i < 6; i++) {
            texts[i] = new Text("This is a JavaFX Text");
            texts[i].setFont(fonts[i]);
        }


        VBox root = new VBox(texts[0],texts[1],texts[2],texts[3],texts[4],texts[5]);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
