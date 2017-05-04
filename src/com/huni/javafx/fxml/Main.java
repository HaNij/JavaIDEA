package com.huni.javafx.fxml;

import javafx.application.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;

public class Main extends Application {

    public Stage window;
    public Scene scene;
    public Parent layout;

    public static void main(String[] args) {launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        layout = FXMLLoader.load(getClass().getResource("lesson1.fxml"));
        scene = new Scene(layout,600 ,400);

        window.setScene(scene);
        window.show();

    }
}
