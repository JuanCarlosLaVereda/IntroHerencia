package Ejercicio5;

import javax.swing.plaf.PanelUI;

public class JefeZona extends Empleado{
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;
    private static final double INCREMENTO = 0.5;

    public JefeZona(String nombre, String apellidos, String dni, String direccion, int telefono, double salario, Empleado supervisor, String despacho, Secretario secretario, Vendedor[] vendedores, Coche coche){
        super(nombre, apellidos, dni, direccion, telefono, salario, supervisor);
        this.despacho = despacho;
        this.coche = coche;
        this.secretario = secretario;
        this.vendedores = vendedores;
    }

    public String getDespacho() {
        return despacho;
    }
    public Coche getCoche() {
        return coche;
    }
    public Secretario getSecretario() {
        return secretario;
    }
    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }
    public void cambiarSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if (!(supervisor instanceof JefeZona)){
            return false;
        }
        super.setSupervisor(supervisor);
        return true;
    }

    @Override
    public void incrementarSalario(){
        setSalario(getSalario()+(getSalario()*INCREMENTO));
    }

    @Override
    public String toString(){
        return "-----JefeZona----" + super.toString() +
                "\nDespacho: " + despacho +
                "\nSecretario personal: " + secretario +
                coche;
    }

}
