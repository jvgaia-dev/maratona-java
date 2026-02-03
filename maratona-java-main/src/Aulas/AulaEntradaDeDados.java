package Aulas;

import java.util.Scanner;

public class AulaEntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();//nexLine para ler a linha inteira caso necessario
        System.out.println("Voce digitou: "+x);

        sc.close();

    }
}
