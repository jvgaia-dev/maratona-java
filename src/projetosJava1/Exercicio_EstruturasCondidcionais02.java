package projetosJava1;

public class Exercicio_EstruturasCondidcionais02 {
    public static void main(String[] args) {
        int idade = 18;
        if(idade < 15){
            System.out.println("categoria infantil");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("Cateoria juvenil");
        }else {
            System.out.println("Categoria adulto");
        }
    }
}
