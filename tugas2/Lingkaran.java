package tugas2;

public class Lingkaran implements MenghitungBidang{
    public double jarijari;
    
    public Lingkaran(double jari){
        this.jarijari = jari;
    }
    public double getJari(){
        return jarijari;
    }
    public void setJari(double jari){
        this.jarijari = jari;
    }

    @Override    
    public double luas(){
        if((jarijari % 7) == 0){
            return((22*jarijari*jarijari)/7);
        }else{
            return 3.14*jarijari*jarijari;
        }
    }
    
    @Override
    public double keliling(){
        if(jarijari % 7 == 0){
            return((2*22*jarijari)/7);
        }else{
            return 2*3.14*jarijari;
        }
    }
}
