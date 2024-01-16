package Ejercicio5;

public class Secretario extends Empleado{
    private String despacho;
    private int numFax;
    private static final double INCRMENTO = 0.15;

    public Secretario(String nombre, String apellidos, String dni, String direccion, int telefono, double salario, Empleado supervisor, String despacho, int numFax){
        super(nombre, apellidos, dni, direccion, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public String getDespacho() {
        return despacho;
    }
    public int getNumFax() {
        return numFax;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if (!(supervisor instanceof Secretario || supervisor instanceof JefeZona)){
            return false;
        }
        super.setSupervisor(supervisor);
        return true;
    }

    @Override
    public void incrementarSalario(){
        setSalario(getSalario()+(getSalario()*INCRMENTO));
    }

    @Override
    public String toString(){
        return "-----Secretario-----" + super.toString() +
                "\nDespacho: " + despacho +
                "\nNumero de fax: " + numFax;
    }
}
