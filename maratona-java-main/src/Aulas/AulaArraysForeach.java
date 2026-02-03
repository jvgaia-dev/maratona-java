package Aulas;

public class AulaArraysForeach {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int um = 1;
        int dois = 2;
        int tres = 3;
        int quatro = 4;
        int cinco = 5;
        //or
        int [] numeros2 = {1,2,3,4,5};
        //or
        int [] numeros3 = new int[]{1,2,3,4,5};


        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
       }
        for (int num: numeros2 ) {
            System.out.println(num);
        }//opçao de for simplificada
     }
}
