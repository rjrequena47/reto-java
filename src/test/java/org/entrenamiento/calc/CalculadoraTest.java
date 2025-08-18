package org.entrenamiento.calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar((double)5, (double)3);
        assertEquals(8.0, resultado, "La suma debe ser correcta");
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar((double)10, (double)4);
        assertEquals(6.0, resultado, "La resta debe ser correcta");
    }

    @Test
    void testDivisionCorrecta() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir((double)10, (double)2);
        assertEquals(5.0, resultado, "La división debe ser correcta");
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        // Esperamos que lance ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir((double)10, (double)0);
        }, "Debe lanzar excepción al dividir entre cero");
    }

    @Test
    void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar((double)5, (double)3);
        assertEquals(15.0, resultado, "La multiplicación debe ser correcta");
    }
}
