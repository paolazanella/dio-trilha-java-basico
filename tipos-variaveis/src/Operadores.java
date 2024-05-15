public class Operadores {

    public static void main(String[] args) {
        
        String nomeCompleto = "LINGUAGEM" + "JAVA";/// junta as duas palavras troando uma so 
        System.out.println(nomeCompleto);


         // Operadores Aritméticos
         int soma = 5 + 3; // Adição: soma = 8
         int subtracao = 7 - 4; // Subtração: subtracao = 3
         int multiplicacao = 2 * 6; // Multiplicação: multiplicacao = 12
         int divisao = 10 / 2; // Divisão: divisao = 5
         int resto = 10 % 3; // Módulo (resto da divisão): resto = 1
 
         // Operadores de Atribuição
         int valor = 10;
         valor += 5; // Adição e atribuição: valor = valor + 5 = 15
         valor -= 3; // Subtração e atribuição: valor = valor - 3 = 12
         valor *= 2; // Multiplicação e atribuição: valor = valor * 2 = 24
         valor /= 4; // Divisão e atribuição: valor = valor / 4 = 6
         valor %= 2; // Módulo e atribuição: valor = valor % 2 = 0
 
         // Operadores de Comparação
         boolean igual = (5 == 5); // Igual a: verdadeiro
         boolean diferente = (7 != 5); // Diferente de: verdadeiro
         boolean menorQue = (3 < 8); // Menor que: verdadeiro
         boolean maiorQue = (6 > 4); // Maior que: verdadeiro
         boolean menorOuIgual = (4 <= 4); // Menor ou igual a: verdadeiro
         boolean maiorOuIgual = (9 >= 10); // Maior ou igual a: falso
 
         // Operadores Lógicos
         boolean and = (true && false); // E lógico (AND): falso
         boolean or = (true || false); // Ou lógico (OR): verdadeiro
         boolean not = !true; // Negação lógica (NOT): falso
 
         // Operadores de Incremento/Decremento
         int numero = 5;
         numero++; // Incremento: numero = 6
         numero--; // Decremento: numero = 5
 
         // Operadores de Bitwise
         int a = 5; // Representado em binário: 101
         int b = 3; // Representado em binário: 011
         int andBitwise = a & b; // AND bitwise: 001 (1)
         int orBitwise = a | b; // OR bitwise: 111 (7)
         int xorBitwise = a ^ b; // XOR bitwise: 110 (6)
         int notBitwise = ~a; // NOT bitwise: 11111111111111111111111111111010 (-6)
         int deslocamentoEsquerda = a << 1; // Deslocamento para a esquerda: 1010 (10)
         int deslocamentoDireita = a >> 1; // Deslocamento para a direita: 10 (2)
         int deslocamentoDireitaSemPreenchimento = a >>> 1; // Deslocamento para a direita sem preenchimento de sinal: 10 (2)
 
         // Operador Ternário
         int idade = 20;
         String status = (idade >= 18) ? "Adulto" : "Menor"; // Se idade for maior ou igual a 18, retorna "Adulto", senão retorna "Menor"
 
         // Operadores de Instância e de Tipo
         String texto = "Exemplo";
         boolean ehString = (texto instanceof String); // Verifica se 'texto' é uma instância da classe String

    }
    
}
