import models.Encrypt;


public class App {
    public static void main(String[] args){
        Encrypt encryptWord = new Encrypt();
        System.out.println(encryptWord.encryptInput("tom"));
    }
}
