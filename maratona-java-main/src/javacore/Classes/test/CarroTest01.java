package javacore.Classes.test;

import javacore.Classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "ecoSport";
        carro1.modelo = "default";
        carro1.ano = 2018;

        carro2.name = "toro";
        carro2.modelo = "sport";
        carro2.ano = 2021;

        System.out.println(carro1.name);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("------------------");

        System.out.println(carro2.name);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
}
}