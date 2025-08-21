package org.entrenamiento.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GestorEmailsTest {

    private final HashSet<String> emails = new HashSet<>(Set.of(
        "mail1@mail.com",
        "mail4@mail.com",
        "mail11@mail.com"
    ));
    private final GestorEmails gestorEmails = new GestorEmails(emails);

    @ParameterizedTest
    @CsvSource({
        "mail1@mail.com, false",
        "mail2@mail.com, true",
        "mail1@mail.com, false",
        "mail3@mail.com, true"
    })
    void testAgregarEmailSinDuplicados(String email, Boolean expected) {
        
        boolean result = gestorEmails.agregarEmail(email);
        assertEquals(expected, result);
    }

}
