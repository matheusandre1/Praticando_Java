import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        boolean acesso = false;
        int[] niveisPermissao = {1,2,3};

        for (int i = 0; i < niveisPermissao.length; i++)
        {
            if(nivelPermissao == niveisPermissao[i]){
                acesso = true;
            }
        }
        var verificacao = codigoAcesso == 2023 && acesso ? "Acesso permitido. Bem-vindo ao sistema!" : "Acesso Negado";

        System.out.println(verificacao);
    }
}
