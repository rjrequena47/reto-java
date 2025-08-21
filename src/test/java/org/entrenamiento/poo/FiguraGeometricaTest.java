package org.entrenamiento.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FiguraGeometricaTest {

    @Test
    void TestCalcularAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        double area = rectangulo.calcularArea();
        assertEquals(50.0, area, 0.0001);
    }

    @Test
    void TestCalcularAreaCirculo() {
        Circulo circulo = new Circulo(7);
        double area = circulo.calcularArea();
        assertEquals(Math.PI * 49, area, 0.0001);
    }

}
