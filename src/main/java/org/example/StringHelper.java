package org.example;

public class StringHelper {



    public static String grabLastWord(String input) {
        return input.substring(input.indexOf(' ') + 1, input.length());
    }




}
