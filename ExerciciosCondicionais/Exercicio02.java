package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

		Scanner sc = new Scanner(System.in);
		int NumeroInteiro;
		
		System.out.print("Digite um número inteiro: ");
		NumeroInteiro = sc.nextInt();
		
		String Resultado = (NumeroInteiro >= 0)?"O número é Positivo":"O número é Negativo";
		
		System.out.println(Resultado);
		
		sc.close();
		
	}

}
