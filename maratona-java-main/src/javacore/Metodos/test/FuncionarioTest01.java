package javacore.Metodos.test;

import javacore.Metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "pedro";
        funcionario01.idade = 32;
        funcionario01.salario = new double[]{290, 356, 500.90};

        funcionario01.imprime();
        //System.out.println("\nmedia salario = " + funcionario01.mediaSalario());
    }
}
