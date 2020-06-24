package aulas.trabalhandoComDatas.javaDateFormat;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat fullDate = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss:mmm");

        String dataFullFormatada = fullDate.format(agora);

        System.out.println(dataFullFormatada);
    }
}
