import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Júlia Pfister";
        String tipoConta = "Corrente";
        Double saldo = 2500.00;
        int opcao = 0;
        
        System.out.println(String.format("""
                **************************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                **************************
                                        """, nome, tipoConta, saldo));
        
        String menu = """
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:
                        """;
        try (Scanner leitura = new Scanner(System.in)) {
            while (opcao != 4) {
                System.out.println(menu);
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println("O saldo atual é " + saldo);
                } else if (opcao == 2) {
                    System.out.println("Valor recebido:" );
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("O saldo atual é " + saldo);
                } else if (opcao == 3) {
                    System.out.println("Qual o valor que deseja transferir");
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valor;
                        System.out.println("Transação bem sucedida! Novo saldo: " + saldo);
                    }   
                } else if (opcao != 4) 
                    System.out.println("Operação invalida");
            }
        }                  
    }
}
