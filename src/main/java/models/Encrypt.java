package models;


public class Encrypt {
    private int key = 3;


    public String encryptInput(String userInput) {
        //find index of each letter of userInput in the standard alphabet
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        userInput = userInput.toLowerCase();
        StringBuilder encryptedText = new StringBuilder();

        for (int index = 0; index < userInput.length(); index++) {
            char c = userInput.charAt(index);
            int charPosition = alphabets.indexOf(c);
            if (charPosition == -1){
                encryptedText.append(c);
            }
            else {
                //finding the index of each letter of the user input using the alphabet
                int indexOfEachLetter = alphabets.indexOf(userInput.charAt(index));
                int indexForEncryptedLetter = (indexOfEachLetter + key)%26;
                char encryptedLetter = alphabets.charAt(indexForEncryptedLetter);
                //adding the encrypted letter to the encrypted text
                encryptedText.append(encryptedLetter);
            }
        }
        return encryptedText.toString();
    }

    public String decrypt(String encryptedWord){
        //find index of each letter of userInput in the standard alphabet
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder decryptedText = new StringBuilder();

        for (int index = 0; index < encryptedWord.length(); index++) {
            char encryptedCharacter = encryptedWord.charAt(index);
            int encryptedWordPosition = alphabets.indexOf(encryptedCharacter);
            if (encryptedWordPosition == -1) {
                decryptedText.append(encryptedCharacter);
            }
            else {
                int indexOfEachLetter = alphabets.indexOf(encryptedWord.charAt(index));
                int indexForEncryptedLetter = (indexOfEachLetter - key)%26;
                char encryptedLetter = alphabets.charAt(indexForEncryptedLetter);
                //adding the encrypted letter to the encrypted text
                decryptedText.append(encryptedLetter);
            }
        }
        return decryptedText.toString();
    }
}