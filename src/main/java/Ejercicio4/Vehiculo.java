package Ejercicio4;

public abstract class Vehiculo {
    private int velocidad;

    public Vehiculo(){
        this.velocidad = 0;
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

    public abstract boolean acelerar(int unidades);
    public abstract boolean frenar(int unidades);

    @Override
    public String toString(){
        return "\nVelocidad: " + velocidad;
    }
}
