package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Multimedia m1 = new Multimedia("Apensab", "Yo", Formato.WAV, 100000);
        Multimedia m2 = new Multimedia("Apensab_Animada", "Yo", Formato.WAV, 333333);

        System.out.println(m1);

        Pelicula p1 = new Pelicula(m1.getTitulo(), m1.getAutor(), m1.getFormato(), m1.getDuracion(), "Tu Padre", "Tu Madre");
        Pelicula p2 = new Pelicula(m2.getTitulo(), m2.getAutor(), m2.getFormato(), m2.getDuracion());
        Disco d1 = new Disco("Me puedes repetir ese numerin?", "Fernando Alonso", Formato.DVD, 3333, "SIHOMBRE");


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(d1);
    }
}
