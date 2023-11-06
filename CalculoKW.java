public class CalculoKW {
    private double Kwatts;
    private double facturaIVA;

    public double Calcular(double KW) {
        Kwatts = KW;

        if (Kwatts <= 300) {
            facturaIVA = Kwatts * 1.5;
        } else {
            facturaIVA = Kwatts * 1.75;
        }

        facturaIVA = facturaIVA * 1.50;
        facturaIVA = facturaIVA * 1.10;

        return facturaIVA;
    }

    public double getKwatts() {
        return Kwatts;
    }

    public double getFacturaIva() {
        return facturaIVA;
    }
}
