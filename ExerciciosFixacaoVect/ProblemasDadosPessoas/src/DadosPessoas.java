import Util.Pessoa;

import java.util.Objects;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        /*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double maiorAltura = 0,
                menorAltura = 5,
                somaAltura = 0,
                numAltura = 0,
                numHomens = 0;
        Pessoa[] Array = new Pessoa[n];

        for (int i = 0; i < Array.length; i++) {
            System.out.print("Altura da "+ (i+1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Genero da "+ (i+1) + "ª pessoa: ");
            sc.nextLine();
            String genero = sc.nextLine();
            Array[i] = new Pessoa(altura, genero);

                if (altura < menorAltura) {
                    menorAltura = altura;
                }
                    if (altura > maiorAltura) {
                        maiorAltura = altura;
                    }
                        if (Objects.equals(genero, "F")) {
                            somaAltura += altura;
                            numAltura += 1;
                        }
                            if(Objects.equals(genero, "M")){
                                numHomens += 1;
                            }
        }
        double media = somaAltura/numAltura;
        System.out.println("--------------------------------------");
        System.out.println("Menor Altura: " + menorAltura);
        System.out.println("Maior Altura: " + maiorAltura);
        System.out.println("Média das alturas Femininas: " + String.format("%.2f",media));
        System.out.println("Número de Homens: " + numHomens);

    }
}