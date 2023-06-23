package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

import java.util.List;
import java.util.Objects;

public class RegionTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(GroupTest.class.getSimpleName());

        Image image = new Image(Objects.requireNonNull(RegionTest.class.getResource("/images/region.png")).toExternalForm());

        HBox imageBackground = new HBox();
        imageBackground.setPadding(new Insets(10));

        HBox box = new HBox();

        StrokeType strokeType = StrokeType.INSIDE;
        StrokeLineJoin strokeLineJoin = StrokeLineJoin.MITER;
        StrokeLineCap strokeLineCap = StrokeLineCap.BUTT;
        double miterLimit = 10;
        double dashOffset = 0;
        List<Double> dashArray = null;

        BorderStrokeStyle borderStrokeStyle =
                new BorderStrokeStyle(
                        strokeType,
                        strokeLineJoin,
                        strokeLineCap,
                        miterLimit,
                        dashOffset,
                        dashArray
                );


        BorderStroke borderStroke =
                new BorderStroke(
                        Color.valueOf("08ff80"),
                        borderStrokeStyle,
                        new CornerRadii(0),
                        new BorderWidths(8)
                );
        Border border = new Border(borderStroke);
        imageBackground.setBorder(border);
        box.setBorder(border);
        BackgroundFill backgroundFill =
                new BackgroundFill(
                        Color.valueOf("#ff00ff"),
                        new CornerRadii(10),
                        new Insets(10)
                );

        Background background =
                new Background(backgroundFill);

        box.setBackground(background);

        BackgroundImage backgroundImage =
                new BackgroundImage(
                        image,
                        BackgroundRepeat.NO_REPEAT,  // repeat X
                        BackgroundRepeat.NO_REPEAT,  // repeat Y
                        BackgroundPosition.CENTER,   // position
                        new BackgroundSize(
                                100,   // width  = 100%
                                100,   // height = 100%
                                true,  // width is percentage
                                true,  // height is percentage
                                true,  // contain image within bounds
                                true   // cover all of Region content area
                        )
                );
        imageBackground.setBackground(new Background(backgroundImage));
        Scene scene = new Scene(box, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
