package models;

import java.lang.reflect.Array;

public class Encrypt {
    public String encryptInput(String userInput) {
        //find index of each letter of userInput in the standard alphabet
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] arrayOfLetters = userInput.toCharArray();
        for (char letter: arrayOfLetters) {
            String stringAlphabet = alphabet.toString();
            int indexLetter = stringAlphabet.indexOf(letter);
        }
        return userInput;
    }

}
