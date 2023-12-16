class ManipStrings {

    public static void main(String[] args) {

        // Declarando e atribuindo valor a variável do tipo String
        String texto = "Quem não sabe para onde vai qualquer caminho serve!";

        // Obtendo o comprimento de uma String
        System.out.println(String.format("%s tem %d letras", texto, texto.length()));

        // Obtendo um caractere de uma String em uma posição específica
        char letra = texto.charAt(9);
        System.out.println(letra);

        // Obtendo uma sub-String de uma String
        String palavra = texto.substring(37, 44);
        System.out.println(palavra);

        // Dividindo (separando) conteúdo de uma String
        String nomes = "Bob,Ted,Maria,Roberto,Silvia";
        String[] arrayNomes = nomes.split(",");
        for(String nome : arrayNomes)
            System.out.println(nome);

        // Convertendo para maiúsculo
        System.out.println("dsa é incrível!!!".toUpperCase());

        // Procurando a primeira ocorrência de uma substring em uma String
        int primeiraOcorrencia = texto.indexOf("er");
        System.out.println(primeiraOcorrencia);

        // Procurando a última ocorrência de uma substring em uma String
        int ultimaOcorrencia = texto.lastIndexOf("er");
        System.out.println(ultimaOcorrencia);

        // Verificando se uma String possui uma substring
        System.out.println(texto.contains("sabe"));
        System.out.println(texto.contains("araraquara"));

        // Substituindo caracteres e realizando encadeamento
        String frase = "analytics-visualizacao-relatorios-tomada-decisao"
                .replace('-',' ')
                .replaceAll(" ","  ")
                .replaceFirst("analytics","ANALYTICS");

        System.out.println(frase);
    }
}
/*
Explicações:

Comprimento da String:

texto.length(): Obtém o comprimento da string e o imprime usando String.format.
Caractere em Posição Específica:

texto.charAt(9): Obtém o caractere na posição 9 da string.
Sub-String:

texto.substring(37, 44): Obtém uma sub-string a partir do índice 37 até o índice 44.
Divisão de String:

nomes.split(","): Divide a string nomes em um array usando a vírgula como delimitador e imprime os elementos.
Conversão para Maiúsculo:

"dsa é incrível!!!".toUpperCase(): Converte a string para maiúsculo.
Procura de Substring:

texto.indexOf("er"): Encontra a posição da primeira ocorrência da substring "er".
texto.lastIndexOf("er"): Encontra a posição da última ocorrência da substring "er".
Verificação de Substring:

texto.contains("sabe"): Verifica se a string contém a substring "sabe".
texto.contains("araraquara"): Verifica se a string contém a substring "araraquara".
Substituição de Caracteres e Encadeamento:

Encadeamento de métodos para substituir caracteres e realizar operações de substituição em uma string.
*/