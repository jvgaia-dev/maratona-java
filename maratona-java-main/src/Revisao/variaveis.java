package Revisao;

import java.sql.SQLOutput;

public class variaveis {
    public static void main(String[] args) {
        String nome = "joão";
        String profissao = "Engenheiro de Software";
        char sexo = 'M';
        int idade = 22;
        Boolean sabeProgramar = false;
        int soma = 10 + 20;

        //delcarar var sem declarar um tipo especifico
        var nomeVarivel = "teste";

        //atribuir outro valor para uma var
        nome = "gaia";

        System.out.println(nome);
        System.out.println("10 + 20 = " + soma);
    }
}
