package javacore.Metodos.test;

import javacore.Metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("pedro");
        funcionario01.setIdade(32);
        funcionario01.setSalario(new double[] {290, 356, 500.90});

        funcionario01.imprime();
    }
}
