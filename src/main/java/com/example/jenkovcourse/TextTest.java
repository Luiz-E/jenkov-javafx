package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class TextTest extends Application {

    @Override
    public void start(Stage primaryStage) {

        Text text1 = new Text("This is a JavaFX text.");
        text1.setFont(Font.font("System Regular", FontWeight.BOLD, 15));

        Text text2 = new Text();
        text2.setText("This is the text to display");
        text2.setFont(Font.font("Arial"));

        Text text3 = new Text("Changing the color");
        text3.setFill(Color.GREEN);

        Text text4 = new Text("Changing the stroke");
        text4.setFill(Color.DARKRED);

        Text text5 = new Text("Changing position");
        text5.setX(100);
        text5.setY(250);

        Text[] text6 = new Text[4];
        VPos[] positions = {VPos.BASELINE, VPos.BOTTOM, VPos.CENTER, VPos.TOP };
        for (int i = 0; i < 4; i++) {
            text6[i] = new Text("Position: " + positions[i].name());
            text6[i].setTextOrigin(positions[i]);
            text6[i].setUnderline(true);
        }

        Text[] wraps = {new Text("This is a javafx text.\nLine 2"), new javafx.scene.text.Text("This is a longer JavaFX text.")};
        wraps[1].setWrappingWidth(80);

        javafx.scene.text.Text text7 = new javafx.scene.text.Text("Set Strike true");
        text7.setStrikethrough(true);

        javafx.scene.text.Text[] smoothing = {new javafx.scene.text.Text("Gray technique"), new javafx.scene.text.Text("LCD technique")};
        smoothing[0].setFontSmoothingType(FontSmoothingType.GRAY);
        smoothing[0].setFont(Font.font("System Regular", FontWeight.MEDIUM, 18));
        smoothing[1].setFontSmoothingType(FontSmoothingType.LCD);
        smoothing[1].setFont(Font.font("System Regular", FontWeight.MEDIUM, 18));

        VBox basics = new VBox(text1, text2, text3, text4, text5);
        VBox origins = new VBox(text6[0], text6[1], text6[2], text6[3]);
        VBox lineLimits = new VBox(wraps[0], wraps[1]);
        VBox smoothingTechniques = new VBox(smoothing[0], smoothing[1]);

        VBox root = new VBox(basics, origins, lineLimits, text7, smoothingTechniques);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
