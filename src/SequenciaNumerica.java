import java.util.Scanner;

/* Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com
a seleção inicial) no intervalo de números informados, incluindo os números informados.
 */

public class SequenciaNumerica {
    public static void calcularSequencia() {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: \n");
        var primeiroNum = scanner.nextInt();
        System.out.println("Digite o segundo numero: \n");

        var ultimoNum = scanner.nextInt();
        if (ultimoNum < primeiroNum) {
            System.out.printf("Digite um numero maior de %s", primeiroNum);
            System.out.println("Digite o segundo numero: \n");
            ultimoNum = scanner.nextInt();
        }
        System.out.println("Escolha: Par ou Impar: \n");

        var escolha = scanner.next();
        escolha = escolha.toLowerCase();


        var inter = primeiroNum;


        while (inter <= ultimoNum) {
            var resto = inter % 2;
            if (escolha.equals("par")) {
                if (resto == 0) {
                    System.out.printf("%s, ", inter);
                }
            } else {
                if (resto > 0) {
                    System.out.printf(String.valueOf(inter));
                }
            }
            inter = inter + 1;

        }
    }
}