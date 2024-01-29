package util;

public class CalculadoraDolar {

    public static final double IOF = 0.06;
    public static double valorPag(double custoDolar, double dolares) {
        return dolares * custoDolar * (1 + IOF);
    }


}
