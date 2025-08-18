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

    public Double potencia(Double base, Double exponente){
        return Math.pow(base, exponente);
    }

    public Double raizCuadrada(Double numero){
        if(numero < 0){
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero);
    }

    public Double modulo(Double a, Double b){
        if(b == 0){
            throw new ArithmeticException("No se permite el módulo con divisor cero");
        }
        return a % b;
    }
}
