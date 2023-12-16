import java.util.Scanner;

class EstruturaCondicional {

    public static void main(String[] args) {

        // Cria o scanner do terminal
        Scanner reader = new Scanner(System.in);

        // Imprime mensagem no terminal
        System.out.println("Qual a sua idade? ");

        // Leitura do valor digitado
        int idade = reader.nextInt();
        reader.close();

        // Condicional
        if (idade < 0) {
            System.out.println("Idade inválida");
            System.out.println("Tente novamente");
        } else if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade < 18) {
            System.out.println("Voto opcional");
        } else if (idade < 65) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto opcional");
        }
    }
}
/*
Explicações:

import java.util.Scanner;: Importa a classe Scanner para receber entrada do usuário.

Scanner reader = new Scanner(System.in);: Cria um objeto Scanner para ler a entrada do terminal.

System.out.println("Qual a sua idade? ");: Imprime uma mensagem solicitando a entrada da idade.

int idade = reader.nextInt();: Lê o valor digitado pelo usuário e armazena na variável idade.

reader.close();: Fecha o scanner para liberar recursos.

Estrutura Condicional:

Verifica se a idade é negativa e imprime uma mensagem se for o caso.
Se a idade for menor que 16, imprime "Não pode votar".
Se a idade for menor que 18, imprime "Voto opcional".
Se a idade for menor que 65, imprime "Voto obrigatório".
Caso contrário, imprime "Voto opcional".
Esse programa usa uma série de declarações if-else encadeadas para determinar a mensagem a ser exibida com base na idade fornecida pelo usuário.
*/