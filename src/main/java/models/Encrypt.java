package models;

import java.lang.reflect.Array;

public class Encrypt {
    private int key = 3;

    public String encryptInput(String userInput) {
        //find index of each letter of userInput in the standard alphabet
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] arrayOfLetters = userInput.toCharArray();
        for (char letter: arrayOfLetters) {
            String stringAlphabet = alphabet.toString();
            int indexLetter = stringAlphabet.indexOf(letter);
            //calculate index of encrypted letter in place of user input
            int encryptedLetterIndex = (indexLetter + key) % 26;
            int encryptedLetter = alphabet[encryptedLetterIndex];
        }
        return userInput;
    }

}
