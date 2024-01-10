package es.ieslavereda;

import java.util.Arrays;

public class Profesor extends Persona{
    private Grado[] grados;

    public Profesor(String dni, String nombre, String apellidos, int edad, Grado[] grados){
        super(dni, nombre, apellidos, edad);
        this.grados = grados;
    }

    public Grado[] getGrados() {
        return grados;
    }

    public void setGrados(Grado ... grados){
        this.grados = grados;
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Profesor imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString()+"\nCursos que imparte: " + Arrays.toString(grados);
    }
}
