package Aulas;

import java.util.Scanner;

public class AulaEntradaDeDados04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        x = sc.next().charAt(0);
        System.out.println(x);

        sc.close();
    }
}
