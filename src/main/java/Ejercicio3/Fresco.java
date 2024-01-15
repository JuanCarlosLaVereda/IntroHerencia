package Ejercicio3;

import java.time.LocalDate;

public class Fresco extends Producto{
    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public Fresco(LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen){
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void envioProducto(String direccion){
        System.out.println("Envio del producto por camion normal a " + direccion);
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString(){
        return "-----ProductoFresco-----" + super.toString() +
                "\nFecha de envasado: " + fechaEnvasado +
                "\nPais de origen: " + paisOrigen;
    }
}
