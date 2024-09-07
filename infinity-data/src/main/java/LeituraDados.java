import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class LeituraDados {

    String dataTratada;
    String horaTratada;

    Boolean receberDados(Integer dados) {
        Boolean dadosExistem = false;

        if(dados > 0) {
            dadosExistem = true;
        }

        return dadosExistem;
    }

    String lerData() {
        LocalDate dia = LocalDate.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String diaTexto = dia.format(formatarData);
        dataTratada = "Não foi possível localizar a data atual";

        if(!diaTexto.isEmpty() ) {
            dataTratada = diaTexto + " ";
        }

        return dataTratada;


    }

    String lerHora() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaTexto = hora.format(formatarHora);
        horaTratada = "Não foi possível encontar o horário atual!";


        if(!horaTexto.isEmpty()) {
            horaTratada = horaTexto + " ";

        }

        return horaTratada;
    }

    void statusArquivo(Integer dados) {
        String mensagemArquivo;

        for (int i = 1; i <= dados; i++) {
        Integer parametro = ThreadLocalRandom.current().nextInt(0, dados + 1);

            mensagemArquivo = "Arquivo " + i;
            if(i < parametro) {
                mensagemArquivo += " Erro na leitura";
            } else if (parametro == i) {
                mensagemArquivo += " Arquivo corrompido";
            } else {
                mensagemArquivo += " Êxito na leitura";
            }

        //  System.out.println(parametro);
            System.out.println(lerData() + lerHora() + mensagemArquivo);
        }

    }




}
