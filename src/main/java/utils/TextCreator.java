package utils;

import java.util.Random;

public class TextCreator {
    protected static String getRandomString(int numberOfLetter) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < numberOfLetter) { // length of the random string.
            int index = (int) (rnd.nextFloat() * letters.length());
            salt.append(letters.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static String emailGenerator() {
        return getRandomString(8) + "@gmail.com";
    }

    public static String nameGenerator() {
        return  getRandomString(6) + "Name";
    }
}
