public class CalculoPS {
    private double Kwatts;
    private double capacidad;

    public double Calcular(double KW) {
        Kwatts = KW;
        if (Kwatts <= 300) {
            capacidad = Kwatts;
        } else {
            capacidad = Kwatts * 1.1;
        }
        return capacidad * 1.5;
    }

    public double getKwatts() {
        return Kwatts;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getFacturaRestante() {
        return 0;
    }
}
