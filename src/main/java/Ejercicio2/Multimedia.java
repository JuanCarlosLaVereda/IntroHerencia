package Ejercicio2;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Formato getFormato() {
        return formato;
    }
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString(){
        return "--------------------" +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nFormato: " + formato.getExtension() +
                "\nDuracion: " + duracion;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }

        if (!(obj instanceof Multimedia)){
            return false;
        }

        Multimedia multimedia = (Multimedia) obj;
        return multimedia.getTitulo().equals(titulo) && multimedia.getAutor().equals(autor);
    }
}
