public class TiposVariaveis {
/*
*   TIPOS PRIMITIVOS 
*      int: Representa números inteiros.
*      double: Representa números de ponto flutuante (com precisão dupla).
*      float: Representa números de ponto flutuante (com precisão simples).
*      boolean: Representa valores booleanos (verdadeiro ou falso).
*      char: Representa um único caractere Unicode.
*      byte: Representa números inteiros de 8 bits.
*      short: Representa números inteiros de 16 bits.
*      long: Representa números inteiros longos.
*
*   Variáveis normais são aquelas que podem ter seus valores alterados durante a execução do código.
*   Variáveis constantes são aquelas cujos valores não podem ser alterados após serem definidos.
*   As constantes são identificadas pela palavra-chave 'final' no início e são geralmente escritas em caixa alta.
 */
    
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;

        short numeroCurto = 1; // Variável normal, pois pode ser mudada durante a execução do código
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        int numero = 5;

        numero = 10; // Alterando o valor da variável normal 'numero'
        System.out.print(numero); // Imprime o valor da variável 'numero'

        final double VALOR_DE_PI = 3.14; /// Constante, essa variável não pode ser alterada no código


         // Tipos primitivos
         int idade = 25; // Declaração de uma variável do tipo inteiro para armazenar a idade
         double altura = 1.75; // Declaração de uma variável do tipo double para armazenar a altura
         boolean ehEstudante = true; // Declaração de uma variável do tipo boolean para indicar se a pessoa é estudante
         
         // String
         String nome = "João"; // Declaração de uma variável do tipo String para armazenar o nome
         String sobrenome = "Silva"; // Declaração de uma variável do tipo String para armazenar o sobrenome
         
         // Exibindo os valores
         System.out.println("Nome: " + nome + " " + sobrenome); // Imprime o nome completo
         System.out.println("Idade: " + idade); // Imprime a idade
         System.out.println("Altura: " + altura); // Imprime a altura
         System.out.println("É estudante? " + ehEstudante); // Imprime se é estudante ou não
    }
}

