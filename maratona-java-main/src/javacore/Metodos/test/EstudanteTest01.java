package javacore.Metodos.test;

import javacore.Metodos.dominio.Estudante;
import javacore.Metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
    Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    ImpressoraEstudante impressora = new ImpressoraEstudante();

    estudante01.nome = "theo";
    estudante01.idade = 5;
    estudante01.sexo = 'M';

    estudante02.nome = "Juliette";
    estudante02.idade = 5;
    estudante02.sexo = 'F';



    impressora.imprime(estudante01);
    impressora.imprime(estudante02);
    }
}
