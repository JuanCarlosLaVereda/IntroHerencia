package Ejercicio5;

public class Vendedor extends Empleado{
    private Coche coche;
    private String areVenta;
    private String[] clientes;
    private double comision;
    private static final double INCRMENTO = 0.10;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, int telefono, double salario, Empleado supervisor, Coche coche, String areVenta, String[] clientes, double comision){
        super(nombre, apellidos, dni, direccion, telefono, salario, supervisor);
        this.areVenta = areVenta;
        this.clientes = clientes;
        this.coche = coche;
        this.comision = comision;
    }

    public Coche getCoche() {
        return coche;
    }
    public double getComision() {
        return comision;
    }
    public String getAreVenta() {
        return areVenta;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if (!(supervisor instanceof Vendedor || supervisor instanceof JefeZona)){
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
        return "------Vendedor-----" + super.toString() +
                coche.toString() +
                "\nArea de venta: " + areVenta +
                "\nComision en porcentaje: " + comision + "%";
    }
}
