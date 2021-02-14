package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    @Test
    void testDecrypting_outputIsString_String() {
        Decrypt testDecrypt = new Decrypt();
        String exampleDecrypt = "";
        assertEquals(exampleDecrypt, testDecrypt.decrypt(""));
    }
}