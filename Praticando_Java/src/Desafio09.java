import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do doador (em kg): ");
        int quilos = scanner.nextInt();

        var verificacao1 = idade >= 18 && idade <= 65 && quilos >= 50 ? "Compativel" : "Não compativel";

        System.out.println(verificacao1);

        System.out.print("Motivo: ");
        if(idade < 18 || idade > 65){
            System.out.print(" Deve ter entre 18 e 65 anos.");
        }

        if(quilos < 50){
            System.out.println("Pesar mais de 50 kg.");
        }





    }
}
