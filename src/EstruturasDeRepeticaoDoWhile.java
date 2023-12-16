import java.util.Scanner;

class EstruturaRepeticaoDoWhile {

    public static void main(String[] args) {

        // Declaração da variável idade
        int idade;

        /*
            O loop Do-While sempre executa o bloco de repetição ao menos 1 vez, 
            pois o teste está no FINAL.

            No caso da estrutura de repetição WHILE, o teste está no início, 
            portanto, o bloco de repetição pode não ser executado dependendo da condição.
        */

        // Cria o scanner do terminal
        Scanner reader = new Scanner(System.in);

        // Estrutura de repetição do-while
        do {
            System.out.print("Qual a sua idade? ");
            idade = reader.nextInt();

            // Verifica se a idade é negativa e imprime uma mensagem
            if (idade < 0)
                System.out.println("Por favor, digite uma idade com valor positivo!");
        } while(idade < 0); // O loop continua enquanto a idade for negativa

        // Imprime a mensagem com base na idade inserida
        System.out.println("Faltam " + (100 - idade) + " para você chegar aos 100 anos!");

        // Fecha o scanner
        reader.close();
    }
}
/*
Explicações:

import java.util.Scanner;: Importa a classe Scanner para receber entrada do usuário.

Declaração da Variável idade: int idade; - Declara a variável que será utilizada para armazenar a idade fornecida pelo usuário.

Estrutura de Repetição do-while:

do { ... } while(idade < 0); - Executa o bloco de código pelo menos uma vez e continua enquanto a condição idade < 0 for verdadeira.
Entrada de Dados:

System.out.print("Qual a sua idade? "); - Solicita ao usuário que insira a idade.
idade = reader.nextInt(); - Lê o valor digitado pelo usuário e armazena na variável idade.
Condicional if:

if (idade < 0) System.out.println("Por favor, digite uma idade com valor positivo!"); - Verifica se a idade é negativa e imprime uma mensagem caso seja.
Saída de Dados:

System.out.println("Faltam " + (100 - idade) + " para você chegar aos 100 anos!"); - Imprime a mensagem com base na idade inserida.
Fechamento do Scanner:

reader.close(); - Fecha o scanner para liberar recursos.
*/