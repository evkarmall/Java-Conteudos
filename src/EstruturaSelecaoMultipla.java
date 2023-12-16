import java.util.Scanner;

class EstruturaSelecaoMultipla {

    public static void main(String[] args) {

        // Inicialização de variáveis
        int ano = 2000;
        int numeroDias = 0;

        // Cria o scanner do terminal
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o número do mês de 1 a 12: ");
        int mes = reader.nextInt();

        // Estrutura de seleção múltipla switch
        switch (mes) {
            case 1:
                numeroDias = 31;
                break;
            case 2:
                // Verifica se o ano é bissexto para determinar o número de dias em fevereiro
                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    numeroDias = 29;
                else
                    numeroDias = 28;
                break;
            case 3:
                numeroDias = 31;
                break;
            case 4:
                numeroDias = 30;
                break;
            case 5:
                numeroDias = 31;
                break;
            case 6:
                numeroDias = 30;
                break;
            case 7:
                numeroDias = 31;
                break;
            case 8:
                numeroDias = 31;
                break;
            case 9:
                numeroDias = 30;
                break;
            case 10:
                numeroDias = 31;
                break;
            case 11:
                numeroDias = 30;
                break;
            case 12:
                numeroDias = 31;
                break;
        }

        // Imprime o número de dias do mês
        System.out.println("Número de dias desse mês = " + numeroDias);

        // Fecha o scanner
        reader.close();
    }
}
/*
Explicações:

Variáveis:

ano: Representa o ano (assumido como 2000 para fins de verificação de ano bissexto).
numeroDias: Armazenará o número de dias no mês.
Entrada de Dados:

System.out.println("Digite o número do mês de 1 a 12: ");: Solicita ao usuário que insira o número do mês.
int mes = reader.nextInt();: Lê o valor digitado pelo usuário e armazena na variável mes.
Estrutura de Seleção Múltipla switch:

O switch é utilizado para determinar o número de dias no mês com base no valor de mes.
Cada case representa um mês, e o código dentro de cada case é executado até encontrar um break.
Condição no Caso 2 (Fevereiro):

O caso 2 (Fevereiro) contém uma condicional para verificar se o ano é bissexto e, assim, determinar o número de dias em fevereiro.
Saída de Dados:

System.out.println("Número de dias desse mês = " + numeroDias);: Imprime o número de dias do mês calculado.
Fechamento do Scanner:

reader.close();: Fecha o scanner para liberar recursos.
*/