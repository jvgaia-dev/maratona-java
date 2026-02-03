package javacore.Classes.test;

import javacore.Classes.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Gaia";
        estudante.sexo = 'M';
        estudante.idade = 21;
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("-------------");

        estudante2.idade = 24;
        estudante2.sexo = 'F';
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
