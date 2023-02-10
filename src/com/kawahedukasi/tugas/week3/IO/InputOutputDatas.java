package com.kawahedukasi.tugas.week3.IO;

import java.util.Scanner;

public class InputOutputDatas {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void welcome(){
        /* Buatlah program untuk input nama anda dan output kalimat
        "Selamat datang di bootcamp Kawah Edukasi, {namaAnda}"
         */
        String name = scanner.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + name);
    }
    public static void dataTypes(){
        /* Buatlah masing masing dua variable untuk data type short, double, char, dan boolean
         */
        short myAge = 21;
        short adultAge = 19;
        double myHeight = 172.5;
        double minHeight = 167.5;
        char myRank = 'B';
        char minRank = 'C';
        boolean isAdult = myAge > adultAge;
        boolean isTall = myHeight > minHeight;
        System.out.println(isAdult);
        System.out.println(isTall);
    }
    public static void learnJava(){
        /*  Buatlah 3 variable string dengan value masing-masing,
        "Saya senang" "belajar" "Java Language", lalu gabungkan dan print hasilnya.
         */
        String first = "Saya senang";
        String second = "Belajar";
        String third = "Java language";
        System.out.println(first + " " + second + " " + third);
    }
    public static void casting(){
        //Buatlah 3 contoh implentasi casting
        int intNum = 1132900;
        byte byteNum = (byte) intNum;
        Short shortNum = (short) byteNum;
        Integer integerNum = Integer.valueOf(shortNum);
    }

}
