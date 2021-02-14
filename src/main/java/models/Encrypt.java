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

        char[] arrayOfLetters = userInput.toCharArray();
        for (char letter: arrayOfLetters) {
            for (int index=0 ; index < alphabets.length; index++) {
                if(alphabets[index].equals(letter)){
                    int indexForEncryptedLetter = (index + key)%26;
                    String encryptedLetter = alphabets[indexForEncryptedLetter];
                    List<String> encryptedWord = new ArrayList<>();
                    encryptedWord.add(encryptedLetter);
                    String fullyEncrypted = encryptedWord.toString();
                     output = fullyEncrypted;
                }
            }
        }
        return output;
    }
}
