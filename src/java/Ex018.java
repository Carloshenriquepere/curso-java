package src.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex018 {

    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2023-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-21T01:30:26");
        Instant d06 = Instant.parse("2023-06-21T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        Date x1 = new Date();

        System.out.println(x1);

//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
//        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
//
//        System.out.println("d04 = " + d04.format(fmt1));
//        System.out.println("d04 = " + fmt1.format(d04));
//        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
//        System.out.println("d05 = " + d05.format(fmt1));
//        System.out.println("d05 = " + d05.format(fmt2));
//        System.out.println("d05 = " + d05.format(fmt4));
//
//        System.out.println("d06 = " + fmt3.format(d06));
//        System.out.println("d06 = " + fmt5.format(d06));

    }
}
