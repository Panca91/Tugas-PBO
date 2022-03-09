package tugas2;

import java.util.Scanner;
import tugas2.Balok;
import tugas2.Tabung;

public class Main {

    
   public static void main(String[] args) {
        int pilih;
        char balik;
        double panjang,lebar,tinggiBalok,jari,tinggiTabung;
        Scanner input = new Scanner(System.in); 
        
        do{
        System.out.println("+--------------------------+");
        System.out.println("| PROGRAM BIDANG DAN RUANG |");
        System.out.println("+--------------------------+");
        System.out.println("MENU = ");
        System.out.println("1. BALOK");
        System.out.println("2. TABUNG");
        System.out.println("3. EXIT");
        System.out.print("pilih : "); pilih = input.nextInt();
        
        switch(pilih){
        
            case 1: 
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("PANJANG   : "); panjang = input.nextInt();
                System.out.print("LEBAR     : "); lebar = input.nextInt();
                System.out.print("TINGGI    : "); tinggiBalok = input.nextInt();
                System.out.println("");
                
                Balok balok = new Balok(tinggiBalok,panjang,lebar);
                
                System.out.println("Hasil Perhitungan");
                System.out.println("-----------------");
                System.out.println("LUAS PERSEGI            : " + balok.luas());
                System.out.println("KELILING PERSEGI        : " + balok.keliling());
                System.out.println("VOLUME                  : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK    : " + balok.luasPermukaan());
                
                System.out.println("");
                System.out.print("Kembali ke menu (y/t)? ");
                balik = input.next().charAt(0);
                if(balik == 't' || balik =='T'){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.exit(0);
                }
                
                break;
            case 2 :
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("JARI-JARI : "); 
                jari = input.nextInt();
                System.out.print("TINGGI    : "); 
                tinggiTabung = input.nextInt();
                System.out.println("");
                
                Tabung tabung = new Tabung(tinggiTabung,jari);
                
                System.out.println("Hasil Perhitungan");
                System.out.println("-----------------");
                System.out.println("LUAS LINGKARAN          : " + tabung.luas());
                System.out.println("KELILING LINGKARAN      : " + tabung.keliling());
                System.out.println("VOLUME TABUNG          : " + tabung.volume());
                System.out.println("LUAS PERMUKAAN TABUNG  : " + tabung.luasPermukaan());
                
                System.out.println("");
                System.out.print("Kembali ke menu (y/t)? ");
                balik = input.next().charAt(0);
                if(balik == 't' || balik =='T'){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.exit(0);
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