import Util.pessoas;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        /*
        * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        * da pessoa mais velha.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        pessoas[] Array = new pessoas[n];
        double maiorNum = 0;

        for (int i = 0; i < Array.length; i++) {
            System.out.print("Dados da " + (1+i) + "ª pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            Array[i] = new pessoas(nome, idade);
            if (idade > maiorNum) {
                maiorNum = idade;
            }
        }

        for (int i = 0; i < Array.length; i++) {
            if (Array[i].getIdade() == maiorNum){
                System.out.print("Pessoas mais velha: " + Array[i].getNome());
            }
        }

    }
}