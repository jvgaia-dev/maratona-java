package Revisao;

public class condicionais {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 1000000;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "joão";
        boolean bool = true;

        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (str == "joão") {
            System.out.println("João");
        } else {
            System.out.println("Falso");
        }
    }
}
