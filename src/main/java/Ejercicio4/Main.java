package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("A", 5, "3333ZZZ");
        Bicicleta b1 = new Bicicleta("BMX");

        System.out.println(c1);
        System.out.println(b1);


        System.out.println("" + c1.acelerar(33) + c1.acelerar(67) + c1.frenar(20) + b1.acelerar(3) + b1.frenar(2) + c1.frenar(100) + b1.acelerar(7));
        System.out.println(c1);
        System.out.println(b1);
    }
}
