package Aulas;

public class AulaArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{0, 9, 8, 7, 6, 9};

        int[][] arrayInt2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10, 11}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
