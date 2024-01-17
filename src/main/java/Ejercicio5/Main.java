package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Vendedor[] vendedores = new Vendedor[1];
        Coche c1 = new Coche("3333ZZZ", "Ford", "Focus");
        vendedores[0] = new Vendedor("Pepito", "Ruedas", "87654321X", "La otra casa", 789789789, 1000, null, c1, "La suya", null, 20);
        JefeZona j1 = new JefeZona("Xavi", "Profe", "12345677X", "Mi casa", 123123123, 5000, null, "El de Xavi", null, vendedores, c1);

        Secretario s1 = new Secretario("Pepe", "Apensab", "12345678X", "Su casa", 123456789, 3000, j1, "El de Pepe", 123);

        System.out.println(s1);
        s1.incrementarSalario();
        System.out.println(s1);
        j1.cambiarSupervisor(j1);
        System.out.println(j1);
        System.out.println(vendedores[0].cambiarSupervisor(j1));
        System.out.println(vendedores[0]);
    }
}
