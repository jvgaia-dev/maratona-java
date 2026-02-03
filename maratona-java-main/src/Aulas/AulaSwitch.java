package Aulas;

public class AulaSwitch {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando domingo como o 01
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homen");
                break;
            case 'F':
                System.out.println("Mulher");
            default:
                System.out.println("invalido");
                break;
        }
    }
}
