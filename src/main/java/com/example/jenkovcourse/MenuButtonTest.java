//Skin classes
package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class MenuButtonTest extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        String path = MenuButtonTest.class.getResource("/images/check.png").toExternalForm();
        Image image = new Image(path);
        ImageView iv = new ImageView(image);
        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");
        MenuButton menuButton = new MenuButton("Options", iv, menuItem1, menuItem2, menuItem3);

        VBox root = new VBox(menuButton);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
