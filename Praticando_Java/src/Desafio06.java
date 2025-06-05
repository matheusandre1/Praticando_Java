import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = scanner.next();

        String[] diasDaSemana = { "segunda", "terca", "quarta", "quinta", "sexta"};
        boolean diaUtil = false;

        for (int i = 0; i < diasDaSemana.length; i++) {

            if(diasDaSemana[i].equalsIgnoreCase(diaDaSemana)){
                System.out.println(diaDaSemana.toUpperCase() + " é um dia útil.");
                diaUtil = true;
            }
        }

        if (!diaUtil){
            System.out.println(diaDaSemana + " não é dia útil.");
        }





    }
}
