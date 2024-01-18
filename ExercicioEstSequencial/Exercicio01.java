package ExercicioEstSequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, 
		//e depois mostrar na tela a soma desses números com uma mensagem explicativa
		
		int A, B, Soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois número inteiros: ");
		A = sc.nextInt(); 
		B = sc.nextInt();
		
		Soma = A + B;
		
		System.out.printf("A soma dos números %d e %d é igual a: %d", A, B, Soma);
		
		
		sc.close();
	}

}
