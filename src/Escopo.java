// Definindo a classe Escopo
class Escopo {

    // Método privado que exibe o preço final
    private static void exibirPrecoFinal(float paramPreco) {
        System.out.println("Preço final: " + paramPreco);
    }

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {

        // Declarando e inicializando variáveis
        int idade = 70;
        float preco = 200;

        // Verificando condição usando o operador lógico || (ou)
        if (idade >= 60 || preco < 30) {
            // Declarando e inicializando variável local dentro do bloco condicional
            float precoComDesconto = preco / 100 * 90;
            System.out.println("Desconto de " + (preco - precoComDesconto));
            preco = precoComDesconto; // Atualizando o valor da variável preco dentro do bloco condicional
        }

        // Chamando o método exibirPrecoFinal e passando o valor atualizado de preco como argumento
        exibirPrecoFinal(preco);

    }
}
/* Explicações:

exibirPrecoFinal: Um método privado que aceita um parâmetro paramPreco do tipo float e imprime o preço final.

main: O método principal que serve como ponto de entrada do programa.

Variáveis:

idade: Uma variável do tipo int inicializada com o valor 70.
preco: Uma variável do tipo float inicializada com o valor 200.
Condição if:

Verifica se a idade é maior ou igual a 60 OU se o preço é menor que 30.
Se a condição for verdadeira, um desconto de 10% é aplicado ao preço e a variável preco é atualizada.
exibirPrecoFinal(preco): Chama o método exibirPrecoFinal passando o valor atualizado de preco como argumento.

Este código ilustra como as variáveis têm escopo local dentro de blocos, como o bloco condicional if neste caso. 
Variáveis declaradas dentro desse bloco só são acessíveis dentro dele. O método exibirPrecoFinal e as variáveis 
idade e preco têm um escopo mais amplo, sendo acessíveis em todo o método main.*/