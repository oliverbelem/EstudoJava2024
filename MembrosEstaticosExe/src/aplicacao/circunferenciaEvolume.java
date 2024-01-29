package aplicacao;

import java.util.Scanner;

public class circunferenciaEvolume {
    public static final double PI = 3.14159; //declaração de constante pelo "final"; delcaração para contanstes é em maiusculo.

    public static void main(String[] args) {
    /*Fazer um programa para ler um valor numérico qualquer, e daí mostrar
    quanto seria o valor de uma circunferência e do volume de uma esfera
    para um raio daquele valor. Informar também o valor de PI com duas
    casas decimais.*/

   //Esse exemplo não será feito com Membros na propria classe...
    Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do raio: ");
        double Raio = sc.nextDouble();

        double circulo = circumferencia(Raio);
        double volume = volume(Raio);

        System.out.printf("Cincunferencia: %.2f%n", circulo);
        System.out.printf("Volume: %.2f%n", volume);


    }

    private static double volume(double Raio) {
        return 4 * PI * Math.pow(Raio, 3) / 3;
    }

    private static double circumferencia(double Raio) {
        return 2 * PI * Raio;
    }
}