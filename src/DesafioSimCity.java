import java.util.Scanner;

public class DesafioSimCity {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Seja bem-vinde ao sistema de\ncálculo de imposto de SimCity");
        System.out.println("----------------------------");
        System.out.println("\nSou Simmy, a assistente virtual de Sim City\nO que deseja acessar?\n");

        menuPrincipal();;
    }

    public static void menuPrincipal(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("1. Meus Dados");
        System.out.println("2. Meus salários e Impostos");
        System.out.println("3. Sair");

        System.out.println("\nDigite apenas o número da opção escolhida:");
        int numSelecionado = leitor.nextInt();
        

        if(numSelecionado == 1){
            cadNomeProfissa();
        }
        else if(numSelecionado == 2){
            showNomeProfissa();
        }
        else if(numSelecionado == 3){
            System.exit(0);
        }
        else{
            System.out.println("Número digitado não corresponde aos disponíveis no menu, por favor comece novamente.");
        }
        
    }

    public static void cadNomeProfissa(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("1. Cadastrar nome e profissão");
        System.out.println("-----------------------------");
        
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
        System.out.println("2. Visualizar dados cadastrados");
        System.out.println("-------------------------------");
        System.out.println("\n");
    }

    public static void cadSalarios(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("3. Cadastrar salários");
        System.out.println("---------------------");
        
        int vetorSalarios[] = new int[12];

        for(int i = 0; i < 12; i++){
            int mes = i+1;
            System.out.println("Digite seu salário líquido do mês "+mes+" (em numero):");
            vetorSalarios[i] = leitor.nextInt();
        }
        System.out.println("---------------------------------");
        System.out.println("Salários Cadastrados com sucesso!");
        System.out.println("---------------------------------");
    }
}
