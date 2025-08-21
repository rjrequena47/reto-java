package org.entrenamiento.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testEmpleadoHeredaDePersona() {
        Empleado empleado = new Empleado("Juan", 30, 2500.0);
        assertTrue(empleado instanceof Persona);
        assert empleado.getNombre().equals("Juan");
        assert empleado.getEdad() == 30;
        assert empleado.getSalario() == 2500.0;
        empleado.presentarse();
    }

    @Test
    void testPolimorfismoPresentarse() {
        Persona empleado = new Empleado("Pedro", 40, 3000.0);
        Persona estudiante = new Estudiante("Ana", 22, "Ingeniería Informática");
        
        assertTrue(empleado instanceof Empleado);
        assertTrue(estudiante instanceof Estudiante);

        empleado.presentarse();
        estudiante.presentarse();

        if (empleado instanceof Empleado emp) {
            assertEquals(36000.0, emp.calcularSalarioAnual());
        }
        if (estudiante instanceof Estudiante est) {
            est.estudiar();
        }
    }

}
