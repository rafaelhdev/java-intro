import java.util.Scanner;

public class j004 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        b = a % 2;
        if (b == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}


