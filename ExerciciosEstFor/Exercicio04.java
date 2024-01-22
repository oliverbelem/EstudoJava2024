package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por definição, fatorial de 0 é 1.

		Scanner sc = new Scanner(System.in);
		int Numero, Resultado = 1;
		
		Numero = sc.nextInt();
		
		for (int i = 1; i < Numero; i++) {
			Resultado *= (Numero - i);
			
		}
		Resultado *= Numero;
		System.out.println(Resultado);
		
		sc.close();
	}

}
