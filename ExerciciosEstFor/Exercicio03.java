package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares 
		//de números e mostre a divisão do primeiro pelo segundo. 
		//Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);
		
		int QuantParaLer;
		double Resultado = 0;
		QuantParaLer = sc.nextInt();
		
		for (int i=0; i < QuantParaLer; i++) {
			double x, y;
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if ( y == 0 ) {
				System.out.println("Divisão Impossível");
			}
			else {
				Resultado = x / y;
			}
			
			System.out.println(Resultado);
		}
	}

}
