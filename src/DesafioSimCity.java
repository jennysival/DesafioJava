import java.util.Scanner;

public class DesafioSimCity {
    static String nome;
    static String profissao;
    static int vetorSalarios[] = new int[12];
    
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
        System.out.println("2. Meus Salários e Impostos");
        System.out.println("3. Sair");

        System.out.println("\nDigite apenas o número da opção escolhida:");
        int numSelecionado = leitor.nextInt();
        

        if(numSelecionado == 1){
            NomeProfissa();
        }
        else if(numSelecionado == 2){
            SalariosImpostos();
        }
        else if(numSelecionado == 3){
            System.exit(0);
        }
        else{
            System.out.println("Número digitado não corresponde aos disponíveis no menu, por favor comece novamente.");
        }
        
    }

    public static void NomeProfissa(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Selecionado: Meus Dados");
        System.out.println("-----------------------");
        
        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Cadastrar dados");
        System.out.println("2. Visualizar dados cadastrados");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenuDados = leitor.nextInt();

        if(opcMenuDados == 1){
            System.out.println("Qual o seu nome? ");
        nome = leitor.next();

        System.out.println("Qual a sua profissão? ");
        profissao = leitor.next();

        System.out.println("------------------------------");
        System.out.println("Dados Cadastrados com sucesso!");
        }

        else if(opcMenuDados == 2){
            System.out.println("Dados Cadastrados: ");
            System.out.println("Nome: "+nome);
            System.out.println("Profissão: "+profissao);
        }
        
        System.out.println("-----------------------------");
        System.out.println("\nO que deseja acessar agora?");
        menuPrincipal();
    }

    public static void SalariosImpostos(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Selecionado: Meus Salários e Impostos");
        System.out.println("-------------------------------------");

        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Cadastrar salários");
        System.out.println("2. Visualizar salários");
        System.out.println("3. Calcular impostos");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenuDados = leitor.nextInt();

        if(opcMenuDados == 1){
            for(int i = 0; i < 12; i++){
                int mes = i+1;
                System.out.println("Digite seu salário líquido do mês "+mes+" (em numero):");
                vetorSalarios[i] = leitor.nextInt();
            }
            System.out.println("---------------------------------");
            System.out.println("Salários Cadastrados com sucesso!");
        }

        else if(opcMenuDados == 2){
            System.out.println("Salários cadastrados: ");
            for(int i = 0; i < 12;  i++){
                int mes = i+1;
                System.out.println(mes+": "+vetorSalarios[i]);
            }
        }

        else if(opcMenuDados == 3){

        }

        System.out.println("-----------------------------");
        System.out.println("\nO que deseja acessar agora?");
        menuPrincipal();
    }
}
