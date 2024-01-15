package Ejercicio3;

import java.time.LocalDate;

public class Refrigerado extends Producto{
    private int codigoOrganismo;

    public Refrigerado(LocalDate fechaCaducidad, int numeroLote, int codigoOrganismo){
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void envioProducto(String direccion){
        System.out.println("Producto enviado con camion refrigerador a " + direccion);
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public String toString(){
        return "-----ProductoRefrigerado-------" + super.toString() +
                "\nCodigo de organismo: " + codigoOrganismo;
    }
}
