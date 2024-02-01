import java.util.Scanner;

public class Soma_Vetores {

    public static void main(String[] args) {
       /*
       * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
       * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
       * o vetor C gerado.
       */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números vai ter cada vetor: ");
        int n = sc.nextInt();
        Double[] Array = new Double[n];
        Double[] Array2 = new Double[n];

        for (int i = 0; i < Array.length ; i++) {
            System.out.print("Digite " + (1+i) + "º valor do 1º Vetor: ");
            Array[i] = sc.nextDouble();
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < Array2.length; i++) {
            System.out.print("Digite " + (1+i) + "º valor do 2º Vetor: ");
            Array2[i] = sc.nextDouble();
        }

        System.out.println("---------------------------------");
        System.out.println("Vetores Resultantes:");

        for (int i = 0; i < n; i++) {
            System.out.println("Soma dos " + (1+i) + "º vetores: " + (Array[i] + Array2[i]) );
        }


    }
}
