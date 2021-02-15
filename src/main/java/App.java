import models.Encrypt;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        Encrypt encryptWord = new Encrypt();
        Scanner myTerminal = new Scanner(System.in);

        System.out.println("What is the word you want to encrypt:");
        String encryptedWord = myTerminal.nextLine();
        String cipheredWord = encryptWord.encryptInput(encryptedWord);
        System.out.println("Encrypted to: " + cipheredWord);

        System.out.println("Do you want to decrypt it yes or no:");
        String chosenOption = myTerminal.nextLine().toLowerCase();
        if (chosenOption.equals("yes")) {
            String decipheredWord = encryptWord.decrypt(cipheredWord);
            System.out.println("Decrypted back to: " + decipheredWord);
        }
        else {
            return;
        }
    }
}
