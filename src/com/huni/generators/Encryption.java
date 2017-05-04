package com.huni.generators;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption extends Application {

    private String input;
    private String output = "";
    char[] chars = new char[input.length()];

    /*
    *   Создать FXML файл.
    *   Создать интерфейс.
    *   Создать графический интерфес (CSS).
    *
    *   Создать поддержу файловой системы (ввод типа DRAG AND DROP ( ну это слишком :D), вывод)
     */

    @FXML
    public Stage window = new Stage();
    public Scene scene;
    public Parent root;
    public Button okButton;
    public TextField field;
    public Label message;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public void encrypt() {
        /*
        *   В этом методе переделать: что-то тут не то)
         */
        loop: {
            for (int i = 0; i < input.length(); i++) {
                chars[i] = input.charAt(i);
                switch (chars[i]) {
                    case 'H': output += "sldflsdwwesa"; break;
                    case 'e': output += "sdasethyrgdf"; break;
                    case 'l': output += "sadklasfkkrf"; break;
                    case 'o': output += "sad4e5t3w32e"; break;
                    case ' ': output += "64885erklgfs"; break;
                    case 'w': output += "e9r9er9fosfа"; break;
                    case 'r': output += "e55tjjkjkwej"; break;
                    case 'd': output += "q23e435wldas"; break;
                    case '!': output += "kdsfksdkfkk6"; break;
                    default:
                        System.out.println("Не возможно шифрование!");
                        output = "";
                        break loop;
                }
            }
        }
    }
}