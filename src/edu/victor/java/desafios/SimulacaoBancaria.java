package edu.victor.java.desafios;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;


        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int deposito = scanner.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+ saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    int saque = scanner.nextInt();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    saldo = saldo - saque;
                    System.out.println("Saldo atual: "+ saldo);
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}