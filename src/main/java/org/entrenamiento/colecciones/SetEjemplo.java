package org.entrenamiento.colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetEjemplo {

    public Set<String> crearSet() {
        Set<String> set = new HashSet<>();
        set.add("Manzana");
        set.add("Banana");
        set.add("Manzana");
        return set;
    }

    public boolean contieneElemento(Set<String> set, String valor) {
        return set.contains(valor);
    }

    public int obtenerTamaño(Set<String> set) {
        return set.size();
    }

}
