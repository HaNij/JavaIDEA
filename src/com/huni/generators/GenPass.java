package com.huni.generators;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class GenPass extends Application {
    //private final String FILE_NAME = "src/com/huni/generators/output.txt";
    //private File file = new File(FILE_NAME);
    private static final String alphabet_number = "0123456789";
    private static final String alphabet_small_word = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphabet_big_word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static boolean displayedDialog = false;
    //private Settings settings = new Settings();
    private Stage wSettings = new Stage();

    @FXML
    public Parent root;
    public Button btn_generate = new Button();
    public TextField field = new TextField();
    public Button btn_settings = new Button();

    @FXML
    public void action() {
        generate();
    }

    @FXML
    public void openSettings() {
        try {
            root = FXMLLoader.load(getClass().getResource("uiGenSettings.fxml"));
            Scene scene = new Scene(root);
            wSettings.setScene(scene);
            wSettings.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { launch(); }

    @Override
    public void start(Stage primaryStage) {
        try {
            root = FXMLLoader.load(getClass().getResource("uiGenPass.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
            root.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applySettings() {

    }

    private void generate() {
        String genpass = "";
        Random rand = new Random();
        if (true) {
            for (int i = 0; i < 12; i++) {
                genpass += alphabet_number.charAt(rand.nextInt(alphabet_number.length()));
            }
            field.setText(genpass);
            copyToSystemClipboard(field.getText());
            if (!isDisplayedDialog()) {
                displayDialog("Пароль сохраненяется в буфер обмена!");
            } else System.out.println("Ошибка");
        }
    }

    private static void copyToSystemClipboard(String str) {

        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    }

    private void displayDialog(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION,message);
        alert.setTitle("Информация");
        alert.setHeaderText(null);
        alert.showAndWait();
        displayedDialog = true;
    }

    private boolean isDisplayedDialog() {
        return displayedDialog;
    }

    /*
   *    Дальше идет блок с записью в файл, но пока я его внедрять не буду.

        Это нужно для записи файла.
        if (file.length() != 0 ) {
            update(genpass + '\n');
        } else write(genpass);

    private void write(String text) throws Exception {
        FileWriter writer = new FileWriter(file);

        try {
            writer.write(text);
        } finally {
            writer.close();
        }
    }

    private void update(String text) throws Exception {
        Writer output = new BufferedWriter(new FileWriter(file,true));
        output.write(text);
        output.close();
    }
    */
}
