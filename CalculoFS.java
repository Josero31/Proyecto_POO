public class CalculoFS {
    private double Kwatts;
    private double facturaIVA;

    public double Calcular(double PL) {
        facturaIVA = PL;
        double AP = facturaIVA * 0.10;
        facturaIVA = facturaIVA - AP;
        double IVA = facturaIVA * 0.12;
        double valorFactura = facturaIVA - IVA;

        if (valorFactura <= 523.25) {
            Kwatts = valorFactura / 1.5;
        } else {
            Kwatts = valorFactura / 1.75;
        }

        return Kwatts;
    }

    public double getKwatts() {
        return Kwatts;
    }

    public double getFacturaIva() {
        return facturaIVA;
    }
}