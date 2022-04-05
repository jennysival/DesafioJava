import java.util.Scanner;

public class DesafioSimCityFinal {
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
        System.out.println("2. Meus Salários e Impostos");
        System.out.println("3. Sair");

        System.out.println("\nDigite apenas o número da opção escolhida:");
        int numSelecionado = leitor.nextInt();
        

        if(numSelecionado == 1){
            meusDados();
        }
        else if(numSelecionado == 2){
            meusSalariosEImpostos();
        }
        else if(numSelecionado == 3){
            System.exit(0);
        }
        else{
            System.out.println("Seleção inválida, por favor comece novamente.");
        }}

    public static void meusDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Selecionado: Meus Dados");
        System.out.println("-----------------------");

        System.out.println("Cadastro de dados: ");

        System.out.println("Qual o seu nome? ");
        String nome = leitor.next();

        System.out.println("Qual a sua profissão? ");
        String profissao = leitor.next();

        System.out.println("------------------------------");
        System.out.println("Dados Cadastrados com sucesso!");
        System.out.println("------------------------------");

        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Visualizar dados cadastrados");
        System.out.println("2. Voltar ao menu principal");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenuDados = leitor.nextInt();

        if(opcMenuDados == 1){
        System.out.println("Dados Cadastrados: ");
        System.out.println("Nome: "+nome);
        System.out.println("Profissão: "+profissao);
        System.out.println("-------------------------");
        System.out.println("O que deseja fazer agora?");
        System.out.println("-------------------------");
        menuPrincipal();
    }

        else if(opcMenuDados == 2){
            menuPrincipal();}

        else{
        System.out.println("Seleção inválida, por favor comece novamente.");
        System.out.println("-----------------------------");
        System.out.println("\nO que deseja acessar agora?");
        menuPrincipal();}}

    public static void meusSalariosEImpostos(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Selecionado: Meus Salários e Impostos");
        System.out.println("--------------------------");

        double vetorSalarios[] = new double[12];

        System.out.println("Cadastro de salários mês a mês:");

            for(int i = 0; i < 12; i++){
                int mes = i+1;
                System.out.println("Digite seu salário líquido do mês "+mes+" (ex: 1200,00):");
                vetorSalarios[i] = leitor.nextDouble();
            }
            System.out.println("---------------------------------");
            System.out.println("Salários Cadastrados com sucesso!");
            System.out.println("---------------------------------");

        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Visualizar salários cadastrados");
        System.out.println("2. Calcular Impostos");
        System.out.println("3. Voltar ao menu principal");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenu = leitor.nextInt();

        if(opcMenu == 1){
        System.out.println("Salários cadastrados: ");
            for(int i = 0; i < 12;  i++){
                int mes = i+1;
                System.out.println(mes+": "+vetorSalarios[i]);}
        System.out.println("-------------------------");
        System.out.println("O que deseja fazer agora?");
        System.out.println("-------------------------");
        System.out.println("1. Calcular impostos");
        System.out.println("2. Voltar ao menu principal");
        System.out.println("\nDigite apenas o número da opção escolhida:");
        int opcMenu2 = leitor.nextInt();

            if(opcMenu2 == 1){
            System.out.println("-----------------");
            System.out.println("Calcular impostos");
            System.out.println("-----------------");

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
            System.out.println("-------------------------");
            System.out.println("O que deseja fazer agora?");
            System.out.println("-------------------------");
            menuPrincipal();
    }
                else if(opcMenu2 == 2){
                menuPrincipal();}

                else{
                System.out.println("Seleção inválida, por favor comece novamente.");
                System.out.println("-----------------------------");
                System.out.println("\nO que deseja acessar agora?");
                menuPrincipal();}}
        
        else if(opcMenu == 2){
        System.out.println("-----------------");
        System.out.println("Calcular impostos");
        System.out.println("-----------------");

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
            System.out.println("-------------------------");
            System.out.println("O que deseja fazer agora?");
            System.out.println("-------------------------");
            menuPrincipal();}

        else if(opcMenu == 3){
                menuPrincipal();}
        else{
                System.out.println("Seleção inválida, por favor comece novamente.");}
        }
    }
