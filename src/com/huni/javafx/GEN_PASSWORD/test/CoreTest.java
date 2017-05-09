package com.huni.javafx.GEN_PASSWORD.test;

import java.util.Random;

public class CoreTest {
    private static final String numbers = "0123456789";
    private static final String small_word = "abcdefghijklmnopqrstuvwxyz";
    private static final String big_word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generatePassword(int count) {
       String out = "";
       Random rand = new Random();

       for (int i = 0; i < count; i++) {
           out += numbers.charAt(rand.nextInt(numbers.length()));
           out += big_word.charAt(rand.nextInt(big_word.length()));
           out += small_word.charAt(rand.nextInt(small_word.length()));
       }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(12));
    }
}
