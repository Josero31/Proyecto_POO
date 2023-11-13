public class CalculoFS {
    private double Kwatts;
    private double factura;
    

    public double CalcularEGGSA(double PL) {
        factura = PL;
        if (PL <= 125) {
            Kwatts = PL / 1.2500;
        } else {
            Kwatts = PL / 1.3366;
        }
        return Kwatts;
    }
    

    

    public double CalcularDEOCSA(double PL) {
        factura = PL;
        if (PL <= 182) {
            Kwatts = PL / 1.8231;
        } else {
            Kwatts = PL / 1.9496;
        }
        return Kwatts;
    }

   

    public double CalcularDEORSA(double PL) {
        factura = PL;
        if (PL <= 172) {
            Kwatts = PL / 1.7289;
        } else {
            Kwatts = PL / 1.8178;
        }
        return Kwatts;
    }


    public double getKwatts() {
        return Kwatts;
    }

    
}
