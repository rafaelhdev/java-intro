import java.util.Scanner;

public class j005 {
    public static void main(String[] args) {
        int a;
        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        System.out.println("==================");
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
