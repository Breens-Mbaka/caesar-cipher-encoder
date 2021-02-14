package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    //testing for input to be a string
    @Test
    void testEncrypt_inputIsString_String() {
        Encrypt testEncrypt = new Encrypt();
        String exampleOutput = "";
        assertEquals(exampleOutput, testEncrypt.encryptInput(""));
    }

    //testing for output should be right when given input
    @Test
    void testEncrypt_outputGiven() {
        Encrypt testEncrypt = new Encrypt();
        String exampleOutput = "wrp";
        assertEquals(exampleOutput, testEncrypt.encryptInput("tom"));
    }

    @Test
    void testDecrypt_inputGiven() {
        Encrypt testDecrypt = new Encrypt();
        String exampleOutput = "tom";
        assertEquals(exampleOutput, testDecrypt.decrypt("wrp"));
    }
}