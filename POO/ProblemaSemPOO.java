package POO;

import java.util.Scanner;

public class ProblemaSemPOO {

	public static void main(String[] args) {
		// Aqui colocarei um problema sem o uso de POO. Logo mais resolverei com o uso de POO
		
		/*
		Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
		válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
		possui a maior área.
		*/
		
		// Area = Math.sqrt(P*(P-a)(P-b)(P-c);
		// P = ( a + b + c )/2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quais os lados do Triangulo X: ");
		double X1 = sc.nextDouble();
		double X2 = sc.nextDouble();
		double X3 = sc.nextDouble();
		
		System.out.print("Quais os lados do Triangulo Y: ");
		double Y1 = sc.nextDouble();
		double Y2 = sc.nextDouble();
		double Y3 = sc.nextDouble();
		
		double PX = (X1 + X2 + X3) / 2;  
		double AreaX = Math.sqrt(PX*(PX-X1)*(PX-X2)*(PX-X3));
		
		double PY = (Y1 + Y2 + Y3) / 2;  
		double AreaY = Math.sqrt(PY*(PY-Y1)*(PY-Y2)*(PY-Y3));
		
		System.out.println("Area de X: " + AreaX);
		
		System.out.println("Area de Y: " + AreaY);
		
		if (AreaX > AreaY) {
			System.out.println("A área do primeiro triangulo é a maior");
		} else {
			System.out.println("A área do segundo triangulo é a maior");
		}
	}

}
