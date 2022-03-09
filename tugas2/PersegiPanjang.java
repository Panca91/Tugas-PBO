package tugas2;

public class PersegiPanjang implements MenghitungBidang{
    public double panjang;
    public double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setLebar(){
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return(panjang + lebar)*2;
    }
}
