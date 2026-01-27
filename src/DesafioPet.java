import java.util.Scanner;

public class DesafioPet {

    private final static Scanner scanner = new Scanner(System.in);

    private static final MaquinaBanho maquinaBanho = new MaquinaBanho();

    public static void executar() {
        scanner.useDelimiter("\\n");


        var opcao = -1;

        do {
            System.out.println(" Escolha uma das opções:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verificar agua da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1 -> maquinaBanho.DarBanho();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> exibirQuantidadeWater();
                case 5 -> exibirQuantidadeShampoo();
                case 6 -> verificarSeTemPetNaMaquina();
                case 7 -> setPetNaMaquina();
                case 8 -> maquinaBanho.removePet();
                case 9 -> maquinaBanho.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }
        }
        while (true);
    }


    private static void setWater() {
        System.out.println("Tentando colocar água na maquina");
        maquinaBanho.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na maquina");
        maquinaBanho.addShampoo();
    }

    private static void exibirQuantidadeShampoo() {
        var quantidadeWater = maquinaBanho.getShampoo();
        System.out.println("A máquina está no momento com " + quantidadeWater + " litro(s) de shampoo");
    }

    private static void exibirQuantidadeWater() {
        var quantidadeShampoo = maquinaBanho.getWater();
        System.out.println("A máquina está no momento com " + quantidadeShampoo + " litro(s) de água");
    }

    private static void verificarSeTemPetNaMaquina() {
        var hasPet = maquinaBanho.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Não tem pet na maquina");
    }

    public static void setPetNaMaquina() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.next();
        }
        var pet = new Pet(name);
        maquinaBanho.setPet(pet);

    }
}

