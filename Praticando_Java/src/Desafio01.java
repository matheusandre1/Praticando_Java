import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        var verification = number % 2 == 0 ? "par" : "ímpar";

        System.out.println("O número " + number + " é " + verification +".");
    }
}
