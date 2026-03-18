package javacore.ModificadorStatic.test;

import javacore.ModificadorStatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDI", 290);
        Carro c3 = new Carro("Mercedes", 300);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
