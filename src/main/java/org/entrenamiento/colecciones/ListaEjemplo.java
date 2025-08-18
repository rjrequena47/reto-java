package org.entrenamiento.colecciones;

import java.util.ArrayList;
import java.util.List;

public class ListaEjemplo {

    public List<String> crearLista() {
        List<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        return lista;
    }

    public String obtenerElemento(List<String> lista, int index){
        return lista.get(index);
    }

    public int obtenerTamaño(List<String> lista) {
        return lista.size();
    }

}
