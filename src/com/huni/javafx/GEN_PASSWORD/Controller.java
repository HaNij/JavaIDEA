package com.huni.javafx.GEN_PASSWORD;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Controller {
    @FXML
    public Button btn_generate;
    public TextField field;
    public Parent root;

    public Parent getRoot() {
        try {
            root = FXMLLoader.load(getClass().getResource("uiGenPass.fxml"));
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
        if (!dialog.isShowed()) {
            dialog.showDialog(dialog);
        } else { return; }
    }

    private void generate() {
        Core core = new Core();
        field.setText(core.generatePassword(12));
        copyToSystemClipboard(field.getText());
    }

    private void copyToSystemClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    public void onEnter() {
        generate();
    }

}
