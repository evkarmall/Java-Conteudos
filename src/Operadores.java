public class Operadores {
public static void main(String[] args) {

    System.out.println("Trabalhando com Operações Aritméticas");

    // Soma
    int num1 = 200, num2 = 325;
    int num3 = 100 + 200 + num1 + num2;
    num3 = num3 + num1;
    System.out.println(num3);

    // Subtração
    byte subtracao = 15 - 120;
    System.out.println(subtracao);

    // Multiplicação
    long resultado1 = num1 * 30000000000000L;
    System.out.println(resultado1);

    // Divisão
    int num4 = 9, num5 = 2;

    // Como o dividendo é inteiro, o quociente será inteiro
    int resultado2 = num4 / num5;
    System.out.println("Resultado da divisão: " + resultado2);

    // Desta forma podemos obter o resto da divisão
    // através do operador de módulo
    int resto = num4 % num5;
    System.out.println("Resto da divisão: " + resto);

    // Se quisermos o quociente em ponto flutuante
    // podemos converter o dividendo para float
    float num6 = 9, num7 = 2;
    float resultadoEmFloat = num6 / num7;
    System.out.println(resultadoEmFloat);
}
}
/*
Explicações:

Soma:
int num1 = 200, num2 = 325;: Declara duas variáveis inteiras.
int num3 = 100 + 200 + num1 + num2;: Realiza uma série de somas.
num3 = num3 + num1;: Adiciona novamente o valor de num1 a num3.
System.out.println(num3);: Imprime o resultado.

Subtração:
byte subtracao = 15 - 120;: Declara uma variável byte e realiza uma subtração.
System.out.println(subtracao);: Imprime o resultado.

Multiplicação:
long resultado1 = num1 * 30000000000000L;: Realiza uma multiplicação, garantindo que o literal seja interpretado como um long.
System.out.println(resultado1);: Imprime o resultado.

Divisão:
int resultado2 = num4 / num5;: Realiza uma divisão entre dois inteiros, resultando em um quociente inteiro.
System.out.println("Resultado da divisão: " + resultado2);: Imprime o resultado.

Resto da Divisão:
int resto = num4 % num5;: Calcula o resto da divisão usando o operador de módulo.
System.out.println("Resto da divisão: " + resto);: Imprime o resultado.

Divisão em Ponto Flutuante:
float num6 = 9, num7 = 2;: Declara duas variáveis float.
float resultadoEmFloat = num6 / num7;: Realiza a divisão, resultando em um quociente em ponto flutuante.
System.out.println(resultadoEmFloat);: Imprime o resultado.
*/