public class OperRealAtrib {
    public static void main(String[] args) {
        System.out.println("Trabalhando com Operadores Relacionais e de Atribuição");

        // Operadores relacionais
        int x = 12, y = 6;
        System.out.println("x > y : " + (x > y));    // true
        System.out.println("x < y : " + (x < y));    // false
        System.out.println("x >= y : " + (x >= y));  // true
        System.out.println("x <= y : " + (x <= y));  // false
        System.out.println("x == y : " + (x == y));  // false
        System.out.println("x != y : " + (x != y));  // true
    
        // Operadores de atribuição
        int a = 0;
        a = a + 10;  // a recebe o valor atual de a mais 10
        System.out.println(a);  // 10
    
        a += 10;  // equivalente a: a = a + 10;
        a -= 15;  // equivalente a: a = a - 15;
        System.out.println(a);  // 5
    
        // Operador de negação
        boolean esportista = false;
        esportista = !esportista;  // inverte o valor booleano
        System.out.println(esportista);  // true (negativo de false)
    }
}
/*
Explicações:

Operadores Relacionais:

x > y, x < y, x >= y, x <= y, x == y, x != y: Realizam comparações entre x e y e imprimem os resultados.
Operadores de Atribuição:

a = a + 10: Atribui a a o valor atual de a mais 10.
a += 10: Equivalente a a = a + 10.
a -= 15: Equivalente a a = a - 15.
Imprime o valor atual de a.
Operador de Negação:

esportista = !esportista: Inverte o valor booleano de esportista.
Imprime o valor atual de esportista.
*/