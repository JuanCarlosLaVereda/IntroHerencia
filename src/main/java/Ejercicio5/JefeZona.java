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

    }

}
