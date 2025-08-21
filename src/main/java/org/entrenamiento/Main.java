package org.entrenamiento;

import java.util.List;

import org.entrenamiento.poo.Empleado;
import org.entrenamiento.poo.Estudiante;
import org.entrenamiento.poo.Persona;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = List.of(
            new Empleado("Juan", 30, 2500.0),
            new Estudiante("Ana", 22, "Ingeniería Informática"),
            new Empleado("Pedro", 40, 3000.0),
            new Estudiante("Lucía", 20, "Biología"),
            new Empleado("María", 35, 2800.0),
            new Estudiante("Carlos", 21, "Matemáticas"),
            new Empleado("Laura", 28, 3200.0),
            new Estudiante("Sofía", 19, "Biología")
        );

        for (Persona persona : personas) {
            persona.presentarse();
            if (persona instanceof Empleado empleado) {
                System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
            } else if (persona instanceof Estudiante estudiante) {
                estudiante.estudiar();
            }
            System.out.println();
        }

    }
}