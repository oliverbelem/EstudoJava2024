package ExerciciosEstWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Escrevaum algoritmo para ler o tipo de combustível abastecido
		//(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
		//Caso o usuário informe um código inválido 
		//(fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido)

		Scanner sc = new Scanner(System.in);
		int Codigo, 
		Gasolina = 0, 
		Alcool = 0, 
		Diesel = 0;
		
		System.out.print("Digite o código do combustível:");
		Codigo = sc.nextInt();
		
		while (Codigo != 4 ) {
			if (Codigo == 1) {
				Gasolina += 1;
				System.out.println("Gasolina Computada...");
			}
			else if (Codigo == 2) {
				Alcool += 1;
				System.out.println("Alcool Computado...");
			}
			else if (Codigo == 3) {
				Diesel += 1;
				System.out.println("Diesel Computado...");
			}
			else if (Codigo == 4) {
				System.out.println("Saída Confirmada");;
			}
			else {
				System.out.println("CÓDIGO INVÁLIDO...");
			}
			
			System.out.println();
			System.out.println("Digite Novamente um código:");
			Codigo = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado pelo dia!!");
		System.out.printf("Gasolina: %d%n", Gasolina);
		System.out.printf("Alcool: %d%n", Alcool);
		System.out.printf("Diesel: %d%n", Diesel);
	}

}
