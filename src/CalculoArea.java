import java.util.Scanner;

// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.


public class CalculoArea {
    public static void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um lado:");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A area do quadrado é: %s \n", area);
    }
}

