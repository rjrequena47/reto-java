package org.entrenamiento.colecciones;

import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {

    public Map<Integer, String> crearMapa() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Perro");
        mapa.put(2, "Gato");
        mapa.put(3, "Loro");
        return mapa;
    }

    public String obtenerValor(Map<Integer, String> mapa, Integer clave) {
        return mapa.get(clave);
    }

    public int obtenerTamaño(Map<Integer, String> mapa) {
        return mapa.size();
    }

}
