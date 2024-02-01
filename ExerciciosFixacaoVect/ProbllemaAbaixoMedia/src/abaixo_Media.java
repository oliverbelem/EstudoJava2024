import java.util.Scanner;

public class abaixo_Media {
    public static void main(String[] args) {

        /*
        * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        */

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        System.out.print("Digite quantos elementos tera o vetor: ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (1+i) + "º valor: ");
            array[i] = sc.nextDouble();
            soma += array[i];
        }

        double media = soma / n;

        System.out.println("Média dos vetores: " + String.format("%.3f", media));
        System.out.println("Elementos a baixo da média: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < media){
                System.out.printf("%.1f%n",array[i]);
            }
        }

    }
}