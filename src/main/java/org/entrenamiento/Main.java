package org.entrenamiento;

import org.entrenamiento.calc.Calculadora;
import org.entrenamiento.ej1.Persona;
import org.entrenamiento.ej2.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar((double)5, (double)3)); // 8.0

    }
}