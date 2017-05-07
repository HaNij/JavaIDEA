package com.huni.javafx.GEN_PASSWORD;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) {
        Controller controller = new Controller();
        stage.setScene(new Scene(controller.getRoot()));
        stage.setResizable(false);
        stage.setTitle("Генератор пароля");
        stage.getIcons().add(new Image("https://cdn4.iconfinder.com/data/icons/flat-icon-set/128/key-icon.png"));
        stage.show();
    }
}
