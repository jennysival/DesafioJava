import java.util.Scanner;

public class ComStaticDesafioSimCity {
    static String nome;
    static String profissao;
    static double vetorSalarios[] = new double[12];
    
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Seja bem-vinde ao sistema de\ncálculo de imposto de SimCity");
        System.out.println("----------------------------");
        System.out.println("\nSou Simmy, a assistente virtual de Sim City\nO que deseja acessar?\n");

        menuPrincipal();
    }

    public static void menuPrincipal(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("1. Meus Dados");
        System.out.println("2. Meus Salários");
        System.out.println("3. Meus Impostos");
        System.out.println("4. Sair");

        System.out.println("\nDigite apenas o número da opção escolhida:");
        int numSelecionado = leitor.nextInt();
        

        if(numSelecionado == 1){
            NomeProfissa();
        }
        else if(numSelecionado == 2){
            Salarios();
        }
        else if(numSelecionado == 3){
            calculoImpostos();
        }
        else if(numSelecionado == 4){
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
        System.out.println("3. Voltar");
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

        else if(opcMenuDados == 3){
            menuPrincipal();
        }
        else{
            System.out.println("Seleção inválida, tente novamente");
            NomeProfissa();
        }
        
        System.out.println("-----------------------------");
        System.out.println("\nO que deseja acessar agora?");
        menuPrincipal();
    }

    public static void Salarios(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Selecionado: Meus Salários");
        System.out.println("--------------------------");

        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Cadastrar salários");
        System.out.println("2. Visualizar salários");
        System.out.println("3. Voltar");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenuDados = leitor.nextInt();

        if(opcMenuDados == 1){
            for(int i = 0; i < 12; i++){
                int mes = i+1;
                System.out.println("Digite seu salário líquido do mês "+mes+" (ex: 1200,00):");
                vetorSalarios[i] = leitor.nextDouble();
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
            menuPrincipal();
        }
        else{
            System.out.println("Seleção Inválida, tente novamente");
            Salarios();
        }

        System.out.println("-----------------------------");
        System.out.println("\nO que deseja acessar agora?");
        menuPrincipal();
    }

    public static void calculoImpostos(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Selecionado: Meus Impostos");
        System.out.println("--------------------------");
        
        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Calcular Impostos");
        System.out.println("2. Voltar");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenuDados = leitor.nextInt();

        if(opcMenuDados == 1){

            System.out.println("Os impostos referentes à cada mês são: ");
            for(int i = 0; i < 12; i++){
                int mes = i+1;
                if(vetorSalarios[i] >= 0 & vetorSalarios[i] <= 2000){
                    System.out.println("Mês "+mes+": Isento de Imposto.");
                }
                else if(vetorSalarios[i] >= 2001 & vetorSalarios[i] <= 3000){
                    Double calculo = (vetorSalarios[i]*8)/100;
                    System.out.println("Mês "+mes+": 8% de Imposto = "+calculo);
                }
                else if(vetorSalarios[i] >= 3001.00 & vetorSalarios[i] <= 4500){
                    Double calculo = (vetorSalarios[i]*18)/100;
                    System.out.println("Mês "+mes+": 18% de Imposto = "+calculo);
                }
                else{
                    Double calculo = (vetorSalarios[i]*28)/100;
                    System.out.println("Mês "+mes+": 28% de Imposto = "+calculo);
                }
            }

        }
        else if(opcMenuDados == 2){
            menuPrincipal();
        }
        else{
            System.out.println("Seleção inválida, tente novamente");
            calculoImpostos();
        }
    }

}
