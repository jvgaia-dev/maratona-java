package javacore.Metodos.test;

import javacore.Metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora divisao = new Calculadora();
        double result = divisao.divideDoiNum(10,0);
        System.out.println(result);
    }
}
