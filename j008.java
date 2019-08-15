import java.util.Scanner;

public class j008 {
    public static void main(String[] args) {
        int n;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a ordem da matriz: ");
        n = leia.nextInt();

        int matriz1[][] = new int[n][n];
        int matriz2[][] = new int[n][n];
        int matriz3[][] = new int[n][n];

        System.out.println("====PRIMEIRA MATRIZ====");
        for (int i = 0; i<=(n-1); i++) {
            for (int j = 0; j <= (n-1); j++) {
                System.out.println("Digite o termo a" + (i + 1) + (j + 1));
                matriz1[i][j] = leia.nextInt();
            }
        }
        System.out.println("====SEGUNDA MATRIZ====");
        for (int i = 0; i<=(n-1); i++) {
            for (int j = 0; j <= (n-1); j++) {
                System.out.println("Digite o termo a" + (i + 1) + (j + 1));
                matriz2[i][j] = leia.nextInt();
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("====IMPRESSÃO====");
        for (int i = 0; i<=(n-1); i++) {
            System.out.println(" ");
            for (int j = 0; j <= (n-1); j++) {
                System.out.print(matriz3[i][j]);
                System.out.print(" ");
            }
        }
      }
  }
