import java.util.Scanner;

public class DesafioSimCity {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Seja bem-vinde ao sistema de\ncálculo de imposto de SimCity");
        System.out.println("----------------------------");
        System.out.println("\nSou Simmy, a assistente virtual de Sim City\nComo posso te ajudar?");

        menu();;
    }

    public static void menu(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\nDigite apenas o número da opção escolhida:\n");
        int numSelecionado = leitor.nextInt();

        if(numSelecionado == 1){
            cadNomeProfissa();
        }
        
    }

    public static void cadNomeProfissa(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Você selecionou 1 - Cadastrar Nome e Profissão");
        System.out.println("----------------------------------------------");
        
        System.out.println("Qual o seu nome? ");
        String nome = leitor.nextLine();

        System.out.println("Qual a sua profissão? ");
        String profissao = leitor.nextLine();

        System.out.println("------------------------------");
        System.out.println("Dados Cadastrados com sucesso!");
        System.out.println("------------------------------");
        System.out.println("\nO que deseja fazer agora?\n");
        menu();
    }

    public static void showNomeProfissa(){
        System.out.println("");
    }


}
