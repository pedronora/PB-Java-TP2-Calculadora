import java.util.Scanner;

public class Calculadora {
    private static Scanner scan;

    public static void main(String[] args) throws Exception {
        System.out.println("---- CALCULADORA -----");

        scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nEscolha a operação que deseja realizar:\n");
            System.out.println("\t[1] Somar");
            System.out.println("\t[2] Subtrair");
            System.out.println("\t[3] Dividir");
            System.out.println("\t[4] Multiplicar");
            System.out.println("\t[0] para SAIR");

            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Somar();
                    break;

                case 2:
                    Subtrair();
                    break;

                case 3:
                    Dividir();
                    break;

                case 4:
                    Multiplicar();
                    break;

                case 0:
                    System.out.println("Calculaora encerrada!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scan.close();

    }

    private static float[] Numeros() {

        float[] numeros = new float[2];

        System.out.print("Informe o primeiro número: ");
        numeros[0] = scan.nextFloat();
        System.out.print("Informe o segundo número: ");
        numeros[1] = scan.nextFloat();

        return numeros;
    }

    private static void Somar() {
        System.out.println("\n----- SOMAR -----");

        float[] nums = Numeros();
        float n1 = nums[0];
        float n2 = nums[1];

        System.out.println("\nO resultado da soma de " + n1 + " + " + n2 + " é " + (n1 + n2));
    }

    private static void Subtrair() {
        System.out.println("\n----- SUBTRAIR -----");

        float[] nums = Numeros();
        float n1 = nums[0];
        float n2 = nums[1];

        System.out.println("\nO resultado da subtração de " + n1 + " - " + n2 + " é " + (n1 - n2));
    }

    private static void Dividir() {
        System.out.println("\n----- DIVISÃO -----");

        float[] nums = Numeros();
        float n1 = nums[0];
        float n2 = nums[1];

        if (n2 == 0) {
            System.out.println("Impossível a divisão por ZERO!\n");
        } else {
            System.out.println("\nO resultado da divisão de " + n1 + " / " + n2 + " é " + (n1 / n2));
        }
    }

    private static void Multiplicar() {
        System.out.println("\n----- MULTIPLICAÇÃO -----");

        float[] nums = Numeros();
        float n1 = nums[0];
        float n2 = nums[1];

        System.out.println("\nO resultado da multiplicação de " + n1 + " x " + n2 + " é " + (n1 * n2));
    }

}
