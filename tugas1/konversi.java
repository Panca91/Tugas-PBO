package tugas1;

public class konversi {
    double celcius;

    public konversi(double celcius) {
        this.celcius = celcius;
    }

    public double Fahrenhait() {
        return ((9 * celcius) / 5 + 32);
    }

    public double Reamur() {
        return ((4 * celcius) / 5);
    }

    public double Kelvin() {
        return (celcius + 273.15);
    }

    public String kondisiAir(){
        if (celcius <= 0) {
            return "Beku.";
        } else if (celcius >= 100) {
            return "Mendidih.";
        } else {
            return "Normal.";
        }
    }
}
