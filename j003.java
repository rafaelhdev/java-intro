import java.util.Scanner;

public class j003 {
    public static void main(String[] args) {
        double a, b, m;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        a = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = leia.nextDouble();
        m = (a+b)/2;
        System.out.println("A média entre " + a + " e " + b + " é " + m);
    }
}
