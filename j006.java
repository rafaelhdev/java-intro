import java.util.Scanner;

public class j006 {

    static double potencia(double base, double pot) {
        double resultado, x;
        resultado = 0;
        x = 1;
        for (int i = 1; i <= pot; i++) {
            x = base*x;
        }
        resultado = x;
        return resultado;
    }

    public static void main(String[] args) {

        double a, b, resultado;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a base:");
        a = leia.nextDouble();
        System.out.println("Digite o expoente:");
        b = leia.nextDouble();
        resultado = potencia(a,b);
        System.out.println(resultado);

    }
}
