package com.huni.javafx.URTK_PROJECT;
/*
    Модуль Рандома

    * Содержит основной учебный текст
    * Выполняет действия над учебным текстом с помощью рандома
*/
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Random;

public class MainWindow extends Application {

    private enum TYPE_OF_DIALOG {
        WARNING, ERROR,INFORMATION
    }

    private final String FILE_QUESTIONS = "com/huni/javafx/URTK_PROJECT/questions.txt";
    private final String FILE_ANSWERS = "com/huni/javafx/URTK_PROJECT/answers.txt";
    private String[] question = {"Что такое яблоко?", "Что такое картошка?", "Кто я?"};
    private String[] answer = {"фрукт","овощь","я"};
    private String[] user_answers = new String[10];
    private Random rand = new Random();
    private int questionIndex;
    private String readyQuestion = randomQuestion();
    private static int titleNumber = 1;

    @FXML
    public Parent root;
    public TextField field = new TextField();
    public Button nextButton = new Button();
    public Label label = new Label();

    @FXML
    public void onEnter() throws Exception {
        action();
    }
    @FXML
    public void handleNextButtonAction() throws Exception {
        action();
    }

    @FXML
    public void initialize() {
        label.setText(readyQuestion);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = new Stage();
        root = FXMLLoader.load(getClass().getResource("uiRandScene.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("com/huni/javafx/URTK_PROJECT/Style.css");
        window.setTitle("Вопрос номер: " + titleNumber);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    private void checkCorrect() {
        if(field.getText().equals(answer[questionIndex])) {
            displayDialog("Ты правильно ответил!", "Информация", TYPE_OF_DIALOG.INFORMATION);
        } else if (field.getText().isEmpty()) {
            displayDialog("Ты ничего не ответил!","Предупреждение", TYPE_OF_DIALOG.WARNING);
        } else displayDialog("Ты неправильно ответил!", "Информация", TYPE_OF_DIALOG.INFORMATION);
    }

    public void displayDialog(String message, String title, TYPE_OF_DIALOG type) {
        Alert alert;
        switch (type) {
            case ERROR:
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle(title);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
                break;
            case INFORMATION:
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle(title);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
                break;
            case WARNING:
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(title);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
                break;
                default:
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText(null);
                    alert.setContentText("Something gone wrong");
                    break;
        }
    }

    private String randomQuestion() {
        return question[questionIndex = rand.nextInt(question.length)];
    }

    private void action() throws Exception {
        checkCorrect();
        field.clear();
        updateStage();
    }

    private Stage generateStage() throws Exception{
        Stage stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("uiRandScene.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("com/huni/javafx/URTK_PROJECT/Style.css");
        stage.setScene(scene);
        stage.setTitle("Вопрос номер: " + titleNumber);
        return stage;
    }

    private void updateStage() throws Exception {
        titleNumber++;
        generateStage().show();

    }
}
