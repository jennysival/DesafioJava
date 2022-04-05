import java.util.Scanner;

public class DesafioSimCity {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Seja bem-vinde ao sistema de\ncálculo de imposto de SimCity");
        System.out.println("----------------------------");
        System.out.println("\nSou Simmy, a assistente virtual de Sim City\nComo posso te ajudar?\n");

        menu();;
    }

    public static void menu(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("1. Cadastrar nome e profissão;");
        System.out.println("2. Visualizar dados cadastrados;");
        System.out.println("3. Cadastrar salários;");
        System.out.println("4. Visualizar salários cadastrados;");
        System.out.println("5. Calcular o imposto;");
        System.out.println("6. Sair;");

        System.out.println("\nDigite apenas o número da opção escolhida:");
        int numSelecionado = leitor.nextInt();
        

        if(numSelecionado == 1){
            cadNomeProfissa();
        }
        else if(numSelecionado == 6){
            System.exit(0);
        }
        else{
            System.out.println("Número digitado não corresponde aos disponíveis no menu, por favor comece novamente.");
        }
        
    }

    public static void cadNomeProfissa(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Você selecionou 1. Cadastrar nome e profissão");
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
