package com.huni.javafx.GEN_PASSWORD;

import com.huni.javafx.GEN_PASSWORD.controllers.SettingsController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Settings extends Application {

    private static Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        SettingsController controller = new SettingsController();
        window = primaryStage;
        window = new Stage();
        window.setResizable(false);
        window.setTitle("Настройки");
        window.setScene(new Scene(controller.getRoot()));
        window.show();
    }

    public static Stage getWindow() {
        return window;
    }
}
