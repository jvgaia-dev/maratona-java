package javacore.Classes.test;

import javacore.Classes.dominio.Professor;

public class PofessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "eduardo";
        professor.idade = 24;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
