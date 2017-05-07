package com.huni.javafx.GEN_PASSWORD;

import javafx.beans.NamedArg;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Dialog extends Alert {
    private static boolean showed = false;

    public Dialog(@NamedArg("alertType") AlertType alertType, @NamedArg("contentText") String contentText, ButtonType... buttons) {
        super(alertType, contentText, buttons);
    }

    public void showDialog(Dialog dialog) {
        showed = true;
        dialog.showAndWait();
    }

    public boolean isShowed() {
        return showed;
    }
}
