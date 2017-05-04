package com.huni.generators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decoder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String output = "";
        String input = reader.readLine();
        String[] split = input.split("(?<=\\G.{12})");
        loop: {
            for (String s : split) {
                switch (s) {
                    case "sldflsdwwesa": output += "H"; break;
                    case "sdasethyrgdf": output += "e"; break;
                    case "sadklasfkkrf": output += "l"; break;
                    case "sad4e5t3w32e": output += "o"; break;
                    case "64885erklgfs": output += " "; break;
                    case "e9r9er9fosfа": output += "w"; break;
                    case "e55tjjkjkwej": output += "r"; break;
                    case "q23e435wldas": output += "d"; break;
                    case "kdsfksdkfkk6": output += "!"; break;

                    default:
                        System.out.println("Не возможно расшифрование!");
                        output = "";
                        break loop;
                }
            }
        }
        System.out.print(output);
    }
}
