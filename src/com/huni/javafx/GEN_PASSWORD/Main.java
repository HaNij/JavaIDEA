package com.huni.javafx.GEN_PASSWORD;
import java.util.Random;

public class Main {

    private final String numbers = "0123456789";

    private String generatePassword(int amount_numbers) {
        Random rand = new Random();
        String generatedPass = "";
        for (int i = 0; i < amount_numbers; i++) {
            generatedPass += numbers.charAt(rand.nextInt(numbers.length()));
        }

        return generatedPass;
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i < 12; i++) {
            System.out.println(main.generatePassword(12));
            System.out.println(main.generatePassword(5));
            System.out.println(main.generatePassword(2));
            System.out.println(main.generatePassword(5));
        }
    }
}
