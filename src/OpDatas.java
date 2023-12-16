import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class OpDatas {

    public static void main(String[] args) {

        // Data em Java é representada basicamente como um número (long)
        // que indica quantos milissegundos se passaram desde 01/01/1970

        // Obtendo a data atual
        Date dataAtual = new Date(); 
        System.out.println(dataAtual.getTime()); // Obtendo o tempo em milissegundos
        System.out.println(dataAtual); // Imprimindo a data atual diretamente

        // Formatando a data atual usando SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(dataAtual));

        // Obtendo o dia no ano usando SimpleDateFormat
        SimpleDateFormat sdf2 = new SimpleDateFormat("D");
        System.out.println(sdf2.format(dataAtual));

        // Obtendo uma instância de um calendário
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // Configurando o calendário com a data atual
        cal.setTime(new Date());

        // Obtendo dia, mês e ano do calendário
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH) + 1; // O mês é baseado em zero, então adicionamos 1
        int ano = cal.get(Calendar.YEAR);

        System.out.println(dia + "/" + mes + "/" + ano);

        // Alterando o ano de uma data (da mesma forma outros campos podem ser manipulados)
        cal.set(Calendar.YEAR, 2023);
        System.out.println(cal.toInstant().toString());

        // Manipulações de datas
        cal.add(Calendar.MONTH, 1); // Adiciona 1 mês
        cal.add(Calendar.DATE, -7); // Subtrai 7 dias
        System.out.println(cal.toInstant().toString());
    }
}
/*
Explicações:

Obtenção da Data Atual:

Date dataAtual = new Date();: Cria uma instância da classe Date representando a data e hora atuais.
Formatando a Data:

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");: Cria um formato para exibir a data de maneira formatada.
Obtendo o Dia no Ano:

SimpleDateFormat sdf2 = new SimpleDateFormat("D");: Cria um formato para obter o dia no ano.
Obtendo uma Instância de Calendário:

Calendar cal = Calendar.getInstance();: Cria uma instância do objeto Calendar.
Configurando o Calendário com a Data Atual:

cal.setTime(new Date());: Configura o objeto Calendar com a data atual.
Obtendo Dia, Mês e Ano do Calendário:

cal.get(Calendar.DATE), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR): Obtém o dia, mês e ano do objeto Calendar.
Alterando o Ano do Calendário:

cal.set(Calendar.YEAR, 2023);: Altera o ano do objeto Calendar para 2023.
Manipulações de Datas no Calendário:

cal.add(Calendar.MONTH, 1);: Adiciona 1 mês ao objeto Calendar.
cal.add(Calendar.DATE, -7);: Subtrai 7 dias do objeto Calendar.
*/