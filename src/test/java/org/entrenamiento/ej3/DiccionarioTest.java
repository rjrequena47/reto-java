package org.entrenamiento.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiccionarioTest {

    private final Diccionario diccionario = new Diccionario();

    @Test
    void testAgregarYObtenerPalabra() {
        diccionario.agregarPalabra("Java", "Lenguaje de programación");
        assertEquals("Lenguaje de programación", diccionario.obtenerDefinicion("Java"));
    }

    @Test
    void testObtenerPalabraInexistente() {
        assertEquals(null, diccionario.obtenerDefinicion("Python"));
    }

    @Test
    void testGetPalabras() {
        diccionario.agregarPalabra("Java", "Lenguaje de programación");
        diccionario.agregarPalabra("Python", "Otro lenguaje de programación");
        assertEquals(2, diccionario.getPalabras().size());
    }

}
