package Ejercicio4;

public abstract class VehiculoMotor extends Vehiculo{
    private String tipoMotor;
    private int numMarchas;

    public VehiculoMotor(String tipoMotor, int numMarchas){
        this.tipoMotor = tipoMotor;
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTipo de motor: " + tipoMotor +
                "\nNumero de marchas: " + numMarchas;
    }
}
