import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LeituraDados analise = new LeituraDados();
        Scanner leitor = new Scanner(System.in);
        Integer dados;
        do {

        System.out.println("Quantos arquivos deseja realizar a leitura?");
        dados = leitor.nextInt();

        if(!analise.receberDados(dados)) {
            System.out.println("Quantidade inválida!\n");
        }
        } while (!analise.receberDados(dados));

        if(analise.receberDados(dados)) {
            analise.statusArquivo(dados);
        }



    }
}
