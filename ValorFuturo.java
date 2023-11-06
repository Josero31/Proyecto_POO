public class ValorFuturo {
    public boolean ValorPresenteNeto(double Vp, double g, double a) {
        double VPN = 0;
        double p = g - a;
        Vp = Vp + 4500;

        for (int i = 1; i < 9; i++) {
            double CF = Calcular(p, i);
            VPN = VPN + (CF) / Math.pow((1 + 0.045), i);
        }
        VPN = VPN - Vp;

        return VPN > 0;
    }

    public double Calcular(double P, int n) {
        P = P * 12;
        return P * Math.pow((1 + 0.045), n);
    }
}
