package com.huni.javafx.GEN_PASSWORD;

import java.util.Random;
import com.huni.javafx.GEN_PASSWORD.controllers.SettingsController;
public class Core {
    private static final String numbers = "0123456789";
    private static final String small_word = "abcdefghijklmnopqrstuvwxyz";
    private static final String big_word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generatePassword(int count) {
        String out = "";
        Random rand = new Random();

        if (!SettingsController.isSmallSelected() && !SettingsController.isBigSelected()) {
            System.out.println("small: " + SettingsController.isSmallSelected());
            System.out.println("big: " + SettingsController.isBigSelected());
            System.out.println(1);
            for (int i = 0; i < count; i++) {
                out += numbers.charAt(rand.nextInt(numbers.length()));
            }

        } else if (SettingsController.isBigSelected() && !SettingsController.isSmallSelected()) {
            System.out.println("small: " + SettingsController.isSmallSelected());
            System.out.println("big: " + SettingsController.isBigSelected());
            System.out.println(2);
            for (int i = 0; i < count; i++) {
                out += numbers.charAt(rand.nextInt(numbers.length()));
                out += big_word.charAt(rand.nextInt(big_word.length()));
            }

        } else if (SettingsController.isSmallSelected() && !SettingsController.isBigSelected()) {
            System.out.println("small: " + SettingsController.isSmallSelected());
            System.out.println("big: " + SettingsController.isBigSelected());
            System.out.println(3);
            for (int i = 0; i < count; i++) {
                out += numbers.charAt(rand.nextInt(numbers.length()));
                out += small_word.charAt(rand.nextInt(small_word.length()));
            }

        } else if (SettingsController.isSmallSelected() && SettingsController.isBigSelected()) {
            System.out.println("small: " + SettingsController.isSmallSelected());
            System.out.println("big: " + SettingsController.isBigSelected());
            System.out.println(4);
            for (int i = 0; i < count; i++) {
                out += numbers.charAt(rand.nextInt(numbers.length()));
                out += big_word.charAt(rand.nextInt(big_word.length()));
                out += small_word.charAt(rand.nextInt(small_word.length()));
            }

        } else System.out.println("Тут пиздец");

        return out;
    }
}
