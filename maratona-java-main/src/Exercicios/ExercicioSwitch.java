package Exercicios;

public class ExercicioSwitch {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("dom Final de semana");
                break;
            case 2:
                System.out.println("seg dia util");
                break;
            case 3:
                System.out.println("ter dia util");
                break;
            case 4:
                System.out.println("qua dia util");
                break;
            case 5:
                System.out.println("qui dia util");
                break;
            case 6:
                System.out.println("sex dia util");
                break;
            case 7:
                System.out.println("sab Final de semana");
                break;
            default:
                System.out.println("dia invalido");
                break;
        }

    }
}
