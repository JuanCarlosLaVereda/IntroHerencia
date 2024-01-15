package Ejercicio3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fresco f1 = new Fresco(LocalDate.now().plusDays(30), 123, LocalDate.now(), "España");
        Refrigerado r1 = new Refrigerado(LocalDate.now().plusDays(30), 33, 1234567890);
        Congelado c1 = new Congelado(LocalDate.now().plusDays(30), 69, 33);

        System.out.println(f1);
        f1.envioProducto("Francia");
        System.out.println(r1);
        r1.envioProducto("Alemania");
        System.out.println(c1);
        c1.envioProducto("EEUU");
    }
}
