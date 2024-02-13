import java.util.Scanner;

public class identificandoPosicoes {
    public static void main(String[] args) {

        /*Fazer um programa para ler dois números inteiros M e N, e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
        podendo haver repetições. Em seguida, ler um número inteiro X que
        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver..*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira quantas Linhas terão a matriz: ");
        ;
        int Lin = sc.nextInt();
        System.out.print("Insira quantas Colunas terão a matriz: ");
        int Col = sc.nextInt();
        int[][] matriz = new int[Lin][Col];

        System.out.println("Digite sua matriz:");
        for (int i = 0; i < Lin; i++) {
            for (int j = 0; j < Col; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Insira um número que pertença a matriz: ");
        int X = sc.nextInt();

        for (int i = 0; i < Lin; i++) {
            for (int j = 0; j < Col; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("posição: [" + i + ", " + j + "]" + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (i < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }

        }
    }
}