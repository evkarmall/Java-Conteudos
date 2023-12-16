import java.util.Date;
import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class RepDatas {

    public static void main(String[] args) {

        // Obtendo a data atual usando o pacote Date
        Date dataAtual = new Date();
        String mensagem = String.format("Hoje é %tD", dataAtual);
        System.out.println("\nData com o Pacote Date:");
        System.out.println(mensagem);

        // Obtendo a data atual usando LocalDate
        LocalDate myObj = LocalDate.now(); 
        System.out.println("\nData Atual do Sistema com LocalDate:");
        System.out.println(myObj); 

        // Obtendo a data atual usando LocalDateTime antes da formatação
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("\nData Atual do Sistema com LocalDateTime Antes da Formatação:");
        System.out.println(myDateObj);

        // Formatando a data usando DateTimeFormatter
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("\nData Atual do Sistema com LocalDateTime Depois da Formatação:");
        System.out.println(formattedDate);

        // Calculando o tempo entre duas ações
        System.out.println("\nCalculando a Diferença Entre Datas:");
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            
            Thread.sleep(5*60*10);
            
            System.out.println(new Date( ) + "\n");
            
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("A diferença é : " + diff + " milissegundos");
         } catch (Exception e) {
            System.out.println("Ocorreu algum problema!");
         }
    }   
}
/*
Explicações:

Pacote Date:
Date dataAtual = new Date();: Cria uma instância da classe Date representando a data e hora atuais.

LocalDate:
LocalDate myObj = LocalDate.now();: Obtém a data atual usando LocalDate.

LocalDateTime:
LocalDateTime myDateObj = LocalDateTime.now();: Obtém a data e hora atuais usando LocalDateTime antes da formatação.

DateTimeFormatter:
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");: Cria um formato para a data e hora.
String formattedDate = myDateObj.format(myFormatObj);: Formata a data e hora usando o formato definido.

Calculando a Diferença Entre Datas:
Usa System.currentTimeMillis() para obter o tempo atual em milissegundos.
Usa Thread.sleep para simular uma pausa de 5 minutos.
Calcula a diferença entre o início e o fim do intervalo de tempo.
*/