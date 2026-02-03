package javacore.Classes.test;

import javacore.Classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "ecoSport";
        carro1.model = "default";
        carro1.year = 2018;

        carro2.name = "toro";
        carro2.model = "sport";
        carro2.year = 2021;

        System.out.println(carro1.name);
        System.out.println(carro1.model);
        System.out.println(carro1.year);

        System.out.println("------------------");

        System.out.println(carro2.name);
        System.out.println(carro2.model);
        System.out.println(carro2.year);
}
}