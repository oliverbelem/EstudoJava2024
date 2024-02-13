package aplicacao;

import java.util.Scanner;

public class exercicioMatrizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int negativos=0;
        System.out.print("Qual a ordem da sua matriz? ");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    negativos ++;
                }
            }
        }
        System.out.println();
        System.out.println("A sua diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println("Números negativos: ");
        System.out.println(negativos);
    }
}
