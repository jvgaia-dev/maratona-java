package Aulas;

public class AulaArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] dias = new int[3] [3];
        dias [0][0] = 5;
        dias [0][1] = 11;
        dias [0][2] = 20;

        dias [1][0] = 10;
        dias [1][1] = 15;
        dias [1][2] = 30;

        dias [2][0] = 12;
        dias [2][1] = 18;
        dias [2][2] = 28;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------");
        for (int[] arrBase : dias){
            for (int num : arrBase ){
                System.out.println(num);

            }
        }
    }
}
