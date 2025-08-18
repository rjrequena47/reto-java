package org.entrenamiento.calc;

public class Calculadora {
    public Double sumar(Double a, Double b){
        return a+b;
    }

    public Double restar(Double a, Double b){
        return a-b;
    }

    public Double dividir(Double a, Double b){
        if(b == 0){
            throw new ArithmeticException("No se permite la división entre cero");
        }
        return a/b;
    }

    public Double multiplicar(Double a, Double b){
        return a * b;
    }
}
