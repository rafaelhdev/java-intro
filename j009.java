import java.util.Scanner;

public class j009 {

    static double mult(double num1, double num2) {
        double resultado;
        resultado = num1*num2;
        return resultado;
    }

    public static void main(String[] args) {
        double a, b, operacao;

        System.out.println("====CALCULADORA====");
        System.out.println("Selecione a operação desejada na lista abaixo:");
        System.out.println("[1] Multiplicação");
        System.out.println("[2] Divisão");
        System.out.println("[3] Subtração");
        System.out.println("[4] Adição");

        Scanner leia = new Scanner(System.in);
        operacao = leia.nextDouble();

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Crie o segundo número: ");
        b = leia.nextInt();

    }
}

