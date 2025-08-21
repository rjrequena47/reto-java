package org.entrenamiento.ej3;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<String> estudiantes;

    public Curso(String nombre, List<String> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>(estudiantes);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(String estudiante) {
        this.estudiantes.add(estudiante);
    }

    public Boolean existeEstudiante(String estudiante) {
        return this.estudiantes.contains(estudiante);
    }
}


