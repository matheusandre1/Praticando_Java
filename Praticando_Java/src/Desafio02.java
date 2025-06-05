public class Desafio02 {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();

        double media = funcoes.CalculaMedia();

        String mediaFormatada = String.format("%.2f", media);


        String mensagem = "O estudante teve média ";

        if(media >= 7.0){
            System.out.println(mensagem + " " + mediaFormatada +  " e foi aprovado");
        }
        else if((media >= 5.0) && (media <= 6.9)) {
            System.out.println(mensagem + " " + mediaFormatada + " e está de recuperação");
        }
        else{
            System.out.println(mensagem + " " + mediaFormatada + " e foi reprovado.");
        }
    }

}
