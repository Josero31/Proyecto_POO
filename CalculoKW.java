public class CalculoKW {
    private double Kwatts;
    private double kilowatts;
    

    public double CalcularEGGSA(double KW) {
        kilowatts = KW;
        if (KW <= 100) {
            Kwatts = KW * 1.25;
        } else {
            Kwatts = KW * 1.33;
        }
        return Kwatts;
    }
    

    

    public double CalcularDEOCSA(double KW) {
        kilowatts = KW;
        if (KW <= 100) {
            Kwatts = KW * 1.82;
        } else {
            Kwatts = KW * 1.94;
        }
        return Kwatts;
    }

   

    public double CalcularDEORSA(double KW) {
       kilowatts = KW;
        if (KW <= 100) {
            Kwatts = KW * 1.72;
        } else {
            Kwatts = KW * 1.81;
        }
        return Kwatts;
    }


    public double getKwatts() {
        return Kwatts;
    }

    
}
