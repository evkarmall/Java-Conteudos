import java.util.Scanner;

class EstruturaRepeticaoWhile {

    public static void main(String[] args) {

        // Cria o scanner do terminal
        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");

        // Lê o valor digitado pelo usuário
        int num = reader.nextInt();
        reader.close();

        // Inicializa a variável de controle
        int i = 1;

        // Estrutura de repetição while
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++; // Incrementa a variável de controle
        }

        /*
           As linhas comentadas abaixo mostram como seria feito sem usar uma estrutura de repetição:
           
           System.out.println(num + " * 1 = " + num * 1);
           System.out.println(num + " * 2 = " + num * 2);
           System.out.println(num + " * 3 = " + num * 3);
           System.out.println(num + " * 4 = " + num * 4);
           System.out.println(num + " * 5 = " + num * 5); 
        */
    }
}
/*
Explicações:

import java.util.Scanner;: Importa a classe Scanner para receber entrada do usuário.

Scanner reader = new Scanner(System.in);: Cria um objeto Scanner para ler a entrada do terminal.

System.out.println("Tabuada de qual número? ");: Imprime uma mensagem solicitando a entrada do número para a tabuada.

int num = reader.nextInt();: Lê o valor digitado pelo usuário e armazena na variável num.

Inicialização da Variável de Controle:

int i = 1;: Inicializa a variável de controle i em 1.
Estrutura de Repetição while:

while (i <= 10): Executa o bloco de código enquanto i for menor ou igual a 10.
System.out.println(num + " * " + i + " = " + num * i);: Imprime a linha da tabuada.
i++;: Incrementa a variável de controle i a cada iteração.
O código usa uma estrutura de repetição while para gerar a tabuada até 10 vezes (de 1 a 10), 
substituindo as linhas comentadas que mostram como seria feito sem usar uma estrutura de repetição.
*/