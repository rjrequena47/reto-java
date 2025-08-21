package org.entrenamiento.ej3;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private Map<String, String> palabras;

    public Diccionario() {
        this.palabras = new HashMap<>();
    }

    public void agregarPalabra(String palabra, String definicion) {
        this.palabras.put(palabra, definicion);
    }

    public String obtenerDefinicion(String palabra) {
        return this.palabras.get(palabra);
    }

    public Map<String, String> getPalabras() {
        return this.palabras;
    }
}
