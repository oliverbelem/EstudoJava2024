import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
        */
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        double somaPares = 0;

        System.out.print("Quantos numeros você quer inserir? ");
        int v = sc.nextInt();
        double[] vect = new double[v];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o número desejado: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0 ){
                somaPares += 1;
            }
        }

        System.out.println("NÚMEROS PARES: " + somaPares);
        for (int i=0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + ", ");
            }
            System.out.println();
        }


    }

}
