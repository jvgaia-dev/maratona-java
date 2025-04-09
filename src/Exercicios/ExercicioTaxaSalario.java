package Exercicios;
//calcular taxa anual de um determinado salario
public class ExercicioTaxaSalario {
    public static void main(String[] args) {
        double salarioAnual, taxa1, taxa2, taxa3;
        salarioAnual = 35472;
        taxa1 = 9.48 / 100;
        taxa2 = 37.07 / 100;
        taxa3 = 49.5 / 100;
        String taxaAnual;

        if (salarioAnual <= 35472){
            taxaAnual = "Será aplicada uma taxa de 9.48% que é igual a "+ (salarioAnual*taxa1) +" do seu salario";
        } else if (salarioAnual >= 35473 && salarioAnual <= 69399){
            taxaAnual = "Será aplicada uma taxa de 37.07% que é igual a "+ (salarioAnual*taxa2) +" do seu salario";
        } else {
            taxaAnual = "Será aplicada uma taxa de 49.50% que é igual a "+ (salarioAnual*taxa3) +" do seu salario";
        }
        System.out.println(taxaAnual);
    }
}
