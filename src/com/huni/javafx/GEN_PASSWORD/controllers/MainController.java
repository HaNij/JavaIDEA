package com.huni.javafx.GEN_PASSWORD.controllers;


import com.huni.javafx.GEN_PASSWORD.Dialog;
import com.huni.javafx.GEN_PASSWORD.Core;
import com.huni.javafx.GEN_PASSWORD.Settings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class MainController {
    @FXML
    public Button btn_generate;
    public TextField field;
    public Parent root;
    public Button btn_settings;

    public Parent getRoot() {
        try {
            root = FXMLLoader.load(getClass().getResource("uiMain.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return root;
    }

    @FXML
    public void generateButton() {
        generate();
        onClick();
    }

    public void onClick() {
        Dialog dialog = new Dialog(Alert.AlertType.INFORMATION, "Пароль сохраняется в буфер обмена", ButtonType.OK);
        dialog.setHeaderText(null);
        dialog.setTitle("Сообщение");
        Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow(); // Добавление иконки к диалогу;
        stage.getIcons().add(new Image("https://cdn4.iconfinder.com/data/icons/flat-icon-set/128/key-icon.png"));
        if (!dialog.isShowed()) {
            dialog.showDialog(dialog);
        } else { return; }
    }

    private void generate() {
        field.setText(Core.generatePassword(12));
        copyToSystemClipboard(field.getText());
    }

    private void copyToSystemClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    public void onEnter() {
        generate();
    }

    public void openSettings() {
        try {
            Settings settings = new Settings();
            settings.start(Settings.getWindow());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
