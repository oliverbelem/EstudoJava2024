package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

		Scanner sc = new Scanner(System.in);
		Double CasaX, CasaY;
		
		CasaX = sc.nextDouble();
		CasaY = sc.nextDouble();
		
		if (CasaX == 0.0 && CasaY == 0.0) {
			System.out.println("Origem");
		}
		else if (CasaX > 0.0 && CasaY > 0.0){
			//Q1 ( X e Y > 0)
			System.out.println("Q1");
		}
		else if (CasaX < 0.0 && CasaY > 0.0){
			//Q2 (X < 0 e Y > 0 )
			System.out.println("Q2");
		}
		else if (CasaX < 0.0 && CasaY < 0.0) {
			//Q3 ( X e Y < 0)
			System.out.println("Q3");
		}
		else {
			//Q4 (X > 0 e Y < 0)
			System.out.println("Q4");
		}
		
		
		
		
		sc.close();
	}

}
