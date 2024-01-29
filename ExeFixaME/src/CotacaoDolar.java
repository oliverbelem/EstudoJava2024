import util.CalculadoraDolar;

import java.util.Scanner;

public class CotacaoDolar {

    public static void main(String[] args) {

        /*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto está custando o dólar hoje? ");
        double custoDolar = sc.nextDouble();
        System.out.print("Quantos dólares você quer comprar? ");
        double dolares = sc.nextDouble();
        double resultado = CalculadoraDolar.valorPag(custoDolar, dolares);
        System.out.printf("Valor a ser pago em reais: %.2f", resultado);


    }

}