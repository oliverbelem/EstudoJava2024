import Util.Pessoas;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.*/

        Scanner sc = new Scanner(System.in);
        double soma = 0, media;
        int somaMenor = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoas [] vect = new Pessoas[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i+1) + "ª Pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect [i] = new Pessoas(nome, idade, altura);
                if (idade < 16) {
                    somaMenor += 1;
                }
            soma += altura;
        }

        double porcentagemMenor = (double) (somaMenor * 100) / n;
        media = soma / n;

        System.out.println();
        System.out.println("Altura média: " + String.format("%.2f",media));
        System.out.println("Pessoas menores de 16 anos: " + String.format("%.2f",porcentagemMenor) + "%");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

    }
}