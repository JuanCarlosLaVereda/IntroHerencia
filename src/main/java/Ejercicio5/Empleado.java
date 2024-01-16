package Ejercicio5;

public abstract class Empleado {
    private String dni;
    private String apellidos;
    private String nombre;
    private String direccion;
    private int anyosAntiguo;
    private int telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int telefono, double salario, Empleado supervisor){
        this.anyosAntiguo = 0;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public String getDni() {
        return dni;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public int getAnyosAntiguo() {
        return anyosAntiguo;
    }
    public int getTelefono() {
        return telefono;
    }
    protected Empleado getSupervisor() {
        return supervisor;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract boolean cambiarSupervisor(Empleado supervisor);
    public abstract void incrementarSalario();

    @Override
    public String toString(){
        return "\nDNI: " + dni +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nDireccion: " + direccion +
                "\nAños de antiguedad: " + anyosAntiguo +
                "\nTelefono: " + telefono +
                "\nSalario: " + salario +
                "\nSupervisor: " + supervisor.getNombre();
    }
}
