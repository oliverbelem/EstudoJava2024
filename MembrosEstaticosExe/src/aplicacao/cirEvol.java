package aplicacao;

import util.calculadora;

import java.util.Scanner;

public class cirEvol {

    //Nesse exemplo usaremos os Membros Estáticos em outra classe...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do raio: ");
        double raio = sc.nextDouble();

        double circulo = calculadora.circunferencia(raio);
        double volume = calculadora.volume(raio);

        System.out.printf("Cincunferencia: %.2f%n", circulo);
        System.out.printf("Volume: %.2f%n", volume);


    }
}

