package com.kawahedukasi.tugas.week3.dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTest {
    public static final DateTimeFormatter firstFormatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
    public static final DateTimeFormatter secFormatter = DateTimeFormatter.ofPattern("YYYYMMdd_HHmmss");

    public static void main(String[] args) {

    }

    public static void reformatDate() {

        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 12, 9, 11, 12);
        System.out.println(firstFormatter.format(localDateTime));
        System.out.println(secFormatter.format(localDateTime));

    }

    public static void expiredDate(){

        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Tanggal saat ini : " + firstFormatter.format(currentDate));
        currentDate = currentDate.plusYears(1);
        currentDate = currentDate.plusMonths(6);
        currentDate = currentDate.plusDays(12);
        currentDate = currentDate.plusHours(3);
        currentDate = currentDate.plusMinutes(12);
        currentDate = currentDate.plusSeconds(20);
        System.out.println("Tanggal Expired : " + firstFormatter.format(currentDate));
    }
}
