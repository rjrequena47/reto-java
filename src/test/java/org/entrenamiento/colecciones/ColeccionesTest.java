package org.entrenamiento.colecciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ColeccionesTest {

    private final ListaEjemplo listaEjemplo = new ListaEjemplo();
    private final SetEjemplo setEjemplo = new SetEjemplo();
    private final MapEjemplo mapEjemplo = new MapEjemplo();

    @Test
    void testLista() {
        List<String> lista = listaEjemplo.crearLista();
        assertEquals(3, listaEjemplo.obtenerTamaño(lista));
        assertEquals("Rojo", listaEjemplo.obtenerElemento(lista, 0));
    }

    @Test
    void testSet() {
        Set<String> set = setEjemplo.crearSet();
        assertEquals(2, setEjemplo.obtenerTamaño(set));
        assertTrue(setEjemplo.contieneElemento(set, "Banana"));
    }

    @Test
    void testMap() {
        Map<Integer, String> mapa = mapEjemplo.crearMapa();
        assertEquals(3, mapEjemplo.obtenerTamaño(mapa));
        assertEquals("Gato", mapEjemplo.obtenerValor(mapa,2));
    }
}
