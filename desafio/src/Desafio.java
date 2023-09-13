import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*******************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: "+ tipoConta);
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("\n*******************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir vaor
                3 - Receber valor
                4 - Sair
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("O saldo atualizado é " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor de transferência? ");
                    double valorTransferencia = scanner.nextDouble();
                    if(valorTransferencia>saldo)
                        System.out.println("Não há saldo para tranferência");
                    else
                        saldo -=valorTransferencia;
                    System.out.println("Novo saldo: "+ saldo);
                    break;
                case 3:
                    System.out.println("Valor recebido: ");
                    double valorRecebido = scanner.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Novo saldo: " + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;

            }

        }


    }
}
