package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Encrypt {
    private int key = 3;
    private List<String> output;

    public String encryptInput(String userInput) {
        //find index of each letter of userInput in the standard alphabet
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        userInput = userInput.toLowerCase();
        String encryptedText = "";

        for (int index=0 ; index < userInput.length(); index++) {
            //finding the index of each letter of the user input using the alphabet
            int indexOfEachLetter = alphabets.indexOf(userInput.charAt(index));

            int indexForEncryptedLetter = (indexOfEachLetter + key)%26;
            char encryptedLetter = alphabets.charAt(indexForEncryptedLetter);

            //adding the encrypted letter to the encrypted text
            encryptedText = encryptedText + encryptedLetter;
        }
        return encryptedText;
    }
}
