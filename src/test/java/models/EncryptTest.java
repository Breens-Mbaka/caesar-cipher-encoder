package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
    void testEncrypt_inputIsString_String() {
        Encrypt testEncrypt = new Encrypt();
        String exampleInput = "tom";
        assertEquals(exampleInput, testEncrypt.encryptInput("tom"));
    }
}