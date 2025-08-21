package org.entrenamiento.poo;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(this.getNombre() + " está estudiando " + carrera + ".");
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Estoy estudiando " + carrera + ".");
    }

}
