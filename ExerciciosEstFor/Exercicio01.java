package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Leia um valor inteiro X (1 <= X <= 1000).
		//Em seguida mostre os ímpares de 1 até X, um valor por linha,
		//inclusive o X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		int X, Contagem;
		X = 1;
		Contagem = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= Contagem; i++) {
			if (X % 2 != 0) {
				System.out.println(X);
			}
			X++;
		}
		sc.close();
	}

}
