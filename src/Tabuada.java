import java.util.Scanner;

public class Tabuada {
    public static void calculo() {
        for(int i = 1; i <= 10 && i != 10; ++i) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: \n");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; ++i) {
            int resultado = num * i;
            System.out.printf("%s x %s = %s \n", num, i, resultado);
        }

    }
}