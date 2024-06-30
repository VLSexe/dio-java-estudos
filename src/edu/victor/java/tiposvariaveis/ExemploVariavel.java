package edu.victor.java.tiposvariaveis;

public class ExemploVariavel {
    public static void main(String[] args) {
        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        String NOME = "Victor";
        //Neste caso, a convencao em NOME não impede de ser um valor constante.
        NOME = "Valor Alterado"; //Retornará: "Lopes"

        final String NOMEFINAL = "Victor Lopes";
        //NOMEFINAL = "teste"; //Esta linha irá apresentar erro, pois o prefixo "final" garante que o valor seja uma constante

        System.out.println(numero);
        System.out.println(NOME);
        System.out.println(NOMEFINAL);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double VALOR_DE_PI = 3.14;

        //TODO: DESCOMENTE PARA VERIFICAR ERRO
        //VALOR_DE_PI=3.15; c
    }
}