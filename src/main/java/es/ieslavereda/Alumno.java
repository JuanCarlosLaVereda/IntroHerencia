package es.ieslavereda;

public class Alumno extends Persona {
    private int NIA;
    private Grado curso;

    public Alumno(String dni, String nombre, String apellidos, int edad, int NIA, Grado curso){
        super(dni, nombre, apellidos, edad);
        this.curso = curso;
        this.NIA = NIA;
    }

    public Alumno(String dni, String nombre, String apellidos, int edad, Grado curso){
        super(dni, nombre, apellidos, edad);
        this.curso = curso;
        this.NIA = generateNIA();
    }

    private int generateNIA(){
        return (int)(Math.random()*100000000);
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Alumno imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString() + "\nNIA: " + NIA + "\nGrado: " + curso;
    }
}
