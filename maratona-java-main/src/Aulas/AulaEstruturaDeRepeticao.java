package Aulas;

import java.util.Scanner;

public class AulaEstruturaDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int x = sc.nextInt();
        while (x != 0){
            soma = soma +x;
            x = sc.nextInt();
        }
        System.out.println("soma dos valores digitados: "+soma);

        sc.close();
        }
}
