package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int N = sc.nextInt();;
		
		for( int i = 1; i <= N; i++ ) {
			System.out.printf("%d ", i);
			System.out.printf("%d ", (int) Math.pow(i, 2));
			System.out.printf("%d%n", (int) Math.pow(i, 3));
		}

		sc.close();
	}

}
