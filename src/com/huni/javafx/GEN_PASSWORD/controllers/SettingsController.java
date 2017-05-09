package com.huni.javafx.GEN_PASSWORD.controllers;

import com.huni.javafx.GEN_PASSWORD.Settings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class SettingsController {

    @FXML
    public Button btn_ok;
    public CheckBox chb_b;
    public CheckBox chb_s;
    public Parent root;

    private static boolean bigSelected;
    private static boolean smallSelected;

    @FXML
    public void okAction() {
        if (chb_b.isSelected() && !chb_s.isSelected()){
            bigSelected = true;
            smallSelected = false;
            Settings.getWindow().close();
            System.out.println("big selected");
        } else if (chb_s.isSelected() && !chb_b.isSelected()) {
            smallSelected = true;
            bigSelected = false;
            Settings.getWindow().close();
            System.out.println("small selected");

        } else if (chb_b.isSelected() && chb_s.isSelected()) {
            smallSelected = true;
            bigSelected = true;
            Settings.getWindow().close();
            System.out.println("big and small selected");
        } else if (!chb_b.isSelected() && !chb_s.isSelected()){
            bigSelected = false;
            smallSelected = false;
            Settings.getWindow().close();
            System.out.println("not big not small selected");
        } else System.out.println("Something gone wrong");
    }

    public static boolean isBigSelected() {
        return bigSelected;
    }

    public static boolean isSmallSelected() {
        return smallSelected;
    }

    public Parent getRoot() {
        try {
            root = FXMLLoader.load(getClass().getResource("uiSettings.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;


    }
}
