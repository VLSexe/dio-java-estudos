package edu.victor.java.operadores;

public class Unarios {
    public static int incrementar() {
        int numero = 5;
        System.out.println(numero ++); //Printa antes de incrementar de fato
        System.out.println(numero); //Printa o resultado incrementado
        return numero;
    }
    public static void main(String[] args) {
        System.out.println(incrementar());
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }
}
