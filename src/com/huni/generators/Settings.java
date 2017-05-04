package com.huni.generators;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class Settings {

    @FXML
    public static Stage window = new Stage();
    public static Parent root;
    private static Scene scene;
    public static Button applyButton = new Button();
    public static CheckBox checkBoxNum = new CheckBox();
    public boolean isCheckedBigWord = false;
    public boolean isCheckedSmallWord = false;
    public boolean isCheckedNum = false;
    public static CheckBox checkBoxBigWord = new CheckBox();
    public static CheckBox checkBoxSmallWord = new CheckBox();

    public void start() {
        try {
            root = FXMLLoader.load(getClass().getResource("uiGenSettings.fxml"));
            scene = new Scene(root);
            window.setScene(scene);
            window.setResizable(false);
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void wordCheckBoxEvent() {
        if (checkBoxBigWord.isSelected()) {
            isCheckedBigWord = true;
            checkBoxBigWord.setSelected(true);
        } else if (checkBoxSmallWord.isSelected()) {
            isCheckedSmallWord = true;
            checkBoxSmallWord.setSelected(true);
        }
    }

    @FXML
    public void applyHandleEvent() {
        wordCheckBoxEvent();
        numberCheckBoxEvent();
        window.close();

    }

    public void numberCheckBoxEvent() {
        if (checkBoxNum.isSelected()) {
            isCheckedNum = true;
            checkBoxNum.setSelected(true);
        }
    }
}
