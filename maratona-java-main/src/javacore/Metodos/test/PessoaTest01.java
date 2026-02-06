package javacore.Metodos.test;

import javacore.Metodos.dominio.Pessoa;
import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o seu nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.println("digite a sua idade: ");
        pessoa.setIdade(sc.nextInt());
        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
