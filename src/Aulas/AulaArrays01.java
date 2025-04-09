package Aulas;

public class AulaArrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3]; //objeto memoria com 3 espaços
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        String [] personagens = new String[3];
        personagens [0] = "Chandler Bing";
        personagens [1] = "Monica geller";
        personagens [2] = "Rachel Green";

        for (int i = 0; i < personagens.length; i++) {
            System.out.println(personagens[i]);

        }

    }
}
