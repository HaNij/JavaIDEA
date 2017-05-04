package com.huni.study;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;

public class Main extends Application implements EventHandler {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world!");
        FlowPane pane = new FlowPane();
        Scene scene = new Scene(pane,300,200);
        primaryStage.setScene(scene);
        Label label = new Label("Hello suka blyat!");
        Button b1 = new Button("Нажми сучка");
        b1.isCancelButton();

        pane.getChildren().add(b1);
        pane.getChildren().add(label);
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {

    }
}
