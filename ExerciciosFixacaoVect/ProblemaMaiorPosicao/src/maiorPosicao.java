import java.util.Scanner;

public class maiorPosicao {

    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
        Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce quer inserir? ");
        int n = sc.nextInt();
        double [] Array = new double[n];
        double maiorNum = 0;

        for (int i = 0; i < Array.length; i++) {
            System.out.printf("Digite o %dº Número: ", (i+1));
            Array[i] = sc.nextDouble();
            if (Array[i] > maiorNum) {
                maiorNum = Array[i];
            }
        }

        System.out.println();
        System.out.println("O maior número foi: " + maiorNum);
        for (int i = 0; i < Array.length ; i++) {
            if (Array[i] == maiorNum){
                System.out.println("Posição do maior número: " + (i+1));
            }
        }

    }
}
