package org.entrenamiento.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CursoTest {

    private final Curso curso = new Curso("Matemáticas", List.of("Alice", "Bob"));

    @ParameterizedTest
    @CsvSource({
        "Alice, true",
        "Charlie, false"
    })
    void testExisteEstudiante(String estudiante, Boolean expected) {
        assertEquals(expected, curso.existeEstudiante(estudiante));
    }

    @Test
    void testAgregarEstudiante() {
        curso.agregarEstudiante("Charlie");
        assertTrue(curso.existeEstudiante("Charlie"));
    }

    @Test
    void esDuplicado() {
        curso.agregarEstudiante("Alice");
        assertTrue(curso.existeEstudiante("Alice"));
    }


}
