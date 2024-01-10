package es.ieslavereda;

import java.util.Arrays;

public class Directivo extends Persona {
    private String cargo;
    private Grado[] grados;

    public Directivo(String dni, String nombre, String apellidos, int edad, String cargo, Grado[] grados){
        super(dni, nombre, apellidos, edad);
        this.cargo = cargo;
        this.grados = grados;
    }

    public String getCargo() {
        return cargo;
    }
    public Grado[] getGrados() {
        return grados;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Directivo imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString()+"\nCargo: " + cargo + "\nGrados: " + Arrays.toString(grados);
    }
}
