package com.huni.javafx.fxml;

import javafx.scene.control.*;

public class Controller {

    public Button okButton;
    public TextField oldField;
    public TextField nameField;

    public void GoToHell() {
        System.out.println("User name is: " + nameField.getText());
        System.out.println("User old is: " + oldField.getText());
    }

}
