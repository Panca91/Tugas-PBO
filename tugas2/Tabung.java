package tugas2;

import tugas2.Lingkaran;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;
    
    public Tabung(double tinggi, double jarijari){
        super(jarijari);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return(luas()*tinggi);
    }
    
    @Override
    public double luasPermukaan(){
        if(getJari() % 7 == 0){
        return(2*luas())+((2*22*getJari()*tinggi)/7);
        }else{
        return(2*luas())+(2*3.14*getJari()*tinggi);
        }
    }
    
}
