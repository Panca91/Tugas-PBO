package kuiz;

public class Seleksi implements kuiz.beasiswa.BeasiswaMahasiswa, kuiz.beasiswa.BeasiswaPelajar{
    public double nilai1, nilai2, nilai3, nilaiAkhir;
    public String nama;
    public int umur;
    
    public Seleksi(double nilai1, double nilai2, double nilai3, String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public int getumur(){
        return umur;
    }
    public void setumur(int umur){
        this.umur = umur;
    }
    public double getnilai1(){
        return nilai1;
    }
    public void setnilai1(double nilai1){
        this.nilai1 = nilai1;
    }
     public double getnilai2(){
        return nilai2;
    }
    public void setnilai2(double nilai2){
        this.nilai2 = nilai2;
    }
    public double getnilai3(){
        return nilai3;
    }
    public void setnilai3(double nilai3){
        this.nilai3 = nilai3;
    }
        
    @Override
    public double nilaiMahasiswa(){
        return (0.5*nilai1) + (0.2*nilai2) + (0.3*nilai3);
        
    }

    @Override
    public double nilaiPelajar(){
        return (0.6*nilai1) + (0.25*nilai2) + (0.15*nilai3);
        
    }
}
