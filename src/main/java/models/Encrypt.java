package models;

public class Encrypt {
    private int key;
    private String input;
    private String output;

    public Encrypt(int key, String input, String output) {
        this.key = key;
        this.input = input;
        this.output = output;
    }


    public String encryptInput(String userInput) {
        return userInput;
    }

}
