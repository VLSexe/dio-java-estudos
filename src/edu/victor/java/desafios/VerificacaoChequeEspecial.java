package edu.victor.java.desafios;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            String result = (saque < saldo+limiteChequeEspecial) ? "Transacao realizada com sucesso utilizando o cheque especial." : "Transacao nao realizada. Limite do cheque especial excedido.";
            System.out.println(result);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}