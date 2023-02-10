package com.kawahedukasi.tugas.week3.statements;

import java.util.Scanner;

public class flowStatements {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void daysAndWeekDay() {

        System.out.print("Masukkan Hari : ");
        String day = scanner.nextLine().toLowerCase();
        if (day.equals("sabtu") || day.equals("minggu")) System.out.println("Hari istirahat Perminggu");
        if (day.equals("senin") || day.equals("selasa") || day.equals("rabu") || day.equals("kamis") || day.equals("jumat")) {

            System.out.print("Hari ini tanggal merah ? (true or false) : ");
            boolean isLibur = scanner.nextBoolean();
            if (isLibur) System.out.println("Hari libur nasional");

            else System.out.println("Hari Kerja");

        } else {
            System.out.println("Bukan bagian dari hari");
        }

    }

    public static void kawahEdukasiLoop() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("KawahEdukasi");
            else if (i % 3 == 0) System.out.println("Kawah");
            else if (i % 5 == 0) System.out.println("Edukasi");
            else System.out.println(i);
        }
    }
}
