import java.util.Scanner;

public class Funcoes {

    public double CalculaMedia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("KKKKKKKKKKKKKKKKK");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        return (nota1 + nota2 + nota3) / 3;
    }
}
