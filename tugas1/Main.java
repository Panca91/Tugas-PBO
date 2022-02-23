package tugas1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double celcius;
        int pilih = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius      : ");
        celcius = input.nextInt();

        while (pilih != 3) {
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi ");
            System.out.println("2. Edit Data Konversi ");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    konversi convert = new konversi(celcius);
                    System.out.println();
                    System.out.println("Suhu Dalam Celsius      : " + celcius + "°C");
                    System.out.println("Dalam Fahrenheit        : " + convert.Fahrenhait() + "°F");
                    System.out.println("Dalam Reamur            : " + convert.Reamur() + "°R");
                    System.out.println("Dalam Kelvin            : " + convert.Kelvin() + "°K");
                    System.out.println("Kondisi Air " + convert.kondisiAir());
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.print("Suhu dalam Celcius      : ");
                    celcius = input.nextInt();
                    break;

                case 3:
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar!");
            }
        } 
    }
}
