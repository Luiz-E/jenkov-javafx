package com.example.jenkovcourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class MenuBarTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(this.getClass().getSimpleName());
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("menu 1");
//        menu.setGraphic(new ImageView(Objects.requireNonNull(this.getClass().getResource("/images/check.png")).toExternalForm()));
        menu.setOnShowing(e -> { System.out.println("Showing Menu 1"); });
        menu.setOnShown  (e -> { System.out.println("Shown Menu 1"); });
        menu.setOnHiding (e -> { System.out.println("Hiding Menu 1"); });
        menu.setOnHidden (e -> { System.out.println("Hidden Menu 1"); });

        Slider slider = new Slider(0, 100, 50);

        CustomMenuItem customMenuItem = new CustomMenuItem();
        customMenuItem.setContent(slider);

        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        SeparatorMenuItem separatorMenuItem2 = new SeparatorMenuItem();

        menu.getItems().addAll(menuItem1, separatorMenuItem, menuItem2, separatorMenuItem2, customMenuItem);

        menuBar.getMenus().add(menu);

        VBox vbox = new VBox(menuBar);
        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
