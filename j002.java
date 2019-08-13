import java.util.Scanner;

public class j002 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner Leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        a = Leia.nextInt();
        System.out.println("Digite o segundo número: ");
        b = Leia.nextInt();
        System.out.println("Digite o terceiro número: ");
        c = Leia.nextInt();
        if (a > b && a > c) {
            System.out.println("O número " + a + " é o maior deles.");
        }
            else if (b > a && b > c) {
            System.out.println("O número " + b + " é o maior deles.");
        }
            else {
                System.out.println("O número " + c + " é o maior deles.");
            }
    }
}

