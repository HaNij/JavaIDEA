package com.huni.javafx.GEN_PASSWORD;
import java.util.Random;

public class Main {
    private static final String numbers = "0123456789";

    private static String generatePassword(int count) {
        String out = "";
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            out += numbers.charAt(rand.nextInt(numbers.length()));
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(12));
    }
}
