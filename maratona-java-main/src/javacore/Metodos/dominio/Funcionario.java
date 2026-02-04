package javacore.Metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprime () {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double ss : salario){
            System.out.print(ss + " ");
        }
        System.out.println("\nmedia salario = " + mediaSalario());
    }

    public double mediaSalario(){
        double soma = 0;
        for (double s : salario) {
            soma += s;
        }
        return soma /= salario.length;
    }
}