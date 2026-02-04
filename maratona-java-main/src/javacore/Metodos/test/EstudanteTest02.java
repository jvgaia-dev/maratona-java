package javacore.Metodos.test;
import javacore.Metodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "theo";
        estudante01.idade = 5;
        estudante01.sexo = 'M';

        estudante02.nome = "Juliette";
        estudante02.idade = 5;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
