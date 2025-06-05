import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        int somaDoisLados = lado1 + lado2;

        var verificacao = somaDoisLados > lado3 ? "Os lados podem formar um triângulo." : "Não pode ser formado";

        System.out.println(verificacao);

    }
}
