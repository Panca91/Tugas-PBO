package kuiz;

import java.util.Scanner;
import kuiz.Seleksi;

public class Main {
    public static void main(String[] args) {
        int pilih;
        char balik;
        double nilai1,nilai2,nilai3;
        int umur;
        String nama;                
        Scanner input = new Scanner(System.in); 
        
        do{
        System.out.println("+--------------------+");
        System.out.println("|  PROGRAM BEASISWA  |");
        System.out.println("+--------------------+");
        System.out.println("MENU = ");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.println("3. EXIT");
        System.out.print("pilih : "); pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
        
            case 1: 
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Nama        : "); nama = input.nextLine();
                System.out.print("Umur        : "); umur = input.nextInt();
                if(umur >= 16 && umur <= 24){
                System.out.println("Nilai-nilai :");
                System.out.print("    Struktur dan Konten Esai  : "); nilai1 = input.nextDouble();
                System.out.print("    Teknik Visualisasi        : "); nilai2 = input.nextDouble();
                System.out.print("    Kemampuan Design Thinking : "); nilai3 = input.nextDouble();
                
                Seleksi seleksi = new Seleksi(nilai1, nilai2, nilai3, nama, umur);
                
                System.out.println("");
                System.out.println("Perhitungan Seleksi");
                System.out.println("-----------------");
                System.out.println("Nilai Akhir anda adalah " + seleksi.nilaiPelajar());
                if(seleksi.nilaiPelajar() >= 87.5){
                    System.out.println("Selamat Anda dinyatakan lolos Seleksi!");
                }else{
                    System.out.println("Mohon Maaf anda belum dinyatakan lolos Seleksi.");
                }
                                
                System.out.println("");
                System.out.print("Kembali ke menu (y/t)? ");
                balik = input.next().charAt(0);
                if(balik == 't' || balik =='T'){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.exit(0);
                }
                }else{
                    System.out.println("Mohon maaf, umur anda tidak mencukupi syarat.");
                }
                break;
            case 2 :
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Nama        : "); nama = input.nextLine();
                System.out.print("Umur        : "); umur = input.nextInt();
                if(umur >= 16 && umur <= 24){
                System.out.println("Nilai-nilai :");
                System.out.print("    Struktur dan Konten Esai  : "); nilai1 = input.nextDouble();
                System.out.print("    Teknik Visualisasi        : "); nilai2 = input.nextDouble();
                System.out.print("    Kemampuan Design Thinking : "); nilai3 = input.nextDouble();
                
                Seleksi seleksi = new Seleksi(nilai1, nilai2, nilai3, nama, umur);
                
                System.out.println("");
                System.out.println("Perhitungan Seleksi");
                System.out.println("-----------------");
                System.out.println("Nilai Akhir anda adalah " + seleksi.nilaiMahasiswa());
                if(seleksi.nilaiMahasiswa() >= 87.5){
                    System.out.println("Selamat Anda dinyatakan lolos Seleksi!");
                }else{
                    System.out.println("Mohon Maaf anda belum dinyatakan lolos Seleksi.");
                }
                                
                System.out.println("");
                System.out.print("Kembali ke menu (y/t)? ");
                balik = input.next().charAt(0);
                if(balik == 't' || balik =='T'){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.exit(0);
                }
                }else{
                    System.out.println("Mohon maaf, umur anda tidak mencukupi syarat.");
                }
                break;
            case 3:
                System.out.println("Terimakasih!");
                System.exit(0);
                
                break;
            default:
                System.out.println("Menu tidak tersedia, Silakan pilih menu yang tersedia!");
                
                break;       
            }
        System.out.println("");
        }while(pilih != 3);
    }
    
}
