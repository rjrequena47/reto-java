package org.entrenamiento.calc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(8.0, calc.sumar((double)5,(double)3));
    }

    @Test
    void testResta() {
        assertEquals(6.0, calc.restar((double)10, (double)4));
    }

    @Test
    void testDivisionCorrecta() {
        assertEquals(5.0, calc.dividir((double)10, (double)2));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> 
            calc.dividir((double)10, (double)0));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(15.0, calc.multiplicar((double)5, (double)3));
    }

    @Test
    void testPotencia() {
        assertEquals(25.0, calc.potencia((double)5, (double)2));
    }

    @Test
    void testRaizCuadrada() {
        assertEquals(3.0, calc.raizCuadrada((double)9));
    }

    @Test
    void testRaizNegativa() {
        assertThrows(IllegalArgumentException.class, () -> 
            calc.raizCuadrada((double)-10));
    }

    @Test
    void testModulo() {
        assertEquals(1.0, calc.modulo((double)9, (double)4));
    }

    
    @DisplayName("Prueba múltiple de sumas con parámetros")
    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "-3, 3, 0"
    })
    void testSumaConParametros(double a, double b, double esperado) {
        assertEquals(esperado, calc.sumar(a, b));
    }
}
