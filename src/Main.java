//incluir dados iniciais dos clientes
// Nome: Lenize Malheiros
// Tipo conta: Corrente
// Saldo inicial: R$ 2500,00
// Operações:
// 1- Consultar saldo (Apresentar o saldo inicial)
// 2- Receber valor (+ somar valor depositado)
// 3- Transferir valor (- diminuir valor transferido)
// 4- sair
// Digite a opção desejada:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double saldoinicial = 2500;
                int operacao;
                String nome = "Lenize Malheiros";
                String tipoConta = "Corrente";

                System.out.println("*****************************");
                System.out.println("\nNome do cliente: " + nome);
                System.out.println("Tipo de conta: " + tipoConta);
                System.out.println("\n*****************************");

                do {

                    System.out.println("Escolha uma das opções abaixo:");
                    System.out.println("1- Consultar saldo");
                    System.out.println("2- Receber valor");
                    System.out.println("3- Transferir valor");
                    System.out.println("4- Sair");
                    System.out.println("Digite a operação desejada:");

                    operacao = scanner.nextInt();

                    switch (operacao) {
                        case 1:
                            System.out.println("Seu saldo é: " + saldoinicial);
                            break;
                        case 2:
                            System.out.println("Digite o valor que será recebido: ");
                            double valorRecebido = scanner.nextDouble();
                            saldoinicial += valorRecebido;
                            System.out.println("Saldo atual R$: " + saldoinicial);
                            break;
                        case 3:
                            System.out.println("Digite o valor que será transferido: ");
                            double valorTransferido = scanner.nextDouble();
                            if (valorTransferido > saldoinicial) {
                                System.out.println("Saldo insuficiente para a transferência.");
                            } else {
                                saldoinicial -= valorTransferido;
                                System.out.println("Saldo atual: R$ " + saldoinicial);
                            }
                            break;
                        case 4:
                            System.out.println("Obrigada por usar nosso sistema, volte sempre!");
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (operacao != 4);

                scanner.close();
            }
        }

