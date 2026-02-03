package Aulas;

public class AulaEstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador ternario
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
