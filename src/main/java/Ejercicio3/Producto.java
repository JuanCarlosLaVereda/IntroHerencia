package Ejercicio3;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;

    public Producto(LocalDate fechaCaducidad, int numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public int getNumeroLote() {
        return numeroLote;
    }
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public abstract void envioProducto(String direccion);

    @Override
    public String toString(){
        return "\nFecha de caducidad: " + fechaCaducidad +
                "\nNumero de lote: " + numeroLote;
    }
}
