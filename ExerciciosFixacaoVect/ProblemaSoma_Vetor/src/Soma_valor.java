import java.util.Scanner;

public class Soma_valor {
    public static void main(String[] args) {
        /*
        *  Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        * - Imprimir todos os elementos do vetor
        * - Mostrar na tela a soma e a média dos elementos do vetor*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Qunatos números você vai digitar? ");
        int num = sc.nextInt();
        double soma = 0, media;
        double[] vect = new double[num];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o número: ");
            vect [i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + ", ");
        }
        media = soma / vect.length;
        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);

    }
}