public class Precedencia {
    public static void main(String[] args) {
        System.out.println("Trabalhando com Precedência de Operadores");

        // Ordem de precedência:
        // () primeiro
        // Multiplicação e divisão
        // Resto
        // Adição e subtração
        // Atribuição

        // Exemplos:

        System.out.println(1 + 2 * 3);  // Resultado: 7
        // A multiplicação (2 * 3) é realizada primeiro, seguida da adição.

        System.out.println((1 + 2) * 3);  // Resultado: 9
        // As operações dentro dos parênteses são realizadas primeiro.

        System.out.println(3 + 5 - 2);  // Resultado: 6
        // A adição e a subtração são realizadas da esquerda para a direita.

        System.out.println(3 - 3 + 1 * 10);  // Resultado: 10
        // A multiplicação (1 * 10) é realizada primeiro, seguida da subtração e adição.
    }
}
/*
Explicações:

Ordem de Precedência:

A ordem de precedência dos operadores em Java é importante para determinar a sequência correta de execução das operações.
Exemplos:

System.out.println(1 + 2 * 3);: A multiplicação (2 * 3) é realizada primeiro, seguida da adição. Resultado: 7.
System.out.println((1 + 2) * 3);: As operações dentro dos parênteses são realizadas primeiro. Resultado: 9.
System.out.println(3 + 5 - 2);: A adição e a subtração são realizadas da esquerda para a direita. Resultado: 6.
System.out.println(3 - 3 + 1 * 10);: A multiplicação (1 * 10) é realizada primeiro, seguida da subtração e adição. Resultado: 10.
*/