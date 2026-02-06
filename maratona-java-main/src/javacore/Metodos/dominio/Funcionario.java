package javacore.Metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma;


    public void imprime () {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double ss : salario){
            System.out.print(ss + " ");
        }
        System.out.println("\nmedia salario = " + mediaSalario());
    }

    public double mediaSalario(){
        for (double s : salario) {
            soma += s;
        }
        return soma /= salario.length;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario(double[] doubles) {
        return salario;
    }

    public double getSoma() {
        return soma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    //logica de negocio para que a media nao seja alterada e permaneça sempre em 0 ate ser executada
    //public void setSoma(double soma) {
    //    this.soma = soma;
    //}
}