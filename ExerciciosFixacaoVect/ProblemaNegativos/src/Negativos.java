import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números quer digitar: ");
        int vetor = sc.nextInt();
        if (vetor > 10 ){ // Validação do valor máximo
            System.out.print("Digite um número válido: ");
            vetor = sc.nextInt();
        }
        double [] vect = new double[vetor];

        for ( int i = 0; i < vect.length; i++) {
            System.out.print("Digite o número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("números negativos:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}