package javacore.Metodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //o nome da var pode ser outro, mas é uma boa pratica usar o mesmo nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
