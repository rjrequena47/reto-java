package org.entrenamiento.poo;

public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Double calcularSalarioAnual() {
        return salario * 12;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Mi salario es " + salario + ".");
    }

}
