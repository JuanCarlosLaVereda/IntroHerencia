package es.ieslavereda;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Persona blanca = new Persona("1A","Blanca","Romero Cano",45);
        Alumno pepa = new Alumno("1A","Blanca","Romero Cano",34, Grado.DAM_PRIMERO);
        Directivo lluna = new Directivo("12345678X", "Lluna", "Navarro Garcia", 20, "Jefa de estudios", new Grado[]{Grado.ASIR_PRIMERO, Grado.DAM_PRIMERO});
        Profesor dulce = new Profesor("12345678X", "Lluna", "Navarro Garcia", 20,new Grado[]{Grado.DAM_PRIMERO, Grado.ASIR_SEGUNDO});

        System.out.println(blanca);
        pepa.cumplirAnyos();
        System.out.println(pepa);
        System.out.println("Son iguales? " + blanca.equals(pepa));
        blanca.printDNI();
        pepa.printDNI();

        System.out.println(lluna);
        lluna.cumplirAnyos();
        System.out.println("Son iguales? " + lluna.equals(blanca));

        System.out.println(dulce);
        dulce.setGrados(Grado.SMR_SEGUNDO, Grado.SMR_PRIMERO);
        System.out.println(dulce);




    }
}
