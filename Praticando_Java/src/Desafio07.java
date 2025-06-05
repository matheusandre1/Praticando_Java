import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        double numero = scanner.nextDouble();

        var verificao = numero >= 1000.0 && numero <= 5000.0 ? "o valor esta disponivel" : ", não está dentro do intervalo permitido para empréstimo.";

        System.out.println("o valor de " + numero + verificao);
    }
}
