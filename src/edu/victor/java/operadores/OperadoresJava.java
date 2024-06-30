package edu.victor.java.operadores;

public class OperadoresJava {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1); // Com uma soma em expressão ( ), ele consegue concatenar o caracter com o resultado da expressão
        System.out.println(concatenacao);
        //Ao identificar texto em uma operação artimética, o java automaticamente entende como concatenção. Isso faz comque quebre a lógica de soma
    }
}