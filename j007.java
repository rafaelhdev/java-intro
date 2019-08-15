import java.util.Scanner;

public class j007 {

    public static void main(String[] args) {
        String nomes[] = new String[10];
        System.out.println("Digite os 10 elementos, em sequência: ");
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite o " + (i + 1) + " elemento: ");
            nomes[i] = leia.next();
        }
        for (int j = 0; j <= 9; j++) {
            System.out.println(nomes[j]);
        }
    }
}
