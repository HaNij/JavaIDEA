package com.huni.javafx.GEN_PASSWORD;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        Core core = new Core();
        field.setText(core.generatePassword(12));
    }

}
