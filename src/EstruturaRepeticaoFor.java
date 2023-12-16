import java.util.Scanner;

class EstruturaRepeticaoFor {

    public static void main(String[] args) {

        // Cria o scanner do terminal
        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");

        // Lê o valor digitado pelo usuário
        int num = reader.nextInt();
        reader.close();

        /*
            Para o comando for, especificar:
            1) variável de controle
            2) critério de continuação
            3) incremento (ou decremento) da variável de controle
        */
        for (int i = 1; i <= 10; i++) {

            // Condicional ternário para determinar se a tabuada deve ser criada
            String cria_tabuada = (num <= 10) ? "S" : "N";

            // Condicional convencional
            if (cria_tabuada.equals("S"))
                System.out.println(num + " * " + i + " = " + num * i);
            else 
                break;
        }
    }
}
/*
Explicações:

import java.util.Scanner;: Importa a classe Scanner para receber entrada do usuário.

Scanner reader = new Scanner(System.in);: Cria um objeto Scanner para ler a entrada do terminal.

System.out.println("Tabuada de qual número? ");: Imprime uma mensagem solicitando a entrada do número para a tabuada.

int num = reader.nextInt();: Lê o valor digitado pelo usuário e armazena na variável num.

Estrutura de Repetição for:

for (int i = 1; i <= 10; i++): Inicia a variável de controle i em 1, continua enquanto i for menor ou igual a 10, e incrementa i a cada iteração.
Condicional Ternário:

String cria_tabuada = (num <= 10) ? "S" : "N";: Usa um operador ternário para atribuir "S" se num for menor ou igual a 10, senão atribui "N".
Condicional Convencional:

if (cria_tabuada.equals("S")): Verifica se cria_tabuada é igual a "S".
Se verdadeiro, imprime a linha da tabuada.
Se falso, interrompe o loop com break.
O código usa a estrutura de repetição for para gerar a tabuada até 10 vezes (de 1 a 10) e a condicional para decidir se a tabuada deve ser criada com base no valor de num.
*/