package com.huni.generators;

import java.util.Random;

public class gen4decoder {
    static final String alphabet = "0123456789abcdfghtasdkaldlasdjjdsfndfnjteopwqpoekelxscmsxcscm5jlkhjerjtweureuhuwiejklsadkkjwjkjkqwjkejqd3482452094jlkdslkflk6kejy34nrn";
    static final int N = alphabet.length();
    static Random rand = new Random();
    static String [] container = new String[50];
    public static void main(String[] args) {
        for (int i = 0; i < container.length; i++) {
            container[i] = gen();
        }
        writeToEncryption(container);
        writeToDecoder(container);
    }

    public static void writeToDecoder(String[] container) {
        for (String s: container) {
            System.out.println("case \"" + s + "\": output += \"\"; break;");
        }
    }

    public static void writeToEncryption(String[] container) {
        for (String s: container) {
            System.out.println("case '': output += \"" + s + "\"; break;");
        }
    }




    public static String gen() {
        String genpass = "";
        for (int i = 0; i < 12; i++) {
            genpass += alphabet.charAt(rand.nextInt(N));
        }
        return genpass;
    }

}

// "case \"" + genpass + "\": output += \"\"; break; ";
// "case '': output += \"" + "\"; break;";