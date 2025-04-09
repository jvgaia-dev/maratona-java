package Aulas;

import java.util.Scanner;

public class AulaEntradaDeDados03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        System.out.println("Voce digitou: "+x);

        sc.close();
    }
}
