package Ejercicio4;

public abstract class Vehiculo {
    private int velocidad;

    public Vehiculo(int velocidad){
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void incrementarVelocidad(){
        velocidad++;
    }
    public void decrementarVelocidad(){
        velocidad--;
    }

    @Override
    public String toString(){
        return "\nVelocidad: " + velocidad;
    }
}
