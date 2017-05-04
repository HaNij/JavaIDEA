package com.huni.javafx.GEN_PASSWORD;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) {
        Controller controller = new Controller();
        stage.setScene(new Scene(controller.getRoot()));
        stage.show();
    }
}
