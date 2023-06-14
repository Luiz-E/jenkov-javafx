//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.Objects;

public class TooltipTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Tooltip tooltip = new Tooltip("Creates a new file");
        Button button = new Button("Create");
        ImageView imageView = new ImageView(Objects.requireNonNull(TooltipTest.class.getResource("/images/check.png")).toExternalForm());
        tooltip.setGraphic(imageView);
        button.setTooltip(tooltip);
        tooltip.setTextAlignment(TextAlignment.CENTER);
        VBox root = new VBox(button);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle(this.getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
