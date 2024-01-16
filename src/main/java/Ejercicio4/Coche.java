package Ejercicio4;

public class Coche extends VehiculoMotor{
    private String matricula;
    private static final int ACELERACION = 80;

    public Coche (String tipoMotor, int numMarchas,String  matricula){
        super(tipoMotor, numMarchas);
        this.matricula = matricula;
    }

    @Override
    public boolean acelerar(int unidades){
        if (unidades>ACELERACION || unidades<1){
            return false;
        }
        for (int i=0; i<unidades; i++){
            super.incrementarVelocidad();
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
        return "-----Coche-----" + super.toString() +
                "\nMatricula: " + matricula;
    }
}
