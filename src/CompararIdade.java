import java.util.Scanner;

public class CompararIdade {
    public static void comparandoIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: \n");
        String nome1 = scanner.next();
        System.out.println("Informe sua idade: \n");
        int idade1 = scanner.nextInt();
        System.out.println("Informe seu nome:\n");
        String nome2 = scanner.next();
        System.out.println("Informe sua idade:\n");
        int idade2 = scanner.nextInt();
        int dif = idade1 - idade2;
        System.out.printf("A diferença de idade é: %s ", dif);
    }
}
