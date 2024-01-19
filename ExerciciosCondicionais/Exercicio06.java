package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
		//em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
		//Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem
		//“Fora de intervalo”.
		
		Scanner sc = new Scanner(System.in);
		
		double Valor1;
				
		Valor1 = sc.nextDouble();
		
		if (Valor1 >= 0 && Valor1 <= 25) {
			System.out.println("[0, 25]");
		}
		else if (Valor1 > 25 && Valor1 <= 50){
			System.out.println("(15,50]");
		}
		else if (Valor1 > 50 && Valor1 <= 75){
			System.out.println("(50,75]");
		}
		else if (Valor1 > 75 && Valor1 <= 100){
			System.out.println("(75,100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
		
	}

}
