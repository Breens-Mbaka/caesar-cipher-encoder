package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Encrypt {
    private int key = 3;
    private List<String> output;

    public String encryptInput(String userInput) {
        //find index of each letter of userInput in the standard alphabet
        String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        char[] arrayOfLetters = userInput.toCharArray();
        for (char letter: arrayOfLetters) {
            for (int index=0 ; index < alphabets.length; index++) {
                if(alphabets[index].equals(letter)){
                    int indexForEncryptedLetter = (index + key)%26;
                    String encryptedLetter = alphabets[indexForEncryptedLetter];
                    List<String> encryptedWord = new ArrayList<>();
                    encryptedWord.add(encryptedLetter);
                    return encryptedWord.toString();
                }
            }
        }
        return userInput;
    }

}
