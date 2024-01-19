package ExerciciosEstWhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
		Double x, y;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x == 0.0 && y == 0.0) {
				System.out.println("Origem");
			}
			else if (x > 0.0 && y > 0.0){
				//Q1 ( X e Y > 0)
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0){
				//Q2 (X < 0 e Y > 0 )
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				//Q3 ( X e Y < 0)
				System.out.println("Q3");
			}
			else {
				//Q4 (X > 0 e Y < 0)
				System.out.println("Q4");
			}
			
			System.out.println();
			x = sc.nextDouble();
			y = sc.nextDouble();
			
		}
		
		System.out.println();
		
	}
}
