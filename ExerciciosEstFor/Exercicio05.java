package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores

		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("Adicione um número Inteiro: ");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
