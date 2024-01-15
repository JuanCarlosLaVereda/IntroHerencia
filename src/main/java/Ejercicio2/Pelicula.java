package Ejercicio2;

public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;
    private static final String ANIMACION = "Animacion";
    public Pelicula (String titulo, String autor, Formato formato, int duracion, String actor, String actriz){
        this(titulo, autor, formato, duracion);
        if (!(actor == null && actriz == null)){
            this.actriz = actriz;
            this.actor = actor;
        }

    }

    public Pelicula(String titulo, String autor, Formato formato, int duracion){
        super(titulo, autor, formato, duracion);
        this.actor = ANIMACION;
        this.actriz = ANIMACION;
    }

    public String getActor() {
        return actor;
    }
    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString(){
        if (actor.equals(ANIMACION)){
            return "-----Pelicula----" + super.toString() +
                    "\nSin actores";
        }
        return "------Pelicula---------" + super.toString() +
                "\nActor: " + actor +
                "\nActriz: " + actriz;
    }
}
