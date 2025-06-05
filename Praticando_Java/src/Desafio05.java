import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double preco = scanner.nextDouble();
        double desconto = preco * 0.1;
        var verificacao = preco >= 100.0 ? "Desconto de 10% aplicado" : "Nenhum desconto aplicado.";

        double descontoaplicado = preco >= 100.0 ? preco - desconto : preco;

        System.out.println(verificacao);
        System.out.println("Valor total: " + descontoaplicado);
    }
}
