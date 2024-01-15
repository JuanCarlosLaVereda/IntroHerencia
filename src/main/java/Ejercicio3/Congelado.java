package Ejercicio3;

import java.time.LocalDate;

public class Congelado extends Producto{
    private int tempRecomendada;

    public Congelado(LocalDate fechaCaducidad, int numeroLote, int tempRecomendada){
        super(fechaCaducidad, numeroLote);
        this.tempRecomendada = tempRecomendada;
    }

    @Override
    public void envioProducto(String direccion){
        System.out.println("Producto enviado en camion con congelador a " + direccion);
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    @Override
    public String toString(){
        return "------ProductoCongelado------" + super.toString() +
                "\nTemperatura recomendada: " + tempRecomendada;
    }
}
