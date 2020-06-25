package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class ExercicioFinal {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);


        LocalDateTime manipulado = agora.plusYears(4).plusMonths(6).plusHours(13).plusSeconds(12);

        System.out.println(manipulado);
    }

}
