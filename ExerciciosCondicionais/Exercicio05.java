package ExerciciosCondicionais;

import java.util.Scanner;
 
public class Exercicio05 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		// 1 -------- Cachorro quente ---- R$4,00
		// 2 -------- X-Salada ----------- R$4,50
		// 3 -------- X-Bacon ------------ R$5,00
		// 4 -------- Torrada Simples ---- R$2,00
		// 5 -------- Refrigerante ------- R$1,50
		
		Scanner sc = new Scanner(System.in);
		
		double NumItem, QuantItem, Total = 0;
		
		System.out.print("Coloque o código do item: ");
		NumItem = sc.nextDouble();
		System.out.print("Agora, a quantidade do item: ");
		QuantItem = sc.nextDouble();
		System.out.println();
		switch ((int)NumItem) {
			case 1:
				Total = 4 * QuantItem;
				break;
			case 2:
				Total = 4.5 * QuantItem;
				break;
			case 3:
				Total = 5 * QuantItem;
				break;
			case 4:
				Total = 2 * QuantItem;
				break;
			case 5:
				Total = 1.5* QuantItem;
				break;
			default:
				break;
		}
		
		System.out.printf("O valor total da sua conta é: R$%.2f",Total);
		
		
		sc.close();
	}

}
