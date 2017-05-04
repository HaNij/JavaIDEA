package com.huni.javafx.URTK_PROJECT;

/*
    Основной класс, реализующий готовый продукт.
*/
import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application {

   public MainWindow mainWindow;
   public Stage password;
   public Stage main;
   public PasswordScene passwordScene;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //First password stage, but now main stage!

       mainWindow = new MainWindow();
      // mainWindow.start();

    }
}
