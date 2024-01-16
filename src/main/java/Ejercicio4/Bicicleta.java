package Ejercicio4;

public class Bicicleta extends Vehiculo{
    private String tipo;
    private static final int ACELERACION = 4;

    public Bicicleta(String tipo){
        this.tipo = tipo;
    }

    @Override
    public boolean acelerar(int unidades){
        if (unidades>ACELERACION || unidades<1){
            return false;
        }
        for (int i=0; i<unidades; i++){
            incrementarVelocidad();
        }
        return true;
    }

    @Override
    public boolean frenar(int unidades){
        if (unidades>ACELERACION || unidades<1 || super.getVelocidad()<1){
            return false;
        }
        for (int i=0; i<unidades; i++){
            if (super.getVelocidad()==0){
                return true;
            }
            super.decrementarVelocidad();
        }
        return true;
    }

    @Override
    public String toString(){
        return "-----Bicicleta-----" + super.toString() +
                "\nTipo: " + tipo;
    }
}
