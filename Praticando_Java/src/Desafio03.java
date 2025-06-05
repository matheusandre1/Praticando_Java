import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha : ");
        int senha = scanner.nextInt();

        var verificacao = senha == 123456 ? "Acesso Permitido!" : "Acesso Negado!";

        System.out.println(verificacao);
    }
}
