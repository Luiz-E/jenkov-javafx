//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class SliderTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Slider slider1 = new Slider(0, 100, 0);
        Slider slider2 = new Slider(0, 100, 20);
        Slider slider3 = new Slider(0, 100, 40);
        Slider slider4 = new Slider(0, 100, 40);
        Slider[] slidersList = {slider1, slider2, slider3, slider4};

        for (Slider slider : slidersList) {
            slider.setMajorTickUnit(8.0);
            slider.setMinorTickCount(3);
        }

        slider2.setShowTickMarks(true);

        slider3.setShowTickLabels(true);

        slider4.setShowTickMarks(true);
        slider4.setShowTickLabels(true);

        VBox root = new VBox();

        for (Slider slider : slidersList) {
            root.getChildren().add(slider);
        }

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
