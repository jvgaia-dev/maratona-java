package Aulas;

public class AulaOperadores {
    public static void main(String[] args) {
        //Operadores Aritimetico
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 + numero01;
        System.out.println(resultado);

        int numero03 = 10;
        int numero04 = 20;
        double resultado2 = numero03 * numero04;
        System.out.println(resultado2);

        int numero05 = 10;
        int numero06 = 20;
        double resultado3 = numero05 / (double) numero06;
        System.out.println(resultado3);

        int resto = 21 % 7;
        System.out.println(resto);

        //Operadores Relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("dez maior que vinte "+isDezMaiorQueVinte);
        System.out.println("dez menor que vinte "+isDezMenorQueVinte);
        System.out.println("dez igual a vinte "+isDezIgualVinte);
        System.out.println("dez igual a dez "+isDezIgualDez);
        System.out.println("dez diferente de dez "+isDezDiferenteDez);
        System.out.println("dez diferente de vinte "+isDezDiferenteVinte);

        //Operadores Logicos && (AND) || (OR) ! (NOT)
        int idade = 30;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Dentro da lei maior que trinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que trinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorNintendoSwitch = 2100f;
        boolean isNintendoSwitchCompravel = valorTotalContaCorrente > valorNintendoSwitch || valorTotalContaPoupanca > valorNintendoSwitch;

        System.out.println("Nintendo switch compravel "+ isNintendoSwitchCompravel);

        //Operadores de atribuição = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //Extra (operadores de atribuição)
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
